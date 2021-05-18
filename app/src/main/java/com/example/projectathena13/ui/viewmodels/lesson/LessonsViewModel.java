package com.example.projectathena13.ui.viewmodels.lesson;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.projectathena13.Lesson;

public class LessonsViewModel extends ViewModel
{

    private MutableLiveData<String> mText;
    private MutableLiveData<Lesson> lessons;

    public LessonsViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is city fragment");
        lessons = new MutableLiveData<>();
        lessons.setValue(new Lesson("something"));
    }

    public LiveData<String> getText()
    {
        return mText;
    }

    public LiveData<Lesson> getLessons() {return this.lessons;}
}