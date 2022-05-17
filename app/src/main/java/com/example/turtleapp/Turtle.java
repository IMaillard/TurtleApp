package com.example.turtleapp;

public class Turtle {
    private String name;
    private String turtleInfo;
    private String dietInfo;
    private String habitatInfo;
    private final int imageResource;


    public Turtle(String name, String turtleInfo, String dietInfo,String habitatInfo, int imageResource) {
        this.name = name;
        this.turtleInfo = turtleInfo;
        this.dietInfo = dietInfo;
        this.habitatInfo = dietInfo;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTurtleInfo() {
        return turtleInfo;
    }

    public void setTurtleInfo(String turtleInfo) {
        this.turtleInfo = turtleInfo;
    }

    public String getDietInfo() {
        return dietInfo;
    }

    public void setDietInfo(String dietInfo) {
        this.dietInfo = dietInfo;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getHabitatInfo() {
        return habitatInfo;
    }

    public void setHabitatInfo(String habitatInfo) {
        this.habitatInfo = habitatInfo;
    }
}
