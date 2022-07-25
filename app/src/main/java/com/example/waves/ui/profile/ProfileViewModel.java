package com.example.waves.ui.profile;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Room;

import com.example.waves.AppDatabase;
import com.example.waves.ui.profile.Data.UserProfile;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileViewModel extends AndroidViewModel {
    AppDatabase mainDatabase;
    FirebaseAuth firebaseAuth;
    GoogleSignInAccount account;
    private final MutableLiveData<UserProfile> userProfile;

    public ProfileViewModel(@NonNull Application application) {
        super(application);
        firebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser user = firebaseAuth.getCurrentUser();
        mainDatabase = Room.inMemoryDatabaseBuilder(application.getApplicationContext(), AppDatabase.class).allowMainThreadQueries().build();
        userProfile = new MutableLiveData<>();
    }

    public LiveData<UserProfile> getUserProfile() {
        return userProfile;
    }

    public void handleNewUser(String username, String email, int level, int skill) {
        mainDatabase.userProfileDao().insert(new UserProfile());
    }
}