package com.example.waves.ui.surfspots;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.waves.R;
import com.example.waves.databinding.FragmentDashboardBinding;
import com.example.waves.databinding.SurfSpotsFragmentBinding;
import com.example.waves.ui.dashboard.SurfSpotInfo;

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
    }

}