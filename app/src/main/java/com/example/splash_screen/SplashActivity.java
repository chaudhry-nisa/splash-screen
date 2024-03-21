package com.example.splash_screen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity{
    private static final long SPLASH_DISPLAY_LENGTH = 3000;
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
      setContentView(R.layout.activit_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent=new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        },SPLASH_DISPLAY_LENGTH);
    }


}