package com.example.waves.ui.home;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.waves.R;

public class HomeViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    //private final MutableLiveData<String> mText;

    private MutableLiveData<HomeData> homeData = new MutableLiveData<>();

    public LiveData<HomeData> getHomeData() {
        return homeData;
    }

    public void setHomeData(HomeData homeData) {
        this.homeData.postValue(homeData);
    }
}