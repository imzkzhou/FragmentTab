package com.wpq.animation;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Window;

public class WelcomeActivity extends Activity{

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_welcome);
		
		StartActivityTask task = new StartActivityTask();
		task.execute();
	
	}
	

	private class StartActivityTask extends AsyncTask<Integer, Integer, Long> {

		@Override
		protected Long doInBackground(Integer... params) {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return (long)0;
		}
		
		protected void onCancelled() {
			super.onCancelled(); 
		}
		
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
			}
		
		protected void onPostExecute(Long result){
			startActivity(new Intent(WelcomeActivity.this,MainActivity.class));
			finish();
		}
		
		protected void onProgressUpdate(Integer... progress){
			
		}
	}
}
