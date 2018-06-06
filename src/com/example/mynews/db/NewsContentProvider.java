package com.example.mynews.db;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;

public class NewsContentProvider extends ContentProvider{

	private SqlNewsHelper dbHelper = null;
	//定义一个UriMatcher对象
	private static final UriMatcher MATCHER = new UriMatcher(UriMatcher.NO_MATCH);
	private static final int NEW_TABLE = 1;
	
	static {
		MATCHER.addURI("com.example.mynews.db", "news_table", NEW_TABLE);
	}
	

	@Override
	public String getType(Uri uri) {
		// TODO Auto-generated method stub
		switch (MATCHER.match(uri)){
		case NEW_TABLE:
			return "vnd.android.cursor.dir/news_table";
		default:
			throw new IllegalArgumentException("Unknow uri: "+uri.toString());
		
	}
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		// TODO Auto-generated method stub
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		Uri insertUri = null;
		
		switch (MATCHER.match(uri)){
			case NEW_TABLE:
				long rowId = db.insert("news_table", "", values);
				insertUri = ContentUris.withAppendedId(uri, rowId);
				return insertUri;
			default:
				throw new IllegalArgumentException("Unknow uri: "+uri.toString());
			
		}
	}

	@Override
	public boolean onCreate() {
		// TODO Auto-generated method stub
		Log.d("Test","ContentProvider - onCreate()");
		dbHelper = new SqlNewsHelper(this.getContext(),"NEWS.db",null,1);
		return false;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
			String sortOrder) {
		// TODO Auto-generated method stub
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		
		switch (MATCHER.match(uri)){
			case NEW_TABLE:
				return db.query("news_table", projection, selection, selectionArgs, null, null, sortOrder);
			default:
				throw new IllegalArgumentException("Unknow uri: "+uri.toString());
			
		}
		
	}

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		int count = 0;
		
		switch (MATCHER.match(uri)){
			case NEW_TABLE:
				count = db.delete("news_table", selection, selectionArgs);
				return count;
			default:
				throw new IllegalArgumentException("Unknow uri: "+uri.toString());
			
		}
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		int count = 0;
		
		switch (MATCHER.match(uri)){
			case NEW_TABLE:
				count = db.update("news_table",values, selection, selectionArgs);
				return count;
			default:
				throw new IllegalArgumentException("Unknow uri: "+uri.toString());
			
		}
	}

}

