package com.dawntech.demo;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView listView1;
    String contacts[] = {"Shuvo", "minhaz", "Rony", "Sagor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView1 = (ListView) findViewById(R.id.listView007);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contacts);
        listView1.setAdapter(adapter);

        // Register the ListView for Context Menu
        registerForContextMenu(listView1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select an Action");
        menu.add(0, Menu.FIRST, Menu.NONE, "Call");
        menu.add(0, Menu.FIRST, Menu.NONE, "SMS");
        menu.add(0, Menu.FIRST, Menu.NONE, "Abort");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Call") {
            Toast.makeText(this, "Calling code", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, CallActivity.class);
            startActivity(intent);
        } else if (item.getTitle() == "SMS") {
            Toast.makeText(getApplicationContext(), "Sending Code", Toast.LENGTH_LONG).show();
        } else {
            return false;
        }
        return true;
    }
}
