package com.example.projectathena13;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.NonNull;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;
import static android.icu.text.DisplayContext.LENGTH_SHORT;

// the pop up window holding the lesson material for each lesson
public class LessonPopUp extends PopupWindow {
    ListView lv_materials;
    public TextView tv_material1;
    public TextView tv_material2;
    public TextView tv_homework;
    Context context;
    ArrayAdapter adapter;

    ArrayList materials;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.lesson_popup, container, false);

        boolean finished = false;

        return root;
    }
}
