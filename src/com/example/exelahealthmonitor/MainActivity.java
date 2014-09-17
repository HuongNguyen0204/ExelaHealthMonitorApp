package com.example.exelahealthmonitor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button heartRateButton = (Button) findViewById(R.id.heartrate);
		heartRateButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent heartRatePage = new Intent(getApplicationContext(), HeartRate.class);
				startActivity(heartRatePage);
			}
		});
		Button respiratoryButton = (Button) findViewById(R.id.respiratory);
		respiratoryButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent respiratoryPage = new Intent(getApplicationContext(), Respiratory.class);
				startActivity(respiratoryPage);				
			}
		});
		Button ecgButton = (Button) findViewById(R.id.ecg);
		ecgButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent ecgPage = new Intent(getApplicationContext(), ECG.class);
				startActivity(ecgPage);
			}
		});
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
