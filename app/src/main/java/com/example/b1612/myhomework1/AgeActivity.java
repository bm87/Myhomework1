package com.example.b1612.myhomework1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by b1612 on 16/11/14.
 */
public class AgeActivity extends Activity {

    private Handler mHandler = new Handler();
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        Intent intent = getIntent();
        String age = intent.getStringExtra(MainActivity.AGEM);

        // Create the text view
        textView = new TextView(this);
        textView = (TextView) findViewById(R.id.MyAge );

        textView.setTextSize(40);
        textView.setTextColor(Color.BLACK);
        textView.setText(age);

        mHandler.postDelayed(new Runnable() {
            public void run() {
                textView.setTextColor(Color.YELLOW);
            }
        }, 1000);

        mHandler.postDelayed(new Runnable() {
            public void run() {
                textView.setTextColor(Color.GREEN);
            }
        }, 2000);

        mHandler.postDelayed(new Runnable() {
            public void run() {
                textView.setTextColor(Color.GRAY);
            }
        }, 3000);

        mHandler.postDelayed(new Runnable() {
            public void run() {
                textView.setTextColor(Color.YELLOW);
            }
        }, 4000);

        mHandler.postDelayed(new Runnable() {
            public void run() {
                textView.setTextColor(Color.GREEN);
            }
        }, 5000);

        mHandler.postDelayed(new Runnable() {
            public void run() {
                textView.setTextColor(Color.GRAY);
            }
        }, 6000);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_age, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
