package com.example.projectathena13.ui.languages;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.projectathena13.R;

import java.util.ArrayList;

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