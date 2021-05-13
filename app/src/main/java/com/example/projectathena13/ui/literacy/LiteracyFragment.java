package com.example.projectathena13.ui.literacy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.projectathena13.CustomAdapter;
import com.example.projectathena13.Lesson;
import com.example.projectathena13.Module;
import com.example.projectathena13.R;
import org.eazegraph.lib.charts.PieChart;

import java.util.ArrayList;

public class LiteracyFragment extends Fragment
{
    private LiteracyViewModel literacyViewModel;

    PieChart imgView;
    TextView txtView;
    LinearLayout linearLayout;
    ListView pieList;
    private static CustomAdapter adapter;

    ArrayList<Module> modules;
    ArrayList<Lesson> module1Lessons;
    ArrayList<Lesson> module2Lessons;
    ArrayList<Lesson> module3Lessons;
    ArrayList<Lesson> module4Lessons;
    ArrayList<Lesson> module5Lessons;
    ArrayList<Lesson> module6Lessons;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        literacyViewModel = new ViewModelProvider(this).get(LiteracyViewModel.class);

        module1Lessons = new ArrayList<Lesson>();
        module2Lessons = new ArrayList<Lesson>();
        module3Lessons = new ArrayList<Lesson>();
        module4Lessons = new ArrayList<Lesson>();
        module5Lessons = new ArrayList<Lesson>();
        module6Lessons = new ArrayList<Lesson>();


        modules = new ArrayList<Module>();

        modules.add(new Module("module1", module1Lessons, true));
        modules.add(new Module("module2", module2Lessons, true));
        modules.add(new Module("module3", module3Lessons, true));
        modules.add(new Module("module4", module4Lessons, true));
        modules.add(new Module("module5", module5Lessons, true));
        modules.add(new Module("module6", module6Lessons, true));

        View root = inflater.inflate(R.layout.fragment_literacy, container, false);

        txtView = root.findViewById(R.id.tv_title);
        imgView = root.findViewById(R.id.piechart);
        pieList = root.findViewById(R.id.math_modules);

        adapter = new CustomAdapter(modules, getContext());
//        final TextView textView = root.findViewById(R.id.text_literacy);
//        literacyViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>()
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