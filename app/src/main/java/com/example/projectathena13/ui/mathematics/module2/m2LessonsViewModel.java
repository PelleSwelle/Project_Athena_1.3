package com.example.projectathena13.ui.mathematics.module2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class m2LessonsViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public m2LessonsViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is Lessons fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}