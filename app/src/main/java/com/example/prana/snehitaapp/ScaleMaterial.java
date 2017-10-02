package com.example.prana.snehitaapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ScaleMaterial extends AppCompatActivity {
    private ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_material);
        l=(ListView)findViewById(R.id.list);
        l.setAdapter(new ImageListAdapter2(this));
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        final MediaPlayer cmaj=MediaPlayer.create(ScaleMaterial.this,R.raw.cmajorscaleaud);
                        cmaj.start();
                }
            }
        });

    }
}
