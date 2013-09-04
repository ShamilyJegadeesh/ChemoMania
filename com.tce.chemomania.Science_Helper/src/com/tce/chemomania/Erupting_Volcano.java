package com.tce.chemomania;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewManager;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.*;
import android.widget.RelativeLayout.LayoutParams;
@SuppressLint({ "NewApi", "NewApi", "NewApi", "NewApi", "NewApi", "NewApi", "NewApi", "NewApi", "NewApi", "NewApi" })
public class Erupting_Volcano extends Activity implements  OnClickListener{
public RelativeLayout item,comment,main;
public ImageView table,beaker,soda,soap,cone,red,yellow,vinegar;
TextView t;
Boolean canAnimate=false;
int i=0,j=80,cnt=0;
static Thread th;
ImageView iv1,iv2,iv3,iv4,iv5;
AnimationDrawable frameAnimation;
MediaPlayer mp;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erupting_volcano);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        //RelativeLayout workarea=new RelativeLayout(this);
          table=(ImageView) findViewById(R.id.imageView1);
          table.setOnClickListener(this);
          beaker=(ImageView) findViewById(R.id.imageView2);
          beaker.setOnClickListener(this);
          cone=(ImageView) findViewById(R.id.imageView3);
          cone.setOnClickListener(this);
          soda=(ImageView) findViewById(R.id.imageView4);
          soda.setOnClickListener(this);
          soap=(ImageView) findViewById(R.id.imageView5);
          soap.setOnClickListener(this);
          red=(ImageView) findViewById(R.id.imageView6);
          red.setOnClickListener(this);
          yellow=(ImageView) findViewById(R.id.imageView7);
          yellow.setOnClickListener(this);
          vinegar=(ImageView) findViewById(R.id.imageView8);
          vinegar.setOnClickListener(this);
          AlertDialog alertDialog = new AlertDialog.Builder(Erupting_Volcano.this).create();
			alertDialog.setTitle("Description");
			alertDialog.setMessage("Erupting Volcano is an chemical experiment in which a small volcano is generated using some chemicals...\nCome, lets create a volcano...");
			alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
	        public void onClick(DialogInterface dialog, int which) {   
	        }});
			alertDialog.show();
			TextView t=(TextView) findViewById(R.id.textView1);
			t.setText("ERUPTING VOLCANO");
			Typeface type = Typeface.createFromAsset(getAssets(),"fonts/bell.ttf"); 
			TextView t1=(TextView) findViewById(R.id.textView9);
			t1.setTypeface(type);
			t1.setTextColor(Color.GREEN);
			t1.setTextSize(20);
			
			TextView t2=(TextView) findViewById(R.id.textView2);
			t2.setTypeface(type);
			t2.setTextColor(Color.GREEN);
			t2.setTextSize(20);
			
			TextView t3=(TextView) findViewById(R.id.textView3);
			t3.setTypeface(type);
			t3.setTextColor(Color.GREEN);
			t3.setTextSize(20);
			
			TextView t4=(TextView) findViewById(R.id.textView4);
			t4.setTypeface(type);
			t4.setTextColor(Color.GREEN);
			t4.setTextSize(20);
			
			TextView t5=(TextView) findViewById(R.id.textView5);
			t5.setTypeface(type);
			t5.setTextColor(Color.GREEN);
			t5.setTextSize(20);
			
			TextView t6=(TextView) findViewById(R.id.textView6);
			t6.setTypeface(type);
			t6.setTextColor(Color.GREEN);
			t6.setTextSize(20);
			
			TextView t7=(TextView) findViewById(R.id.textView7);
			t7.setTypeface(type);
			t7.setTextColor(Color.GREEN);
			t7.setTextSize(20);
			
			TextView t8=(TextView) findViewById(R.id.textView8);
			t8.setTypeface(type);
			t8.setTextColor(Color.GREEN);
			t8.setTextSize(20);
 	    
          instruct();
        

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_chemo_mania, menu);
        return true;
    }


