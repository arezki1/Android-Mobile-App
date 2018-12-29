package com.arezki.myproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/* https://evolution.voxeo.com/library/audio/prompts/numbers/index.jsp */
public class Pronounce_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronounce_);

        //find all the buttons
        Button btnCount=findViewById(R.id.button_one);
        Button btnCount2=findViewById(R.id.button_two);
        Button btnCount3=findViewById(R.id.button_three);
        Button btnCount4=findViewById(R.id.button_four);
        Button btnCount5=findViewById(R.id.button_five);
        Button btnCount6=findViewById(R.id.button_six);
        Button btnCount7=findViewById(R.id.button_seven);
        Button btnCount8=findViewById(R.id.button_eight);
        Button btnCount9=findViewById(R.id.button_nine);
        Button btnCount10=findViewById(R.id.button_ten);

        // play an audio if any button is played
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.one);
                mPlayer.start();
            }
        });


        btnCount2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.two);
                mPlayer.start();
            }
        });
        btnCount3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.three);
                mPlayer.start();
            }
        });
        btnCount4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.four);
                mPlayer.start();
            }
        });
        btnCount5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.five);
                mPlayer.start();
            }
        });
        btnCount6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.six);
                mPlayer.start();
            }
        });
        btnCount7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.seven);
                mPlayer.start();
            }
        });
        btnCount8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.eight);
                mPlayer.start();
            }
        });
        btnCount9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nine);
                mPlayer.start();
            }
        });
        btnCount10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ten);
                mPlayer.start();
            }
        });
    }
}
