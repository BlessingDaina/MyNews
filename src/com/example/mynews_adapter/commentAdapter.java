package com.example.mynews_adapter;

import java.util.LinkedList;

import com.example.mynews_bean.Comments;
import com.example.mynews_bean.News;
import com.example.mynews_bean.NewsBean;

import com.example.mynews.R;
import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class commentAdapter extends BaseAdapter{
	private LinkedList<Comments> commentList;
    private Context context;

    public commentAdapter(LinkedList<Comments> commentList, Context context) {
        this.commentList = commentList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return commentList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view = null;  
        //1.����converView�Ż�listview,����һ��view��Ϊgetview�ķ���ֵ������ʾһ����Ŀ  
        if(convertView != null){  
            view = convertView;  
        }else {  
            //����һ���Ƽ�  
            //context:������, resource:Ҫת����view�����layout��id, root:��layout��root(ViewGroup)��һ����Ϊcodify�ķ���ֵ,һ�㴫null  
            view = View.inflate(context, R.layout.comment_item, null);//��һ�������ļ�ת����һ��view����  
        }  
        
        System.out.println("commentAdapter");
        TextView comment_time = (TextView) view.findViewById(R.id.comment_time);
        TextView comment_content = (TextView) view.findViewById(R.id.comment_content);
        
        Comments comment = commentList.get(position);
        comment_time.setText(commentList.get(position).getComment_time());
        comment_content.setText(commentList.get(position).getComment());
          
        return view; 
	}
}
