package com.example.mynews;

import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.WindowManager;


public class WelcomeActivity extends Activity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState){
		 super.onCreate(savedInstanceState);  
	        //����Ϊ�ޱ�����  
	        requestWindowFeature(Window.FEATURE_NO_TITLE);  
	        //����Ϊȫ��ģʽ  
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  
	                WindowManager.LayoutParams.FLAG_FULLSCREEN);  
	        setContentView(R.layout.welcome_main);  
	   
	  
	        //����Timer����  
	        Timer timer = new Timer();  
	        //����TimerTask����  
	        TimerTask timerTask = new TimerTask() {  
	            @Override  
	            public void run() {  
	                Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);  
	                startActivity(intent);  
	                finish();  
	            }  
	        };  
	        //ʹ��timer.schedule������������timerTask����ʱ3���ִ��run  
	        timer.schedule(timerTask, 3000);  
	}

}

