package com.example.waves.ui.home;

import android.graphics.Bitmap;

import androidx.annotation.DrawableRes;

public class HomeData {
    @DrawableRes private int image1;
    @DrawableRes private int image2;
    private Bitmap image3;

    public HomeData(@DrawableRes int image1, @DrawableRes int image2, Bitmap image3) {
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }

    public int getFirstImage() {
        return image1;
    }
    public int getSecondImage() {
        return image2;
    }
    public Bitmap getThirdImage(){
        return image3;
    }

    public void setFirstimage(@DrawableRes int image) {
        this.image1 = image;
    }
    public void setSecondImage(@DrawableRes int image) {
        this.image2 = image;
    }
    public void setThirdimage(Bitmap image) {
        this.image3 = image;
    }
}
