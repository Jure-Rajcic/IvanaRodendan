package com.example.myapplication.utilities;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {
    // shared preferences -> is tool that we use when uer closes app, that its data doesn't get lost
    private final SharedPreferences sharedPreferences;

    public PreferenceManager(Context context) {
        // Storing data into SharedPreferences
        sharedPreferences = context.getSharedPreferences(Constants.KEY_PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    public void putBoolean(String key, Boolean value) {
        // Creating an Editor object to edit(write to the file)
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public Boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        // Storing the key and its value as the data fetched from edittext
        editor.putString(key, value);
        // Once the changes have been made,
        // we need to commit to apply those changes made,
        // otherwise, it will throw an error
        editor.apply();
    }

    public String getString(String key){
        return sharedPreferences.getString(key, null);
    }

    public void clear(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
