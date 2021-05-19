package com.example.projectathena13.ui;

import android.app.Activity;
import android.annotation.SuppressLint;
import android.app.Activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import com.example.projectathena13.MainActivity;
import com.example.projectathena13.R;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.NavController;

import java.util.ArrayList;

public class FragmentLanguages extends Fragment {
    View root;

    ArrayList<Button> buttons;
    Button english;
    Button turkish;
    Button arabic;
    Button greek;

//    private LanguagesViewModel languagesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        languagesViewModel = new ViewModelProvider(this).get(LanguagesViewModel.class);

        root = inflater.inflate(R.layout.fragment_languages, container, false);

        english = (Button) root.findViewById(R.id.englishButton);
        turkish = (Button) root.findViewById(R.id.turkishButton);
        arabic = (Button) root.findViewById(R.id.arabicButton);
        greek = (Button) root.findViewById(R.id.greekButton);

        buttons = new ArrayList<>();
        buttons.add(english);
        buttons.add(turkish);
        buttons.add(arabic);
        buttons.add(greek);

        for (Button _button : buttons) {
            _button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Navigation.findNavController(getActivity(), R.id.nav_host_fragment).navigate(R.id.nav_login);
                }
            });
        }

        //set Status- & Navigation bar colors
        @SuppressLint("ResourceType") String systemBar = getResources().getString(R.color.iconGray);
        ((MainActivity)getActivity()).updateStatusBarColor(systemBar);
        ((MainActivity)getActivity()).updateNavBarColor(systemBar);
        //Toolbar & Navigation drawer Header
        @SuppressLint("ResourceType") String toolBar = getResources().getString(R.color.coastalFog);
        ((MainActivity)getActivity()).updateActionBarColor(toolBar);
        //((MainActivity)getActivity()).updateNavHeaderColor(toolBar);

        return root;
    }
}