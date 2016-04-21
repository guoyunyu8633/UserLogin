package com.it.userlogin;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	public void fun(View view) {//方法
		//1.找到控件
        EditText nameET = (EditText) findViewById(R.id.name_et); 
        EditText passET = (EditText) findViewById(R.id.pass_et); 
        //2.取控件中输入的值
        String name=nameET.getText().toString();
        String pass=passET.getText().toString();
        		//3.判断输入的值是否正确，并返回结果
        if(name.equals("it") && pass.equals("it"))
        	Toast.makeText(this, "成功", Toast.LENGTH_SHORT).show();
        else
        	Toast.makeText(this, "失败", Toast.LENGTH_SHORT).show();
        
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
