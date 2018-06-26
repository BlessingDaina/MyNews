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
import android.content.ContentUris;
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
        final String id = intent.getStringExtra("news_id");
        final String title = intent.getStringExtra("title");   
        final String time = intent.getStringExtra("news_time");    
        final String content = intent.getStringExtra("des");
        final String imgurl = intent.getStringExtra("news_url");
       
        
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
		
		cAdapter = new commentAdapter((ArrayList<Comments>) list, context);
		comment_listView.setAdapter(cAdapter);
		
		
		comment_btn = (Button) findViewById(R.id.btn_comment);
        
        //监听button事件
		comment_btn.setOnClickListener(new OnClickListener() {
            

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			
				ContentValues values = new ContentValues();
				 
				values.put("news_id", intent.getIntExtra("news_id", 0));
				values.put("comment", area.getText().toString());
				values.put("comment_time", df.format(new Date()));
				
				Uri result = cr2.insert(uri2, values);
				
				comment_listView.invalidateViews();
				if(ContentUris.parseId(result) > 0){
					list.add(new Comments(intent.getIntExtra("news_id", 0),df.format(new Date()),area.getText().toString()));
					cAdapter = new commentAdapter((ArrayList<Comments>) list, context);
					comment_listView.setAdapter(cAdapter);
					area.getText().clear();
					Toast.makeText(NewsDetailActivity.this, "发表评论成功!", Toast.LENGTH_SHORT).show();
				}else{
					Toast.makeText(NewsDetailActivity.this, "发表评论失败!", Toast.LENGTH_SHORT).show();
				}
			}
        });
	}
	 
}
