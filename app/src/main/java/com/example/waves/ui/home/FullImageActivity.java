package com.example.waves.ui.home;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.waves.R;
import com.example.waves.SecurityHelper;
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
        Glide.with(this).load(SecurityHelper.Decrypt(image.URL)).into(fullImage);

    }
}