package com.example.b1612.myhomework1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;


/**
 * Created by b1612 on 16/11/14.
 */
public class LastNameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastname);

        Intent intent = getIntent();
        String surname = intent.getStringExtra(MainActivity.LASTNAMEM);

        // Create the text view
        TextView textView = new TextView(this);
        textView = (TextView) findViewById(R.id.MyLastname );

        textView.setTextSize(40);
        textView.setText(surname);

        // Set the text to blink
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(10); //You can manage the blinking time with this parameter
        anim.setStartOffset(800);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        textView.startAnimation(anim);

    }

}


