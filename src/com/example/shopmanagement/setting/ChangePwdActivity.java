package com.example.shopmanagement.setting;

import com.wpq.animation.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class ChangePwdActivity extends Activity implements OnClickListener{
	
	private EditText oldpwd,newpwd1,newpwd2;
	private Button reback,save;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_changepwd);
		
		initView();
	}

	private void initView() {
		// TODO Auto-generated method stub
		oldpwd = (EditText)this.findViewById(R.id.setting_oldpassword_edit);
		newpwd1 = (EditText)this.findViewById(R.id.setting_newpassword1_edit);
		newpwd2 = (EditText)this.findViewById(R.id.setting_newpassword2_edit);
		
//		reback = (Button)this.findViewById(R.id.);
//		save = (Button)this.findViewById(R.id.);
		
//		reback.setOnClickListener(this);
//		save.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
