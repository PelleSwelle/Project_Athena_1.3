package com.example.projectathena13;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.navigation.Navigation;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;


public class Adapter_Materials extends ArrayAdapter<Material> implements View.OnClickListener {

    private ArrayList<Material> materials;
    int doneColor = Color.parseColor("#3daee9");
    int notDoneColor = Color.parseColor("#3daee9");

    Context mContext;
    public static ArrayList materialsToBeSent;

    // represents the linear layout holding the text- and imageView
    private static class ViewHolder {
        TextView tv_lessonTitle;
        TextView tv_description;
        TextView tv_materialName;
        ImageView iv_tickmark;
    }


    // constructor
    public Adapter_Materials(ArrayList<Material> materials, Context _context) {
        super(_context, R.layout.material_item, materials);

        this.materials = materials;
        this.mContext = _context;
    }

    public void onClick(View _view) {
    }

    private int lastPosition = -1;

    public View getView(int _position, View _convertView, ViewGroup _parent) {

        // get the data item for this position
        Lesson lesson = getItem(_position);

        // check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        final View result;

        // if there is no convertView, make one.
        if (_convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());


            _convertView = inflater.inflate(R.layout.material_item, _parent, false);
            viewHolder.tv_materialName = (TextView) _convertView.findViewById(R.id.tv_materialTitle);

            result = _convertView;
            Log.d(TAG, "ViewHolder: " + viewHolder.toString());
            _convertView.setTag(viewHolder);
            Log.d(TAG, "convertView.getTag(): " + _convertView.getTag().toString());
        }
        // if there is one, get the tag
        else {
            viewHolder = (ViewHolder) _convertView.getTag();
            Log.d(TAG, "viewHolder: " + viewHolder.toString());
            Log.d(TAG, "_convertView.tag: " + _convertView.getTag().toString());
            result = _convertView;
        }

        viewHolder.tv_materialName.setText(lesson.getTitle());

        _convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
//                int position = (Integer) _view.getTag();
//                Object object = getItem(position);
//                Module module = (Module) object;
//                Toast.makeText(mContext, "View" + module.getTitle(), Toast.LENGTH_SHORT).show();


                _view.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        materialsToBeSent = lesson.getMaterials();
                        Navigation.findNavController(_view).navigate(R.id.nav_lessons);
                    }
                });
            }
        });
        return _convertView;
    }
}
