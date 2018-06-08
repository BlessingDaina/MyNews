package com.example.mynews;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;


public class WelcomeActivity extends Activity{
	AnimationDrawable welcomeAnimation;
	
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState){
		 super.onCreate(savedInstanceState);  
	        //设置为无标题栏  
	        requestWindowFeature(Window.FEATURE_NO_TITLE);  
	        //设置为全屏模式  
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  
	                WindowManager.LayoutParams.FLAG_FULLSCREEN);  
	        setContentView(R.layout.welcome_main);  
	   
	        ImageView welcomeImage = (ImageView) this.findViewById(R.id.imageView);
	        welcomeImage.setBackgroundResource(R.drawable.welcomeanimation);
	        welcomeAnimation = (AnimationDrawable) welcomeImage.getBackground();
	        welcomeAnimation.start();
	        
	        int duration = 0; 

	        for(int i=0;i<welcomeAnimation.getNumberOfFrames();i++){ 

	            duration += welcomeAnimation.getDuration(i); 

	        } 

	        Handler handler = new Handler(); 

	        handler.postDelayed(new Runnable() { 

	            public void run() { 
	            	Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);  
	                startActivity(intent);  
	                finish();  	
	            } 

	        }, duration); 
	}
	
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			Intent intent = new Intent();  
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.cartier.cn/?utm_source=baidu&utm_medium=brandzone&utm_content=pc_mainzone_title"));  
            startActivity(intent);
            return true;
        }else
		return false;
	    
    }


}

