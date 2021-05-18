package com.example.projectathena13;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import static android.content.ContentValues.TAG;
import static android.icu.text.DisplayContext.LENGTH_SHORT;

// the pop up window holding the lesson material for each lesson
public class LessonPopUp extends PopupWindow {
    public TextView tv_material1;
    public TextView tv_material2;
    public TextView tv_homework;
    Context context;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.lesson_popup, container, false);

//        tv_material1 = (TextView) root.findViewById(R.id.tv_material1);
//        tv_material1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, context.toString());
//                Toast.makeText(context, "Hello World",Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        tv_material2 = (TextView) root.findViewById(R.id.tv_material2);
//        tv_material2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(tv_material2.getContext(), "not implemented yet", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        tv_homework = (TextView) root.findViewById(R.id.tv_homework);
//        tv_homework.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(tv_material2.getContext(), "not implemented yet", Toast.LENGTH_SHORT).show();
//            }
//        });



        return root;
    }
}
