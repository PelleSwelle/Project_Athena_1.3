package com.example.projectathena13.ui.viewmodels.achievements;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AchievementsViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public AchievementsViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}