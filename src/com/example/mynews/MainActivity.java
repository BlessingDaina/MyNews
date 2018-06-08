package com.example.mynews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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
 * HorizontalScrollView��ViewPager����Ч��
 * ��HorizontalScrollView��ViewPager
 * @author ��
 *
 */
public class MainActivity extends ActionBarActivity {
	
	private ImageView mImageView;
	private float mCurrentCheckedRadioLeft;//��ǰ��ѡ�е�radioButton�������ľ���
	private HorizontalScrollView mHorizontalScrollView;//�����ˮƽ�����ؼ�
	private ViewPager mViewPager;//�·��Ŀɺ����϶��Ŀؼ�
	private ArrayList<View> mViews;//��������·�������layout
	
	LocalActivityManager manager = null;
	
	private RadioGroup myRadioGroup;
	
	private int _id = 1000;
	
	private LinearLayout layout,titleLayout;
	private TextView textView;
	
	//�ֲ�ͼ���
		private ViewPager bViewPaper;  
	    private List<ImageView> bimages;  
	    private List<View> bdots;  
	    private int bcurrentItem;  
	    //��¼��һ�ε��λ��  
	    private int boldPosition = 0;  
	    //���ͼƬ�ĵ�ַ  
	    private int[] bimageIds = new int[]{  
	            R.drawable.a,  
	            R.drawable.b,  
	            R.drawable.c,  
	            R.drawable.d,  
	            R.drawable.e  
	    }; 
	    //��ͼƬ��id
	    private int[] imgae_ids = new int[]{R.id.a,R.id.b,R.id.c,R.id.d,R.id.e};
	  //���ͼƬ�ı���  
	    private String[]  btitles = new String[]{  
	            "����������ѵ���ۿ��ع⣺����׬100��",   
	            "����������������80%�������д�",    
	            "����ǿ���ԡ�����Ů�����ͻ�Ƽ��伫��",     
	            "��PPT����30��������ŵ㣬��Ҳ�������",      
	            "����ѧӢ�������Ч"  
	    };  
	    //��Ź��URL
	    private String[] burls = new String[]{
	    		"https://vip.open.163.com/courses/966",
	    		"https://vip.open.163.com/courses/853",
	    		"https://vip.open.163.com/courses/206",
	    		"https://vip.open.163.com/courses/780",
	    		"https://vip.open.163.com/courses/797"
	    };
	    private TextView btitle;  
	    private bViewPagerAdapter badapter;  
	    private ScheduledExecutorService bscheduledExecutorService;  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//ȥ����
		setContentView(R.layout.activity_main);
		
		manager = new LocalActivityManager(this,true);
		manager.dispatchCreate(savedInstanceState);
		
		getTitleInfo();
		initGroup();
		iniListener();
		iniVariable();
		
		mViewPager.setCurrentItem(0);
		
		//�ֲ�ͼ���
				bViewPaper = (ViewPager) findViewById(R.id.vp);
			       //��ʾ��ͼƬ  
			         bimages = new ArrayList<ImageView>();  
			         for(int i = 0; i < bimageIds.length; i++){  
			             ImageView bimageView = new ImageView(this);  
			             bimageView.setBackgroundResource(bimageIds[i]); 
			             bimageView.setId(imgae_ids[i]);
			             bimageView.setOnClickListener(new pagerImageOnClick());//����ͼƬ����¼�
			             bimages.add(bimageView);  
			         }  
			       //��ʾ��С��  
			         bdots = new ArrayList<View>();  
			         bdots.add(findViewById(R.id.dot_0));  
			         bdots.add(findViewById(R.id.dot_1));  
			         bdots.add(findViewById(R.id.dot_2));  
			         bdots.add(findViewById(R.id.dot_3));  
			         bdots.add(findViewById(R.id.dot_4));
			         
			         btitle = (TextView) findViewById(R.id.title);  
			         btitle.setText(btitles[0]);  
			           
			         badapter = new bViewPagerAdapter();  
			         bViewPaper.setAdapter(badapter);  
			         
			         bViewPaper.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
						
						public void onPageSelected(int position) {
							// TODO Auto-generated method stub
							btitle.setText(btitles[position]);  
			                bdots.get(position).setBackgroundResource(R.drawable.dot_focused);  
			                bdots.get(boldPosition).setBackgroundResource(R.drawable.dot_normal);  
			                  
			                boldPosition = position;  
			                bcurrentItem = position;
						}
						
						public void onPageScrolled(int arg0, float arg1, int arg2) {
							// TODO Auto-generated method stub
							
						}
						
