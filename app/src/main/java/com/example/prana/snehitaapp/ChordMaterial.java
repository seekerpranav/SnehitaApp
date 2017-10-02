package com.example.prana.snehitaapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ChordMaterial extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chord_material);
        listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(new ImageListAdapter(this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        final MediaPlayer cmaj=MediaPlayer.create(ChordMaterial.this,R.raw.cmajoraccoustic);
                        cmaj.start();

                }
            }
        });
    }
}
