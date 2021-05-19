package com.example.projectathena13.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import com.example.projectathena13.R;

import java.util.ArrayList;

public class FragmentChooseGrade extends Fragment
{
    Button butt7;
    Button butt8;
    Button butt9;
    Button butt10;

    Button butt11;
    Button butt12;


//    private ChooseGradeViewModel cityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View root = inflater.inflate(R.layout.fragment_choose_grade, container, false);

        // getting the buttons
        butt7 = root.findViewById(R.id.lowersecondary_grade7);
        butt8 = root.findViewById(R.id.lowersecondary_grade8);
        butt9 = root.findViewById(R.id.lowersecondary_grade9);
        butt10 = root.findViewById(R.id.lowersecondary_grade10);

        butt11 = root.findViewById(R.id.uppersecondary_grade11);
        butt12 = root.findViewById(R.id.uppersecondary_grade12);

        setButtons(butt7, butt8, butt9);
        setButtons(butt10, butt11, butt12);

        return root;
    }

    private void setButtons(Button butt10, Button butt11, Button butt12) {
        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDashboard();
            }
        });
        butt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDashboard();
            }
        });
        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDashboard();
            }
        });
    }

    public void goToDashboard() {
        Navigation.findNavController(getActivity(), R.id.nav_host_fragment).navigate(R.id.nav_dashboard);
    }
}