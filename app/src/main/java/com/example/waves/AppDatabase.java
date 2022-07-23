package com.example.waves;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.waves.ui.profile.Data.UserProfile;
import com.example.waves.ui.profile.Data.UserProfileDao;

@Database(entities = {UserProfile.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserProfileDao userProfileDao();
}