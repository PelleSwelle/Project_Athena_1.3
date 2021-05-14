package com.example.projectathena13.ui.achievements;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.projectathena13.R;

public class AchievementsFragment extends Fragment
{

    private AchievementsViewModel achievementsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        achievementsViewModel = new ViewModelProvider(this).get(AchievementsViewModel.class);

        View root = inflater.inflate(R.layout.fragment_achievements, container, false);

        Button achpop1 = getView().findViewById(R.id.button4);
        LinearLayout ach1 = getView().findViewById(R.id.ach1);
        achpop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ach1.getVisibility() == View.GONE)
                {
                    ach1.setVisibility(View.VISIBLE);
                }
                else
                {
                    ach1.setVisibility(View.GONE);
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