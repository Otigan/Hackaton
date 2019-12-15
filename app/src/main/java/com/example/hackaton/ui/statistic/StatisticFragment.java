package com.example.hackaton.ui.statistic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hackaton.R;
import com.example.hackaton.ui.options.OptionsFragment;

public class StatisticFragment extends Fragment {
    public static int Sum = 0;
    private StatisticViewModel statisticViewModel;
    public static int stat[][] = new int[12][31];

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        statisticViewModel =
                ViewModelProviders.of(this).get(StatisticViewModel.class);
        View root = inflater.inflate(R.layout.fragment_statistic, container, false);
        int Jan = 0;
        for(int i = 0; i < 31; i++)
        {
            Jan = Jan + stat[0][i];
        }
        Jan = (OptionsFragment.quantity * 31 - Jan) * OptionsFragment.type;
        TextView Ja = root.findViewById(R.id.textView3);
        Ja.setText(Integer.toString(Jan));
        int Feb = 0;
        for(int i = 0; i < 28; i++)
        {
            Feb = Feb + stat[1][i];
        }
        Feb = (OptionsFragment.quantity * 28 - Feb) * OptionsFragment.type;
        TextView Fe = root.findViewById(R.id.textView5);
        Fe.setText(Integer.toString(Feb));
        int Mrh = 0;
        for(int i = 0; i < 31; i++)
        {
            Mrh = Mrh + stat[2][i];
        }
        Mrh = (OptionsFragment.quantity * 31 - Mrh) * OptionsFragment.type;
        TextView Ma = root.findViewById(R.id.textView7);
        Ma.setText(Integer.toString(Mrh));
        int Apr = 0;
        for(int i = 0; i < 30; i++)
        {
            Apr = Apr + stat[3][i];
        }
        Apr = (OptionsFragment.quantity * 30 - Apr) * OptionsFragment.type;
        TextView Ap = root.findViewById(R.id.textView12);
        Ap.setText(Integer.toString(Apr));
        int may = 0;
        for(int i = 0; i < 31; i++)
        {
            may = may + stat[4][i];
        }
        may = (OptionsFragment.quantity * 31 - may) * OptionsFragment.type;
        TextView M = root.findViewById(R.id.textView9);
        M.setText(Integer.toString(may));
        int Jun = 0;
        for(int i = 0; i < 30; i++)
        {
            Jun = Jun + stat[5][i];
        }
        Jun = (OptionsFragment.quantity * 30 - Jun) * OptionsFragment.type;
        TextView Ju = root.findViewById(R.id.textView13);
        Ju.setText(Integer.toString(Jun));
        int Jul = 0;
        for(int i = 0; i < 31; i++)
        {
            Jul = Jul + stat[6][i];
        }
        Jul = (OptionsFragment.quantity * 31 - Jul) * OptionsFragment.type;
        TextView J = root.findViewById(R.id.textView20);
        J.setText(Integer.toString(Jul));
        int Aug = 0;
        for(int i = 0; i < 31; i++)
        {
            Aug = Aug + stat[7][i];
        }
        Aug = (OptionsFragment.quantity * 31 - Aug) * OptionsFragment.type;
        TextView Au = root.findViewById(R.id.textView21);
        Au.setText(Integer.toString(Aug));
        int Sep = 0;
        for(int i = 0; i < 30; i++)
        {
            Sep = Sep + stat[8][i];
        }
        Sep = (OptionsFragment.quantity * 30 - Sep) * OptionsFragment.type;
        TextView Se = root.findViewById(R.id.textView25);
        Se.setText(Integer.toString(Sep));
        int Oct = 0;
        for(int i = 0; i < 31; i++)
        {
            Oct = Oct + stat[9][i];
        }
        Oct = (OptionsFragment.quantity * 31 - Oct) * OptionsFragment.type;
        TextView Oc = root.findViewById(R.id.textView16);
        Oc.setText(Integer.toString(Oct));
        int Nov = 0;
        for(int i = 0; i < 30; i++)
        {
            Nov = Nov + stat[10][i];
        }
        Nov = (OptionsFragment.quantity * 30 - Nov) * OptionsFragment.type;
        TextView No = root.findViewById(R.id.textView14);
        No.setText(Integer.toString(Nov));
        int Dec = 0;
        for(int i = 0; i < 31; i++)
        {
            Dec = Dec + stat[11][i];
        }
        Dec = (OptionsFragment.quantity * 31 - Dec) * OptionsFragment.type;
        TextView De = root.findViewById(R.id.textView15);
        De.setText(Integer.toString(Dec));
        Sum = Jan + Feb + Mrh + Apr + may + Jun + Jul + Aug + Sep + Oct + Nov + Dec;
        TextView S = root.findViewById(R.id.textView27);
        S.setText(Integer.toString(Sum));
        return root;
    }
}