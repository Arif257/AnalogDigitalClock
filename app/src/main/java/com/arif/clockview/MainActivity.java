package com.arif.clockview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextClock textClock;
    private AnalogClock analogClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textClock = findViewById(R.id.textClock);
        analogClock = findViewById(R.id.analogClockId);

        analogClock.setOnClickListener(this);
        textClock.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.analogClockId){
            Toast.makeText(MainActivity.this,"Analog Clock", Toast.LENGTH_SHORT).show();

        }
        if(v.getId()==R.id.textClock){
            Toast.makeText(MainActivity.this,"Text Clock", Toast.LENGTH_SHORT).show();

        }



    }
}