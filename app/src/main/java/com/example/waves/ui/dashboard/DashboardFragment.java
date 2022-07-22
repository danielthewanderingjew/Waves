package com.example.waves.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.waves.databinding.FragmentDashboardBinding;

import java.util.List;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
        new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), binding.textDashboard::setText);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindRows();
    }

    private void bindRows() {
        List<SurfSpotInfo> defaultSurfSpotInfo = dashboardViewModel.getSurfSpotInfo().getValue();
        for(int i = 0; i < defaultSurfSpotInfo.size(); i++) {
            SurfSpotInfo surfspotInfo = defaultSurfSpotInfo.get(i);
            String time;
            if(surfspotInfo.getTime() <= 12) {
                time = Integer.toString(surfspotInfo.getTime()) + "am";
            }
            else {
                time = Integer.toString(surfspotInfo.getTime()-12) + "pm";
            }
            if(i == 0) {
                binding.firstRowTime.setText(time);
                if(surfspotInfo.getStartSurfDepth() == surfspotInfo.getEndSurfDepth()) {
                    binding.firstRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "ft");
                }
                else {
                    binding.firstRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "-" + Integer.toString(surfspotInfo.getEndSurfDepth()) + "ft");
                }
                for(int k = 0; k< surfspotInfo.getSwellRating(); k++) {
                    binding.firstRowSwellRating.setText(binding.firstRowSwellRating.getText()+"v");
                }
               binding.firstRowSwellDepth.setText(Double.toString(surfspotInfo.getSwellLength()) + "ft " + Integer.toString(surfspotInfo.getSwellTime()) + "s");
               binding.firstRowWindSpeed.setText(Integer.toString(surfspotInfo.getWindSpeed()) + "mph");
            }
            else if(i == 1) {
                binding.SecondRowTime.setText(time);
                if(surfspotInfo.getStartSurfDepth() == surfspotInfo.getEndSurfDepth()) {
                    binding.SecondRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "ft");
                } else {
                    binding.SecondRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "-" + Integer.toString(surfspotInfo.getEndSurfDepth()) + "ft");
                }
                for (int k = 0; k < surfspotInfo.getSwellRating(); k++) {
                    binding.SecondSwellRating.setText(binding.SecondSwellRating.getText() + "v");
                }
                binding.SecondRowSwellDepth.setText(Double.toString(surfspotInfo.getSwellLength()) + "ft " + Integer.toString(surfspotInfo.getSwellTime()) + "s");
                binding.SecondRowWind.setText(Integer.toString(surfspotInfo.getWindSpeed()) + "mph");
            } else if (i == 2) {
                binding.ThirdRowTime.setText(time);
                if (surfspotInfo.getStartSurfDepth() == surfspotInfo.getEndSurfDepth()) {
                    binding.ThirdRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "ft");
                } else {
                    binding.ThirdRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "-" + Integer.toString(surfspotInfo.getEndSurfDepth()) + "ft");
                }
                for (int k = 0; k < surfspotInfo.getSwellRating(); k++) {
                    binding.ThirdRowSwellRating.setText(binding.ThirdRowSwellRating.getText() + "v");
                }
                binding.ThirdRowSwellDepth.setText(Double.toString(surfspotInfo.getSwellLength()) + "ft " + Integer.toString(surfspotInfo.getSwellTime()) + "s");
                binding.ThirdRowWind.setText(Integer.toString(surfspotInfo.getWindSpeed()) + "mph");
            } else if (i == 3) {
                binding.FourthRowTime.setText(time);
                if (surfspotInfo.getStartSurfDepth() == surfspotInfo.getEndSurfDepth()) {
                    binding.FourthRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "ft");
                } else {
                    binding.FourthRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "-" + Integer.toString(surfspotInfo.getEndSurfDepth()) + "ft");
                }
                for (int k = 0; k < surfspotInfo.getSwellRating(); k++) {
                    binding.FourthRowSwellRating.setText(binding.FourthRowSwellRating.getText() + "v");
                }
                binding.FourthRowSwellDepth.setText(Double.toString(surfspotInfo.getSwellLength()) + "ft " + Integer.toString(surfspotInfo.getSwellTime()) + "s");
                binding.FourthRowWind.setText(Integer.toString(surfspotInfo.getWindSpeed()) + "mph");
            } else if (i == 4) {
                binding.FifthRowTime.setText(time);
                if (surfspotInfo.getStartSurfDepth() == surfspotInfo.getEndSurfDepth()) {
                    binding.FifthRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "ft");
                } else {
                    binding.FifthRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "-" + Integer.toString(surfspotInfo.getEndSurfDepth()) + "ft");
                }
                for (int k = 0; k < surfspotInfo.getSwellRating(); k++) {
                    binding.FifthRowSwellRating.setText(binding.FifthRowSwellRating.getText() + "v");
                }
                binding.FifthRowSwellDepth.setText(Double.toString(surfspotInfo.getSwellLength()) + "ft " + Integer.toString(surfspotInfo.getSwellTime()) + "s");
                binding.FifthRowWind.setText(Integer.toString(surfspotInfo.getWindSpeed()) + "mph");
            } else if (i == 5) {
                binding.SixthRowTime.setText(time);
                if (surfspotInfo.getStartSurfDepth() == surfspotInfo.getEndSurfDepth()) {
                    binding.SixthRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "ft");
                } else {
                    binding.SixthRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "-" + Integer.toString(surfspotInfo.getEndSurfDepth()) + "ft");
                }
                for (int k = 0; k < surfspotInfo.getSwellRating(); k++) {
                    binding.SixthRowSwellRating.setText(binding.SixthRowSwellRating.getText() + "v");
                }
                binding.SixthRowSwellDepth.setText(Double.toString(surfspotInfo.getSwellLength()) + "ft " + Integer.toString(surfspotInfo.getSwellTime()) + "s");
                binding.SixthRowWind.setText(Integer.toString(surfspotInfo.getWindSpeed()) + "mph");
            } else if (i == 6) {
                binding.SeventhRowTime.setText(time);
                if (surfspotInfo.getStartSurfDepth() == surfspotInfo.getEndSurfDepth()) {
                    binding.SeventhRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "ft");
                } else {
                    binding.SeventhRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "-" + Integer.toString(surfspotInfo.getEndSurfDepth()) + "ft");
                }
                for (int k = 0; k < surfspotInfo.getSwellRating(); k++) {
                    binding.SeventhRowSwellRating.setText(binding.SeventhRowSwellRating.getText() + "v");
                }
                binding.SeventhRowSwellDepth.setText(Double.toString(surfspotInfo.getSwellLength()) + "ft " + Integer.toString(surfspotInfo.getSwellTime()) + "s");
                binding.SeventhRowWind.setText(Integer.toString(surfspotInfo.getWindSpeed()) + "mph");
            } else if (i == 7) {
                binding.EighthRowTime.setText(time);
                if (surfspotInfo.getStartSurfDepth() == surfspotInfo.getEndSurfDepth()) {
                    binding.EighthRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "ft");
                } else {
                    binding.EighthRowSurfDepth.setText(Integer.toString(surfspotInfo.getStartSurfDepth()) + "-" + Integer.toString(surfspotInfo.getEndSurfDepth()) + "ft");
                }
                for (int k = 0; k < surfspotInfo.getSwellRating(); k++) {
                    binding.EighthRowSwellRating.setText(binding.EighthRowSwellRating.getText() + "v");
                }
                binding.EighthRowSwellDepth.setText(Double.toString(surfspotInfo.getSwellLength()) + "ft " + Integer.toString(surfspotInfo.getSwellTime()) + "s");
                binding.EighthRowWind.setText(Integer.toString(surfspotInfo.getWindSpeed()) + "mph");
            }
        }
    }
    @Override
       public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}