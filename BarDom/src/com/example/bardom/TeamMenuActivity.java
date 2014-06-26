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


public class TeamMenuActivity extends ActionBarActivity implements OnClickListener
{
	private View buttonZones;
	private View buttonTeam;
	private View buttonIndividual;
	private View buttonSettings;
	private View buttonMembers;
	private View buttonChat;
	private View buttonStats;
	private View buttonTeamManagement;
	private View buttonStatus;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_team_menu);
		
		//establish controller actions for widgets of MainMenu screen
		buttonZones = (Button) findViewById(R.id.zonesButton);
		buttonZones.setOnClickListener(this);
		buttonTeam = (Button) findViewById(R.id.teamButton);
		buttonTeam.setOnClickListener(this);
		buttonIndividual = (Button) findViewById(R.id.individualButton);
		buttonIndividual.setOnClickListener(this);
		buttonSettings = (Button) findViewById(R.id.settingsButton);
		buttonSettings.setOnClickListener(this);
		buttonMembers = (Button) findViewById(R.id.membersButton);
		buttonMembers.setOnClickListener(this);
		buttonChat = (Button) findViewById(R.id.chatButton);
		buttonChat.setOnClickListener(this);
		buttonStats = (Button) findViewById(R.id.statsButton);
		buttonStats.setOnClickListener(this);
		buttonTeamManagement = (Button) findViewById(R.id.teamManagementButton);
		buttonTeamManagement.setOnClickListener(this);
		buttonStatus = (Button) findViewById(R.id.statusButton);
		buttonStatus.setOnClickListener(this);
	}
	
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.team_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) 
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	*/
	
	
	/**
	 * A placeholder fragment containing a simple view.
	 */
	/*
	public static class PlaceholderFragment extends Fragment 
	{

		public PlaceholderFragment() 
		{
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) 
		{
			View rootView = inflater.inflate(R.layout.activity_team_menu,
					container, false);
			return rootView;
		}
	}
	*/
	
	/**
	 * Send user to the appropriate page based on their selection (button pressed)
	 */
	@Override
	public void onClick(View v) 
	{
		switch (v.getId()) 
		{
		case R.id.zonesButton:
			//need to check login credentials as well as tell them it was successful then briefly display success!
			//then jump to main menu screen
			startActivity(new Intent(this, MainMenuActivity.class));
			finish();
			break;
			
		case R.id.membersButton:
			//needs to jump to sign up activity page eventually we need to have it store the value entered as well
			//to carry to the other activity if needed
			startActivity(new Intent(this, SignUpActivity.class));
			finish();
			break;
			
		case R.id.chatButton:
			//need to check login credentials as well as tell them it was successful then briefly display success!
			//then jump to main menu screen
			startActivity(new Intent(this, MainMenuActivity.class));
			finish();
			break;
			
		case R.id.statsButton:
			//needs to jump to sign up activity page eventually we need to have it store the value entered as well
			//to carry to the other activity if needed
			startActivity(new Intent(this, SignUpActivity.class));
			finish();
			break;
			
		case R.id.teamManagementButton:
			//need to check login credentials as well as tell them it was successful then briefly display success!
			//then jump to main menu screen
			startActivity(new Intent(this, MainMenuActivity.class));
			finish();
			break;
			
		case R.id.settingsButton:
			//needs to jump to sign up activity page eventually we need to have it store the value entered as well
			//to carry to the other activity if needed
			startActivity(new Intent(this, SignUpActivity.class));
			finish();
			break;
			
		case R.id.statusButton:
			//needs to jump to sign up activity page eventually we need to have it store the value entered as well
			//to carry to the other activity if needed
			startActivity(new Intent(this, SignUpActivity.class));
			finish();
			break;
		}
	}

}
