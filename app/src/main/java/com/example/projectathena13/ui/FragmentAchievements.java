package com.example.projectathena13.ui;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.example.projectathena13.MainActivity;
import com.example.projectathena13.R;

import java.util.ArrayList;

public class FragmentAchievements extends Fragment
{
    Button mathButton;
    Button literacyButton;
    Button arabicButton;
    Button chemistryButton;
    Button physicsButton;
    Button bioButton;
    Button historyButton;

    ImageView mathTree;
    ImageView litTree;

    ConstraintLayout literacyConstraint;
    ConstraintLayout mathConstraint;



    ArrayList buttons;

//    private AchievementsViewModel achievementsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_achievements, container, false);


        ImageButton achpop1 = root.findViewById(R.id.imageButton);
        ImageButton achclose1 = root.findViewById(R.id.imageButton2);
        mathButton = root.findViewById(R.id.button_math);
        literacyButton = root.findViewById(R.id.button_literacy);
        ConstraintLayout achpopL = root.findViewById(R.id.ach1);
        literacyConstraint = root.findViewById(R.id.literacyConstraint);
        mathConstraint = root.findViewById(R.id.mathTree);

        achpop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (achpopL.getVisibility() == View.GONE)
                {
                    achpopL.setVisibility(View.VISIBLE);
                }
            }
        });

        achclose1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (achpopL.getVisibility() == View.VISIBLE)
                {
                    achpopL.setVisibility(View.GONE);
                }
            }
        });

        literacyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                literacyButton.setBackgroundColor(getResources().getColor(R.color.nobleFir));
                mathButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));

                if (literacyConstraint.getVisibility() == View.GONE)
                {
                    literacyConstraint.setVisibility(View.VISIBLE);
                    mathConstraint.setVisibility(View.GONE);
                } else
                {
                    literacyConstraint.setVisibility(View.GONE);
                }
            }
        });
        mathButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                literacyButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                mathButton.setBackgroundColor(getResources().getColor(R.color.nobleFir));
                if (mathConstraint.getVisibility() == View.GONE)
                {
                    mathConstraint.setVisibility(View.VISIBLE);
                    literacyConstraint.setVisibility(View.GONE);
                } else
                {
                    mathConstraint.setVisibility(View.GONE);
                }
            }
        });

        //set Status- & Navigation bar colors
        @SuppressLint("ResourceType") String systemBar = getResources().getString(R.color.darkIconYellow);
        ((MainActivity)getActivity()).updateStatusBarColor(systemBar);
        ((MainActivity)getActivity()).updateNavBarColor(systemBar);
        //Toolbar & Navigation drawer Header
        @SuppressLint("ResourceType") String toolBar = getResources().getString(R.color.iconYellow);
        ((MainActivity)getActivity()).updateActionBarColor(toolBar);
        ((MainActivity)getActivity()).updateNavHeaderColor(toolBar);

        return root;
    }


}