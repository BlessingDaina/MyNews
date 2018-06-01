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
		  
        //������д˼·����д�����ϰ��  
        //  1����ģ�����ż����ݣ���list��װ  
        //  2������ListView  
        //  3����ȡListView�ؼ�  
        //  4������һ��adapter���ø�listview  
        //  5������ListView��Ŀ�����¼�  
  
        //1.��ȡ����������list��װ  
        ArrayList<NewsBean> allNews = NewsUtils.getAllNews(mContext);  
        //2.�ҵ��ؼ�  
        ListView lv_news = (ListView) findViewById(R.id.lv_news);  
        //3.����һ��adapter���ø�listview  
        NewsAdapter newsAdapter = new NewsAdapter(mContext, allNews);  
        lv_news.setAdapter(newsAdapter);  
        //4.����listview��Ŀ�ĵ���¼�  
        lv_news.setOnItemClickListener(new OnItemClickListener(){

			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				 //��Ҫ��ȡ��Ŀ��bean������url����ת  
		        NewsBean bean = (NewsBean) parent.getItemAtPosition(position);  
		  
		        String url = bean.news_url;  
		  
		        //��ת�����  
		        Intent intent = new Intent(Main01Activity.this,NewsDetailActivity.class);  
		        intent.setData(Uri.parse(url));  
		        startActivity(intent);
		        
			}
        	
        });  
	}
	
}