						public void onPageScrollStateChanged(int arg0) {
							// TODO Auto-generated method stub
							
						}
					});
	}
	
	private List<Map<String,Object>> titleList = new ArrayList<Map<String,Object>>();
	private void getTitleInfo(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 0);
		map.put("title", "����");
		titleList.add(map);

		map = new HashMap<String, Object>();
		map.put("id", 1);
		map.put("title", "����");
		titleList.add(map);

		map = new HashMap<String, Object>();
		map.put("id", 2);
		map.put("title", "��Ʊ");
		titleList.add(map);

		map = new HashMap<String, Object>();
		map.put("id", 3);
		map.put("title", "���籭");
		titleList.add(map);

		map = new HashMap<String, Object>();
		map.put("id", 4);
		map.put("title", "����");
		titleList.add(map);

		map = new HashMap<String, Object>();
		map.put("id", 5);
		map.put("title", "����");
		titleList.add(map);

		map = new HashMap<String, Object>();
		map.put("id", 6);
		map.put("title", "����");
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
				//����ID��ȡRadioButton��ʵ��
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
				//���·�ViewPager���������HorizontalScollView�л�
				mCurrentCheckedRadioLeft = rb.getLeft();//���µ�ǰ����������ߵľ���
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
			Intent intent1 = new Intent(this,Main01Activity.class);   //�������
			intent1.putExtra("id", i);        //�����Ϣ
			mViews.add(getView("View"+i, intent1));
			mViewPager.setAdapter(new MyPagerAdapter());//����ViewPager��������
		}
	}
	
	private void iniListener() {
		// TODO Auto-generated method stub
		mViewPager.setOnPageChangeListener(new MyPagerOnPageChangeListener());
	}
	
	/**
	 * ViewPager��������
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
	 * ViewPager��PageChangeListenerҳ��ı������
	 */
	
	private class MyPagerOnPageChangeListener implements OnPageChangeListener{

		public void onPageScrollStateChanged(int arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onPageScrolled(int arg0, float arg1, int arg2) {
			// TODO Auto-generated method stub
			
		}
		/**
		 * ����ViewPager��ʱ��,���Ϸ���HorizontalScrollView�Զ��л�
		 */
		public void onPageSelected(int position) {
			// TODO Auto-generated method stub
			RadioButton radioButton = (RadioButton) findViewById(_id+position);
			radioButton.performClick();
		}
		
	}
	
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

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
	//�ֲ�ͼ���
	
		//ͼƬ����¼�
	    private class pagerImageOnClick implements View.OnClickListener{

	        public void onClick(View v) {
	        	//��ת�����  
	            Intent intent = new Intent();  
	            intent.setAction(Intent.ACTION_VIEW); 
	        	switch (v.getId()){
		        	case R.id.a: 
		                intent.setData(Uri.parse(burls[0]));  
		                break;
		        	case R.id.b: 
		                intent.setData(Uri.parse(burls[1]));  
		                break;
		        	case R.id.c: 
		                intent.setData(Uri.parse(burls[2]));  
		                break;
		        	case R.id.d: 
		                intent.setData(Uri.parse(burls[3]));  
		                break;
		        	case R.id.e: 
		                intent.setData(Uri.parse(burls[4]));  
		                break;
	        	}
	        	startActivity(intent);
	        }
	    }
		private class bViewPagerAdapter extends PagerAdapter {

			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return bimages.size();
			}

			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				// TODO Auto-generated method stub
				return arg0 == arg1;
			}
			
			@Override
			public void destroyItem(ViewGroup view,int position,Object object){
				view.removeView(bimages.get(position));
			}
			
			@Override
			public Object instantiateItem(ViewGroup view,int position){
				view.addView(bimages.get(position));  
	            return bimages.get(position);  
			}
	    	
	    }
	    
	    @Override
	    public boolean onCreateOptionsMenu(Menu menu){
	    	getMenuInflater().inflate(R.menu.main, menu);  
	        return true; 
	    }
	    
	    /** 
	     * �����̳߳ض�ʱִ�ж����ֲ� 
	     */  
	    @Override  
	    protected void onStart() {  
	        // TODO Auto-generated method stub  
	        super.onStart();  
	        bscheduledExecutorService = Executors.newSingleThreadScheduledExecutor();  
	        bscheduledExecutorService.scheduleWithFixedDelay(  
	                new ViewPageTask(),   
	                2,   
	                2,   
	                TimeUnit.SECONDS);  
	    }  
	    
	    /** 
	     * ͼƬ�ֲ����� 
	     * 
	     */  
	    private class ViewPageTask implements Runnable{

			public void run() {
				// TODO Auto-generated method stub
				bcurrentItem = (bcurrentItem + 1) % bimageIds.length;  
	            bHandler.sendEmptyMessage(0);
			} 
	        
	    }  
	    /** 
	     * �������̴߳��ݹ��������� 
	     */  
	    private Handler bHandler = new Handler(){  
	        public void handleMessage(android.os.Message msg) {  
	        	bViewPaper.setCurrentItem(bcurrentItem);  
	        };  
	    };  
	    
	    @Override  
	    protected void onStop() {  
	        // TODO Auto-generated method stub  
	        super.onStop();  
	        if(bscheduledExecutorService != null){  
	            bscheduledExecutorService.shutdown();  
	            bscheduledExecutorService = null;  
	        }  
	    }    
}
