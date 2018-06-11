package com.examle.mynews.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.example.mynews.R;
import com.example.mynews_bean.Comments;
import com.example.mynews_bean.News;
import com.example.mynews_bean.NewsBean;

public class NewsUtils {
	//封装新闻的假数据到list中返回,以后数据会从数据库中获取  
    public static ArrayList<NewsBean> getAllNews(Context context,Cursor c,int meun_id) {
    	ArrayList<NewsBean> arrayList = new ArrayList<NewsBean>();  
    	Resources resources = context.getResources();
    	
    	String img = "dark";
    	for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
    		//根据菜单的id获取不同类型的新闻
    		if(c.getInt(1) == meun_id){
				NewsBean newsBean = new NewsBean(); 
				newsBean.id = c.getInt(0);
				newsBean.type_id = c.getInt(1);
				newsBean.title =c.getString(2);  
				newsBean.des= c.getString(3);
				newsBean.news_time= c.getString(5);
				if(c.getString(4) != ""){
					img = c.getString(c.getColumnIndex("img"));
				}
				int resLD = resources.getIdentifier(img, "drawable",context.getPackageName());
				//int imgID = getResourceIdByIdentifier(context,img);;
				newsBean.icon = resources.getDrawable(R.drawable.dark);  
				arrayList.add(newsBean);
    		}
		}
        return arrayList;
    }
    
    public static ArrayList<Comments> getAllComments(Context context,Cursor c,int news_id){
    	ArrayList<Comments> list  = new ArrayList<Comments>();
    	Resources resources = context.getResources();
    	for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
    		//根据菜单的id获取不同类型的新闻
    		if(c.getInt(1) == news_id){
    			Comments cm = new Comments();
    			cm.setId(c.getInt(0));
    			cm.setNews_id(c.getInt(1));
    			cm.setComment(c.getString(3));
    			cm.setComment_time(c.getString(2));

    			list.add(cm);
    		}
    	}
		return list;
    }
}
