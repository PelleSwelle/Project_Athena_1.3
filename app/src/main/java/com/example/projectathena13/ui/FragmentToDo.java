package com.example.projectathena13.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import com.example.projectathena13.R;

public class FragmentToDo extends Fragment
{

//    private ToDoViewModel toDoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
//        toDoViewModel = new ViewModelProvider(this).get(ToDoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_todo, container, false);

        root.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Navigation.findNavController(root).navigate(R.id.action_nav_dashboard_to_nav_todo);
            }
        });
//        final TextView textView = root.findViewById(R.id.text_todo);
//
//        toDoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>()
//        {
//            @Override
//            public void onChanged(@Nullable String s)
//            {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}