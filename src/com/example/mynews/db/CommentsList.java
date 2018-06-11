package com.example.mynews.db;

import java.util.ArrayList;

import com.example.mynews_bean.Comments;

public class CommentsList {

	static ArrayList<Comments> comments = new ArrayList<Comments>();
	
	public static ArrayList<Comments> initComments(){
		
		comments.add(new Comments(1,"据西方媒体报道，如果消息属实，意味着华盛顿准备采取更多行动来展示其对华施压的姿态。在这个消息传出的同一天但是随后美国太平洋空军发言人又否认那两架B-52飞到了南沙附近。 </p>\n",
				"2018/6/10 09:20"));
		comments.add(new Comments(1,"派军舰过台湾海峡，B-52飞抵中国南沙，放这些传闻的美国想唬谁这个地方尚未形成中美军事.空军发言人又否认那两架B-52飞到了南沙附近。 </p>\n",
				"2018/6/10 09:20"));
		return comments;
		
	}
	
}
