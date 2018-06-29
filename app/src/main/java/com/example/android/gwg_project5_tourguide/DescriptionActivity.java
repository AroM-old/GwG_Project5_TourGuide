package com.example.android.gwg_project5_tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        // Find the views that show the {@link DescriptionActivity}
        TextView nameTextView = findViewById(R.id.description_textview);
        TextView locationTextView = findViewById(R.id.location_textview);
        ImageView descImage = findViewById(R.id.description_imageview);

        // Get data from the intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME_KEY");
        String location = intent.getStringExtra("LOCATION_KEY");
        int image = intent.getIntExtra("ResID", 0);

        // Set the views with new data to display
        nameTextView.setText(name);
        locationTextView.setText(location);
        descImage.setImageResource(image);

    }
}
