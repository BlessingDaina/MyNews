package com.examle.mynews.utils;

import java.util.ArrayList;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.example.mynews.R;
import com.example.mynews_bean.NewsBean;

public class NewsUtils {
	//��װ���ŵļ����ݵ�list�з���,�Ժ����ݻ�����ݿ��л�ȡ  
    public static ArrayList<NewsBean> getAllNews(Context context,Cursor c,int meun_id) {
    	ArrayList<NewsBean> arrayList = new ArrayList<NewsBean>();  
    	Resources resources = context.getResources();
    	
    	String img = "dark";
    	for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
    		//���ݲ˵���id��ȡ��ͬ���͵�����
    		if(c.getInt(1) == meun_id){
				NewsBean newsBean = new NewsBean(); 
				newsBean.id = c.getInt(0);
				newsBean.type_id = c.getInt(1);
				newsBean.title =c.getString(2);  
				newsBean.des= c.getString(3);
				newsBean.news_url= c.getString(0);  
				if(c.getString(4) != ""){
					img = c.getString(c.getColumnIndex("img"));
				}
				int resLD = resources.getIdentifier(img, "drawable",context.getPackageName());
				//int imgID = getResourceIdByIdentifier(context,img);;
				newsBean.icon = resources.getDrawable(R.drawable.dark);  
				arrayList.add(newsBean);
//				Log.isLoggable("����id�����ݿ��ȡ", c.getInt(c.getColumnIndex("id")));
//				Log.isLoggable("����id��newsBean��ȡ", newsBean.id);
				Log.v("����id�����ݿ��ȡ", String.valueOf(c.getInt(0)));
				Log.v("����id��newsBean��ȡ",String.valueOf( newsBean.id));
    		}
		}
        return arrayList;
    }
}
