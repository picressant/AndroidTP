package fr.gphy.piotrgui.androidtp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity {

	public static final String DISPLAY_TEXT_KEY = "text1";
	private Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		intent = new Intent(this, Hello.class);

		TextView v = (TextView)findViewById(R.id.output);
		v.setText(getIntent().getStringExtra(DISPLAY_TEXT_KEY));
		Toast.makeText(this, getIntent().getStringExtra(DISPLAY_TEXT_KEY), Toast.LENGTH_SHORT).show();
	}
	
	public void retourClick(View v) {
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
