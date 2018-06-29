package com.example.android.gwg_project5_tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        // Find the views that show the {@link DescriptionActivity}
        ImageView descImage = findViewById(R.id.description_imageview);
        TextView nameTextView = findViewById(R.id.name_textview);
        TextView descriptionTextView = findViewById(R.id.description_textview);
        TextView locationTextview = findViewById(R.id.location_textview);
        TextView contactTextview = findViewById(R.id.contact_textview);
        TextView websiteTextview = findViewById(R.id.website_textview);


        // Get data from the intent
        Intent intent = getIntent();
        int image = intent.getIntExtra("ResID", 0);
        String name = intent.getStringExtra("NAME_KEY");
        String description = intent.getStringExtra("DESC_KEY");
        String location = intent.getStringExtra("LOCATION_KEY");
        String contact = intent.getStringExtra("CONTACT_KEY");
        String website = intent.getStringExtra("WEBSITE_KEY");



        // Set the views with new data to display
        descImage.setImageResource(image);
        nameTextView.setText(name);
        descriptionTextView.setText(description);
        locationTextview.setText(location);
        contactTextview.setText(contact);
        websiteTextview.setText(website);


    }
}
