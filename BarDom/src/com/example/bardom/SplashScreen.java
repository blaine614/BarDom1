package com.example.bardom;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class SplashScreen extends ActionBarActivity 
{

	protected static final int TIMER_RUNTIME = 10000;
	protected boolean mbActive;
    protected ProgressBar mProgressBar;
	ImageView imageLogo;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
        imageLogo = (ImageView) findViewById(R.id.BarDomLogoImage);
        imageLogo.setImageResource(R.drawable.bardomlogo);
        imageLogo.bringToFront();
	    mProgressBar = (ProgressBar)findViewById(R.id.progressbar);
	    
	    
	      final Thread timerThread = new Thread() 
	      {
	    	  @Override
	    	  public void run() 
	    	  {
	                mbActive = true;
	                try 
	                {
	                    int waited = 0;
	
	                    while(mbActive && (waited < TIMER_RUNTIME)) 
	                    {
	                        sleep(50);
	                        if(mbActive) 
	                        {
	                            waited += 200;
	                            setProgress(waited);
	                            updateProgress(waited);
	                        }
	                    }
	
	                } 
	                catch(InterruptedException e) 
	                {
	                    // do nothing
	                } 
	                finally 
	                {
	                    onContinue();
	                }

              	}

	      };

	      timerThread.start();
	      
	      
	      
		
	}
	
	  public void updateProgress(final int timePassed) 
	  {
	       if(null != mProgressBar) 
	       {
	           // Ignore rounding error here
	           final int progress = mProgressBar.getMax() * timePassed / TIMER_RUNTIME;
	           mProgressBar.setProgress(progress);
	       }
	   }

	
   @Override
   public void onDestroy() 
   {
       android.os.Process.killProcess(android.os.Process.myPid());
       System.exit(1);
   }

	 


	public void onContinue() 
	{
		Intent finished = new Intent(this, LoginActivity.class);
		startActivity(finished);
	}

	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash_screen, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
*/
	/**
	 * A placeholder fragment containing a simple view.
	 */
	/*
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_splash_screen,
					container, false);
			return rootView;
		}
	}
*/
}
