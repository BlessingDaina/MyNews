package com.example.mynews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBarActivity;
import android.app.LocalActivityManager;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
/**
 * HorizontalScrollView和ViewPager联动效果
 * 上HorizontalScrollView下ViewPager
 * @author 娜
 *
 */
public class MainActivity extends ActionBarActivity {
	
	private ImageView mImageView;
	private float mCurrentCheckedRadioLeft;//当前被选中的radioButton距离左侧的距离
	private HorizontalScrollView mHorizontalScrollView;//上面的水平滚动控件
	private ViewPager mViewPager;//下方的可横向拖动的控件
	private ArrayList<View> mViews;//用来存放下方滚动的layout
	
	LocalActivityManager manager = null;
	
	private RadioGroup myRadioGroup;
	
	private int _id = 1000;
	
	private LinearLayout layout,titleLayout;
	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//去标题
		setContentView(R.layout.activity_main);
		
		manager = new LocalActivityManager(this,true);
		manager.dispatchCreate(savedInstanceState);
		
		getTitleInfo();
		initGroup();
		iniListener();
		iniVariable();
		
		mViewPager.setCurrentItem(0);
	}
	
	private List<Map<String,Object>> titleList = new ArrayList<Map<String,Object>>();
	private void getTitleInfo(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 0);
		map.put("title", "新闻");
		titleList.add(map);

		map = new HashMap<String, Object>();
		map.put("id", 1);
		map.put("title", "体育");
		titleList.add(map);

		map = new HashMap<String, Object>();
		map.put("id", 2);
		map.put("title", "彩票");
		titleList.add(map);

		map = new HashMap<String, Object>();
		map.put("id", 3);
		map.put("title", "世界杯");
		titleList.add(map);

		map = new HashMap<String, Object>();
		map.put("id", 4);
		map.put("title", "国际");
		titleList.add(map);

		map = new HashMap<String, Object>();
		map.put("id", 5);
		map.put("title", "娱乐");
		titleList.add(map);

		map = new HashMap<String, Object>();
		map.put("id", 6);
		map.put("title", "军事");
		titleList.add(map);
	}

	private void initGroup(){
		titleLayout = (LinearLayout) findViewById(R.id.title_lay);
		layout = (LinearLayout) findViewById(R.id.lay);
		
		mImageView = (ImageView) findViewById(R.id.img1);
		mHorizontalScrollView = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);
		
		mViewPager = (ViewPager) findViewById(R.id.pager);
		
		myRadioGroup = new RadioGroup(this);
		myRadioGroup.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
		myRadioGroup.setOrientation(LinearLayout.HORIZONTAL);
		layout.addView(myRadioGroup);
		for (int i=0; i < titleList.size(); i++){
			Map<String,Object> map = titleList.get(i);
			RadioButton radio = new RadioButton(this);
			
			radio.setBackgroundResource(R.drawable.radiobtn_selector);
			radio.setButtonDrawable(android.R.color.transparent);
			LinearLayout.LayoutParams l = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT, Gravity.CENTER);
			radio.setLayoutParams(l);
			radio.setGravity(Gravity.CENTER);
			radio.setPadding(20, 15, 20, 15);
			radio.setId(_id+i);
			radio.setText(map.get("title")+"");
			radio.setTextColor(Color.WHITE);
			radio.setTag(map);
			if (i==0){
				radio.setChecked(true);
				int itemWidth = (int) radio.getPaint().measureText(map.get("title")+"");
				mImageView.setLayoutParams(new LinearLayout.LayoutParams(itemWidth+radio.getPaddingLeft()+radio.getPaddingRight(),4));
			}
			myRadioGroup.addView(radio);
		}
		myRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				int radioButtonId = group.getCheckedRadioButtonId();
				//根据ID获取RadioButton的实例
				RadioButton rb = (RadioButton) findViewById(radioButtonId);
				Map<String,Object> seletMap = (Map<String,Object>) rb.getTag();
				
				AnimationSet animationSet = new AnimationSet(true);
				TranslateAnimation translateAnimation;
				translateAnimation = new TranslateAnimation(mCurrentCheckedRadioLeft, rb.getLeft(), 0f, 0f);
				animationSet.addAnimation(translateAnimation);
				animationSet.setFillBefore(true);
				animationSet.setFillAfter(true);
				animationSet.setDuration(300);
				
				mImageView.startAnimation(animationSet);
				mViewPager.setCurrentItem(radioButtonId-_id);
				//让下方ViewPager跟随上面的HorizontalScollView切换
				mCurrentCheckedRadioLeft = rb.getLeft();//更新当前横条距离左边的距离
				mHorizontalScrollView.smoothScrollTo((int)mCurrentCheckedRadioLeft-(int)getResources().getDimension(R.dimen.rdo2), 0);
				
				mImageView.setLayoutParams(new LinearLayout.LayoutParams(rb.getRight()-rb.getLeft(),4));
				
			}
		});
	}
	
	private View getView(String id, Intent intent){
		return manager.startActivity(id, intent).getDecorView();
		
	}
	
	private void iniVariable(){
		mViews = new ArrayList<View>();
		for (int i = 0 ; i < titleList.size(); i++){
			Intent intent1 = new Intent(this,Main01Activity.class);   //启动组件
			intent1.putExtra("id", i);        //添加信息
			mViews.add(getView("View"+i, intent1));
			mViewPager.setAdapter(new MyPagerAdapter());//设置ViewPager的适配器
		}
	}
	
	private void iniListener() {
		// TODO Auto-generated method stub
		mViewPager.setOnPageChangeListener(new MyPagerOnPageChangeListener());
	}
	
	/**
	 * ViewPager的适配器
	 */
	private class MyPagerAdapter extends PagerAdapter{

		@Override
		public void destroyItem(View v, int position, Object obj) {
			// TODO Auto-generated method stub
			((ViewPager)v).removeView(mViews.get(position));
		}
		
		@Override
		public void finishUpdate(View arg0) {
			// TODO Auto-generated method stub
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return mViews.size();
		}
		
		@Override
		public Object instantiateItem(View v, int position) {
			((ViewPager)v).addView(mViews.get(position));
			return mViews.get(position);
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			// TODO Auto-generated method stub
			return arg0 == arg1;
		}

		@Override
		public void restoreState(Parcelable arg0, ClassLoader arg1) {
			// TODO Auto-generated method stub
		}

		@Override
		public Parcelable saveState() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void startUpdate(View arg0) {
			// TODO Auto-generated method stub
		}
		
	}
	
	/**
	 * ViewPager的PageChangeListener页面改变监听器
	 */
	
	private class MyPagerOnPageChangeListener implements OnPageChangeListener{

		public void onPageScrollStateChanged(int arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onPageScrolled(int arg0, float arg1, int arg2) {
			// TODO Auto-generated method stub
			
		}
		/**
		 * 滑动ViewPager的时候,让上方的HorizontalScrollView自动切换
		 */
		public void onPageSelected(int position) {
			// TODO Auto-generated method stub
			RadioButton radioButton = (RadioButton) findViewById(_id+position);
			radioButton.performClick();
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
