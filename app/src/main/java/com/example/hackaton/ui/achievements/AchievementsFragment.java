package com.example.hackaton.ui.achievements;

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
import com.example.hackaton.ui.statistic.StatisticFragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class AchievementsFragment extends Fragment {
    ProgressBar prg;
    ProgressBar prg2;
    ProgressBar prg3;
    private AchievementsViewModel achievementsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        achievementsViewModel =
                ViewModelProviders.of(this).get(AchievementsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_achievements, container, false);
        prg = root.findViewById(R.id.progressBar12);
        prg.setMax(10);
        prg.setProgress(StatisticFragment.Sum);

        prg2 = root.findViewById(R.id.progressBar13);
        prg2.setMax(100);
        prg2.setProgress(StatisticFragment.Sum);

        prg3 = root.findViewById(R.id.progressBar14);
        prg3.setMax(1000);
        prg3.setProgress(StatisticFragment.Sum);
        return root;
    }
}
