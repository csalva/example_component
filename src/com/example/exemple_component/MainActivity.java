package com.example.exemple_component;

import com.example.component_android.Date;
import com.example.component_android.DateHandler;
import com.example.component_android.component_android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener, DateHandler{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		DateHandler handler = this;
		
		component_android.setHandler(handler);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v.getId() == R.id.button1) {
			component_android.getFecha();
		}
	}

	@Override
	public void dateResponse(Date date) {
		// TODO Auto-generated method stub
		Toast.makeText(this, ""+date.getDay()+" / "+date.getMonth()+" / "+date.getYear(), Toast.LENGTH_SHORT).show();
	}

}

