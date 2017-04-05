package com.example.youtube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class allChannels extends AppCompatActivity {

    ArrayList<String> channels = new ArrayList<String>();
    ArrayList<String> channelID = new ArrayList<String>();

    HashMap<String, String> channelInfo = new HashMap<String, String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_channels);

        addtoList();

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, channels);

        ListView listView =  (ListView)findViewById(R.id.allChannelsList);
        listView.setAdapter(adapter);


    }

    private void addtoList() {
        channelInfo = MainActivity.maping;
        for (String aChannel : channelInfo.keySet()) {
            channels.add(aChannel);
        }

        for (String aChannel : channelInfo.values()) {
            channelID.add(aChannel);
        }

    }
}
