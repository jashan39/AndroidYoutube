package com.example.youtube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class allChannels extends AppCompatActivity {

    String[] channels = {"Be Inspired","Video Advice", "Motivation Kings"};
    String[] channelId = {"UCaKZDEMDdQc8t6GzFj1_TDw", "UCAwylBbx8RiRD3VsaYdwNTw", "UCl2Ja5K8Q5NjI4XbztVM9Yw"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_channels);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, channels);

        ListView listView =  (ListView)findViewById(R.id.allChannelsList);
        listView.setAdapter(adapter);
    }

}
