package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TempNavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_nav);

        Button btnSuper = findViewById(R.id.btnSuper);
        Button btnAirline = findViewById(R.id.btnAirline);
        Button btnHotel = findViewById(R.id.btnHotel);
        Button btnRegular = findViewById(R.id.btnRegular);

        btnSuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempNavActivity.this, SuperAdminActivity.class));
            }
        });

        btnAirline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempNavActivity.this, AirlineAdminActivity.class));
            }
        });

        btnHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempNavActivity.this, SuperAdminActivity.class));
            }
        });

        btnRegular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempNavActivity.this, LoginActivity.class));
            }
        });
    }
}