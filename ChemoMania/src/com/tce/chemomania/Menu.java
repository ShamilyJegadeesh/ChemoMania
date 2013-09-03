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

public class Menu extends Activity implements OnClickListener{

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.menu);
	    ImageButton acid=(ImageButton)findViewById(R.id.imageButton1);
	    ImageButton base=(ImageButton)findViewById(R.id.imageButton2);
	    ImageButton neutral=(ImageButton)findViewById(R.id.imageButton3);
	    acid.setOnClickListener(this);
	   base.setOnClickListener(this);
	   neutral.setOnClickListener(this);
	   TextView text=(TextView)findViewById(R.id.textView1);
	   TextView text1=(TextView)findViewById(R.id.textView2);
	   TextView text2=(TextView)findViewById(R.id.textView3);
	    Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Koala.ttf"); 
		   text.setTypeface(type);
		    text.setTextColor(Color.YELLOW);
		    text1.setTypeface(type);
		    text1.setTextColor(Color.YELLOW);
		    text2.setTypeface(type);
		    text2.setTextColor(Color.YELLOW);
	}

	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.imageButton1:
			Intent acid=new Intent(Menu.this,ChemoMania.class);
			acid.putExtra("Test", 1);
			startActivity(acid);
			break;
		case R.id.imageButton2:
			Intent base=new Intent(Menu.this,base_exp.class);
			//base.putExtra("Test", 2);
			startActivity(base);
			break;
		case R.id.imageButton3:
			Intent neut=new Intent(Menu.this,Neutral.class);
			//neut.putExtra("Test", 3);
			startActivity(neut);
			break;
		}
		
	}

}
