package com.yarin.Android.HelloAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class HelloNewWorld extends Activity {
	
	/* 定义TAG标签，打印调试日志*/
	static final String TAG ="HelloNewWorld";
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*打印Log信息*/
        Log.v(TAG,"VERBOSE");
        Log.d(TAG,"DEBUG");
        Log.i(TAG,"INFO");
        Log.w(TAG,"WARN");
        Log.e(TAG,"ERROR");
        
        setContentView(R.layout.main);
        
        Button button=(Button)findViewById(R.id.button1);
        
		button.setOnClickListener(button1);
    }
		private OnClickListener button1=new OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(HelloNewWorld.this, Activity02.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				HelloNewWorld.this.finish();
			}
		};      
}


