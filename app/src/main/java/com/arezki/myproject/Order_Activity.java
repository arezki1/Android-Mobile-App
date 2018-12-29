package com.arezki.myproject;

import android.app.Activity;
import android.content.ClipData;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Order_Activity extends AppCompatActivity {


    //references: https://stackoverflow.com/questions/21670807/ondrag-cannot-receive-dragevent-action-drop


     LinearLayout target1,target2,target3,target4,target5,target6,target7,target8,target9,target10;

     Button test1,test2,test3,test4,btn1,btn2,btn3,btn4,test5,test6,test7,test8,btn5,btn6,btn7,btn8,test9,test10,btn9,btn10;

     MediaPlayer correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final MediaPlayer mPlayermain = MediaPlayer.create(getApplicationContext(), R.raw.draganddrop);

        mPlayermain.start();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.activity_order_);

        //finding all the linear layouts that holds the buttons
        target1=findViewById(R.id.target1);
        target2=findViewById(R.id.target2);
        target3=findViewById(R.id.target3);
        target4=findViewById(R.id.target4);
        target5=findViewById(R.id.target5);
        target6=findViewById(R.id.target6);
        target7=findViewById(R.id.target7);
        target8=findViewById(R.id.target8);
        target9=findViewById(R.id.target9);
        target10=findViewById(R.id.target10);

//finding all the destination buttons
        test1=findViewById(R.id.test1);
        test2=findViewById(R.id.test2);
        test3=findViewById(R.id.test3);
        test4=findViewById(R.id.test4);
        test5=findViewById(R.id.test5);
        test6=findViewById(R.id.test6);
        test7=findViewById(R.id.test7);
        test8=findViewById(R.id.test8);
        test9=findViewById(R.id.test9);
        test10=findViewById(R.id.test10);

//find all the matching buttons
        btn1=findViewById(R.id.match1);
        btn2=findViewById(R.id.match2);
        btn3=findViewById(R.id.match3);
        btn4=findViewById(R.id.match4);
        btn5=findViewById(R.id.match5);
        btn6=findViewById(R.id.match6);
        btn7=findViewById(R.id.match7);
        btn8=findViewById(R.id.match8);
        btn9=findViewById(R.id.match9);
        btn10=findViewById(R.id.match10);

//add onDrag listenener to the layout that holds the buttons
        target1.setOnDragListener(dragListener);
        target2.setOnDragListener(dragListener);
        target3.setOnDragListener(dragListener);
        target4.setOnDragListener(dragListener);
        target5.setOnDragListener(dragListener);
        target6.setOnDragListener(dragListener);
        target7.setOnDragListener(dragListener);
        target8.setOnDragListener(dragListener);
        target9.setOnDragListener(dragListener);
        target10.setOnDragListener(dragListener);