public void onClick(View v) {
		// TODO Auto-generated method stub
	switch(v.getId())
	{
	case R.id.imageView1:
		if(i==0)
		{
		
		canAnimate=false;
		i++;
		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(300,550);
		ImageView iv=new ImageView(this);
		iv.setImageResource(R.drawable.table2);
		iv.setX(400);
		iv.setY(0);
		addContentView(iv,lp);
		mp=MediaPlayer.create(this,R.drawable.place_beaker);
		mp.start();
		instruct();
		
		//instruct();
		}
	    break;
	case R.id.imageView2:
		if(i==1)
		{
		canAnimate=false;
		i++;
		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(350,65);
	
		iv4=new ImageView(this);
		iv4.setImageResource(R.drawable.empty_beaker);
		iv4.setX(370);
		iv4.setY(0);
		addContentView(iv4,lp);
	    //load the sun movement animation
	    AnimatorSet sunSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.swing);
	    //set the view as target
	    sunSet.setTarget(iv4);
	    //start the animation
	    sunSet.start();
	    mp=MediaPlayer.create(this,R.drawable.paper_cone);
		mp.start();
	    instruct();
	  

	    //instruct();
		}
	    break;
	case R.id.imageView3:
		if(i==2)
		{
		canAnimate=false;
		i++;
		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(400,300);
		iv1=new ImageView(this);
		iv1.setImageResource(R.drawable.cone);
		iv1.setX(350);
		iv1.setY(-120);
		addContentView(iv1,lp);
	    //load the sun movement animation
	    AnimatorSet sunSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.swing1);
	    //set the view as target
	    sunSet.setTarget(iv1);
	    //start the animation
	    sunSet.start();
	    mp=MediaPlayer.create(this,R.drawable.p_baking_soda);
		mp.start();
	    instruct();
	  
	    //instruct();
		}
	    break;
	case R.id.imageView4:
		
		if(i==3)
		{
			
		        	iv3=new ImageView(getApplicationContext());
		        	 
		        	i++;
		    		
		    		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(350,125);
		    		
		    		iv3.setImageResource(R.drawable.spoon);
		    		iv3.setX(380);
		    		iv3.setY(0);
		    		addContentView(iv3,lp);
		    	    //ad the sun movement animation
		    	    AnimatorSet sunSet = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(), R.animator.swing4);
		    	    //set the view as target
		    	    sunSet.setTarget(iv3);
		    	    //start the animation
		    	    sunSet.start();
		    	    iv1.bringToFront();
		    	    mp=MediaPlayer.create(this,R.drawable.p_dish_soap);
		    		mp.start();
		    	    instruct();
		    	    
		     
				
			
		}
	    break;
	case R.id.imageView5:
		if(i==4)
		{
			iv3.setVisibility(ImageView.INVISIBLE);
		i++;
		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(350,150);
		ImageView iv=new ImageView(this);
		iv.setImageResource(R.drawable.white_drop);
		iv.setX(380);
		iv.setY(0);
		addContentView(iv,lp);
		
		//load the sun movement animation
	    AnimatorSet sunSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.swing3);
	    //set the view as target
	    sunSet.setTarget(iv);
	    //start the animation
	    sunSet.start();

	    iv1.bringToFront();
	    mp=MediaPlayer.create(this,R.drawable.p_red);
		mp.start();
	    instruct();
		}
	    break;
	case R.id.imageView6:
		if(i==5)
		{
			i++;
		canAnimate=false;
		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(350,150);
		ImageView iv=new ImageView(this);
		iv.setImageResource(R.drawable.red_drop);
		iv.setX(380);
		iv.setY(0);
		addContentView(iv,lp);
	    //load the sun movement animation
	    AnimatorSet sunSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.swing3);
	    //set the view as target
	    sunSet.setTarget(iv);
	    //start the animation
	    sunSet.start();
	    iv1.bringToFront();
	    mp=MediaPlayer.create(this,R.drawable.p_yellow);
		mp.start();
	    instruct();
		}
	    break;
	case R.id.imageView7:
		if(i==6)
		{
			i++;
		canAnimate=false;
		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(350,150);
		iv5=new ImageView(this);
		iv5.setImageResource(R.drawable.yellow_drop);
		iv5.setX(380);
		iv5.setY(0);
		addContentView(iv5,lp);
	    //load the sun movement animation
	    AnimatorSet sunSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.swing3);
	    //set the view as target
	    sunSet.setTarget(iv5);
	    //start the animation
	    sunSet.start();
	    iv1.bringToFront();
	    mp=MediaPlayer.create(this,R.drawable.p_vinegar);
		mp.start();
	    instruct();
		}
	    break;
	case R.id.imageView8:
	if(i==7)
	{
		i++;
	canAnimate=false;
	RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(350,150);
	ImageView iv=new ImageView(this);
	iv.setImageResource(R.drawable.white_drop);
	iv.setX(380);
	iv.setY(0);
	addContentView(iv,lp);
    //load the sun movement animation
    AnimatorSet sunSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.swing2);
    //set the view as target
    sunSet.setTarget(iv);
    //start the animation
    sunSet.start();
    
   iv1.setVisibility(ImageView.INVISIBLE);
   iv4.setVisibility(ImageView.INVISIBLE);
   iv5.setVisibility(ImageView.INVISIBLE);
   
    iv2=new ImageView(this);
    iv2.setImageResource(R.drawable.dots);
    iv2.setX(350);
    iv2.setY(30);
    addContentView(iv2, new RelativeLayout.LayoutParams(400,300));
    iv2.setBackgroundResource(R.animator.volcano_frame);
   // iv2.bringToFront();
    //pinkDrop.bringToFront();
    frameAnimation=(AnimationDrawable)iv2.getBackground();
    frameAnimation.start();
    Toast.makeText(getApplicationContext(), "Wow...Exciting volcano\n is getting erupted...", Toast.LENGTH_LONG).show();
   //instruct();
    AlertDialog alertDialog = new AlertDialog.Builder(Erupting_Volcano.this).create();
	alertDialog.setTitle("What actually happens was.....");
	alertDialog.setMessage("NaHCO3 + CH3COOH --> CH3COONa + H2CO3\nThe H2CO3 is carbonic acid which very quickly breaks down into carbon dioxide (CO2) and water (H2O).\n The carbon dioxide is what causes the bubbling and foaming when baking soda and vinegar are mixed.\n Pretty cool!");
	alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
    public void onClick(DialogInterface dialog, int which) {   
    }});
	alertDialog.show();
    //show_dialog();
	mp=MediaPlayer.create(this,R.drawable.volcano_result);
	mp.start();
	}
    break;
	}
	}

public void instruct()
{
String ins[]={"Place a table","Lay a beaker on the table","Lay paper cone over beaker","Put in some Baking Soda","Adjoin drops of Dish soap","Add red food color","Add yellow food color","Affix some Vinegar"};
//canAnimate=true;
RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//try {

/*Thread.sleep(3000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}*/
TextView text=new TextView(this);
text.setText((i+1)+". "+ins[i]);
text.setX(50);
text.setY(j);
Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Koala.ttf"); 
text.setTypeface(type);
text.setTextColor(Color.YELLOW);
text.setTextSize(20);
addContentView(text,params1);
j=j+30;
/*if(i==0)
{
	try
	{
		Thread.sleep(10000);	

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}*/
}
}
