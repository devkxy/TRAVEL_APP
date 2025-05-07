package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BookingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookings);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.bookings);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.home) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                finish();
                return true;

            } else if (itemId == R.id.bookings) {
                return true;

            } else if (itemId == R.id.notifications) {
                startActivity(new Intent(getApplicationContext(), NotificationsActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                finish();
                return true;

            } else if (itemId == R.id.user) {
                startActivity(new Intent(getApplicationContext(), UsersActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                finish();
                return true;
            }

            return false;
        });
    }
}