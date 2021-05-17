package com.example.projectathena13.ui.lesson;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.projectathena13.Lesson;
import com.example.projectathena13.LessonsAdapter;
import com.example.projectathena13.ModuleAdapter;
import com.example.projectathena13.R;
import org.eazegraph.lib.charts.PieChart;

import java.util.ArrayList;

public class LessonsFragment extends Fragment
{

    PieChart imgView;
    TextView txtView;
    LinearLayout linearLayout;
    ListView lv_pieChart;
    ArrayList lessons;
    private static LessonsAdapter adapter;


    private LessonsViewModel lessonsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        lessonsViewModel = new ViewModelProvider(this).get(LessonsViewModel.class);
        lessonsViewModel.getLessons();

        View root = inflater.inflate(R.layout.fragment_lessons, container, false);

//        lessons = new ArrayList<Lesson>();
//        txtView = root.findViewById(R.id.tv_title);
//        imgView = root.findViewById(R.id.piechart);
//        lv_pieChart = root.findViewById(R.id.math_modules);
//
//        adapter = new LessonsAdapter(lessons, getContext());
//
//        lv_pieChart.setAdapter(adapter);
//
//        PieChart _piechart = (PieChart) root.findViewById(R.id.piechart);

//        String moduleName = String.parseString(amountTv.getText().toString());
//        ConfirmationAction action =
//                SpecifyAmountFragmentDirections.confirmationAction();
//        action.setAmount(amount);
//        Navigation.findNavController(view).navigate(action);

        return root;
    }
}