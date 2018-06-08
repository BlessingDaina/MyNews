package com.example.mynews;

import java.util.LinkedList;
import java.util.List;

import com.example.mynews_adapter.commentAdapter;
import com.example.mynews_bean.Comments;
import com.example.mynews_bean.News;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class NewsDetailActivity extends Activity {
	
	 private List<Comments> list = null;
	 private Context context;
	 private commentAdapter cAdapter = null;
	 private ListView comment_listView;
	    
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news_detail);
		
		context = this;
		
		comment_listView = (ListView) findViewById(R.id.comment_listView);
		list = new LinkedList<Comments>();
		
		list.add(new Comments("2018/06/08\t\t14:53", "派军舰过台湾海峡，B-52飞抵中国南沙，放这些传闻的美国想唬谁这个地方尚未形成中美唬谁这个地方尚未形成唬谁这个地方尚未形成军事."));
		list.add(new Comments("2018/06/08\t\t14:53", "派军舰过台湾海峡，B-52飞抵中国南沙，放这些传闻的美国想唬谁这个地方尚未形成中美军事."));
		list.add(new Comments("2018/06/08\t\t14:53", "派军舰过台湾海峡，B-52飞抵中国南沙，放这些传闻的美国想唬谁这个地方尚未形成中美军事."));
		list.add(new Comments("2018/06/08\t\t14:53", "派军舰过台湾海峡，B-52飞抵中国南沙，放这些传闻的美国想唬谁这个地方尚未形成中美军事."));
		list.add(new Comments("2018/06/08\t\t14:53", "派军舰过台湾海峡，B-52飞抵中国南沙，放这些传闻的美国想唬谁这个地方尚未形成中美军事."));
	     
		System.out.println("newsdetailsActivity");
		cAdapter = new commentAdapter((LinkedList<Comments>) list, context);
		comment_listView.setAdapter(cAdapter);
	}
}
