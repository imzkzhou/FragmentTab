package com.wpq.animation;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Purchases extends Activity implements OnClickListener{
	
	private EditText edt;
	private TextView tv;
	private Button btn;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_purchase);
		
		initView();
//		WebView googleChartView = new WebView(this);
//		setContentView(googleChartView);
//		String mUrl = "http://chart.apis.google.com/chart?cht=p3& chd=t:30,60,10&chs=250x100&chl=cars|bikes|trucks";
//		googleChartView.loadUrl(mUrl);

		
		
	}

	private void initView() {
		// TODO Auto-generated method stub
		edt = (EditText)this.findViewById(R.id.orString);
		tv = (TextView)this.findViewById(R.id.newString);
		btn = (Button)this.findViewById(R.id.btn);
		
		btn.setOnClickListener(this);

	}

	private String getMD5(String string) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(string.getBytes());
		byte[] m = md5.digest();
		return new String(m);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.btn:
			try {
					InputMethodManager inputManager = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
					if(inputManager.isActive()) 
						inputManager.hideSoftInputFromWindow(this.getCurrentFocus().getWindowToken(), 0);
				tv.setText(getMD5(edt.getText().toString()));
			}catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
	}

}
