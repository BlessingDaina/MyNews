package com.example.mynews;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.examle.mynews.utils.NewsUtils;
import com.example.mynews.db.SqlNewsHelper;
import com.example.mynews_adapter.commentAdapter;
import com.example.mynews_bean.Comments;
import com.example.mynews_bean.News;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class NewsDetailActivity extends Activity {
	
	 private ArrayList<Comments> list = null;
	 private Context context;
	 private commentAdapter cAdapter = null;
	 private ListView comment_listView;
	 private ImageView image;
	 private TextView news_detail_title;
	 private TextView news_detail_time;
	 private TextView news_detail_content;
	 private Button comment_btn;
	 private EditText area;
	 private SqlNewsHelper helper;
	 protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news_detail);
		
		context = this;
		helper = new SqlNewsHelper(context, "news.db", null, 2);
		comment_listView = (ListView) findViewById(R.id.comment_listView);
		list = new ArrayList<Comments>();
		
		
		
		//获取显示详情容器
		news_detail_title = (TextView) findViewById(R.id.news_detail_title);
		news_detail_time = (TextView) findViewById(R.id.news_detail_time);
		news_detail_content = (TextView) findViewById(R.id.news_detail_content);
		area = (EditText) findViewById(R.id.comment_area);
		image = (ImageView) findViewById(R.id.comment_img);
		//取得启动该Activity的Intent对象   
        final Intent intent =getIntent();
        
        /*取出Intent中附加的数据*/ 
        String id = intent.getStringExtra("news_id");
        String title = intent.getStringExtra("title");   
        String time = intent.getStringExtra("news_time");    
        String content = intent.getStringExtra("des");
        String imgurl = intent.getStringExtra("news_url");
		
        
        String img = "news_1";
        Resources resources = context.getResources();
		//获取图片
        int imgid = context.getResources().getIdentifier(imgurl, "drawable",
				 context.getPackageName());
		
        //为容器赋值
        news_detail_title.setText(Html.fromHtml(title));
        news_detail_time.setText(Html.fromHtml(time));
        news_detail_content.setText(Html.fromHtml(content));
        image.setImageDrawable(resources.getDrawable(imgid));//设置imageView的图片
      //查找评论
        final ContentResolver cr2 = NewsDetailActivity.this.getContentResolver();
		final Uri uri2 = Uri.parse("content://com.example.mynews.db/comments_table");
		
		Cursor c2 = cr2.query(uri2, null, null, null,null );
		final ArrayList<Comments> list = NewsUtils.getAllComments(context,c2,intent.getIntExtra("news_id", 0));
			
		System.out.println("newsdetailsActivity");
		cAdapter = new commentAdapter((ArrayList<Comments>) list, context);
		comment_listView.setAdapter(cAdapter);
		
		comment_btn = (Button) findViewById(R.id.btn_comment);
        
        //监听button事件
		comment_btn.setOnClickListener(new OnClickListener() {
            

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm");
				
				//1
				SQLiteDatabase db = helper.getWritableDatabase(); 
//				ContentValues values = new ContentValues();
//				
////				db.beginTransaction();
//
//				values.put("news_id", intent.getIntExtra("news_id", 0));
//				values.put("comment", area.getText().toString());
//				Log.v("xxx", area.getText().toString());
//				values.put("comment_time", df.format(new Date()));
//				long id = db.insert("comments_table","", values);
//				db.setTransactionSuccessful();
				
				
				//2
//				SQLiteDatabase db = null;
				String _sql = "insert into comments_table(news_id,comment,comment_time) values(?,?,?)";  
				SQLiteStatement stat = db.compileStatement(_sql);  
		        db.beginTransaction();  
		       
	            stat.bindLong(1, intent.getIntExtra("news_id", 0)) ;
	            stat.bindString(2, area.getText().toString());  
	            stat.bindString(3, df.format(new Date()));
		            
	            stat.executeInsert();  
		        
		        db.setTransactionSuccessful();  
		        db.endTransaction();
		        
		        list.add(new Comments(intent.getIntExtra("news_id", 0),df.format(new Date()),area.getText().toString()));
//		        Cursor c2 = cr2.query(uri2, null, null, null,null );
//				ArrayList<Comments> list = NewsUtils.getAllComments(context,c2,intent.getIntExtra("news_id", 0));
//					
//				System.out.println("newsdetailsActivity");
				cAdapter = new commentAdapter((ArrayList<Comments>) list, context);
				comment_listView.setAdapter(cAdapter);
				
//				Toast.makeText(NewsDetailActivity.this, list.size(), Toast.LENGTH_SHORT).show();
				
				Log.v("评论长度",String.valueOf(list.size()));
				Log.v("评论内容：", area.getText().toString());
//				values.clear();
				
//				if (id != -1) 
//					Toast.makeText(NewsDetailActivity.this, "插入成功", Toast.LENGTH_SHORT).show();
//				else 
//					Toast.makeText(NewsDetailActivity.this, "插入失败", Toast.LENGTH_SHORT).show();
				
			}
        });
	}
	 
}
