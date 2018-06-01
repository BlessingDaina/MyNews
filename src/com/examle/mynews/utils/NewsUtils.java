package com.examle.mynews.utils;

import java.util.ArrayList;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import com.example.mynews.R;
import com.example.mynews_bean.NewsBean;

public class NewsUtils {
	//��װ���ŵļ����ݵ�list�з���,�Ժ����ݻ�����ݿ��л�ȡ  
    public static ArrayList<NewsBean> getAllNews(Context context) {
    	ArrayList<NewsBean> arrayList = new ArrayList<NewsBean>();  
    	Resources resources = context.getResources();
        for(int i = 0 ;i <100;i++)  
        {  
            NewsBean newsBean = new NewsBean();  
            newsBean.title ="�������ɹ�";  
            newsBean.des= "�����㷨�ƶ��Ƕ����ֵ��ַ����׸�����������";  
            newsBean.news_url= "http://www.sina.cn";  
            newsBean.icon = resources.getDrawable(R.drawable.dark);  
            arrayList.add(newsBean);  
  
  
            NewsBean newsBean1 = new NewsBean();  
            newsBean1.title ="�ƶ��Ƕ�ɪɪ�����ٶ�";  
            newsBean1.des= "�ط��ϵķ����׸������׸����������ַ����׸����������ָ���";  
            newsBean1.news_url= "http://www.baidu.cn";  
            newsBean1.icon = resources.getDrawable(R.drawable.one);
            arrayList.add(newsBean1);  
            	
  
            NewsBean newsBean2 = new NewsBean();  
            newsBean2.title ="����Ƥ������";  
            newsBean2.des= "�ѽ�����뿪�����ɨ����뿪���ؿշ���˹���˷ѵ��������ּ��������";  
            newsBean2.news_url= "http://www.qq.com";  
            newsBean2.icon = resources.getDrawable(R.drawable.fish);
            arrayList.add(newsBean2);  
        }  
        return arrayList;
    }
}
