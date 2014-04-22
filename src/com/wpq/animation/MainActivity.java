package com.wpq.animation;

import java.util.ArrayList;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

	private ImageView ivBottomLine;
	private int bottomLineWidth, offset, position_one, position_two,
			position_three;
	private TextView Activity1, Activity2, Activity3;
	private ArrayList<Fragment> fragmentsList;
	private ViewPager mPager;
	private int currIndex = 0;
	private Resources resources;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		resources = getResources();
		InitWidth();
		InitTextView();
		InitViewPager();
	}

	private void InitWidth() {
		ivBottomLine = (ImageView) findViewById(R.id.iv_bottom_line);
		bottomLineWidth = ivBottomLine.getLayoutParams().width;
		// Log.d(TAG, "cursor imageview width=" + bottomLineWidth);
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		int screenW = dm.widthPixels;
		offset = (int) ((screenW / 3.0 - bottomLineWidth) / 2);
		// Log.i("MainActivity", "offset=" + offset);

		position_one = (int) (screenW / 3.0);
		position_two = position_one * 2;
	}

	private void InitTextView() {
		Activity1 = (TextView) findViewById(R.id.activity1);
		Activity2 = (TextView) findViewById(R.id.activity2);
		Activity3 = (TextView) findViewById(R.id.activity3);

		Activity1.setOnClickListener(new MyOnClickListener(0));
		Activity2.setOnClickListener(new MyOnClickListener(1));
		Activity3.setOnClickListener(new MyOnClickListener(2));
	}

	private void InitViewPager() {
		mPager = (ViewPager) findViewById(R.id.vPager);
		fragmentsList = new ArrayList<Fragment>();
		LayoutInflater mInflater = getLayoutInflater();
		View activityView = mInflater.inflate(R.layout.lay1, null);

		Fragment fragment1 = new Fragment1();
		Fragment fragment2 = Fragment2.newInstance("hellozzk");
		Fragment fragment3 = new Fragment3();

		fragmentsList.add(fragment1);
		fragmentsList.add(fragment2);
		fragmentsList.add(fragment3);

		mPager.setAdapter(new MyFragmentPagerAdapter(
				getSupportFragmentManager(), fragmentsList));
		mPager.setCurrentItem(0);
		mPager.setOnPageChangeListener(new MyOnPageChangeListener());
	}

	public class MyOnClickListener implements View.OnClickListener {
		private int index = 0;

		public MyOnClickListener(int i) {
			index = i;
		}

		@Override
		public void onClick(View v) {
			mPager.setCurrentItem(index);
		}
	};

	public class MyOnPageChangeListener implements OnPageChangeListener {

		@Override
		public void onPageSelected(int arg0) {
			Animation animation = null;
			switch (arg0) {
			case 0:
				if (currIndex == 1) {
					animation = new TranslateAnimation(position_one, 0, 0, 0);
					Activity2.setTextColor(resources.getColor(R.color.anhui));
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(position_two, 0, 0, 0);
					Activity3.setTextColor(resources.getColor(R.color.anhui));
				}
				Activity1.setTextColor(resources.getColor(R.color.blue));
				break;
			case 1:
				if (currIndex == 0) {
					animation = new TranslateAnimation(offset, position_one, 0,
							0);
					Activity1.setTextColor(resources.getColor(R.color.anhui));
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(position_two,
							position_one, 0, 0);
					Activity3.setTextColor(resources.getColor(R.color.anhui));
				}
				Activity2.setTextColor(resources.getColor(R.color.blue));
				break;
			case 2:
				if (currIndex == 0) {
					animation = new TranslateAnimation(offset, position_two, 0,
							0);
					Activity1.setTextColor(resources.getColor(R.color.anhui));
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(position_one,
							position_two, 0, 0);
					Activity2.setTextColor(resources.getColor(R.color.anhui));
				}
				Activity3.setTextColor(resources.getColor(R.color.blue));
				break;
			}
			currIndex = arg0;
			animation.setFillAfter(true);
			animation.setDuration(300);
			ivBottomLine.startAnimation(animation);
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
		}

		@Override
		public void onPageScrollStateChanged(int arg0) {
		}
	}

}
