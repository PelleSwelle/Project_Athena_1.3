package com.example.projectathena13;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import static android.content.ContentValues.TAG;

// TODO probably make this extend recyclerView instead. ArrayAdapter is for ListView, recyclerView is for recyclerView
public class Adapter_Lessons extends ArrayAdapter<Lesson> implements View.OnClickListener
{
    private ArrayList<Lesson> lessons;
    int doneColor = Color.parseColor("#3daee9");
    int notDoneColor = Color.parseColor("#3daee9");
    Random r = new Random();

    Context mContext;

    // represents the linear layout holding the text- and imageView
    private static class ViewHolder {
        TextView tv_title;
        PieChart pieChart;
    }


    // constructor
    public Adapter_Lessons(ArrayList<Lesson> _lessons, Context _context) {
        super(_context, R.layout.pie, _lessons);

        this.lessons = _lessons;
        this.mContext = _context;
    }


    public void onClick(View _view) {

    }

    private int lastPosition = -1;

    public View getView(int _position, View _convertView, ViewGroup _parent)
    {
        // get the data item for this position
        Lesson lesson = getItem(_position);

        // check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        final View result;

        // if there is no convertView, make one.
        if (_convertView == null)
        {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());


            _convertView = inflater.inflate(R.layout.pie, _parent, false);
            viewHolder.tv_title = (TextView) _convertView.findViewById(R.id.tv_title);
            viewHolder.pieChart = (PieChart) _convertView.findViewById(R.id.piechart);

            result = _convertView;
            Log.d(TAG, "ViewHolder: " + viewHolder.toString());
            _convertView.setTag(viewHolder);
            Log.d(TAG, "convertView.getTag(): " + _convertView.getTag().toString());
        }
        // if there is one, get the tag
        else
        {
            viewHolder = (ViewHolder) _convertView.getTag();
            Log.d(TAG, "viewHolder: " + viewHolder.toString());
            Log.d(TAG, "_convertView.tag: " + _convertView.getTag().toString());
            result = _convertView;
        }

//        Animation animation = AnimationUtils.loadAnimation(mContext, (_position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
//        result.startAnimation(animation);
//        lastPosition = _position;

        // TODO color according to whether it is done or not.

//        PieModel donePie = new PieModel(
//                "Lesson 2", 3,
//                R.color.notFinished);

//        PieModel notDonePie = new PieModel(
//                "Lesson 3", 3,
//                R.color.finished);

//        for (Object _material : lesson.getMaterials())
//        {
//
//        }
        viewHolder.pieChart.addPieSlice(new PieModel("something", 1, Color.parseColor("#232629")));

        viewHolder.pieChart.addPieSlice(
                new PieModel("Lesson 2", 2,
                Color.parseColor("#3daee9")));
        viewHolder.pieChart.addPieSlice(
                new PieModel("Lesson 3", 1,
                Color.parseColor("#232629")));

        viewHolder.pieChart.startAnimation();
        viewHolder.tv_title.setText(lesson.getTitle());

        for (View view:_convertView.getTouchables()) {
            int min = 1;
            int max = 1000;
            int i1 = r.nextInt(max - min + 1) + min;
            view.setTranslationX(i1);
        }


        return _convertView;
    }
}
