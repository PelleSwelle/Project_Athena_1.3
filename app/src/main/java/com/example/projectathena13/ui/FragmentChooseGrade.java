package com.example.projectathena13.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.projectathena13.MainActivity;
import com.example.projectathena13.R;

public class FragmentChooseGrade extends Fragment
{


//    private ChooseGradeViewModel cityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
//        cityViewModel = new ViewModelProvider(this).get(ChooseGradeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_choose_grade, container, false);

        //set Status- & Navigation bar colors
        @SuppressLint("ResourceType") String systemBar = getResources().getString(R.color.abyssBlue);
        ((MainActivity)getActivity()).updateStatusBarColor(systemBar);
        ((MainActivity)getActivity()).updateNavBarColor(systemBar);
        //Toolbar & Navigation drawer Header
        @SuppressLint("ResourceType") String toolBar = getResources().getString(R.color.plasmaBlue);
        ((MainActivity)getActivity()).updateActionBarColor(toolBar);
        ((MainActivity)getActivity()).updateNavHeaderColor(toolBar);


        return root;
    }
}