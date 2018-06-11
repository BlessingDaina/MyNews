package com.example.mynews.db;

import java.util.ArrayList;

import com.example.mynews_bean.Comments;
import com.example.mynews_bean.News;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

public class SqlNewsHelper extends SQLiteOpenHelper{
	
	
	public SqlNewsHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String sql = "CREATE TABLE news_table ("
				+"id INTEGER PRIMARY KEY AUTOINCREMENT,"
				+"type_id INTEGER,"
				+"title VARCHAR ,"
				+"des VARCHAR ,"
				+"img VARCHAR,"
				+"news_time VARCHAR)";
		db.execSQL(sql);
		
		
		
		//初始化数据
		ArrayList<News> lists = new ArrayList<News>();
		Newslist newlist = new Newslist();
		lists = newlist.initNews();
		
		String _sql = "insert into news_table(type_id,title,des,img,news_time) values(?,?,?,?,?)";  
        SQLiteStatement stat = db.compileStatement(_sql);  
        db.beginTransaction();  
        for (News list : lists) {  
            stat.bindLong(1, list.getType_id()) ;
            stat.bindString(2, list.getTitle());  
            stat.bindString(3, list.getDes()); 
            stat.bindString(4, list.getImg());  
            stat.bindString(5, list.getNews_time());
            stat.executeInsert();  
        }  
        db.setTransactionSuccessful();  
        db.endTransaction();  
        
        
        
        sql = "CREATE TABLE comments_table ("
				+"id INTEGER PRIMARY KEY AUTOINCREMENT,"
				+"news_id INTEGER ,"
				+"comment VARCHAR ,"
				+"comment_time VARCHAR)";
		db.execSQL(sql);
		//初始化数据
		ArrayList<Comments> Clists = new ArrayList<Comments>();
		CommentsList commentlist = new CommentsList();
		Clists = commentlist.initComments();
		
		_sql = "insert into comments_table(news_id,comment,comment_time) values(?,?,?)";  
        stat = db.compileStatement(_sql);  
        db.beginTransaction();  
        for (Comments list : Clists) {  
            stat.bindLong(1, list.getNews_id()) ;
            stat.bindString(2, list.getComment());  
            stat.bindString(3, list.getComment_time());
            
            stat.executeInsert();  
	        }  
	        db.setTransactionSuccessful();  
	        db.endTransaction();
}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
