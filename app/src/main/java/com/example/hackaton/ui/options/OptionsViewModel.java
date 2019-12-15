package com.example.hackaton.ui.options;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hackaton.R;

public class OptionsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OptionsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Options");
    }
    public LiveData<String> getText() {
        return mText;
    }
}