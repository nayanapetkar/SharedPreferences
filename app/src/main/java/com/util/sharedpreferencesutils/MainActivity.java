package com.util.sharedpreferencesutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.util.sharedpreferences.SharedPreferencesUtils;

public class MainActivity extends AppCompatActivity {

    private SharedPreferencesUtils sharedPreferencesUtils;
    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){

        sharedPreferencesUtils = new SharedPreferencesUtils(this);
        sharedPreferencesUtils.setObjectAsBoolean("isLoggedIn",true);
        boolean isLoggedIn = sharedPreferencesUtils.getObjectAsBoolean("isLoggedIn");
        Log.d(TAG, "init(): isLoggedIn=" + isLoggedIn);
        sharedPreferencesUtils.removeSharedPref();
    }
}