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
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
		//取得启动该Activity的Intent对象   
        final Intent intent =getIntent();
        
        /*取出Intent中附加的数据*/ 
        String id = intent.getStringExtra("news_id");
        String title = intent.getStringExtra("title");   
        String time = intent.getStringExtra("news_time");    
        String content = intent.getStringExtra("des");
		
        //为容器赋值
        news_detail_title.setText(Html.fromHtml(title));
        news_detail_time.setText(Html.fromHtml(time));
        news_detail_content.setText(Html.fromHtml(content));
        
      //查找评论
        ContentResolver cr2 = NewsDetailActivity.this.getContentResolver();
		Uri uri2 = Uri.parse("content://com.example.mynews.db/comments_table");
		
		Cursor c2 = cr2.query(uri2, null, null, null,null );
		ArrayList<Comments> list = NewsUtils.getAllComments(context,c2,intent.getIntExtra("news_id", 0));
			
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
				
				SQLiteDatabase db = helper.getWritableDatabase(); 
				ContentValues values = new ContentValues();
				
				values.put("news_id", intent.getIntExtra("news_id", 0));
				values.put("comment", area.getText().toString());
				values.put("comment_time", df.format(new Date()));
				long id = db.insert("comments_table","", values);
				
				Log.v("评论内容：", area.getText().toString());
//				values.clear();
				
				if (id != -1) 
					Toast.makeText(NewsDetailActivity.this, "插入成功", Toast.LENGTH_SHORT).show();
				else 
					Toast.makeText(NewsDetailActivity.this, "插入失败", Toast.LENGTH_SHORT).show();
				
			}
        });
	}
}
