package com.example.hackaton.ui.achievements;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AchievementsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AchievementsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Achievements");
    }

    public LiveData<String> getText() {
        return mText;
    }
}