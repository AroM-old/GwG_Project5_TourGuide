/*
 * MIT License
 *
 * Copyright (c) 2018 Algenis Romero<algenisromero@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.example.android.gwg_project5_tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    // TODO Show location of the item on google maps.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        // TODO Add back navigation to fragment list of item.

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

        // TODO Add intents for place call, navigate to location and open website.
    }
}
