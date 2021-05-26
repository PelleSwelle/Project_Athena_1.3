package com.example.projectathena13.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import com.example.projectathena13.MainActivity;
import com.example.projectathena13.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FragmentToDo extends Fragment
{

//    private ToDoViewModel toDoViewModel;

    Button bt_newshort;
    Button bt_newLong;
    EditText editText;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
//        toDoViewModel = new ViewModelProvider(this).get(ToDoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_todo, container, false);

        bt_newshort = root.findViewById(R.id.newgoal_short);
        bt_newLong = root.findViewById(R.id.newgoal_long);

        bt_newshort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(root.getContext(), "Not implemented at this point", Toast.LENGTH_SHORT).show();
            }
        });
        bt_newLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(root.getContext(), "Not implemented at this point", Toast.LENGTH_SHORT).show();
            }
        });
        root.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Navigation.findNavController(root).navigate(R.id.nav_todo);
            }
        });


//

        //set Status- & Navigation bar colors
        @SuppressLint("ResourceType") String systemBar = getResources().getString(R.color.darkIconGreen);
        ((MainActivity)getActivity()).updateStatusBarColor(systemBar);
        ((MainActivity)getActivity()).updateNavBarColor(systemBar);
        //Toolbar & Navigation drawer Header
        @SuppressLint("ResourceType") String toolBar = getResources().getString(R.color.iconGreen);
        ((MainActivity)getActivity()).updateActionBarColor(toolBar);
        ((MainActivity)getActivity()).updateNavHeaderColor(toolBar);

        return root;
    }
}