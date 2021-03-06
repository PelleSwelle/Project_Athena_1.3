package com.example.projectathena13;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.navigation.Navigation;
import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.util.ArrayList;
import java.util.Random;

import static android.content.ContentValues.TAG;

// TODO probably make this extend recyclerView instead. ArrayAdapter is for ListView, recyclerView is for recyclerView
public class Adapter_Modules extends ArrayAdapter<Module> implements View.OnClickListener {

    private ArrayList<Module> modules;
    int doneColor = Color.parseColor("#3daee9");
    int notDoneColor = Color.parseColor("#3daee9");
    DisplayMetrics displayMetrics;

    Random r = new Random();

    Context mContext;


    public static ArrayList lessonsToBeSent;

    // represents the linear layout holding the text- and imageView
    private static class ViewHolder {
        TextView tv_title;
        PieChart pieChart;
    }


    // constructor
    public Adapter_Modules(ArrayList<Module> _modules, Context _context) {
        super(_context, R.layout.pie, _modules);

        this.modules = _modules;
        this.mContext = _context;

        displayMetrics = new DisplayMetrics();

        Log.d(TAG, "Adapter_Modules: ScreenWidth: " + displayMetrics.widthPixels); // this returns 0
    }

    // TODO on of 2 onClicks
    public void onClick(View _view) {
    }


    private int lastPosition = -1;

    public View getView(int _position, View _convertView, ViewGroup _parent) {

        // get the data item for this position
        Module module = getItem(_position);

        // check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        final View result;

        // if there is no convertView, make one.
        if (_convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());


            _convertView = inflater.inflate(R.layout.pie, _parent, false);
            viewHolder.tv_title = (TextView) _convertView.findViewById(R.id.tv_title);
            viewHolder.pieChart = (PieChart) _convertView.findViewById(R.id.piechart);

            result = _convertView;
//            Log.d(TAG, "ViewHolder: " + viewHolder.toString());
            _convertView.setTag(viewHolder);
//            Log.d(TAG, "convertView.getTag(): " + _convertView.getTag().toString());
        }
        // if there is one, get the tag
        else {
            viewHolder = (ViewHolder) _convertView.getTag();
//            Log.d(TAG, "viewHolder: " + viewHolder.toString());
//            Log.d(TAG, "_convertView.tag: " + _convertView.getTag().toString());
            result = _convertView;
        }


        // TODO color according to whether it is done or not.


        for (Lesson _lesson : module.getLessons()) {
            if (_lesson.getFinished()) {
                viewHolder.pieChart.addPieSlice(new PieModel(_lesson.getTitle(), module.getLessons().size(), R.color.design_default_color_background));
            } else {
                viewHolder.pieChart.addPieSlice(new PieModel(_lesson.getTitle(), module.getLessons().size(), R.color.design_default_color_error));
            }
        }
        viewHolder.pieChart.addPieSlice(new PieModel("something", 1, Color.parseColor("#232629")));

        viewHolder.pieChart.addPieSlice(
                new PieModel("Lesson 2", 2, Color.parseColor("#3daee9")));
        viewHolder.pieChart.addPieSlice(
                new PieModel("Lesson 3", 1, Color.parseColor("#232629")));

        int rand = r.nextInt(500 - 1 + 1) + 1;
        viewHolder.pieChart.setTranslationX(rand);
        viewHolder.tv_title.setTranslationX(rand);
        viewHolder.pieChart.startAnimation();
        viewHolder.tv_title.setText(module.getTitle());

        // SET THE X POSITION FOR EACH VIEW.
//        for (View view:_convertView.getTouchables()) {
//            int min = 200;
//            int max = 1000;
//            int i1 = r.nextInt(max - min + 1) + min;
//
//            view.setTranslationX(i1);
//        }



        _convertView.setOnClickListener(new View.OnClickListener() {
            // TODO 2nd of 2 onClicks
            @Override
            public void onClick(View _view) {
//                int position = (Integer) _view.getTag();
//                Object object = getItem(position);
//                Module module = (Module) object;
//                Toast.makeText(mContext, "View" + module.getTitle(), Toast.LENGTH_SHORT).show();


                _view.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View v) {
                        lessonsToBeSent = module.getLessons();
                        Navigation.findNavController(_view).navigate(R.id.nav_lessons);
                    }
                });
            }
        });



        return _convertView;
    }
}
