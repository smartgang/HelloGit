package com.yarin.Android.HelloAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class HelloNewWorld extends Activity {
	
	/* ����TAG��ǩ����ӡ������־*/
	static final String TAG ="HelloNewWorld";
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*��ӡLog��Ϣ*/
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
				/* �½�һ��Intent���� */
				Intent intent = new Intent();
				/* ָ��intentҪ�������� */
				intent.setClass(HelloNewWorld.this, Activity02.class);
				/* ����һ���µ�Activity */
				startActivity(intent);
				/* �رյ�ǰ��Activity */
				HelloNewWorld.this.finish();
			}
		};      
}


