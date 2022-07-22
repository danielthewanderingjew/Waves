package com.example.waves.ui.home;

import android.app.Application;
import android.graphics.Bitmap;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class HomeViewModelFactory implements ViewModelProvider.Factory {
    private Bitmap bitmap;

    public HomeViewModelFactory(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override
    public<T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new HomeViewModel(bitmap);
    }
}
