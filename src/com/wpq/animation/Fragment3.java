package com.wpq.animation;

import com.example.shopmanagement.setting.AccountActivity;
import com.example.shopmanagement.setting.ChangePwdActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class Fragment3 extends Fragment implements OnClickListener {
	private RelativeLayout account,changePwd,help,feedBack,exit;
	private View rootView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		rootView = inflater.inflate(R.layout.lay3, container, false);
		initLayout();
		
		return rootView;
	}
	
	private void initLayout() {
		// TODO Auto-generated method stub
		
		account = (RelativeLayout)rootView.findViewById(R.id.account_top_layout);
		changePwd = (RelativeLayout)rootView.findViewById(R.id.changePwd_top_layout);
		help = (RelativeLayout)rootView.findViewById(R.id.help_top_layout);
		feedBack = (RelativeLayout)rootView.findViewById(R.id.feedBack_top_layout);
		exit = (RelativeLayout)rootView.findViewById(R.id.exit_top_layout);
		
		account.setOnClickListener(this);
		changePwd.setOnClickListener(this);
		help.setOnClickListener(this);
		feedBack.setOnClickListener(this);
		exit.setOnClickListener(this);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent;
		switch(v.getId()){
		case R.id.account_top_layout:
			intent = new Intent(getActivity(),AccountActivity.class);
			startActivity(intent);
			break;
		case R.id.changePwd_top_layout:
			intent = new Intent(getActivity(),ChangePwdActivity.class);
			startActivity(intent);
			break;
		case R.id.help_top_layout:
			break;
		case R.id.feedBack_top_layout:
			break;
		case R.id.exit_top_layout:
			getActivity().finish();
			break;
		default:
			break;
			
		}
	}
	
}
