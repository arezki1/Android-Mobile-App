package com.arezki.myproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Random;

public class Count_Activity extends AppCompatActivity {



    // references : https://stackoverflow.com/questions/20437642/android-random-activity-in-a-quiz-application

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_);
        Button btnCount1=findViewById(R.id.count1);
        Button btnCount2=findViewById(R.id.count2);
        Button btnCount3=findViewById(R.id.count3);

        btnCount1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        // pass the encouragement voice to try again as its not correct
                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tryagain);
                mPlayer.start();
            }
        });
        btnCount2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correct);
                mPlayer.start();
                Class activity;

                //creating an arrayList of activities to eliminate every very time we call a new activity
                ArrayList<Class> activityList=new ArrayList<>();


                activityList.add(Count_five.class);
                activityList.add(Count_three.class);
                activityList.add(Count_two.class);
                activityList.add(Count_one.class);
                activityList.add(Count_four.class);

                // Here, we are generating a random number
                //I am limiting the numbers to 6, but it can go to 10 for example
                Random generator = new Random();
                int number = generator.nextInt(5) + 1;


                //  checking to see what the output of the random was
                switch(number) {
                    case 1:
                        //  if the output is 1, the activity we will open is Count_one.class ans so on
                        activity = Count_two.class;

                        //activityList.remove(Count_Activity.class);
                        break;
                    case 2:
                        activity = Count_five.class;
                        break;
                    case 3:
                        activity = Count_four.class;
                        break;
                    case 4:
                        activity = Count_three.class;
                        break;
                    default:
                        activity = Count_one.class;
                        break;
                }
                // We use intents to start activities
                Intent intent = new Intent(getBaseContext(), activity);

                //passing the ArrayList to the new activity
                intent.putExtra("ACTIVITY_LIST", activityList);
                startActivity(intent);

            }
        });
        btnCount3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // pass the encouragement voice to try again as its not correct
                MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tryagain);
                mPlayer.start();
            }
        });
    }
}
