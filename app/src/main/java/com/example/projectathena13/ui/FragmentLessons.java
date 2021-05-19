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
import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;
import static com.example.projectathena13.MainActivity.user;

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
//        
        context = this.context;


        View root = inflater.inflate(R.layout.fragment_lessons, container, false);


        txtView = root.findViewById(R.id.tv_title);
        imgView = root.findViewById(R.id.piechart);
        lv_pieChart = root.findViewById(R.id.lv_lessons);

        // TODO make dynamic depending on which module you press.
        lessons = Adapter_Modules.lessonsToBeSent;
        adapter = new Adapter_Lessons(lessons, getContext());

        popWindow = new PopupWindow(inflater.inflate(R.layout.lesson_popup, null, false), 1200, 2000, true);
        TextView tv_material1 = popWindow.getContentView().findViewById(R.id.tv_material1);
        TextView tv_material2 = popWindow.getContentView().findViewById(R.id.tv_material2);
        TextView tv_homeWork = popWindow.getContentView().findViewById(R.id.tv_homework);

        ImageView iv_exit = root.findViewById(R.id.exitCross);




        lv_pieChart.setAdapter(adapter);
        lv_pieChart.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemClick: popUp menu open");
                // TODO open a toast saying: "Downloading..."

                popWindow.showAtLocation(lv_pieChart, Gravity.CENTER, 0, 0);
                popWindow.setBackgroundDrawable(popWindow.getBackground());
                popWindow.getContentView().findViewById(R.id.tv_material1).setOnClickListener(new View.OnClickListener() {
//                    @Override
                    public void onClick(View v) {
                        tv_material1.setTextColor(getResources().getColor(R.color.nobleFir));

                        // TODO this should happen when all are clicked.
                        // TODO find out if getting math or literacy points.
//                        user.addliteracy();
                    }
                });
                popWindow.getContentView().findViewById(R.id.tv_material2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tv_material2.setTextColor(getResources().getColor(R.color.nobleFir));
                        Log.d(TAG, "onClick: material 2");
                    }
                });
                popWindow.getContentView().findViewById(R.id.tv_homework).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tv_homeWork.setTextColor(getResources().getColor(R.color.nobleFir));
                        Log.d(TAG, "onClick: homework");
                    }
                });


            }
        });

        PieChart _piechart = (PieChart) root.findViewById(R.id.piechart);
        return root;
    }
}