package com.example.shopmanagement.setting;

import com.wpq.animation.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

public class AccountActivity extends Activity implements OnCheckedChangeListener, OnClickListener{
	
	private TextView email,nickname;
	private CheckBox autoLogin;
	private Button reback,save;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_account);
		
		initView();
	}

	private void initView() {
		// TODO Auto-generated method stub
		email = (TextView)this.findViewById(R.id.setting_email_edit);
		nickname = (TextView)this.findViewById(R.id.setting_nickname_edit);
		
		autoLogin = (CheckBox)this.findViewById(R.id.setting_autoLogin_checkBox);
		autoLogin.setOnCheckedChangeListener(this);
		
//		
//		reback.setOnClickListener(this);
//		save.setOnClickListener(this);
		
		email.setText("imzkzhou@yeah.net");
		nickname.setText("zkhzou");
		
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		if(isChecked){
			
		}
		else{
			
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		}
	}

}
