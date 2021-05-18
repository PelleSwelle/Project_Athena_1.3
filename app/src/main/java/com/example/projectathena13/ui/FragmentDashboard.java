package com.example.projectathena13.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.projectathena13.R;

public class FragmentDashboard extends Fragment
{
    Button cityButton;

//    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
//        dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

//        final TextView textView = root.findViewById(R.id.text_dashboard);
//
//        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>()
//        {
//            @Override
//            public void onChanged(@Nullable String s)
//            {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}