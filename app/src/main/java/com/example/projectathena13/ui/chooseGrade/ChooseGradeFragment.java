package com.example.projectathena13.ui.chooseGrade;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.projectathena13.R;

public class ChooseGradeFragment extends Fragment
{


    private ChooseGradeViewModel cityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        cityViewModel = new ViewModelProvider(this).get(ChooseGradeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_choose_grade, container, false);


        return root;
    }
}