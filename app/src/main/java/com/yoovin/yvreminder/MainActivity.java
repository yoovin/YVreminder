package com.yoovin.yvreminder;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> items = new ArrayList<>();
        final ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, items);
        final ListView listReminder = (ListView) findViewById(R.id.list_reminder);
        listReminder.setAdapter(adapter);

        }



    }

public class ListViewReminder extends ListActivity{

}
