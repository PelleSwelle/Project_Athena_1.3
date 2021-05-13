package com.example.projectathena13.ui.mathematics;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MathematicsViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public MathematicsViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is mathematics fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}