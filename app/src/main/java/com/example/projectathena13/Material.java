package com.example.projectathena13;

public class Material extends Lesson {
    private String name;
    private boolean isFinished;

    public Material(String name) {
        super(name);
        this.name = name;
        this.isFinished = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean getIsFinished() {
        return this.isFinished;
    }
    public void setIsFinished (boolean isFinished) {
        this.isFinished = isFinished;
    }
}
