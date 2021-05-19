package com.example.projectathena13.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.projectathena13.*;
import org.eazegraph.lib.charts.PieChart;

import java.util.ArrayList;

public class FragmentMathematics extends Fragment
{

//    private MathematicsViewModel mathematicsViewModel;

    PieChart imgView;
    TextView txtView;
    LinearLayout linearLayout;
    ListView lv_mathModules;
    private static Adapter_Modules adapter;


    ArrayList<Module> modules;
    ArrayList<Lesson> selfAssessmentLessons;
    ArrayList<Lesson> multiplicationLessons;
    ArrayList<Lesson> divisionRepeatSubtractionLessons;
    ArrayList<Lesson> decimalsLessons;
    ArrayList<Lesson> percentagesLessons;
    ArrayList<Lesson> fractionsLessons;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
//        mathematicsViewModel = new ViewModelProvider(this).get(MathematicsViewModel.class);


        modules = new ArrayList<Module>();

        // SELF ASSESSMENT
            selfAssessmentLessons = new ArrayList<Lesson>();
            selfAssessmentLessons.add(new Lesson("Self Assessment – Year 7"));
        modules.add(new Module("Self-assessment", selfAssessmentLessons));

        // MULITPLICATION
            multiplicationLessons = new ArrayList<Lesson>();
            multiplicationLessons.add(new Lesson("Multiplication 1",
                    "Multiplying 2-digit numbers by 2-digit numbers"));
            multiplicationLessons.add(new Lesson("Multiplication 2",
                    "Multiplying 4-digit numbers by 3-digit numbers"));
            multiplicationLessons.add(new Lesson("Multiplication 3",
                    "Multiplying 4-digit numbers by 3-digit numbers"));
        modules.add(new Module("Multiplication", multiplicationLessons));

        // DIVISION / REPEAT SUBTRACTION
            divisionRepeatSubtractionLessons = new ArrayList<Lesson>();
            divisionRepeatSubtractionLessons.add(new Lesson("Division / Repeat Subtraction 1","Repeated subtraction with divisors less than 20 with no remainders"));
            divisionRepeatSubtractionLessons.add(new Lesson("Division / Repeat Subtraction 2","Repeated subtraction by multiples of 10 with divisors less than 20 with no remainders"));
            divisionRepeatSubtractionLessons.add(new Lesson("Division / Repeat Subtraction 3","Repeated subtraction by multiples of 2, 3 and 4 with divisors greater than 20 with no remainders"));
            divisionRepeatSubtractionLessons.add(new Lesson("Division / Repeat Subtraction 4","Repeated subtraction by multiples of 1,2 and 3 with divisors less than 20 with remainders"));
            divisionRepeatSubtractionLessons.add(new Lesson("Division / Repeat Subtraction 5","Repeated subtraction by multiples of 10 with divisors less than 20 with remainders"));
            divisionRepeatSubtractionLessons.add(new Lesson("Division / Repeat Subtraction 6","Repeated subtraction with divisors greater than 20 with remainders as fractions"));
            divisionRepeatSubtractionLessons.add(new Lesson("Division / Repeat Subtraction 7","Repeated subtraction with divisors less than 35 with some remainders"));
            divisionRepeatSubtractionLessons.add(new Lesson("Division / Repeat Subtraction 8","Repeated subtraction with divisors less than 55 with dividends of 3 and 4-digits with some remainders"));
            divisionRepeatSubtractionLessons.add(new Lesson("Division / Repeat Subtraction 9","Repeated subtraction with divisors greater than 50 with dividends of thousands and some remainders"));
            divisionRepeatSubtractionLessons.add(new Lesson("Division / Repeat Subtraction 10","Using divide, multiply and subtraction in the bring down method"));
        modules.add(new Module("Division/repeat subtraction", divisionRepeatSubtractionLessons));

        // DECIMALS
            decimalsLessons = new ArrayList<Lesson>();
            decimalsLessons.add(new Lesson("Decimals 1", "Rounding decimals"));
            decimalsLessons.add(new Lesson("Decimals 2", "Decimals to three decimal places"));
            decimalsLessons.add(new Lesson("Decimals 3", "Adding decimals with a different number of decimal places"));
            decimalsLessons.add(new Lesson("Decimals 4", "Subtracting decimals with a different number of places"));
            decimalsLessons.add(new Lesson("Decimals 5", "Multiplying decimals by 10, 100 and 1000"));
            decimalsLessons.add(new Lesson("Decimals 6", "Multiplying decimals by whole numbers"));
            decimalsLessons.add(new Lesson("Decimals 7", "Dividing decimals by 10, 100 and 1000"));
            decimalsLessons.add(new Lesson("Decimals 8", "Dividing decimal fractions by whole numbers"));
            decimalsLessons.add(new Lesson("Decimals 9", "Dividing numbers by a decimal fraction"));
        modules.add(new Module("Decimals", decimalsLessons));

