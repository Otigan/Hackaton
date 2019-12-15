package com.example.hackaton.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hackaton.R;
import com.example.hackaton.ui.statistic.StatisticFragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import org.xmlpull.v1.XmlPullParser;
public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    Button button;
    ImageButton buttonInc;
    ImageButton buttonDec;
    TextView Day;
    TextView Month;
    EditText quantit;
    int day;
    int month;
    int quantity;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        String dateText = dateFormat.format(currentDate);

        String dd = dateText.substring(0, 2);
        final String mm = dateText.substring(3, 5);


        button = root.findViewById(R.id.enter_button);
        buttonDec = root.findViewById(R.id.dayCh_button1);
        buttonInc = root.findViewById(R.id.dayCh_button2);

        Day = root.findViewById(R.id.day);
        Month = root.findViewById(R.id.month);
        quantit = root.findViewById(R.id.edit_message);

        Day.setText(dd);
        Month.setText(mm);
        if((Integer.parseInt(Day.getText().toString()) - 1) <= 1 ){
            buttonDec.setClickable(false);
        }else{
            buttonDec.setClickable(true);

        }
        if((Integer.parseInt(Day.getText().toString()) + 1) > 31){
            buttonInc.setClickable(false);
        }else{
            buttonInc.setClickable(true);

        }
        buttonDec.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Integer.parseInt(Day.getText().toString()) + 1) < 31){
                    buttonInc.setClickable(true);
                }
                if((Integer.parseInt(Day.getText().toString()) - 1) < 1 ){
                    buttonDec.setClickable(false);
                }else{
                    buttonDec.setClickable(true);
                    Day.setText(Integer.toString(Integer.parseInt(Day.getText().toString()) - 1));
                }
            }
        });

        buttonInc.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            if((Integer.parseInt(Day.getText().toString()) + 1) > 1){
                buttonDec.setClickable(true);
            }
            if((Integer.parseInt(Day.getText().toString()) + 1) > 31){
                buttonInc.setClickable(false);
            }else{
                buttonInc.setClickable(true);
                Day.setText(Integer.toString(Integer.parseInt(Day.getText().toString()) + 1));
            }
        }
        });

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                day = Integer.parseInt(Day.getText().toString());
                month = Integer.parseInt(Month.getText().toString());
                quantity = Integer.parseInt(quantit.getText().toString());
                StatisticFragment.stat[month-1][day-1] = quantity;
            }
        });
        return root;
    }
}