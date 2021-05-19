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
    ArrayList<Lesson> essayWritingLessons;
    ArrayList<Lesson> speechLessons;
    ArrayList<Lesson> punctuationLessons;
    ArrayList<Lesson> advancedSpeechLessons;
    ArrayList<Lesson> spellingLessons;
    ArrayList<Lesson> sentenceImprovementLessons;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
//        literacyViewModel = new ViewModelProvider(this).get(LiteracyViewModel.class);

        modules = new ArrayList<Module>();

        // MODULE 1
            essayWritingLessons = new ArrayList<Lesson>();
            essayWritingLessons.add(new Lesson("Spelling – Mnemonics"));
            essayWritingLessons.add(new Lesson("Essay Writing 2"));
            essayWritingLessons.add(new Lesson("Phrases"));
            essayWritingLessons.add(new Lesson("Clauses"));
            essayWritingLessons.add(new Lesson("Prepositions"));
            essayWritingLessons.add(new Lesson("Conjunctions"));
        modules.add(new Module("Essay Writing", essayWritingLessons));

        // MODULE 2
            speechLessons = new ArrayList<Lesson>();
            speechLessons.add(new Lesson("Conjunctions – Sentences"));
            speechLessons.add(new Lesson("Sentence Improvement"));
            speechLessons.add(new Lesson("Sentence Construction"));
            speechLessons.add(new Lesson("Commas 2"));
            speechLessons.add(new Lesson("Quotation Marks"));
        modules.add(new Module("Speech", speechLessons));

        // MODULE 3
            punctuationLessons = new ArrayList<Lesson>();
            punctuationLessons.add(new Lesson("Colons and Semi-Colons"));
            punctuationLessons.add(new Lesson("Apostrophe – Possession"));
            punctuationLessons.add(new Lesson("Punctuation – Various"));
            punctuationLessons.add(new Lesson("Interjections"));
            punctuationLessons.add(new Lesson("Clauses"));
        modules.add(new Module("Punctuation", punctuationLessons));

        // MODULE 4
            advancedSpeechLessons = new ArrayList<Lesson>();
            advancedSpeechLessons.add(new Lesson("Subject and Predicate"));
            advancedSpeechLessons.add(new Lesson("Modal Verbs"));
            advancedSpeechLessons.add(new Lesson("Adjectives"));
            advancedSpeechLessons.add(new Lesson("Adverbs"));
            advancedSpeechLessons.add(new Lesson("First and second conditionals"));
        modules.add(new Module("Advanced Speech", advancedSpeechLessons));

        // MODULE 5
            spellingLessons = new ArrayList<Lesson>();
            spellingLessons.add(new Lesson("Modals of obligation"));
            spellingLessons.add(new Lesson("Imperatives"));
            spellingLessons.add(new Lesson("Spelling"));
            spellingLessons.add(new Lesson("Prefixes"));
            spellingLessons.add(new Lesson("Suffixes"));
        modules.add(new Module("Spelling", spellingLessons));

        // MODULE 6
            sentenceImprovementLessons = new ArrayList<Lesson>();
            sentenceImprovementLessons.add(new Lesson("Advanced Dictionary Use"));
            sentenceImprovementLessons.add(new Lesson("Conjunctions – Sentences"));
            sentenceImprovementLessons.add(new Lesson("Sentence Improvement"));
            sentenceImprovementLessons.add(new Lesson("Sentence Construction"));
            sentenceImprovementLessons.add(new Lesson("Verbs – Tense"));
        modules.add(new Module("Sentence Improvement", sentenceImprovementLessons));

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