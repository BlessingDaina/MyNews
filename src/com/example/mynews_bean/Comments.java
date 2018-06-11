package com.example.mynews_bean;

public class Comments {
	
	public int id;
	public int news_id;
	public String comment;
	public String comment_time;
	
	public Comments(){
		
	}
	public Comments(int news_id,String comment_time,String comment){
		this.news_id = news_id;
		this.comment = comment;
		this.comment_time = comment_time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getComment_time() {
		return comment_time;
	}
	public void setComment_time(String comment_time) {
		this.comment_time = comment_time;
	}
	public int getNews_id() {
		return news_id;
	}
	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}
	
	
	
}
