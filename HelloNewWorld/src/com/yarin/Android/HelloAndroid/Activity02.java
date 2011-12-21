package com.yarin.Android.HelloAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.Button;


public class Activity02 extends Activity{
	
	static final String TAG2 ="HelloNewWorld2";
    
	public void onCreate(Bundle savedInstanceState){
	Log.e(TAG2,"Creat2");		
	super.onCreate(savedInstanceState);
	//Show the view of activity2 which is defined in mainactivity.xml
	Log.e(TAG2,"Layout2");
	setContentView(R.layout.mainactivity);
	//根据ID编号从布局文件mainactivity中获取按键
	Button button=(Button)findViewById(R.id.button2);
	
	button.setOnClickListener(new Button.OnClickListener(){
		public void onClick(View v){
			Intent intent=new Intent();
			
			intent.setClass(Activity02.this,HelloNewWorld.class);
			
			startActivity(intent);
			
			Activity02.this.finish();
		}
	});		
	}
}