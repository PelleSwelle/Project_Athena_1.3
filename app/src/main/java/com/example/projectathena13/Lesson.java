package com.example.projectathena13;

// TODO lighter hue of module color, darker the further you get.

import java.io.File;
import java.util.ArrayList;

public class Lesson
{

    private String title;

    private ArrayList<Material> materials;
    private boolean isFinished;

    public Lesson(String _title) {
        this.title = _title;
        this.materials = new ArrayList<Material>();
        this.isFinished = false;
    }

    // TITLE
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String _title) {
        this.title = _title;
    }

    // MATERIALS
    public ArrayList getMaterials()
    {
        return materials;
    }

    public void setMaterials(ArrayList materials)
    {
        this.materials = materials;
    }

    // FINISHED
    public boolean getFinished() {
        return isFinished;
    }

    public void setFinished(Boolean _finished) {
        isFinished = _finished;
    }


}


