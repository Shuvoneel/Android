package com.dawntech.demo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class OptionMenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Toast.makeText(this, "...wow", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_menu1) {
            Toast.makeText(this, "...how", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_menu2) {
            Toast.makeText(this, "...mow", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_menu3) {
            Toast.makeText(this, "...cow", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
