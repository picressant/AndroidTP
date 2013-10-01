package fr.gphy.piotrgui.androidtp;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyView extends View {

	public MyView(Context context) {
		super(context);

		LinearLayout layout = new LinearLayout(context);
		layout.addView(new TextView(context));		
		
	}

}
