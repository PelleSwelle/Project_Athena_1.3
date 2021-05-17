package com.example.projectathena13.ui.mathematics.module2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.projectathena13.Lesson;
import com.example.projectathena13.LessonsAdapter;
import com.example.projectathena13.Module;
import com.example.projectathena13.R;
import com.example.projectathena13.ui.lesson.LessonsViewModel;
import org.eazegraph.lib.charts.PieChart;

import java.util.ArrayList;

public class m2LessonsFragment extends Fragment
{
    private LessonsViewModel lessonsViewModel;

    PieChart imgView;
    TextView txtView;
    LinearLayout linearLayout;
    ListView pieList;
    private LessonsAdapter adapter;

    ListView lv_pieChart;

    ArrayList<Lesson> lessons;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        lessonsViewModel = new ViewModelProvider(this).get(LessonsViewModel.class);

        lessons = new ArrayList<Lesson>();
        lessons.add(new Lesson("Repeated subtraction with divisors less than 20 with no remainders"));
        lessons.add(new Lesson("Repeated subtraction by multiples of 10 with divisors less than 20 with no remainders"));
        lessons.add(new Lesson("Repeated subtraction by multiples of 2, 3 and 4 with divisors greater than 20 with no remainders"));
        lessons.add(new Lesson("Repeated subtraction by multiples of 1,2 and 3 with divisors less than 20 with remainders"));
        lessons.add(new Lesson("Repeated subtraction by multiples of 10 with divisors less than 20 with remainders"));
        lessons.add(new Lesson("Repeated subtraction with divisors greater than 20 with remainders as fractions"));
        lessons.add(new Lesson("Repeated subtraction with divisors less than 35 with some remainders"));
        lessons.add(new Lesson("Repeated subtraction with divisors less than 55 with dividends of 3 and 4-digits with some remainders"));
        lessons.add(new Lesson("Repeated subtraction with divisors greater than 50 with dividends of thousands and some remainders"));
        lessons.add(new Lesson("Using divide, multiply and subtraction in the bring down method"));



        View root = inflater.inflate(R.layout.fragment_m2lessons, container, false);

        txtView = root.findViewById(R.id.tv_title);
        imgView = root.findViewById(R.id.piechart);
        lv_pieChart = root.findViewById(R.id.lv_lessons);

        adapter = new LessonsAdapter(lessons, getContext());

        lv_pieChart.setAdapter(adapter);

        PieChart _piechart = (PieChart) root.findViewById(R.id.piechart);
        return root;
    }
}