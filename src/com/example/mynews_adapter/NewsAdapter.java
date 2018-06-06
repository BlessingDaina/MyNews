package com.example.mynews_adapter;

import java.util.ArrayList;

import com.example.mynews.R;
import com.example.mynews_bean.NewsBean;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsAdapter extends BaseAdapter {
	private ArrayList<NewsBean> list;  
	private Context context;  
	
	//ͨ�����췽������Ҫ��ʾ���������ݼ���  
    public NewsAdapter(Context context, ArrayList<NewsBean> list) {  
        this.list = list;  
        this.context = context;  
    } 
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		 View view = null;  
	        //1.����converView�Ż�listview,����һ��view��Ϊgetview�ķ���ֵ������ʾһ����Ŀ  
	        if(convertView != null){  
	            view = convertView;  
	        }else {  
	            //����һ���Ƽ�  
	            //context:������, resource:Ҫת����view�����layout��id, root:��layout��root(ViewGroup)��һ����Ϊcodify�ķ���ֵ,һ�㴫null  
	            view = View.inflate(context, R.layout.item_news_layout, null);//��һ�������ļ�ת����һ��view����  
	              
	            //������  
	            //ͨ��LayoutInflater������ת����view����  
	            //view =  LayoutInflater.from(context).inflate(R.layout.item_news_layout, null);  
	              
	            //��������ϵͳ������  
	            //ͨ��context��ȡϵͳ����õ�һ��LayoutInflater��ͨ��LayoutInflater��һ������ת��Ϊview����  
	            //LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);  
	            //view = layoutInflater.inflate(R.layout.item_news_layout, null);  
	              
	        }  
	        //2.��ȡview�ϵ��ӿؼ�����  
	        ImageView item_img_icon = (ImageView) view.findViewById(R.id.item_img_icon);  
	        TextView item_tv_des = (TextView) view.findViewById(R.id.item_tv_des);  
	        TextView item_tv_title = (TextView) view.findViewById(R.id.item_tv_title);  
	        //3.��ȡpostionλ����Ŀ��Ӧ��list�����е��������ݣ�Bean����  
	        NewsBean newsBean = list.get(position);  
	        //4.���������ø���Щ�ӿؼ�����ʾ  
	        item_img_icon.setImageDrawable(newsBean.icon);//����imageView��ͼƬ  
	        //ʹ��HTML��Դ���html��ǩ���ַ������и�ʽ��
	        item_tv_title.setText(newsBean.title);  
	        item_tv_des.setText(Html.fromHtml(newsBean.des));  
	          
	        return view;  
	}

}
