package com.example.projectathena13;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class User {
    private Image image;
    private String name;
    private String mail;
    private ArrayList achievements;
    private int mathPoints;
    private int literacyPoints;
    private int Grade;

    public User(String name) {
        this.name = name;
        this.mail = name+"@fakeMail.nope";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // MATH POINTS
    public int getMathPoints() {
        return mathPoints;
    }

    public void addMath(int points) {
        this.mathPoints += points;
        Log.d(TAG, "addMath: added " + mathPoints);
        Log.d(TAG, "Total Math points" + getMathPoints());
    }

    // LITERACY POINTS
    public int getLiteracyPoints() {
        return literacyPoints;
    }
    public void addLiteracy(int points) {
        this.literacyPoints += points;
        Log.d(TAG, "addLiteracy: added " + literacyPoints);
        Log.d(TAG, "Total literacy points" + getLiteracyPoints());
    }

    // ACHIEVEMENTS
    public ArrayList getAchievements() {
        return achievements;
    }
    public void setAchievements(ArrayList achievements) {
        this.achievements = achievements;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
