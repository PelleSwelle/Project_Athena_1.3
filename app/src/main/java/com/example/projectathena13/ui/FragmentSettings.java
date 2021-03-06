package com.example.projectathena13.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.example.projectathena13.MainActivity;
import com.example.projectathena13.R;

import static com.example.projectathena13.MainActivity.user;

public class FragmentSettings extends Fragment {

    Button profileButton;
    Button gradeandlanguageButton;
    Button visualsButton;
    Button supportButton;
    Button aboutButton;

    ConstraintLayout profileConstraint;
    ConstraintLayout gradeandlanguageConstraint;
    ConstraintLayout visualsConstraint;
    ConstraintLayout supportConstraint;
    ConstraintLayout aboutConstraint;

    TextView tv_username;
    TextView tv_mail;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View root = inflater.inflate(R.layout.fragment_settings, container, false);

        tv_username = root.findViewById(R.id.tv_username);
        tv_mail = root.findViewById(R.id.tv_mail);

        if (user != null) {
            tv_username.setText(user.getName());
            tv_mail.setText(user.getMail());
        }

        profileButton = root.findViewById(R.id.profile_button);
        gradeandlanguageButton = root.findViewById(R.id.gradeandlanguage_button);
        visualsButton = root.findViewById(R.id.visuals_button);
        supportButton = root.findViewById(R.id.support_button);
        aboutButton = root.findViewById(R.id.about_button);

        profileConstraint = root.findViewById(R.id.profile_settings);
        gradeandlanguageConstraint = root.findViewById(R.id.grade_and_language_settings);
        visualsConstraint = root.findViewById(R.id.visuals_settings);
        supportConstraint = root.findViewById(R.id.support_settings);
        aboutConstraint = root.findViewById(R.id.about_settings);

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileButton.setBackgroundColor(getResources().getColor(R.color.nobleFir));
                gradeandlanguageButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                visualsButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                supportButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                aboutButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));

                if (profileConstraint.getVisibility() == View.GONE)
                {
                    profileConstraint.setVisibility(View.VISIBLE);
                    gradeandlanguageConstraint.setVisibility(View.GONE);
                    visualsConstraint.setVisibility(View.GONE);
                    supportConstraint.setVisibility(View.GONE);
                    aboutConstraint.setVisibility(View.GONE);
                }
            }
        });

        gradeandlanguageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                gradeandlanguageButton.setBackgroundColor(getResources().getColor(R.color.nobleFir));
                visualsButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                supportButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                aboutButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));if (gradeandlanguageConstraint.getVisibility() == View.GONE)
                {
                    profileConstraint.setVisibility(View.GONE);
                    gradeandlanguageConstraint.setVisibility(View.VISIBLE);
                    visualsConstraint.setVisibility(View.GONE);
                    supportConstraint.setVisibility(View.GONE);
                    aboutConstraint.setVisibility(View.GONE);
                }
            }
        });

        visualsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                gradeandlanguageButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                visualsButton.setBackgroundColor(getResources().getColor(R.color.nobleFir));
                supportButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                aboutButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));if (visualsConstraint.getVisibility() == View.GONE)
                {
                    profileConstraint.setVisibility(View.GONE);
                    gradeandlanguageConstraint.setVisibility(View.GONE);
                    visualsConstraint.setVisibility(View.VISIBLE);
                    supportConstraint.setVisibility(View.GONE);
                    aboutConstraint.setVisibility(View.GONE);
                }
            }
        });

        supportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                gradeandlanguageButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                visualsButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                supportButton.setBackgroundColor(getResources().getColor(R.color.nobleFir));
                aboutButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));if (supportConstraint.getVisibility() == View.GONE)
                {
                    profileConstraint.setVisibility(View.GONE);
                    gradeandlanguageConstraint.setVisibility(View.GONE);
                    visualsConstraint.setVisibility(View.GONE);
                    supportConstraint.setVisibility(View.VISIBLE);
                    aboutConstraint.setVisibility(View.GONE);
                }
            }
        });

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                gradeandlanguageButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                visualsButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                supportButton.setBackgroundColor(getResources().getColor(R.color.coastalFog));
                aboutButton.setBackgroundColor(getResources().getColor(R.color.nobleFir));
                if (aboutConstraint.getVisibility() == View.GONE)
                {
                    profileConstraint.setVisibility(View.GONE);
                    gradeandlanguageConstraint.setVisibility(View.GONE);
                    visualsConstraint.setVisibility(View.GONE);
                    supportConstraint.setVisibility(View.GONE);
                    aboutConstraint.setVisibility(View.VISIBLE);
                }
            }
        });

        //set Status- & Navigation bar colors
        @SuppressLint("ResourceType") String systemBar = getResources().getString(R.color.iconGray);
        ((MainActivity)getActivity()).updateStatusBarColor(systemBar);
        ((MainActivity)getActivity()).updateNavBarColor(systemBar);
        //Toolbar & Navigation drawer Header
        @SuppressLint("ResourceType") String toolBar = getResources().getString(R.color.coastalFog);
        ((MainActivity)getActivity()).updateActionBarColor(toolBar);
        ((MainActivity)getActivity()).updateNavHeaderColor(toolBar);

        return root;
    }
}
