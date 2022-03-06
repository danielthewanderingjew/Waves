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

public class SurfSpotsFragment extends Fragment {

    private SurfSpotsViewModel mViewModel;

    public static SurfSpotsFragment newInstance() {
        return new SurfSpotsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.surf_spots_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SurfSpotsViewModel.class);
        // TODO: Use the ViewModel
    }

}