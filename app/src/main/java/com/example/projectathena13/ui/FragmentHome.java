package com.example.projectathena13.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.projectathena13.R;

public class FragmentHome extends Fragment
{

//    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
//        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);



        View root = inflater.inflate(R.layout.fragment_home, container, false);

        return root;
    }
}