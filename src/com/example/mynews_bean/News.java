package com.example.mynews_bean;


public class News {
	public int id;
	public int type_id;
	public String title;
	public String des;
	public String img;
	public String news_url;
	
	public News(int type_id, String title, String des, String img,
			String news_url) {
		// TODO Auto-generated constructor stub
		this.type_id = type_id;
		this.title = title;
		this.des = des;
		this.img = img;
		this.news_url = news_url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getNews_url() {
		return news_url;
	}
	public void setNews_url(String news_url) {
		this.news_url = news_url;
	}
	
	
}
