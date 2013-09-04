package com.tce.chemomania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Syllabus extends Activity implements OnClickListener {

	Intent intent;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.syllabus);
	    ImageButton cbse=(ImageButton)findViewById(R.id.imageButton1);
	    ImageButton samacheer=(ImageButton)findViewById(R.id.imageButton2);
	    cbse.setOnClickListener(this);
	    samacheer.setOnClickListener(this);
	}

	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.imageButton1:
			intent=new Intent(this,Domain.class);
			intent.putExtra("Syllabus", 1);
			startActivity(intent);
			break;
		case R.id.imageButton2:
			intent=new Intent(this,Domain.class);
			intent.putExtra("Syllabus", 2);
			startActivity(intent);
			break;
		}
		
	}

}
