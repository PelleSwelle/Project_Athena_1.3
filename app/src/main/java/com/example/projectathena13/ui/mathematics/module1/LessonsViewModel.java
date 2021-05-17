package com.example.projectathena13.ui.mathematics.module1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class LessonsViewModel extends ViewModel
{
    public ArrayList lessons;


    public ArrayList getLessons() { return lessons; }

    public void setLessons() {

    }

    private MutableLiveData<String> mText;

    public LessonsViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is Lessons fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}