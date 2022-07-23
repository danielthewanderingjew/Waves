package com.example.waves.ui.profile;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Room;

import com.example.waves.AppDatabase;
import com.example.waves.ui.profile.Data.UserProfile;

public class ProfileViewModel extends AndroidViewModel {
    AppDatabase mainDatabase;
    private final MutableLiveData<UserProfile> userProfile;

    public ProfileViewModel(@NonNull Application application) {
        super(application);
        mainDatabase = Room.inMemoryDatabaseBuilder(application.getApplicationContext(), AppDatabase.class).build();
        userProfile = new MutableLiveData<>();
    }

    public com.example.waves.ui.profile.Data.UserProfile getUserProfileDAO() {
        return (UserProfile) mainDatabase.userProfileDao();
    }

    public LiveData<UserProfile> getUserProfile() {
        return userProfile;
    }

    public void handleNewUser(String username, String email, int level, int skill) {
        getUserProfileDAO().insert(new UserProfile());
    }
}