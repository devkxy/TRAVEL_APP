package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.packages);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.home) {
                startActivity(new Intent(getApplicationContext(), AirlineAdminActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                finish();
                return true;

            } else if (itemId == R.id.packages) {
                startActivity(new Intent(getApplicationContext(), BookingsActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                finish();
                return true;

            } else if (itemId == R.id.notifications) {
                startActivity(new Intent(getApplicationContext(), NotificationsActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                finish();
                return true;

            } else if (itemId == R.id.profile) {
                return true;
            }

            return false;
        });

    }
}