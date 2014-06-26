package com.example.bardom;

import com.example.bardom.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class MapFullScreenActivity extends FragmentActivity 
{
	private LatLng HAMBURG;
	private LatLng KIEL;
	private GoogleMap mapX;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		
		
		setContentView(R.layout.activity_map_full_screen);
	    /* mapX = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
	        .getMap();
	    Marker hamburg = mapX.addMarker(new MarkerOptions().position(HAMBURG)
	        .title("Hamburg"));
	    Marker kiel = mapX.addMarker(new MarkerOptions()
	        .position(KIEL)
	        .title("Kiel")
	        .snippet("Kiel is cool")
	        .icon(BitmapDescriptorFactory
	            .fromResource(R.drawable.ic_launcher)));

	    // Move the camera instantly to hamburg with a zoom of 15.
	    mapX.moveCamera(CameraUpdateFactory.newLatLngZoom(HAMBURG, 15));

	    // Zoom in, animating the camera.
	    mapX.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null); */
	}
	

	
	

	
}
