package com.example.projectathena13.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.projectathena13.*;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import org.eazegraph.lib.charts.PieChart;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class FragmentLessons extends Fragment {
//    private LessonsViewModel lessonsViewModel;

    PieChart imgView;
    TextView txtView;
    LinearLayout linearLayout;
    ListView pieList;
    private Adapter_Lessons adapter;

    Context context;

    public PopupWindow popWindow;

    ListView lv_pieChart;

    ArrayList<Lesson> lessons;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        lessonsViewModel = new ViewModelProvider(this).get(LessonsViewModel.class);

//        lessons = new ArrayList<Lesson>();
//        lessons.add(new Lesson("Multiplying 2-digit numbers by 2-digit numbers"));
//        lessons.add(new Lesson("Multiplying 4-digit numbers by 3-digit numbers"));
//        lessons.add(new Lesson("Multiplying 4-digit numbers by 3-digit numbers"));
        context = this.context;


        View root = inflater.inflate(R.layout.fragment_lessons, container, false);


        txtView = root.findViewById(R.id.tv_title);
        imgView = root.findViewById(R.id.piechart);
        lv_pieChart = root.findViewById(R.id.lv_lessons);

        // TODO make dynamic depending on which module you press.
        lessons = Adapter_Modules.lessonsToBeSent;
        adapter = new Adapter_Lessons(lessons, getContext());

        popWindow = new PopupWindow(inflater.inflate(R.layout.lesson_popup, null, false), 1200, 2000, true);

        ImageView iv_exit = root.findViewById(R.id.exitCross);


        lv_pieChart.setAdapter(adapter);
        lv_pieChart.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemClick: popUp menu open");

                popWindow.showAtLocation(lv_pieChart, Gravity.CENTER, 0, 0);
                popWindow.setBackgroundDrawable(popWindow.getBackground());
                popWindow.getContentView().findViewById(R.id.tv_material1).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Log.d(TAG, "onClick: material 1");
                        // TODO open a toast saying: "Downloading..."
                    }
                });
                popWindow.getContentView().findViewById(R.id.tv_material2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Log.d(TAG, "onClick: material 2");
                        // TODO open a toast saying: "Downloading..."
                    }
                });
                popWindow.getContentView().findViewById(R.id.tv_homework).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Log.d(TAG, "onClick: homework");
                        // TODO open a toast saying: "Downloading..."
                    }
                });


            }
        });

        PieChart _piechart = (PieChart) root.findViewById(R.id.piechart);
        return root;
    }
}