package com.example.waves.ui.profile;

import android.graphics.Bitmap;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private final MutableLiveData<String> mText;

    private final MutableLiveData<Bitmap> mBitmap = new MutableLiveData();

    public ProfileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the profile fragment.");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public void setImage(Bitmap capturedImage) {
        mBitmap.postValue(capturedImage);
    }

    public LiveData<Bitmap> getBitmap() {
        return mBitmap;
    }
}