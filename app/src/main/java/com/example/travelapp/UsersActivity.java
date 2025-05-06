package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class UsersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.users);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            item.setIcon(R.drawable.group_filledf_24px);

            if (itemId == R.id.home) {
                startActivity(new Intent(getApplicationContext(), SuperAdminActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                item.setIcon(R.drawable.home_filled_24px);
                finish();
                return true;

            } else if (itemId == R.id.users) {
                item.setIcon(R.drawable.group_filledf_24px);
                return true;

            } else if (itemId == R.id.packages) {
                startActivity(new Intent(getApplicationContext(), UsersActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                finish();
                return true;

            } else if (itemId == R.id.settings) {
                startActivity(new Intent(getApplicationContext(), UsersActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                finish();
                return true;
            }

            return false;
        });
    }
}