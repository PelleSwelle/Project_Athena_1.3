package com.example.projectathena13;

import java.util.ArrayList;

// TODO color: lighter hue of cubject color, darker as you get further and further.

public class Module
{
    private String title;
    private ArrayList<Lesson> lessons;
    private int noOfLessons;


// TODO should instantiate with lessons in it.
    public Module(String _title, ArrayList<Lesson> _lessons) {
        this.title = _title;
        this.lessons = _lessons;
    }



    public void setTitle(String _title) {
        this.title = _title;
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<Lesson> getLessons() {
        return this.lessons;
    }




}
