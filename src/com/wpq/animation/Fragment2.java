package com.wpq.animation;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {
	private String hello;
	private String defaultHello = "default value";
	private TextView tv1;
	private View rootView;
	
	static Fragment2 newInstance(String s) {
        Fragment2 newFragment = new Fragment2();
        Bundle bundle = new Bundle();
        bundle.putString("hello", s);
        newFragment.setArguments(bundle);
        return newFragment;

    }
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        Bundle args = getArguments();
	        hello = args != null ? args.getString("hello") : defaultHello;
	    }
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
	    rootView = inflater.inflate(R.layout.lay2, container, false);
	    tv1 = (TextView)rootView.findViewById(R.id.tv1);
	    tv1.setText(hello);
		
		return rootView;
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	}
	
}
