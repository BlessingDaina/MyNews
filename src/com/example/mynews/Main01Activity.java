package com.example.mynews;

import java.util.ArrayList;

import com.examle.mynews.utils.NewsUtils;
import com.example.mynews_adapter.NewsAdapter;
import com.example.mynews_bean.NewsBean;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class Main01Activity extends Activity {
	private TextView textView;
	private Context mContext;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_1);
		
		mContext = this;  
		  
        //养成先写思路，再写程序的习惯  
        //  1：用模拟新闻假数据，用list封装  
        //  2：布局ListView  
        //  3：获取ListView控件  
        //  4：创建一个adapter设置给listview  
        //  5：设置ListView条目单击事件  
  
        //1.获取新闻数据用list封装  
        ArrayList<NewsBean> allNews = NewsUtils.getAllNews(mContext);  
        //2.找到控件  
        ListView lv_news = (ListView) findViewById(R.id.lv_news);  
        //3.创建一个adapter设置给listview  
        NewsAdapter newsAdapter = new NewsAdapter(mContext, allNews);  
        lv_news.setAdapter(newsAdapter);  
        //4.设置listview条目的点击事件  
        lv_news.setOnItemClickListener(new OnItemClickListener(){

			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				 //需要获取条目上bean对象中url做跳转  
		        NewsBean bean = (NewsBean) parent.getItemAtPosition(position);  
		  
		        String url = bean.news_url;  
		  
		        //跳转浏览器  
		        Intent intent = new Intent(Main01Activity.this,NewsDetailActivity.class);  
		        intent.setData(Uri.parse(url));  
		        startActivity(intent);
		        
			}
        	
        });  
	}
	
}
