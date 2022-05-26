package com.example.turtleapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class AlarmActivity extends AppCompatActivity {

    FloatingActionButton fab;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clock_page                             );

        fab = findViewById(R.id.floatingActionButton2);

         fab.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                         .setAction("Action", null).show();
             }
         });

    }



}
