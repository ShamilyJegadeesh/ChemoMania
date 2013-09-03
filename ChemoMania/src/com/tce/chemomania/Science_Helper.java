package com.tce.chemomania;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Science_Helper extends Activity implements OnClickListener {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.science_helper);
	    ImageButton acid_base=(ImageButton)findViewById(R.id.imageButton1);
	    ImageButton volcano=(ImageButton)findViewById(R.id.imageButton2);
	    acid_base.setOnClickListener(this);
	    volcano.setOnClickListener(this);
	    Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Koala.ttf"); 
	    TextView text1=(TextView)findViewById(R.id.textView1);
		   text1.setTypeface(type);
		    text1.setTextColor(Color.YELLOW);
		    TextView text2=(TextView)findViewById(R.id.textView2);
			   text2.setTypeface(type);
			    text2.setTextColor(Color.YELLOW);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.imageButton1:
			Intent exp1=new Intent(this,Menu.class);
			startActivity(exp1);
			break;
		case R.id.imageButton2:
			Intent exp2=new Intent(this,Erupting_Volcano.class);
			startActivity(exp2);
		}
		
	}

}
