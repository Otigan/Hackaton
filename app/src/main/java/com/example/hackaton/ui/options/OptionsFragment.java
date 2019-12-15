package com.example.hackaton.ui.options;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.hackaton.R;
import android.widget.Button;

public class OptionsFragment extends Fragment {

    private OptionsViewModel optionsViewModel;
    String[] data = {"Parlament", "Marlboro", "Winston", "Bond", "Captain Black"};
    public static int type = 1;
    public static int quantity = 10;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        optionsViewModel =
                ViewModelProviders.of(this).get(OptionsViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_options, container, false);
        final TextView textView = root.findViewById(R.id.text_options);
        optionsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = root.findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        spinner.setPrompt("Title");
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case (1):
                        type = 1;
                        break;
                    case (2):
                        type = 2;
                        break;
                    case (3):
                        type = 3;
                        break;
                    case (4):
                        type = 4;
                        break;
                    case (5):
                        type = 5;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        Button button = root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit = root.findViewById(R.id.etWidth1);
                quantity = Integer.parseInt(edit.getText().toString());
            }
        });
        return root;
    }
}