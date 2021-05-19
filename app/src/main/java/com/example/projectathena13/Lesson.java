package com.example.projectathena13;

// TODO lighter hue of module color, darker the further you get.

import android.graphics.drawable.Drawable;

import java.io.File;
import java.util.ArrayList;

public class Lesson {
    private String title;
    private String description;
    private ArrayList<String> materials;
    private boolean isFinished;


    // everytime a lesson is instantiated it makes a arraylist of Strings for the materials.
    public Lesson(String _title) {
        this.title = _title;
        this.isFinished = false;
        this.description = String.valueOf(R.string.lorem_ipsum);
        // every lesson instantiates with 2 materials and 1 homework
        this.materials = new ArrayList<String>();
        this.materials.add("material 1");
        this.materials.add("material 2");
        this.materials.add("Homework");
    }

    public Lesson(String title, String description) {
        this.title = title;
        this.isFinished = false;
        this.description = description;

        this.materials = new ArrayList<String>();
        this.materials.add("material 1");
        this.materials.add("material 2");
        this.materials.add("Homework");
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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
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


