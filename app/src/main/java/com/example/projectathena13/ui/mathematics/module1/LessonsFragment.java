package com.example.projectathena13.ui.mathematics.module1;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.projectathena13.Lesson;
import com.example.projectathena13.LessonsAdapter;
import com.example.projectathena13.R;
import com.example.projectathena13.ui.lesson.LessonsViewModel;
import org.eazegraph.lib.charts.PieChart;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class LessonsFragment extends Fragment
{
    private LessonsViewModel lessonsViewModel;

    PieChart imgView;
    TextView txtView;
    LinearLayout linearLayout;
    ListView pieList;
    private LessonsAdapter adapter;

    public PopupWindow popWindow;

    ListView lv_pieChart;

    ArrayList<Lesson> lessons;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        lessonsViewModel = new ViewModelProvider(this).get(LessonsViewModel.class);

        lessons = new ArrayList<Lesson>();
        lessons.add(new Lesson("Multiplying 2-digit numbers by 2-digit numbers"));
        lessons.add(new Lesson("Multiplying 4-digit numbers by 3-digit numbers"));
        lessons.add(new Lesson("Multiplying 4-digit numbers by 3-digit numbers"));


        View root = inflater.inflate(R.layout.fragment_lessons, container, false);



        txtView = root.findViewById(R.id.tv_title);
        imgView = root.findViewById(R.id.piechart);
        lv_pieChart = root.findViewById(R.id.lv_lessons);

        adapter = new LessonsAdapter(lessons, getContext());

        popWindow = new PopupWindow(inflater.inflate(R.layout.lesson_popup, null, false), 1200,2000, true);

        ImageView iv_exit = root.findViewById(R.id.exitCross);



        lv_pieChart.setAdapter(adapter);
        lv_pieChart.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Log.d(TAG, "onItemClick: popUp menu open");

                popWindow.showAtLocation(lv_pieChart, Gravity.CENTER, 0, 0);
                popWindow.setBackgroundDrawable(popWindow.getBackground());


            }
        });

        PieChart _piechart = (PieChart) root.findViewById(R.id.piechart);
        return root;
    }
}