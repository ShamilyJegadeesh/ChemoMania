package com.tce.chemomania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Science_Helper extends Activity implements OnClickListener {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.home);
	    Button b1=(Button) findViewById(R.id.button1);
	    b1.setOnClickListener(this);
	    
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
	
			Intent exp1=new Intent(this,Experiment.class);
			startActivity(exp1);
			
		
	}

}
