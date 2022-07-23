package com.example.waves;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class FullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        Bundle b = getIntent().getExtras();
        Image image = (Image) b.getSerializable("image");
        GoogleSignInAccount account = (GoogleSignInAccount) b.get("user");

        ImageView fullImage = findViewById(R.id.fullImage);
        Glide.with(this).load(image.URL).into(fullImage);

    }
}