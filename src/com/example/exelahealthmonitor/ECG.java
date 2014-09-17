package com.example.exelahealthmonitor;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ECG extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ecg_page);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ecg, menu);
		return true;
	}

}
