package com.example.waves.ui.profile.Data;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserProfile {
    @PrimaryKey
    @NonNull
    private String username;
    private String email;
    private int surfingLevel; //0 = begginer, 1 = intermediate, 2 = advanced
    private String workOn;

    public UserProfile() {

    }

    public String getWorkOn() {
        return this.workOn;
    }

    public void setWorkOn(String workOn) {
        this.workOn = workOn;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSurfingLevel() {
        return this.surfingLevel;
    }

    public void setSurfingLevel(int surfingLevel) {
        this.surfingLevel = surfingLevel;
    }
}
