package com.example.projectathena13.ui.viewmodels.chooseGrade;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChooseGradeViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public ChooseGradeViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is choose grade fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}