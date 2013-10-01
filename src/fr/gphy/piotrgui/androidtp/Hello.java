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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello);

		Button v = (Button) findViewById(R.id.button1);
		v.setBackgroundColor(Color.RED);
	}
	
	public void toastClick(View v) {
		//Toast.makeText(this, "Toaaaioyauste", Toast.LENGTH_SHORT).show();
		
		EditText t = (EditText) findViewById(R.id.input);
		Main.text = t.getText().toString();
		
		Intent intent = new Intent(this, Main.class);
		startActivity(intent);
		
	}

	public void poitiersClick(View v) {
		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.univ-poitiers.fr"));
		startActivity(browserIntent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello, menu);
		return true;
	}
	
}
