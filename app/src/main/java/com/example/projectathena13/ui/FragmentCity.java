package com.example.projectathena13.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.projectathena13.MainActivity;
import com.example.projectathena13.R;

public class FragmentCity extends Fragment
{


//    private CityViewModel cityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
//        cityViewModel = new ViewModelProvider(this).get(CityViewModel.class);

        View root = inflater.inflate(R.layout.fragment_city, container, false);

        final TextView textView = root.findViewById(R.id.text_city);

        //set Status- & Navigation bar colors
        @SuppressLint("ResourceType") String systemBar = getResources().getString(R.color.shadeBlack);
        ((MainActivity)getActivity()).updateStatusBarColor(systemBar);
        ((MainActivity)getActivity()).updateNavBarColor(systemBar);
        //Toolbar & Navigation drawer Header
        @SuppressLint("ResourceType") String toolBar = getResources().getString(R.color.burntCharcoal);
        ((MainActivity)getActivity()).updateActionBarColor(toolBar);
        ((MainActivity)getActivity()).updateNavHeaderColor(toolBar);

        return root;
    }
}