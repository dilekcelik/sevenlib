package com.example.sevenlib;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button BSAY;
	Button name1, name2, name3, name4, name5, name6, name7, name8, name9, name10,
	name11, name12, name13, name14, name15, name16, name17, name18, name19, name20;
	TextView tvisim, tvSAYI;
	int say = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		super.onCreate(savedInstanceState);
		// Get the view from activity_main.xml
		setContentView(R.layout.activity_main);
		

		
		BSAY = (Button) findViewById(R.id.bSay);
		name1 = (Button) findViewById(R.id.bName1);
		name2 = (Button) findViewById(R.id.bName2);
		name3 = (Button) findViewById(R.id.bName3);
		name4 = (Button) findViewById(R.id.bName4);
		name5 = (Button) findViewById(R.id.bName5);
		name6 = (Button) findViewById(R.id.bName6);
		name7 = (Button) findViewById(R.id.bName7);
		name8 = (Button) findViewById(R.id.bName8);
		name9 = (Button) findViewById(R.id.bName9);
		name10 = (Button) findViewById(R.id.bName10);
		name11 = (Button) findViewById(R.id.bName11);
		name12 = (Button) findViewById(R.id.bName12);
		name13 = (Button) findViewById(R.id.bName13);
		name14 = (Button) findViewById(R.id.bName14);
		name15 = (Button) findViewById(R.id.bName15);
		name16 = (Button) findViewById(R.id.bName16);
		name17 = (Button) findViewById(R.id.bName17);
		name18 = (Button) findViewById(R.id.bName18);
		name19 = (Button) findViewById(R.id.bName19);
		name20 = (Button) findViewById(R.id.bName20);
		
		tvSAYI = (TextView) findViewById(R.id.tvNumber);
		tvisim = (TextView) findViewById(R.id.tvIsim);
		
		BSAY.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				say ++;
				tvSAYI.setText(String.valueOf(say));
			
				
			}
		});
		
		
		name1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			say = 0;
			tvSAYI.setText(String.valueOf(0));
			tvisim.setText(getResources().getString(R.string.isim1));}});
		
		name2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim2));}});
		
		name3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim3));}});
		
		name4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim4));}});
		
		name5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim5));}});
		
		name6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			say = 0;
			tvSAYI.setText(String.valueOf(0));
			tvisim.setText(getResources().getString(R.string.isim6));}});
		
		name7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim7));}});
		
		name8.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim8));}});
		
		name9.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim9));}});
		
		name10.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim10));}});
		
		name11.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			say = 0;
			tvSAYI.setText(String.valueOf(0));
			tvisim.setText(getResources().getString(R.string.isim11));}});
		
		name12.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim12));}});
		
		name13.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim13));}});
		
		name14.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim14));}});
		
		name15.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim15));}});
		
		name16.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			say = 0;
			tvSAYI.setText(String.valueOf(0));
			tvisim.setText(getResources().getString(R.string.isim16));}});
		
		name17.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim17));}});
		
		name18.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim18));}});
		
		name19.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim19));}});
		
		name20.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				tvisim.setText(getResources().getString(R.string.isim20));}});
	}

	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
