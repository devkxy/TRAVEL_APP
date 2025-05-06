package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.*;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Get the TextViews from the Layout
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);

        // Load the animation
        Animation slideIn = AnimationUtils.loadAnimation(this, R.anim.slide_in);

        // Apply the animation to the textview
        textView.startAnimation(slideIn);
        textView2.startAnimation(slideIn);
        textView3.startAnimation(slideIn);
        textView.postDelayed(()->{
            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            finish();
        }, 3000);
    }
}