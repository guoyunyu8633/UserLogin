package com.it.userlogin;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	public void fun(View view) {//����
		//1.�ҵ��ؼ�
        EditText nameET = (EditText) findViewById(R.id.name_et); 
        EditText passET = (EditText) findViewById(R.id.pass_et); 
        //2.ȡ�ؼ��������ֵ
        String name=nameET.getText().toString();
        String pass=passET.getText().toString();
        		//3.�ж������ֵ�Ƿ���ȷ�������ؽ��
        if(name.equals("it") && pass.equals("it"))
        	Toast.makeText(this, "�ɹ�", Toast.LENGTH_SHORT).show();
        else
        	Toast.makeText(this, "ʧ��", Toast.LENGTH_SHORT).show();
        
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
