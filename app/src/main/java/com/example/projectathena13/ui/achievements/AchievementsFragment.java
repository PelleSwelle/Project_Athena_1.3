package com.example.projectathena13.ui.achievements;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
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

        mathButton = (Button) root.findViewById(R.id.b_math);
        literacyButton = (Button) root.findViewById(R.id.b_literacy);

        mathTree = (ImageView) root.findViewById(R.id.iv_mathTree);
        litTree = (ImageView) root.findViewById(R.id.iv_literacyTree);

        mathButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                litTree.setVisibility(View.GONE);
                mathTree.setVisibility(View.VISIBLE);

            }
        });
        literacyButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mathTree.setVisibility(View.GONE);
                litTree.setVisibility(View.VISIBLE);

            }
        });


        return root;
    }
}