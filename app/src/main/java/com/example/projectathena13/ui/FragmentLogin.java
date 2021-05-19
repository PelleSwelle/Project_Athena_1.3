package com.example.projectathena13.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import com.example.projectathena13.MainActivity;
import com.example.projectathena13.R;
import com.example.projectathena13.User;
import com.google.android.material.navigation.NavigationView;

import static com.example.projectathena13.MainActivity.hideKeyboard;
import static com.example.projectathena13.MainActivity.user;

public class FragmentLogin extends Fragment
{
    EditText et_name;
    EditText et_password;
    Button bt_signIn;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_login, container, false);

        bt_signIn = root.findViewById(R.id.bt_signIn);
        et_name = root.findViewById(R.id.tv_name);
        et_password = root.findViewById(R.id.et_password);

        // if touch background, hide keyboard
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideKeyboard(getActivity());
            }
        });


        bt_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_name != null) {
                    // create user.
                    user = new User(et_name.getText().toString());

                    // update UI
                    NavigationView navigationView = (NavigationView) MainActivity.navigationView;
                    View headerView = navigationView.getHeaderView(0);
                    TextView navUsername = (TextView) headerView.findViewById(R.id.nav_header_username);
                    navUsername.setText(et_name.getText().toString());
                    TextView navEmail = (TextView) headerView.findViewById(R.id.nav_header_email);
                    navEmail.setText(user.getMail());
                    Navigation.findNavController(getActivity(), R.id.nav_host_fragment).navigate(R.id.nav_chooseGrade);

                }
            }
        });

        //set Status- & Navigation bar colors
        @SuppressLint("ResourceType") String systemBar = getResources().getString(R.color.abyssBlue);
        ((MainActivity)getActivity()).updateStatusBarColor(systemBar);
        ((MainActivity)getActivity()).updateNavBarColor(systemBar);

        return root;
    }
}