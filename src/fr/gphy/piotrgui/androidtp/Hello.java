package fr.gphy.piotrgui.androidtp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Hello extends Activity {

	private Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello);

		Button v = (Button) findViewById(R.id.button1);
		v.setBackgroundColor(Color.RED);
		intent  = new Intent(this, Main.class);
	}
	
	public void submit(View v) {
		EditText t = (EditText) findViewById(R.id.input);
		intent.putExtra(Main.DISPLAY_TEXT_KEY, t.getText().toString());
		startActivity(intent);
	}

	public void poitiersClick(View v) {
		startActivity(
			new Intent(
				Intent.ACTION_VIEW, 
				Uri.parse("http://www.univ-poitiers.fr")	
			)
		);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello, menu);
		return true;
	}
	
}
