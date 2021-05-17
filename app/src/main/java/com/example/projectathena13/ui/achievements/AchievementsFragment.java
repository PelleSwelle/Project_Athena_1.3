package com.example.projectathena13.ui.achievements;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.projectathena13.R;

import java.util.ArrayList;

public class AchievementsFragment extends Fragment
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



    ArrayList buttons;

    private AchievementsViewModel achievementsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        buttons = new ArrayList<Button>();
        buttons.add(mathButton);
        buttons.add(literacyButton);
        buttons.add(arabicButton);
        buttons.add(chemistryButton);
        buttons.add(physicsButton);
        buttons.add(bioButton);
        buttons.add(historyButton);



        achievementsViewModel = new ViewModelProvider(this).get(AchievementsViewModel.class);



        View root = inflater.inflate(R.layout.fragment_achievements, container, false);


        ImageButton achpop1 = root.findViewById(R.id.imageButton);
        ImageButton achclose1 = root.findViewById(R.id.imageButton2);
        ConstraintLayout achpopL = root.findViewById(R.id.ach1);
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

//        achievementsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>()
//        {
////            @Override
////            public void onChanged(@Nullable String s)
////            {
////                textView.setText(s);
////            }
//        });

        return root;
    }
}