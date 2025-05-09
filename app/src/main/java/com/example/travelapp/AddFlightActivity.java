package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddFlightActivity extends AppCompatActivity {

    EditText etCompany, etSched, etSeat, etOrigin, etDestination;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_flight);

        etCompany = findViewById(R.id.etCompany);
        etSched = findViewById(R.id.etSched);
        etSeat = findViewById(R.id.etSeat);
        etOrigin = findViewById(R.id.etOrigin);
        etDestination = findViewById(R.id.etDestination);
        btnAdd = findViewById(R.id.btnAdd);

        String company = etCompany.getText().toString().trim();
        String sched = etSched.getText().toString().trim();
        String seat = etSeat.getText().toString().trim();
        String origin = etOrigin.getText().toString().trim();
        String destination = etDestination.getText().toString().trim();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(company.isEmpty()){
                    etCompany.setError("Airline Company name is Required");
                    etCompany.requestFocus();
                    return;
                }
                if(sched.isEmpty()){
                    etSched.setError("Flight Schedule is Required");
                    etSched.requestFocus();
                    return;
                }
                if(seat.isEmpty()){
                    etSeat.setError("Seat Number is Required");
                    etSeat.requestFocus();
                    return;
                }
                if(origin.isEmpty()){
                    etOrigin.setError("Flight Origin is Required");
                    etOrigin.requestFocus();
                    return;
                }
                if(destination.isEmpty()){
                    etDestination.setError("Flight Destination is Required");
                    etDestination.requestFocus();
                    return;
                }
            }
        });


    }
}