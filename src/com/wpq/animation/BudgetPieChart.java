package com.wpq.animation;

import org.achartengine.ChartFactory;
import org.achartengine.model.CategorySeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;

public class BudgetPieChart {
	private int[] array = new int[3];
	private String[] string = new String[3];
	
	public BudgetPieChart(){
		   System.out.print("hellozzk");  
		   
	}

	public BudgetPieChart(int[] a,String[] s){
		for(int i=0;i<a.length;i++){
			array[i] = a[i];
			string[i] = s[i];
		}
	}
	public Intent execute(Context context) {

		int[] colors = new int[] { Color.RED, Color.YELLOW, Color.BLUE };
		DefaultRenderer renderer = buildCategoryRenderer(colors);
		CategorySeries categorySeries = new CategorySeries("Vehicles Chart");
		for(int i=0;i<array.length;i++){
			//categorySeries.add(array[i]);
			categorySeries.add(string[i],array[i]);
		}	
		return ChartFactory
				.getPieChartIntent(context, categorySeries, renderer,"");
	}

	protected DefaultRenderer buildCategoryRenderer(int[] colors) {
		DefaultRenderer renderer = new DefaultRenderer();
		for (int color : colors) {
			SimpleSeriesRenderer r = new SimpleSeriesRenderer();
			r.setColor(color);
			renderer.addSeriesRenderer(r);
			renderer.setLegendTextSize(20);
			renderer.setLabelsTextSize(20);
			renderer.setLabelsColor(Color.BLACK);
			renderer.setShowLegend(false);
			renderer.setShowGrid(true);
		}
		return renderer;
	}

}

