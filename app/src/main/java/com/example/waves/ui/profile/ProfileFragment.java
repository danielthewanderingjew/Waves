package com.example.waves.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.waves.databinding.ProfileFragmentBinding;

public class ProfileFragment extends Fragment {


    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    private ProfileViewModel profileViewModel;
    private ProfileFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = ProfileFragmentBinding.inflate(inflater, container, false);
        profileViewModel = new ViewModelProvider(this).get(ProfileViewModel.class);
        binding.saveProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = binding.surferUsername.getText().toString();
                String email = binding.surferEmail.getText().toString();
                int surferLevel = binding.surferLevel.getSelectedItemPosition();
                int selectedSkill = binding.skills.getSelectedItemPosition();
                if (username != null && email != null && !username.isEmpty()) {
                    profileViewModel.handleNewUser(username, email, surferLevel, selectedSkill);
                } else {
                    //handle if user tried to save without providing username
                }

            }
        });
        return binding.getRoot();
    }
}