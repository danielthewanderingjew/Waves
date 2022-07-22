package com.example.waves.ui.surfspots;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.waves.databinding.SurfSpotsFragmentBinding;

import java.util.List;

public class SurfSpotsFragment extends Fragment {

    private SurfSpotsViewModel mViewModel;
    private SurfSpotsFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(SurfSpotsViewModel.class);
        binding = SurfSpotsFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<SurfLocationInfo> defaultSurfLocationInfo = mViewModel.getLocationInfo().getValue();
        for (int i = 0; i < defaultSurfLocationInfo.size(); i++) {
            SurfLocationInfo surfLocationInfo = defaultSurfLocationInfo.get(i);
            String locationInfo = "";
            locationInfo += "Tide: " + Integer.toString(surfLocationInfo.getTide()) + "N\n";
            locationInfo += "Wind: " + Integer.toString(surfLocationInfo.getWindSpeed()) + "MPH\n";
            locationInfo += "Water Temperature: " + Integer.toString(surfLocationInfo.getWaterTemperature()) + "ºC\n";
            locationInfo += "Surf Height: " + Integer.toString(surfLocationInfo.getSurfHeight()) + "Feet";
            String reccomendation = "";
            if (surfLocationInfo.getSurfHeight() < 2 && surfLocationInfo.getWindSpeed() >= 10 && surfLocationInfo.getTide() >= 3) {
                reccomendation = "Go Surfing";
            } else {
                reccomendation = "Don't go surfing.";
            }
            if (i == 0) {
                binding.reportOnePlaceTime.setText(surfLocationInfo.getLocation());
                binding.reportOneStats.setText(locationInfo);
                binding.reportOneRecommendation.setText(reccomendation);
            } else if (i == 1) {
                binding.reportTwoPlaceTime.setText(surfLocationInfo.getLocation());
                binding.reportTwoStats.setText(locationInfo);
                binding.reportTwoRecommendation.setText(reccomendation);
            } else if (i == 2) {
                binding.reportThreePlaceTime.setText(surfLocationInfo.getLocation());
                binding.reportThreeStats.setText(locationInfo);
                binding.reportThreeRecommendation.setText(reccomendation);
            }
        }
    }

}