        // PERCENTAGES
            percentagesLessons = new ArrayList<Lesson>();
            percentagesLessons.add(new Lesson("Percentages 1","Changing fractions and decimals to percentages using tenths and hundredths"));
            percentagesLessons.add(new Lesson("Percentages 2","Changing percentages to fractions and decimals"));
            percentagesLessons.add(new Lesson("Percentages 3","One quantity as a percentage of another"));
            percentagesLessons.add(new Lesson("Percentages 4","Calculating Percentages and Fractions of Quantities"));
        modules.add(new Module("Percentages", percentagesLessons));

        // FRACTIONS
            fractionsLessons = new ArrayList<Lesson>();
            fractionsLessons.add(new Lesson("Fractions 1","Adding and subtracting fractions with the same denominator"));
            fractionsLessons.add(new Lesson("Fractions 2","Improper fractions"));
            fractionsLessons.add(new Lesson("Fractions 3","Comparing and ordering fractions greater than (>) 1"));
            fractionsLessons.add(new Lesson("Fractions 4","Adding and subtracting fractions with different denominators"));
            fractionsLessons.add(new Lesson("Fractions 5","Multiplying fractions by whole numbers"));
            fractionsLessons.add(new Lesson("Fractions 6","Fractions of whole numbers"));
            fractionsLessons.add(new Lesson("Fractions 7","Multiplying and dividing to obtain equivalent fractions"));
            fractionsLessons.add(new Lesson("Fractions 8","Reducing fractions to lowest equivalent form"));
            fractionsLessons.add(new Lesson("Fractions 9","Finding reciprocals of fractions and mixed numbers (mixed numerals)"));
            fractionsLessons.add(new Lesson("Fractions 10","Dividing fractions"));
            fractionsLessons.add(new Lesson("Fractions 11","Dividing mixed numbers (mixed numerals)"));
            fractionsLessons.add(new Lesson("Fractions 12","Multiplying fractions"));
            fractionsLessons.add(new Lesson("Fractions 13","Multiplying mixed numbers (mixed numerals)"));
        modules.add(new Module("Fractions", fractionsLessons));

        View root = inflater.inflate(R.layout.fragment_mathematics, container, false);

        txtView = root.findViewById(R.id.tv_title);
        imgView = root.findViewById(R.id.piechart);
        lv_mathModules = root.findViewById(R.id.lv_math_modules);

        adapter = new Adapter_Modules(modules, getContext());

        lv_mathModules.setAdapter(adapter);

        PieChart _piechart = (PieChart) root.findViewById(R.id.piechart);




        //this is for programmaticilly setting the margin of the viewholders, when moving down the screen.
//        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)_piechart.getLayoutParams();
//        for (int i = 0; i < pieList.getCount(); i++)
//        {
//            params.setMargins(i, 0, 0, 0); //substitute parameters for left, top, right, bottom
//            _piechart.setLayoutParams(params);
//        }

        //set Status- & Navigation bar colors
        @SuppressLint("ResourceType") String systemBar = getResources().getString(R.color.darkIconRed);
        ((MainActivity)getActivity()).updateStatusBarColor(systemBar);
        ((MainActivity)getActivity()).updateNavBarColor(systemBar);
        //Toolbar & Navigation drawer Header
        @SuppressLint("ResourceType") String toolBar = getResources().getString(R.color.iconRed);
        ((MainActivity)getActivity()).updateActionBarColor(toolBar);
        ((MainActivity)getActivity()).updateNavHeaderColor(toolBar);

        return root;
    }




    // this is for programmaticilly setting the margin of the viewholders, when moving down the screen.
    public static void setMargins (View _view, int _left, int _top, int _right, int _bottom) {
        if (_view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) _view.getLayoutParams();
            params.setMargins(_left, _top, _right, _bottom);
            _view.requestLayout();
        }
    }
}