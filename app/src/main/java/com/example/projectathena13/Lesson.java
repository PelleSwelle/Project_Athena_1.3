package com.example.projectathena13;

// TODO lighter hue of module color, darker the further you get.

import android.graphics.drawable.Drawable;

import java.io.File;
import java.util.ArrayList;

public class Lesson {
    private String title;

    private ArrayList<String> materials;
    private boolean isFinished;


    // everytime a lesson is instantiated it makes a arraylist of Strings for the materials.
    public Lesson(String _title) {
        this.title = _title;
        this.isFinished = false;

        this.addMaterials(_title, "material 1", "material 2", "homework");
    }

    public void addMaterials(String lesson, String title1, String title2, String title3) {
        this.materials = new ArrayList<String>();

        this.materials.add(lesson + "-" + title1);
        this.materials.add(lesson + "-" + title2);
        this.materials.add(lesson + "-" + title3);
    }

    // TITLE
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String _title) {
        this.title = _title;
    }

    // MATERIALS
    public ArrayList getMaterials() {
        return this.materials;
    }

    public void setMaterials(ArrayList materials) {
        this.materials = materials;
    }

    // FINISHED
    public boolean getFinished() {
        return isFinished;
    }

    public void setFinished(Boolean _finished) {
        isFinished = _finished;
    }

    public class resource {
    }
}


