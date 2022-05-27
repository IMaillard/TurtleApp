package com.example.turtleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String IMAGE_VALUE_KEY = "image_key";
    public static int value;

     Turtle currentTurtle;

    TextView nameText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yume);


        ImageView turtleImage = (ImageView) findViewById(R.id.imageView);
        ImageButton rightArrow = (ImageButton) findViewById(R.id.right_arrow);
        ImageButton leftArrow = (ImageButton) findViewById(R.id.left_arrow);
        nameText = (TextView) findViewById(R.id.textView4);
        int resource = (int)turtleImage.getTag();
        currentTurtle = new Turtle(getName(), resource);


        /*if(savedInstanceState != null){
            value = savedInstanceState.getInt(IMAGE_VALUE_KEY, 0);

            turtleImage.setImageResource(resource);
        }*/

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







        rightArrow.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View view) {
                nameText.setText(TurtleDB.turtleType[i]);
                turtleImage.setImageResource(TurtleDB.ids[i]);
                currentTurtle = new Turtle(getName(), resource);
                i++;
                if (i == TurtleDB.ids.length) {
                    i = 0;

                }


            }
        });

        leftArrow.setOnClickListener(new View.OnClickListener() {
            int i = 4;
            @Override
            public void onClick(View view) {
                try {
                    nameText.setText(TurtleDB.turtleType[i]);
                    turtleImage.setImageResource(TurtleDB.ids[i]);
                }catch(Exception exception){
                    i=3;
                    nameText.setText(TurtleDB.turtleType[i]);
                    turtleImage.setImageResource(TurtleDB.ids[i]);
                }
                currentTurtle = new Turtle(getName(), resource);
                i--;

            }



        });






    }



  /*  protected void onSaveInstanceState(@NonNull Bundle outState){
        outState.putInt(IMAGE_VALUE_KEY, value);
        super.onSaveInstanceState(outState);
    }
*/
    public String getName() {
       String name = (String)nameText.getText();
       return name;
    }




}