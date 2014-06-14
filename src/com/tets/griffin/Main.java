package com.tets.griffin;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
			
		final Button text = (Button)findViewById(R.id.text) ;
		final Button isps = (Button)findViewById(R.id.isps) ;
		final Button pictures = (Button)findViewById(R.id.pictures) ;
		final Button videos = (Button)findViewById(R.id.videos) ;
		
		
		text.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t = new Intent(Main.this , Text.class);
				startActivity(t);
					
			}
		});
		isps.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent is = new Intent(Main.this , Isps.class);
				startActivity(is);
				
				
			}
		});
		
		pictures.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			   Intent pic = new Intent(Main.this ,Pictures.class);
			   startActivity(pic);
			   
			}
		});
		
		videos.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent vid = new Intent (Main.this , Videos.class);
				startActivity(vid);
				
				
			}
		});
		
		
	}

	

	
	


	

}
