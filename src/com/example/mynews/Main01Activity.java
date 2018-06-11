package com.example.mynews;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.examle.mynews.utils.NewsUtils;
import com.example.mynews_adapter.NewsAdapter;
import com.example.mynews_bean.Comments;
import com.example.mynews_bean.News;
import com.example.mynews_bean.NewsBean;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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
		
		Intent intent = getIntent();//��ȡ������intent����
		final int typeid = intent.getIntExtra("id", 0);//��ȡ��ֵ�Եļ���
		  
        //������д˼·����д�����ϰ��  
        //  1��ͨ�����ݿ��ȡ���ţ���list��װ  
        //  2������ListView  
        //  3����ȡListView�ؼ�  
        //  4������һ��adapter���ø�listview  
        //  5������ListView��Ŀ�����¼�  
  
		
		
        //1.��ȡ����������list��װ  
		ContentResolver cr = Main01Activity.this.getContentResolver();
		Uri uri = Uri.parse("content://com.example.mynews.db/news_table");
		
		Cursor c = cr.query(uri, null, null, null,null );
		
        ArrayList<NewsBean> allNews = NewsUtils.getAllNews(mContext,c,typeid);  
//        System.out.println("�������:"+id);
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
//				ListView item = (ListView) parent;
		        NewsBean bean = (NewsBean) parent.getItemAtPosition(position);  
		        
        
		        
		        
		        //System.out.println("���ʱ��ʱ��--------��"+bean.news_time);
		        
		        //��ת�����  
		        Intent intent = new Intent(Main01Activity.this,NewsDetailActivity.class);
		        
		       
//		        
		        intent.putExtra("news_id",bean.id);
		        intent.putExtra("title", (String)bean.title);
		        intent.putExtra("des", (String)bean.des);
		        intent.putExtra("news_time", (String)bean.news_time); 
		        startActivity(intent);
			}
			
        	
        });
        
        c.close();
	}
	
}
