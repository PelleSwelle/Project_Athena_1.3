package com.example.projectathena13.ui.literacy.module1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.projectathena13.*;
import com.example.projectathena13.ui.lesson.LessonsViewModel;
import org.eazegraph.lib.charts.PieChart;

import java.util.ArrayList;

public class LessonsFragment extends Fragment
{
    private LessonsViewModel lessonsViewModel;

    PieChart imgView;
    TextView txtView;
    LinearLayout linearLayout;
    ListView pieList;
    private static LessonsAdapter adapter;

    ListView lv_pieChart;

    ArrayList<Lesson> lessons;

//    ArrayList<Lesson> module1Lessons;
//    ArrayList<Lesson> module2Lessons;
//    ArrayList<Lesson> module3Lessons;
//    ArrayList<Lesson> module4Lessons;
//    ArrayList<Lesson> module5Lessons;
//    ArrayList<Lesson> module6Lessons;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        lessonsViewModel = new ViewModelProvider(this).get(LessonsViewModel.class);


        lessons.add(new Lesson("Spelling – Mnemonics"));
        lessons.add(new Lesson("Essay Writing 2"));
        lessons.add(new Lesson("Phrases"));
        lessons.add(new Lesson("Clauses"));
        lessons.add(new Lesson("Prepositions"));
        lessons.add(new Lesson("Conjunctions"));
//
//        module2Lessons = new ArrayList<Lesson>();
//        module2Lessons.add(new Lesson("Conjunctions – Sentences"));
//        module2Lessons.add(new Lesson("Sentence Improvement"));
//        module2Lessons.add(new Lesson("Sentence Construction"));
//        module2Lessons.add(new Lesson("Commas 2"));
//        module2Lessons.add(new Lesson("Quotation Marks"));
//
//        module3Lessons = new ArrayList<Lesson>();
//        module3Lessons.add(new Lesson("Colons and Semi-Colons"));
//        module3Lessons.add(new Lesson("Apostrophe – Possession"));
//        module3Lessons.add(new Lesson("Punctuation – Various"));
//        module3Lessons.add(new Lesson("Interjections"));
//        module3Lessons.add(new Lesson("Clauses"));
//
//        module4Lessons = new ArrayList<Lesson>();
//        module4Lessons.add(new Lesson("Subject and Predicate"));
//        module4Lessons.add(new Lesson("Modal Verbs"));
//        module4Lessons.add(new Lesson("Adjectives"));
//        module4Lessons.add(new Lesson("Adverbs"));
//        module4Lessons.add(new Lesson("First and second conditionals"));
//
//        module5Lessons = new ArrayList<Lesson>();
//        module5Lessons.add(new Lesson("Modals of obligation"));
//        module5Lessons.add(new Lesson("Imperatives"));
//        module5Lessons.add(new Lesson("Spelling"));
//        module5Lessons.add(new Lesson("Prefixes"));
//        module5Lessons.add(new Lesson("Suffixes"));
//
//        module6Lessons = new ArrayList<Lesson>();
//        module6Lessons.add(new Lesson("Advanced Dictionary Use"));
//        module6Lessons.add(new Lesson("Conjunctions – Sentences"));
//        module6Lessons.add(new Lesson("Sentence Improvement"));
//        module6Lessons.add(new Lesson("Sentence Construction"));
//        module6Lessons.add(new Lesson("Verbs – Tense"));
//
//
//        modules = new ArrayList<Module>();
//
//        modules.add(new Module("module1", module1Lessons));
//        modules.add(new Module("module2", module2Lessons));
//        modules.add(new Module("module3", module3Lessons));
//        modules.add(new Module("module4", module4Lessons));
//        modules.add(new Module("module5", module5Lessons));
//        modules.add(new Module("module6", module6Lessons));

        View root = inflater.inflate(R.layout.fragment_lessons, container, false);

        txtView = root.findViewById(R.id.tv_title);
        imgView = root.findViewById(R.id.piechart);
        lv_pieChart = root.findViewById(R.id.lv_lessons);

        adapter = new LessonsAdapter(lessons, getContext());

        lv_pieChart.setAdapter(adapter);

        PieChart _piechart = (PieChart) root.findViewById(R.id.piechart);
        return root;
    }
}