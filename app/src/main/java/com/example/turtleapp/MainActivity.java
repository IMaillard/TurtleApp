package com.example.turtleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yume);

        Button calendarButton = (Button) findViewById(R.id.calendarButton);
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CalendarActivity.class));
            }
        });

        Button alarmButton = (Button) findViewById(R.id.alarm_button);
        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AlarmActivity.class));
            }
        });

        Button infoButton = (Button) findViewById(R.id.info_button);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InfoActivity.class));
            }
        });

        ImageButton rightArrow = (ImageButton) findViewById(R.id.right_arrow);
        ImageButton leftArrow = (ImageButton) findViewById(R.id.left_arrow);

        ImageView turtleImage = (ImageView)findViewById(R.id.imageView);

        /*rightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = 0;
                while(i<TurtleDB.ids.length){
turtleImage.setImageResource(TurtleDB.ids[i]);
                }
                i++;
            }
        });*/


    }





}