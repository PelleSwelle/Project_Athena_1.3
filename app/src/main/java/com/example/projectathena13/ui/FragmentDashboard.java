package com.example.projectathena13.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.NonNull;
import com.example.projectathena13.MainActivity;
import androidx.fragment.app.Fragment;
import com.example.projectathena13.MainActivity;
import com.example.projectathena13.R;
import com.example.projectathena13.User;

import static com.example.projectathena13.MainActivity.user;

public class FragmentDashboard extends Fragment
{
    TextView tv_username;

    TextView tv_mathPoints;
    ImageView iv_mathResource;

    TextView tv_literacyPoints;
    ImageView iv_literacyResource;

//    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
//        dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        // If user has been set up
        if(user != null) {
            tv_username = root.findViewById(R.id.tv_username);
            tv_username.setText(user.getName());

            // set resources
            tv_mathPoints = root.findViewById(R.id.tv_mathPoints);
            tv_literacyPoints = root.findViewById(R.id.tv_literacyPoints);
            tv_mathPoints.setText(String.valueOf(user.getMathPoints()));
            tv_literacyPoints.setText(String.valueOf(user.getLiteracyPoints()));
        }
        else {
            Toast.makeText(getContext(), "Please make a user first", Toast.LENGTH_SHORT).show();
        }


        return root;
    }
}