package com.example.mynews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.examle.mynews.utils.NewsUtils;
import com.example.mynews_adapter.commentAdapter;
import com.example.mynews_bean.Comments;
import com.example.mynews_bean.News;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class NewsDetailActivity extends Activity {
	
	 private ArrayList<Comments> list = null;
	 private Context context;
	 private commentAdapter cAdapter = null;
	 private ListView comment_listView;
	 private ImageView image;
	 private TextView news_detail_title;
	 private TextView news_detail_time;
	 private TextView news_detail_content;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news_detail);
		
		context = this;
		
		comment_listView = (ListView) findViewById(R.id.comment_listView);
		list = new ArrayList<Comments>();
		
		list.add(new Comments(0,"2018/06/08\t\t14:53", "�ɾ�����̨�庣Ͽ��B-52�ɵ��й���ɳ������Щ���ŵ������뻣˭����ط���δ�γ�������˭����ط���δ�γɻ�˭����ط���δ�γɾ���."));
		list.add(new Comments(0,"2018/06/08\t\t14:53", "�ɾ�����̨�庣Ͽ��B-52�ɵ��й���ɳ������Щ���ŵ������뻣˭����ط���δ�γ���������."));
		list.add(new Comments(0,"2018/06/08\t\t14:53", "�ɾ�����̨�庣Ͽ��B-52�ɵ��й���ɳ������Щ���ŵ������뻣˭����ط���δ�γ���������."));
		list.add(new Comments(0,"2018/06/08\t\t14:53", "�ɾ�����̨�庣Ͽ��B-52�ɵ��й���ɳ������Щ���ŵ������뻣˭����ط���δ�γ���������."));
		list.add(new Comments(0,"2018/06/08\t\t14:53", "�ɾ�����̨�庣Ͽ��B-52�ɵ��й���ɳ������Щ���ŵ������뻣˭����ط���δ�γ���������."));
		
		
		
		//��ȡ��ʾ��������
		news_detail_title = (TextView) findViewById(R.id.news_detail_title);
		news_detail_time = (TextView) findViewById(R.id.news_detail_time);
		news_detail_content = (TextView) findViewById(R.id.news_detail_content);
		//ȡ��������Activity��Intent����   
        Intent intent =getIntent();
        
        /*ȡ��Intent�и��ӵ�����*/ 
//        int id = intent.getIntExtra("id", 100);
        String title = intent.getStringExtra("title");   
        String time = intent.getStringExtra("news_time");    
        String content = intent.getStringExtra("des");
		
        //Ϊ������ֵ
        news_detail_title.setText(Html.fromHtml(title));
        news_detail_time.setText(Html.fromHtml(time));
        news_detail_content.setText(Html.fromHtml(content));
        
      //��������
//        ContentResolver cr2 = NewsDetailActivity.this.getContentResolver();
//		Uri uri2 = Uri.parse("content://com.example.mynews.db/comments_table");
//		
//		Cursor c2 = cr2.query(uri2, null, null, null,null );
//		ArrayList<Comments> list = NewsUtils.getAllComments(context,c2,intent.getIntExtra("news_id", 0));
//		
//		
		System.out.println("newsdetailsActivity");
		cAdapter = new commentAdapter((ArrayList<Comments>) list, context);
		comment_listView.setAdapter(cAdapter);
	}
}
