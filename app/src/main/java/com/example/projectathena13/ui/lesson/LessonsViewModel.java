package com.example.projectathena13.ui.lesson;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LessonsViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public LessonsViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is city fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}