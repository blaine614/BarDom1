package com.example.bardom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

//This class implements the Sign Up page of BarDom
public class SignUpActivity extends ActionBarActivity implements OnClickListener {
	private EditText username;
	private EditText usernameConfirm;
	private EditText password;
	private EditText confirmPassword;
	private View buttonLogin;
	private View buttonSignup;
	
	
	
	@Override
	//called when the user clicks the sign up button, Starts Sign Up activity
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);
		
		//establish controller actions for widgets of SignUp screen
		username = (EditText) findViewById(R.id.usernameText);
		usernameConfirm = (EditText) findViewById(R.id.usernameConfirmText);
		password = (EditText) findViewById(R.id.passwordText);
		confirmPassword = (EditText) findViewById(R.id.passwordConfirmText);
		buttonLogin = (Button) findViewById(R.id.loginButton);
		buttonLogin.setOnClickListener(this);
		buttonSignup = (Button) findViewById(R.id.signupButton);
		buttonSignup.setOnClickListener(this);
	}
	
	/**
	 * Pick an action to do based on user's button selection
	 * @param v, button selected within SignUp page
	 */
	@Override
	public void onClick(View v) 
	{
		switch (v.getId()) 
		{
		case R.id.signupButton:
			//need to check sign up credentials as well as tell them it was successful then briefly display success!
			//then jump to main menu screen
			startActivity(new Intent(this, MainMenuActivity.class));
			finish();
			break;
			
		case R.id.loginButton:
			//needs to jump to login activity page. eventually we need to have it store the value entered as well
			//to carry to the other activity if needed
			startActivity(new Intent(this, LoginActivity.class));
			finish();
			break;
		}
	}
		

/*		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}*/
	
/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sign_up, menu);
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
	 */
	/*public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_sign_up,
					container, false);
			return rootView;
		}
	}
*/
}
