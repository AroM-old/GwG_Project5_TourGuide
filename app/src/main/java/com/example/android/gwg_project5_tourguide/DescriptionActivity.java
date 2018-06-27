package com.example.android.gwg_project5_tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        TextView nameTextView = findViewById(R.id.description_textview);
        TextView locationTextView = findViewById(R.id.location_textview);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME_KEY");
        String location = intent.getStringExtra("LOCATION_KEY");

        nameTextView.setText(name);
        locationTextView.setText(location);

    }
}
