package com.example.projectathena13;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.navigation.ui.NavigationUI;
import com.example.projectathena13.MainActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import com.example.projectathena13.ui.mathematics.MathematicsFragment;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

// TODO probably make this extend recyclerView instead. ArrayAdapter is for ListView, recyclerView is for recyclerView
public class ModuleAdapter extends ArrayAdapter<Module> implements View.OnClickListener
{

    private ArrayList<Module> modules;
    int doneColor = Color.parseColor("#3daee9");
    int notDoneColor = Color.parseColor("#3daee9");
//    FragmentManager fragmentManager

    Context mContext;
    public static ArrayList lessonsToBeSent;

    // represents the linear layout holding the text- and imageView
    private static class ViewHolder
    {
        TextView tv_title;
        PieChart pieChart;
    }


    // constructor
    public ModuleAdapter(ArrayList<Module> _modules, Context _context)
    {
        super(_context, R.layout.pie, _modules);

        this.modules = _modules;
        this.mContext = _context;
    }


    public void onClick(View _view)
    {
//        int position = (Integer) _view.getTag();
//        Object object = getItem(position);
//        Module module = (Module) object;
//
//
//        switch (_view.getId())
//        {
//            case R.id.tv_title:
//                Snackbar.make(_view, "this is title", Snackbar.LENGTH_LONG).show();
//
////                mContext.startActivity(new Intent(mContext, LessonsActivity.class));
//
//            case R.id.piechart:
//                Snackbar.make(_view, "this is pie chart", Snackbar.LENGTH_LONG);
//        }
    }

    private int lastPosition = -1;

    public View getView(int _position, View _convertView, ViewGroup _parent)
    {

        // get the data item for this position
        Module module = getItem(_position);

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

        for (Lesson _lesson : module.getLessons())
        {
            if (_lesson.getFinished())
            {

                viewHolder.pieChart.addPieSlice(new PieModel(_lesson.getTitle(),
                        module.getLessons().size(), R.color.design_default_color_background));
            } else
            {
                viewHolder.pieChart.addPieSlice(new PieModel(_lesson.getTitle(),
                        module.getLessons().size(), R.color.design_default_color_error));
            }
        }
        viewHolder.pieChart.addPieSlice(new PieModel("something", 1, Color.parseColor("#232629")));

        viewHolder.pieChart.addPieSlice(
                new PieModel("Lesson 2", 2,
                Color.parseColor("#3daee9")));
        viewHolder.pieChart.addPieSlice(
                new PieModel("Lesson 3", 1,
                Color.parseColor("#232629")));

        viewHolder.pieChart.startAnimation();
        viewHolder.tv_title.setText(module.getTitle());

        _convertView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View _view)
            {
//                int position = (Integer) _view.getTag();
//                Object object = getItem(position);
//                Module module = (Module) object;
                Toast.makeText(mContext, "View" + module.getTitle(), Toast.LENGTH_SHORT).show();

//                NavController navController = Navigation.findNavController(MainActivity, R.id.nav_host_fragment);
//                navController.navigate(R.id.action_nav_mathematics_to_nav_lessons);

                _view.setOnClickListener(new View.OnClickListener()
                {

                    @Override
                    public void onClick(View v)
                    {
                        lessonsToBeSent = module.getLessons();
                        Navigation.findNavController(_view).navigate(R.id.nav_math1lessons);
                    }

                });
                // TODO gotolessons

            }
        });
        return _convertView;
    }

}
