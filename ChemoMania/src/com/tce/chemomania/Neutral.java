package com.tce.chemomania;

import android.os.Bundle;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.view.Menu;
import android.view.View;

import android.view.View.OnClickListener;
import android.widget.*;
import android.widget.RelativeLayout.LayoutParams;

@SuppressLint({ "NewApi", "NewApi", "NewApi", "NewApi", "NewApi", "NewApi", "NewApi", "NewApi", "NewApi", "NewApi" })
public class Neutral extends Activity implements  OnClickListener{

	public ImageView glass,table,cabbageJuice,water,vinegar;
	public static boolean canAnimate=true;
static ImageView beaker,beaker1,beaker2;
 AnimationDrawable frameAnimation;
public int i=0,j=75;
String ins[]={"Place a table","Place a beaker on the table","Pour Cabbage Juice","Add Water","Result:\n Water does not make any color\nchange which indicates\nthat it is neutral"};
final RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT); 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neutral);
        	//onclick listener for table
           table=(ImageView)findViewById(R.id.imageView2);
           table.setOnClickListener(this);
          // table.set
         //onclick listener for beaker
           beaker=(ImageView)findViewById(R.id.imageView3);
           beaker.setOnClickListener(this);
         //onclick listener for cabbageJuice
           cabbageJuice=(ImageView)findViewById(R.id.imageView4);
           cabbageJuice.setOnClickListener(this);
         //onclick listener for water
           water=(ImageView)findViewById(R.id.imageView5);
           water.setOnClickListener(this);
        
           Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Koala.ttf"); 
           TextView t1=(TextView)findViewById(R.id.textView6);
           t1.setTypeface(type);
		   t1.setTextColor(Color.YELLOW);
		   TextView t2=(TextView)findViewById(R.id.textView7);
           t2.setTypeface(type);
		   t2.setTextColor(Color.YELLOW);
		   TextView t3=(TextView)findViewById(R.id.textView8);
           t3.setTypeface(type);
		   t3.setTextColor(Color.YELLOW);
		   TextView t4=(TextView)findViewById(R.id.textView9);
           t4.setTypeface(type);
		   t4.setTextColor(Color.YELLOW);
		   
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
		case R.id.imageView2://table
			if(i==0){
				
		 table=new ImageView(this);
		 table.setImageResource(R.drawable.table2);
	     table.setX(400);
	     table.setY(2);
	     RelativeLayout.LayoutParams param = new RelativeLayout.LayoutParams(250,600);
	     addContentView(table,param);
	     i++;
	     instruct();
			}
	     break;
	     
		case R.id.imageView3://beaker
			if(i==1)
			{
				//new dynamic beaker
			beaker1=new ImageView(this);
			beaker1.setImageResource(R.drawable.beaker_1);
			beaker1.setX(440);
			beaker1.setY(0);
			//delegating frame animation to beaker
		    RelativeLayout.LayoutParams b_param = new RelativeLayout.LayoutParams(150,200);
			//add beaker to layout
			addContentView(beaker1, b_param);
			//adding animation for beaker movement
			AnimatorSet animat=(AnimatorSet)AnimatorInflater.loadAnimator(this,R.animator.moving);
			animat.setTarget(beaker1);
			//start moving beaker
			animat.start();
			i++;
			instruct();
		}
			break;
		case R.id.imageView4:
			
			//cabbage juice
			if(i==2){
				AlertDialog alertDialog = new AlertDialog.Builder(Neutral.this).create();
				alertDialog.setTitle("Cabbage Juice");
				alertDialog.setMessage("Cabbage Juice is used as \"INDICATOR\"." +
						/*"An indicator is typically a chemical that changes color if it comes in contact with an ACID or a BASE.\n" +
						"Purple cabbage contains a water-soluble pigment called \"Anthocyanin\" that changes color when it is mixed with an acid or a base. " +
						"The pigment turns red in acidic environments with a pH less than 7 & the pigment turns bluish-green in" +
						" alkaline (basic) environments with a pH greater than 7." +
						"" +*/
						"Indicators are chemical compounds that can be added to a solution to determine whether it is acidic or alkaline(base). "+
"The indicator will change colour depending on whether an acid or an alkali is added."+ 
"The colour in purple cabbage (it is a pigment called an anthocyanin) makes a very good indicator.");
				alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int which) { 
		        	RelativeLayout.LayoutParams b_param = new RelativeLayout.LayoutParams(150,200);
					ImageView pinkDrop=new ImageView(getApplicationContext());
					pinkDrop.setImageResource(R.drawable.purple_drop);
					pinkDrop.setX(450);
					pinkDrop.setY(0);
					
					addContentView(pinkDrop, b_param);
					AnimatorSet animat=(AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.falling);
					animat.setTarget(pinkDrop);
					//start droplet animation
					animat.start();
					
					beaker1.setVisibility(ImageView.INVISIBLE);
					
					beaker2=new ImageView(getApplicationContext());
					beaker2.setImageResource(R.drawable.dots);
					beaker2.setX(440);
					beaker2.setY(160);
					addContentView(beaker2, new RelativeLayout.LayoutParams(160,110));
					beaker2.setBackgroundResource(R.animator.frame_animation);
					beaker2.bringToFront();
					pinkDrop.bringToFront();
					frameAnimation=(AnimationDrawable)beaker2.getBackground();
					frameAnimation.start();
					i++;
					instruct();
		        }});
				alertDialog.show();
			
			}
			break;
			
	case R.id.imageView5:
			                           
		   //water
			if(i==3){
				AlertDialog alertDialog = new AlertDialog.Builder(Neutral.this).create();
				alertDialog.setTitle("Water");
				alertDialog.setMessage("Water has a pH value of 7. It is neutral in nature");
				alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int which) {
			ImageView whiteDrop=new ImageView(getApplicationContext());
			whiteDrop.setImageResource(R.drawable.white_drop);
			whiteDrop.setX(450);
			whiteDrop.setY(0);
			
			RelativeLayout.LayoutParams b_param1 = new RelativeLayout.LayoutParams(150,200);
			addContentView(whiteDrop, b_param1);
			AnimatorSet animater=(AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.test);
			animater.setTarget(whiteDrop);
			animater.start();
			
			beaker2=new ImageView(getApplicationContext());
			beaker2.setImageResource(R.drawable.nw8);
			beaker2.setX(440);
			beaker2.setY(160);
			addContentView(beaker2, new RelativeLayout.LayoutParams(160,110));
			//beaker2.setBackgroundResource(R.animator.res_acid);
			//whiteDrop.bringToFront();
			//beaker2.bringToFront();
			//frameAnimation=(AnimationDrawable)beaker2.getBackground();
			//frameAnimation.start();
			beaker2.bringToFront();
			i++;
			instruct();
		        }});
				alertDialog.show();   
			}
			break;
			
	/*case R.id.imageView1:
        
		   //soda
		if(i==4){
			AlertDialog alertDialog = new AlertDialog.Builder(ChemoMania.this).create();
			alertDialog.setTitle("Soda(NaOH)");
			alertDialog.setMessage("Soda is a alkali in nature(contains sodium hydroxide).The pigments of purple cabbage turns green in base environments with a pH greater than 7");
			alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
	        public void onClick(DialogInterface dialog, int which) {
			ImageView whiteDrop=new ImageView(getApplicationContext());
			whiteDrop.setImageResource(R.drawable.white_drop);
			whiteDrop.setX(450);
			whiteDrop.setY(0);
			
			RelativeLayout.LayoutParams b_param1 = new RelativeLayout.LayoutParams(150,200);
			addContentView(whiteDrop, b_param1);
		AnimatorSet	 animater=(AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.test);
			animater.setTarget(whiteDrop);
			animater.start();
			
			beaker2=new ImageView(getApplicationContext());
			beaker2.setImageResource(R.drawable.dots);
			beaker2.setX(440);
			beaker2.setY(160);
			addContentView(beaker2, new RelativeLayout.LayoutParams(160,110));
			beaker2.setBackgroundResource(R.animator.res_base);
			whiteDrop.bringToFront();
			//beaker2.bringToFront();
			frameAnimation=(AnimationDrawable)beaker2.getBackground();
			frameAnimation.start();
			//beaker2.bringToFront();
	        }});
			alertDialog.show();   
			
		}
			break;
			*/
		}
	}
	
	 public void instruct()
	    {
	  
	    RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
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
	    /*} catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }*/
	    }

	
}
