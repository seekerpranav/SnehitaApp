package com.example.prana.snehitaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bsc,chord,scal,mor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bsc=(Button)findViewById(R.id.Basic);
        chord=(Button)findViewById(R.id.Chords);
        scal=(Button)findViewById(R.id.Scales);
        mor=(Button)findViewById(R.id.More);
        bsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BasicMaterial.class));
            }
        });
        chord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChordMaterial.class));
            }
        });
        scal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ScaleMaterial.class));
            }
        });
        mor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MoreMaterial.class));
            }
        });
    }
}
