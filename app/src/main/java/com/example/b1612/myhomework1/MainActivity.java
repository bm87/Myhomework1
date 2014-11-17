package com.example.b1612.myhomework1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    public static String LASTNAMEM = "";
    public static String AGEM = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void ClickName(View view){
        EditText text = (EditText)findViewById(R.id.name);
        Intent name = new Intent();
        name.putExtra("value", text.getText().toString());
        name.setClass(this,NameActivty.class);
        startActivity(name);
    }

    public void ClickLastname(View view) {
        Intent intent = new Intent(this, LastNameActivity.class);

        EditText editText = (EditText) findViewById(R.id.lastname);
        String lastnamem = editText.getText().toString();

        intent.putExtra(LASTNAMEM, lastnamem);
        startActivity(intent);
    }

    public void ClickAge (View view) {
        Intent intent = new Intent(this, AgeActivity.class);

        EditText editText = (EditText) findViewById(R.id.age);
        String agem = editText.getText().toString();

        intent.putExtra(AGEM, agem);
        startActivity(intent);
    }

    public void ClickImage(View view){
        Intent img = new Intent(this,ImageActivity.class);
        startActivity(img);
    }
}

