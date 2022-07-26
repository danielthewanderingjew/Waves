package com.example.waves.ui.home;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.waves.R;

public class ImageViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;

    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);

        image = (itemView).findViewById(R.id.imageView);
    }
}
