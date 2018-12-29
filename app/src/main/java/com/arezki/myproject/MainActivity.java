package com.arezki.myproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.main);



            mPlayer.start();


        final Button pronounceBtn = findViewById(R.id.pronounce);
        pronounceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.stop();
                Intent intent= new Intent(getApplicationContext(),Pronounce_Activity.class);

                startActivity(intent);
            }
        });


        final Button orderBtn =findViewById(R.id.order);
        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.stop();
                Intent intent=new Intent(getApplicationContext(),Order_Activity.class);
                startActivity(intent);

            }
        });

        final Button countBtn =findViewById(R.id.three3);
        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.stop();
                Intent intent=new Intent(getApplicationContext(),Count_Activity.class);
                startActivity(intent);
            }
        });
    }
}
