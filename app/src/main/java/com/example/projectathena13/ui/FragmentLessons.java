package com.example.projectathena13.ui;

import android.annotation.SuppressLint;
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
    private ArrayAdapter materialsAdapter;
    ImageView iv_exitCross;



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

        lessons = Adapter_Modules.lessonsToBeSent;
        adapter = new Adapter_Lessons(lessons, getContext());

        popWindow = new PopupWindow(inflater.inflate(R.layout.lesson_popup, null, false), 1200, 2000, true);
        ListView lv_materials = popWindow.getContentView().findViewById(R.id.lv_materials);

        // TODO get materials from lessons


        ArrayList materials = new ArrayList<String>();
        materials.add("material 1");
        materials.add("material 2");
        materials.add("Homework");
        materials.add("Quiz");

        materialsAdapter = new ArrayAdapter<String>(root.getContext(), R.layout.material_item, materials);
        lv_materials.setAdapter(materialsAdapter);

        lv_materials.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;

                textView.setTextColor(getResources().getColor(R.color.hoverBlue));

                user.addLiteracy(2);
            }
        });

        lv_pieChart.setAdapter(adapter);
        lv_pieChart.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemClick: popUp menu open");
                // TODO open a toast saying: "Downloading..."

                popWindow.showAtLocation(lv_pieChart, Gravity.CENTER, 0, 0);
                popWindow.setBackgroundDrawable(popWindow.getBackground());

                // set title of lesson
                TextView tv_lessonTitle = popWindow.getContentView().findViewById(R.id.tv_lessonTitle);
                tv_lessonTitle.setText(adapter.getItem(position).getTitle());

                // set description for lesson
                TextView tv_lessonDescription = popWindow.getContentView().findViewById(R.id.tv_lessonDescription);
                tv_lessonDescription.setText(adapter.getItem(position).getDescription());
                iv_exitCross = popWindow.getContentView().findViewById(R.id.iv_cross);

                iv_exitCross.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popWindow.dismiss();
                    }
                });
            }
        });

        PieChart _piechart = (PieChart) root.findViewById(R.id.piechart);


        // We don't change the colors for the lesson fragment, we let it inherit the color of the subject it is accessed from

//        //set Status- & Navigation bar colors
//        @SuppressLint("ResourceType") String systemBar = getResources().getString(R.color.abyssBlue);
//        ((MainActivity)getActivity()).updateStatusBarColor(systemBar);
//        ((MainActivity)getActivity()).updateNavBarColor(systemBar);
//        //Toolbar & Navigation drawer Header
//        @SuppressLint("ResourceType") String toolBar = getResources().getString(R.color.plasmaBlue);
//        ((MainActivity)getActivity()).updateActionBarColor(toolBar);
//        ((MainActivity)getActivity()).updateNavHeaderColor(toolBar);

        return root;
    }
}