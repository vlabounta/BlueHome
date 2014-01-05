package com.senior.bluehome;

import android.os.Bundle;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.view.Menu;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MediaPlayer extends Activity {
	private static final int REQUEST_CONNECT_DEVICE = 1;
    private static final int REQUEST_ENABLE_BT = 2;
	// Name of connected device
    private String ConnectedDeviceName = null;
    // Local Bluetooth adapter
    private BluetoothAdapter BluetoothAdapter = null;
    // Member object for Bluetooth Command Service
   // private BluetoothCommandService CommandService = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.media_player);
		
//		BluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
//		
//		if(BluetoothAdapter == null){
//			Toast.makeText(this, "Bluetooth not available on this device", Toast.LENGTH_LONG).show();
//            finish();
//            return;
//		}
		
		 
	  }
	 
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.home_controls:
	        	startActivity(new Intent(this, MainActivity.class));
	            return true;
	        case R.id.media_player:
	        	return super.onOptionsItemSelected(item);
	        case R.id.action_settings:
	            startActivity(new Intent(this, Settings.class));
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		
//		// If Bluetooth not on then request enable.
//        // setupCommand() will then be called during onActivityResult
//		if (!BluetoothAdapter.isEnabled()) {
//			Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//			startActivityForResult(enableIntent, REQUEST_ENABLE_BT);
//		}
//		// otherwise set up the command service
//		else {
//		//	if (CommandService==null)
//				setupCommand();
//		}
	}
	
	
	
	private void setupCommand() {
		// Initialize the BluetoothChatService to perform bluetooth connections
      //  CommandService = new BluetoothCommandService(this, Handler);
	}
	

}
