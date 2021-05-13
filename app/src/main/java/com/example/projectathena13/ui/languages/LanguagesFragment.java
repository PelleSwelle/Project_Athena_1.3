package com.example.projectathena13.ui.languages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.projectathena13.R;

import java.util.ArrayList;

public class LanguagesFragment extends Fragment
{
    View root;

    ArrayList<Button> buttons;
    Button english;
    Button turkish;
    Button arabic;
    Button greek;

    private LanguagesViewModel languagesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        languagesViewModel = new ViewModelProvider(this).get(LanguagesViewModel.class);

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

        for (Button _button: buttons)
        {
            _button.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Toast.makeText(_button.getContext(), "you chose " + _button.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }

        return root;
    }
}