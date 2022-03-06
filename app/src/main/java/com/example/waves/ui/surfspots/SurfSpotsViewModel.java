package com.example.waves.ui.surfspots;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SurfSpotsViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private final MutableLiveData<String> mText;

    public SurfSpotsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the surf spots fragment.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}