// set a clisk listenenrr for long in order to drag it
        btn1.setOnLongClickListener(longClickListener);
        btn2.setOnLongClickListener(longClickListener);
        btn3.setOnLongClickListener(longClickListener);
        btn4.setOnLongClickListener(longClickListener);
        btn5.setOnLongClickListener(longClickListener);
        btn6.setOnLongClickListener(longClickListener);
        btn7.setOnLongClickListener(longClickListener);
        btn8.setOnLongClickListener(longClickListener);
        btn9.setOnLongClickListener(longClickListener);
        btn10.setOnLongClickListener(longClickListener);


        correct=MediaPlayer.create(getApplicationContext(), R.raw.yes);
    }

    View.OnLongClickListener longClickListener=new View.OnLongClickListener(){

        @Override

        public boolean onLongClick(View v){

            ClipData data=ClipData.newPlainText("","");
            View.DragShadowBuilder myShadowBuilder=new View.DragShadowBuilder(v);
            v.startDrag(data,myShadowBuilder,v,0);
            return true;
        }
    };

    View.OnDragListener dragListener=new View.OnDragListener(){
        @Override

        public boolean onDrag(View v, DragEvent event){

            int dragEvent =event.getAction();
            final View view=(View)event.getLocalState();

            switch(dragEvent){

                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;

                case DragEvent.ACTION_DROP:

                        if(view.getId()==R.id.match1&&v.getId()==R.id.target1){

                            //get the layout and remove it from its place
                            LinearLayout oldparent=(LinearLayout)view.getParent();
                            oldparent.removeView(view);

                            //remove the destination layout and replace it with the old one
                            LinearLayout newparent=(LinearLayout)v;
                            test1.setVisibility(View.GONE);
                            newparent.addView(view);

                            //if number matches, play an audio confirmation
                            correct.start();

                        }

                        else if(view.getId()==R.id.match2&&v.getId()==R.id.target2){

                            LinearLayout oldparent=(LinearLayout)view.getParent();
                            oldparent.removeView(view);

                            LinearLayout newparent=(LinearLayout)v;
                            test2.setVisibility(View.GONE);
                            newparent.addView(view);
                            correct.start();

                        }
                        else if(view.getId()==R.id.match3&&v.getId()==R.id.target3){

                            LinearLayout oldparent=(LinearLayout)view.getParent();
                            oldparent.removeView(view);

                            LinearLayout newparent=(LinearLayout)v;
                            test3.setVisibility(View.GONE);
                            newparent.addView(view);
                            correct.start();

                        }
                        else if(view.getId()==R.id.match4&&v.getId()==R.id.target4){

                            LinearLayout oldparent=(LinearLayout)view.getParent();
                            oldparent.removeView(view);

                            LinearLayout newparent=(LinearLayout)v;
                            test4.setVisibility(View.GONE);
                            newparent.addView(view);
                            correct.start();

                        }
                        else if(view.getId()==R.id.match5&&v.getId()==R.id.target5){

                            LinearLayout oldparent=(LinearLayout)view.getParent();
                            oldparent.removeView(view);

                            LinearLayout newparent=(LinearLayout)v;
                            test5.setVisibility(View.GONE);
                            newparent.addView(view);
                            correct.start();

                        }
                        else if(view.getId()==R.id.match6&&v.getId()==R.id.target6){

                            LinearLayout oldparent=(LinearLayout)view.getParent();
                            oldparent.removeView(view);

                            LinearLayout newparent=(LinearLayout)v;
                            test6.setVisibility(View.GONE);
                            newparent.addView(view);
                            correct.start();

                        }
                        else if(view.getId()==R.id.match7&&v.getId()==R.id.target7){

                            LinearLayout oldparent=(LinearLayout)view.getParent();
                            oldparent.removeView(view);

                            LinearLayout newparent=(LinearLayout)v;
                            test7.setVisibility(View.GONE);
                            newparent.addView(view);
                            correct.start();

                        }
                        else if(view.getId()==R.id.match8&&v.getId()==R.id.target8){

                            LinearLayout oldparent=(LinearLayout)view.getParent();
                            oldparent.removeView(view);

                            LinearLayout newparent=(LinearLayout)v;
                            test8.setVisibility(View.GONE);
                            newparent.addView(view);
                            correct.start();

                        }
                        else if(view.getId()==R.id.match9&&v.getId()==R.id.target9){

                            LinearLayout oldparent=(LinearLayout)view.getParent();
                            oldparent.removeView(view);

                            LinearLayout newparent=(LinearLayout)v;
                            test9.setVisibility(View.GONE);
                            newparent.addView(view);
                            correct.start();

                        }
                        else if(view.getId()==R.id.match10&&v.getId()==R.id.target10){

                            LinearLayout oldparent=(LinearLayout)view.getParent();
                            oldparent.removeView(view);

                            LinearLayout newparent=(LinearLayout)v;
                            test10.setVisibility(View.GONE);
                            newparent.addView(view);
                            correct.start();

                        }

                        else{

                            //if the matching i not correct, we play a different audio and breck out of here
                            MediaPlayer mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.uhbaby);
                            mPlayer.start();
                        }
                        break;
            }

            return true;
        }
    };
}
