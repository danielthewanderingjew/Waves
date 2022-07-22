package com.example.waves.ui.profile.Data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserProfileDao {
    @Query("SELECT * FROM userprofile WHERE username=:name")
    UserProfile getUser(String name);

    @Insert
    void insertAll(UserProfile... userProfiles);

    @Insert
    void insert(UserProfile userProfile);

    @Delete
    void delete(UserProfile userProfile);
}
