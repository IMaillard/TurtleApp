package com.example.turtleapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class InfoViewModel extends AndroidViewModel {

    private MutableLiveData<Turtle> currentTurtle;

    public PlantViewModel(@NonNull Application application){
        super(application);
        currentTurtle = new MutableLiveData<Turtle>();
    }


//TODO getter and setter
}
