package fr.gphy.piotrgui.androidtp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity {

	private static final String TAG = "Main";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*setContentView(R.layout.main);*/
		
		setContentView(R.layout.activity_hello);
		
		Button v = (Button) findViewById(R.id.button1);
		v.setBackgroundColor(Color.RED);
		/*v.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				toastClick();
			}
		});*/
		
		/*
		LinearLayout l = new LinearLayout(this);
		TextView t = new TextView(this);
		l.addView(t);
		t.setText("TOTOT");
		
		setContentView(l);
		*/
	}
	

	public void toastClick(View v) {
		Toast.makeText(this, "Toaaaioyauste", Toast.LENGTH_LONG).show();
		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.univ-poitiers.fr"));
		startActivity(browserIntent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
