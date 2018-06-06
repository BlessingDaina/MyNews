package com.example.mynews.db;

import java.util.ArrayList;

import com.example.mynews_bean.News;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteStatement;

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
				+"news_url VARCHAR )";
		db.execSQL(sql);
		
		
		
		//��ʼ������
		ArrayList<News> lists = new ArrayList<News>();
		Newslist newlist = new Newslist();
		lists = newlist.initNews();
		
		String _sql = "insert into news_table(type_id,title,des,img,news_url) values(?,?,?,?,?)";  
        SQLiteStatement stat = db.compileStatement(_sql);  
        db.beginTransaction();  
        for (News list : lists) {  
            stat.bindLong(1, list.getType_id()) ;
            stat.bindString(2, list.getTitle());  
            stat.bindString(3, list.getDes()); 
            stat.bindString(4, list.getImg());  
            stat.bindString(5, list.getNews_url());
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
