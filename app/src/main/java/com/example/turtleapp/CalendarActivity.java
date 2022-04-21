package com.example.turtleapp;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;
import java.util.Date;


import android.os.Bundle;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

    }

    public Date getCurrentTime() {
        return Calendar.getInstance().getTime();
    }


}