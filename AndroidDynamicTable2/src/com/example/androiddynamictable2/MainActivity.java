package com.example.androiddynamictable2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	
	TextView tv1,tv2,tv3,tv4,tv5;
	
	int view = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	
	public void showMarketingPipelineData(View v){
			init();
	}
	
	public void init(){
	    TableLayout ll = (TableLayout) findViewById(R.id.displayLinear);
	    
	    for (int i = 0; i <30; i++) {

	        TableRow row= new TableRow(this);
	        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
	        row.setLayoutParams(lp);
	        tv1 = new TextView(this);
	        tv2 = new TextView(this);
	        tv3 = new TextView(this);
	        tv4 = new TextView(this);
	        tv5 = new TextView(this);
	        
	        if(i==0){
	        	tv1.setText("Req No");
	        	tv1.setTypeface(null, Typeface.BOLD);
		        tv2.setText("Req Date");
		        tv2.setTypeface(null, Typeface.BOLD);
		        tv3.setText("Quantity");
		        tv3.setTypeface(null, Typeface.BOLD);
		        tv4.setText("A. Price");
		        tv4.setTypeface(null, Typeface.BOLD);
		        tv5.setText("Inv. Price");
		        tv5.setTypeface(null, Typeface.BOLD);
	        } else {
	        	tv1.setText(""+i+""+i);
		        tv2.setText(""+i+""+i);
		        tv3.setText(""+i+""+i);
		        tv4.setText(""+i+""+i);
		        tv5.setText(""+i+""+i);
	        }
	        	        
	        row.addView(tv1);
	        row.addView(tv2);
	        row.addView(tv3);
	        row.addView(tv4);
	        row.addView(tv5);
	        
	        ll.addView(row,i);
	    }
	}
}
