package com.tce.chemomania;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Domain extends Activity implements OnClickListener {

	ImageButton physics,chemistry,biology;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.domain);
	    physics=(ImageButton)findViewById(R.id.imageButton1);
	    chemistry=(ImageButton)findViewById(R.id.imageButton2);
	    biology=(ImageButton)findViewById(R.id.imageButton3);
	    
	    physics.setOnClickListener(this);
	    chemistry.setOnClickListener(this);
	    biology.setOnClickListener(this);
	   
	}
	public void onClick(View v) {
		
		switch(v.getId())
		{
		case R.id.imageButton1:
			break;
		case R.id.imageButton2:
			break;
		case R.id.imageButton3:
			break;
		}
		
	}

}
