package com.example.projectathena13.ui.todo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ToDoViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public ToDoViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is TO DO fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}