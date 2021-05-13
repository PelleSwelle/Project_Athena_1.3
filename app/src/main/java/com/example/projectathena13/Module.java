package com.example.projectathena13;

import java.util.ArrayList;

// TODO color: lighter hue of cubject color, darker as you get further and further.

public class Module
{
    private String title;
    private ArrayList<Lesson> lessons;
    private int noOfLessons;


// TODO should instantiate with lessons in it.
    public Module(String _title, ArrayList<Lesson> _lessons, boolean _hardCoded) {
        this.title = _title;
//        setLessons(_lessons);

        // this is just for testing.b
        if (_hardCoded) {
            this.lessons = new ArrayList<Lesson>();
            this.lessons.add(new Lesson("Self Assessment – Year 7"));
            this.lessons.add(new Lesson("Multiplying 2-digit numbers by 2-digit numbers"));
            this.lessons.add(new Lesson("Multiplying 4-digit numbers by 3-digit numbers"));
            this.lessons.get(0).setFinished(false);
            this.lessons.get(1).setFinished(false);
            this.lessons.get(2).setFinished(true);
        }

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

    public void setLessons(int _grade, int _moduleNumber) {
//        Switch (_grade) {
//            case 7:
//                // set grade to 7;
//        }
    }
}
