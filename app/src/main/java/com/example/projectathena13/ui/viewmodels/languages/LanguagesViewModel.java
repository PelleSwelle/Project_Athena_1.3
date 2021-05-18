package com.example.projectathena13.ui.viewmodels.languages;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LanguagesViewModel extends ViewModel
{



    private MutableLiveData<String> mText;

    public LanguagesViewModel()
    {

    }

    public LiveData<String> getText()
    {
        return mText;
    }
}