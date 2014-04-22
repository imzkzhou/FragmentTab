package com.wpq.animation;

import com.wpq.animation.R.color;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Fragment1 extends Fragment {
	
	private RelativeLayout purchases_top_layout,sale_top_layout,
	                       purchases_order_top_layout,sale_order_top_layout;
	private TextView purchases,sale,purchases_order,sale_order;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.lay1, container, false);
		 purchases = (TextView)rootView.findViewById(R.id.purchases);
		 sale = (TextView)rootView.findViewById(R.id.sale);
		 purchases_order = (TextView)rootView.findViewById(R.id.purchases_order);
		 sale_order = (TextView)rootView.findViewById(R.id.sale_order);
		
		 purchases_top_layout = (RelativeLayout)rootView.findViewById(R.id.purchases_top_layout);
		 sale_top_layout = (RelativeLayout)rootView.findViewById(R.id.sale_top_layout);
		 purchases_order_top_layout = (RelativeLayout)rootView.findViewById(R.id.purchases_order_top_layout);
		 sale_order_top_layout = (RelativeLayout)rootView.findViewById(R.id.sale_order_top_layout);
		
		
		purchases_top_layout.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//r1.setBackgroundColor(color.gray);
				startActivity(new Intent(getActivity(),Purchases.class));
			}
			
		});
		
		sale_top_layout.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
                int []a = {50,50,100};
                String[]s ={"第一天","第二天","第三天"};
				BudgetPieChart b = new BudgetPieChart(a,s);

				Intent intent =(b.execute(getActivity()));
//				intent.putExtra("test1",30);
//				intent.putExtra("test2",30);
//				intent.putExtra("test3",30);
				startActivity(intent);
			}
			
		});
		
		purchases_order_top_layout.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(getActivity(), LoadingActivity.class);// 跳转到加载界面
				startActivity(intent);
			}
		});
		
		sale_order_top_layout.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
			
		});
		
		return rootView;
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	}
	
}
