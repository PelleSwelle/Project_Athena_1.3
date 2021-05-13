package com.example.projectathena13.ui.literacy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LiteracyViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public LiteracyViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is literacy fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}