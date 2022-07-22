package com.example.waves.ui.surfspots;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class SurfSpotsViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private MutableLiveData<List<SurfLocationInfo>> locationInfo;
    private final MutableLiveData<String> mText = new MutableLiveData<>();

    public SurfSpotsViewModel() {
        List<SurfLocationInfo> defaultListOfData = new ArrayList<>();
        defaultListOfData.add(new SurfLocationInfo("Santa Cruz", 5, 15, 25, 5));
        defaultListOfData.add(new SurfLocationInfo("T-Street", -1, 1, 30, 3));
        defaultListOfData.add(new SurfLocationInfo("Salt Creek", -1, 10, 35, 1));
        locationInfo = new MutableLiveData<>(defaultListOfData);
    }

    public LiveData<List<SurfLocationInfo>> getLocationInfo() {
        return locationInfo;
    }

    public LiveData<String> getText() {
        return mText;
    }
}