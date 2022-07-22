package com.example.waves.ui.home;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.waves.R;
import com.example.waves.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment{

    private HomeViewModel mViewModel;
    private final Uri imageUri2 = Uri.EMPTY;
    private final ActivityResultLauncher<Uri> mTakePicture = registerForActivityResult(new ActivityResultContracts.TakePicture(), new ActivityResultCallback<Boolean>() {
                @Override
                public void onActivityResult(Boolean result) {
                    if (result) {
                        Log.e("Wave", "Generated Uri: " + imageUri2);
                        Bitmap bitmap;
                        try {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                                bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(requireContext().getContentResolver(), imageUri2));
                            } else {
                                bitmap = MediaStore.Images.Media.getBitmap(requireContext().getContentResolver(), imageUri2);
                            }
                            binding.surferImage1.setImageBitmap(bitmap);
                        } catch (Exception e) {
                            Log.e("Wave", "A Error Occurred." + e.getLocalizedMessage());
                            e.printStackTrace();
                        }
                    }
                }
            }
    );
    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        mViewModel = new ViewModelProvider(this, new HomeViewModelFactory(BitmapFactory.decodeResource(getContext().getResources(), R.drawable.surfboard_silhouette_vector))).get(HomeViewModel.class);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.imageView.setImageDrawable(getResources().getDrawable(mViewModel.getHomeData().getValue().getFirstImage()));
        binding.imageView2.setImageDrawable(getResources().getDrawable(mViewModel.getHomeData().getValue().getSecondImage()));
        binding.surferImage1.setImageBitmap(mViewModel.getHomeData().getValue().getThirdImage());
        binding.changePicture.setOnClickListener(view1 -> dispatchTakePictureIntent());
        mViewModel.getHomeData().observe(getViewLifecycleOwner(), new Observer<HomeData>() {
            @Override
            public void onChanged(HomeData homeData) {
                binding.surferImage1.setImageBitmap(homeData.getThirdImage());
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        try {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        } catch (ActivityNotFoundException e) {
            // display error state to the user
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            mViewModel.getHomeData().getValue().setThirdimage(imageBitmap);
            mViewModel.setHomeData(mViewModel.getHomeData().getValue());
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}