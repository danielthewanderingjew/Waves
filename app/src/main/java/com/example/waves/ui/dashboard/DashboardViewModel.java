package com.example.waves.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private MutableLiveData<List<SurfSpotInfo>> _surfSpotInfo;

    public DashboardViewModel() {
        List<SurfSpotInfo> defaultSurfSpotInfo = new ArrayList<SurfSpotInfo>();
        defaultSurfSpotInfo.add(new SurfSpotInfo(0,3, 3, 0, 4, 10, 8));
        defaultSurfSpotInfo.add(new SurfSpotInfo(3,3, 4, 3, 5, 10, 0));
        defaultSurfSpotInfo.add(new SurfSpotInfo(6,3, 4, 4, 5, 10, 6));
        defaultSurfSpotInfo.add(new SurfSpotInfo(9,3, 3, 3, 4, 9, 6));
        defaultSurfSpotInfo.add(new SurfSpotInfo(12,3, 3, 3, 3, 9, 8));
        defaultSurfSpotInfo.add(new SurfSpotInfo(15,2, 3, 2, 3, 9, 6));
        defaultSurfSpotInfo.add(new SurfSpotInfo(18,2, 3, 0, 2.5, 9, 12));
        defaultSurfSpotInfo.add(new SurfSpotInfo(21,2, 3, 0, 4, 9, 10));
        _surfSpotInfo = new MutableLiveData<>(defaultSurfSpotInfo);
        mText = new MutableLiveData<>();
        mText.setValue("Live Video");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public MutableLiveData<List<SurfSpotInfo>> getSurfSpotInfo() {
        return _surfSpotInfo;
    }
}