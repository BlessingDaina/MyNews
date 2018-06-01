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
	        //设置为无标题栏  
	        requestWindowFeature(Window.FEATURE_NO_TITLE);  
	        //设置为全屏模式  
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  
	                WindowManager.LayoutParams.FLAG_FULLSCREEN);  
	        setContentView(R.layout.welcome_main);  
	   
	  
	        //创建Timer对象  
	        Timer timer = new Timer();  
	        //创建TimerTask对象  
	        TimerTask timerTask = new TimerTask() {  
	            @Override  
	            public void run() {  
	                Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);  
	                startActivity(intent);  
	                finish();  
	            }  
	        };  
	        //使用timer.schedule（）方法调用timerTask，定时3秒后执行run  
	        timer.schedule(timerTask, 3000);  
	}

}

