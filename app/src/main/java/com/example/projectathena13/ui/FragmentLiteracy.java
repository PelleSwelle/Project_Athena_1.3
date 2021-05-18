package com.example.projectathena13.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.projectathena13.Adapter_Modules;
import com.example.projectathena13.Lesson;
import com.example.projectathena13.Module;
import com.example.projectathena13.R;
import org.eazegraph.lib.charts.PieChart;

import java.util.ArrayList;

public class FragmentLiteracy extends Fragment
{
//    private LiteracyViewModel literacyViewModel;

    PieChart imgView;
    TextView txtView;
    LinearLayout linearLayout;
    ListView pieList;
    private static Adapter_Modules adapter;

    ListView lv_literacyModules;

    ArrayList<Module> modules;
    ArrayList<Lesson> module1Lessons;
    ArrayList<Lesson> module2Lessons;
    ArrayList<Lesson> module3Lessons;
    ArrayList<Lesson> module4Lessons;
    ArrayList<Lesson> module5Lessons;
    ArrayList<Lesson> module6Lessons;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
//        literacyViewModel = new ViewModelProvider(this).get(LiteracyViewModel.class);

        modules = new ArrayList<Module>();

        // MODULE 1
            module1Lessons = new ArrayList<Lesson>();
            module1Lessons.add(new Lesson("Spelling – Mnemonics"));
            module1Lessons.add(new Lesson("Essay Writing 2"));
            module1Lessons.add(new Lesson("Phrases"));
            module1Lessons.add(new Lesson("Clauses"));
            module1Lessons.add(new Lesson("Prepositions"));
            module1Lessons.add(new Lesson("Conjunctions"));
        modules.add(new Module("module1", module1Lessons));

        // MODULE 2
            module2Lessons = new ArrayList<Lesson>();
            module2Lessons.add(new Lesson("Conjunctions – Sentences"));
            module2Lessons.add(new Lesson("Sentence Improvement"));
            module2Lessons.add(new Lesson("Sentence Construction"));
            module2Lessons.add(new Lesson("Commas 2"));
            module2Lessons.add(new Lesson("Quotation Marks"));
        modules.add(new Module("module2", module2Lessons));

        // MODULE 3
            module3Lessons = new ArrayList<Lesson>();
            module3Lessons.add(new Lesson("Colons and Semi-Colons"));
            module3Lessons.add(new Lesson("Apostrophe – Possession"));
            module3Lessons.add(new Lesson("Punctuation – Various"));
            module3Lessons.add(new Lesson("Interjections"));
            module3Lessons.add(new Lesson("Clauses"));
        modules.add(new Module("module3", module3Lessons));

        // MODULE 4
            module4Lessons = new ArrayList<Lesson>();
            module4Lessons.add(new Lesson("Subject and Predicate"));
            module4Lessons.add(new Lesson("Modal Verbs"));
            module4Lessons.add(new Lesson("Adjectives"));
            module4Lessons.add(new Lesson("Adverbs"));
            module4Lessons.add(new Lesson("First and second conditionals"));
        modules.add(new Module("module4", module4Lessons));

        // MODULE 5
            module5Lessons = new ArrayList<Lesson>();
            module5Lessons.add(new Lesson("Modals of obligation"));
            module5Lessons.add(new Lesson("Imperatives"));
            module5Lessons.add(new Lesson("Spelling"));
            module5Lessons.add(new Lesson("Prefixes"));
            module5Lessons.add(new Lesson("Suffixes"));
        modules.add(new Module("module5", module5Lessons));

        // MODULE 6
            module6Lessons = new ArrayList<Lesson>();
            module6Lessons.add(new Lesson("Advanced Dictionary Use"));
            module6Lessons.add(new Lesson("Conjunctions – Sentences"));
            module6Lessons.add(new Lesson("Sentence Improvement"));
            module6Lessons.add(new Lesson("Sentence Construction"));
            module6Lessons.add(new Lesson("Verbs – Tense"));
        modules.add(new Module("module6", module6Lessons));

        View root = inflater.inflate(R.layout.fragment_literacy, container, false);

        txtView = root.findViewById(R.id.tv_title);
        imgView = root.findViewById(R.id.piechart);
        lv_literacyModules = root.findViewById(R.id.lv_literacyModules);

        adapter = new Adapter_Modules(modules, getContext());

        lv_literacyModules.setAdapter(adapter);

        PieChart _piechart = (PieChart) root.findViewById(R.id.piechart);
        return root;
    }
}