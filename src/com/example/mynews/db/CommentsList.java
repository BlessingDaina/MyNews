package com.example.mynews.db;

import java.util.ArrayList;

import com.example.mynews_bean.Comments;

public class CommentsList {

	static ArrayList<Comments> comments = new ArrayList<Comments>();
	
	public static ArrayList<Comments> initComments(){
		
		comments.add(new Comments(1,"������ý�屨���������Ϣ��ʵ����ζ�Ż�ʢ��׼����ȡ�����ж���չʾ��Ի�ʩѹ����̬���������Ϣ������ͬһ�쵫���������̫ƽ��վ��������ַ���������B-52�ɵ�����ɳ������ </p>\n",
				"2018/6/10 09:20"));
		comments.add(new Comments(1,"�ɾ�����̨�庣Ͽ��B-52�ɵ��й���ɳ������Щ���ŵ������뻣˭����ط���δ�γ���������.�վ��������ַ���������B-52�ɵ�����ɳ������ </p>\n",
				"2018/6/10 09:20"));
		return comments;
		
	}
	
}
