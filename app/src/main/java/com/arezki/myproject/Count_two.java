package com.arezki.myproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Count_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_two);
        Button btnCount1=findViewById(R.id.two1);
        Button btnCount2=findViewById(R.id.two2);
        Button btnCount3=findViewById(R.id.two7);

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

                ArrayList<Class> activityList;
                Bundle extras = getIntent().getExtras();

                // casting the get extras into arrayList and pasing it to the activityList
                activityList = (ArrayList<Class>) extras.get("ACTIVITY_LIST");

                //generating a number that is smaller than the size of the new ArrayList
                Random generator = new Random();
                int number = generator.nextInt(activityList.size());

                // getting a random class call using that random number
                switch (number) {
                    case 1:
                        // E.g., if the output is 1, the activity we will open is Count_one.class
                        activity = Count_one.class;

                        activityList.remove(Count_one.class);
                        break;
                    case 2:
                        activity = Count_three.class;
                        activityList.remove(Count_two.class);
                        break;
                    case 3:
                        activity = Count_five.class;
                        activityList.remove(Count_three.class);
                        break;
                    case 4:
                        activity = Count_four.class;
                        activityList.remove(Count_four.class);
                        break;
                    default:
                        activity = Count_two.class;
                        activityList.remove(Count_five.class);
                        break;
                }


                Toast.makeText(getApplicationContext(), activityList.size() + " left", Toast.LENGTH_LONG).show();
                //  start a new activities


                Intent intent = new Intent(getApplicationContext(), activity);
                //pass the activityList into the extras for another class
                intent.putExtra("ACTIVITY_LIST", activityList);

                //wait for 1 seconds before starting a new activity
                SystemClock.sleep(1000);

                //check if all podsibilities are played then, bring the player back to the main ganme
                if (activityList.size() == 0) {
                    //wait for 2 seconds before starting a new activity
                    SystemClock.sleep(2000);
                    //MediaPlayer mPlayer1 = MediaPlayer.create(getApplicationContext(), R.raw.cheers);
                    // mPlayer1.start();

                    Intent intent2 = new Intent(getApplicationContext(), Count_Activity.class);
                    startActivity(intent2);
                    finish();

                } else {
                    startActivity(intent);

                    //disable the back button for this activity
                    finish();
                }
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
