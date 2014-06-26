package com.example.bardom;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

//This class implements the main menu of BarDom after a successful login
public class MainMenuActivity extends ActionBarActivity implements OnClickListener 
{
	private View buttonZones;
	private View buttonTeam;
	private View buttonIndividual;
	private View buttonSettings;
	
	//Create the Main Menu activity
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);

		//establish controller actions for widgets of MainMenu screen
		buttonZones = (Button) findViewById(R.id.zonesButton);
		buttonZones.setOnClickListener(this);
		buttonTeam = (Button) findViewById(R.id.teamButton);
		buttonTeam.setOnClickListener(this);
		buttonIndividual = (Button) findViewById(R.id.individualButton);
		buttonIndividual.setOnClickListener(this);
		buttonSettings = (Button) findViewById(R.id.settingsButton);
		buttonSettings.setOnClickListener(this);
	}
	
	
	/**
	 * Pick an action to do based on user's button selection
	 * @param v, button selected within menu page
	 */
	@Override
	public void onClick(View v) 
	{
		switch (v.getId()) 
		{
		case R.id.zonesButton:
			startActivity(new Intent(this, MapFullScreenActivity.class));
			finish();
			break;
			
		case R.id.teamButton:
			startActivity(new Intent(this, TeamMenuFullScreenActivity.class));
			finish();
			break;
			
		case R.id.individualButton:
			startActivity(new Intent(this, TeamMenuActivity.class));
			finish();
			break;
		
		case R.id.settingsButton:
			startActivity(new Intent(this, TeamMenuActivity.class));
			finish();
			break;
		
		}
	}
		
	/*	if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}*/
	
/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 *
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main_menu,
					container, false);
			return rootView;
		}
	}
*/
}
