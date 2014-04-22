package com.example.shopmanagement.setting;


import com.wpq.animation.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class FeedBackActivity extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_feedback);
	}
}
