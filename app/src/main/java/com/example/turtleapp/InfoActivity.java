package com.example.turtleapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class InfoActivity extends AppCompatActivity {

    InfoViewModel infoViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_page);

        infoViewModel = new ViewModelProvider(this).get(InfoViewModel.class);

        infoViewModel.getCurrentTurtle();





    }





}

