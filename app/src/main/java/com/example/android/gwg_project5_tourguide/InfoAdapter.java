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

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * {@link InfoAdapter} is a {@link android.support.v4.app.FragmentPagerAdapter} that
 * can provide the layout for each list item based on the data source which is
 * a list of {@link Info} objects.
 */
public class InfoAdapter extends ArrayAdapter<Info> {

    /**
     * Create a new {@link InfoAdapter} object
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param info    is the list of {@link Info}s to be displayed.
     */
    public InfoAdapter(Context context, ArrayList<Info> info) {
        super(context, 0, info);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View lisItemView = convertView;
        if (lisItemView == null) ;
        lisItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);

        // Get the {@link Word} object located at this position in the list
        Info currentInfo = getItem(position);

        // Find the ImageView in the list_item_layout.xml layout with the ID places_imageview.
        ImageView iconImage = lisItemView.findViewById(R.id.places_imageview);
        //Get the image drawable from the currentInfo object and set this to
        // the default ImageView
        iconImage.setImageResource(currentInfo.getResourceID());

        // Find the TextView in the list_item_activity.xml layout with the ID place_name_textview.
        TextView nameTextView = lisItemView.findViewById(R.id.place_name_textview);
        // Get the default text from the currentInfo object and set this text on
        // the default TextView.
        nameTextView.setText(currentInfo.getName());

        // Find the TextView in the list_item_activity.xml layout with the ID place_location_textview.
        TextView descriptionTextView = lisItemView.findViewById(R.id.place_location_textview);
        // Get the default text from the currentInfo object and set this text on
        // the default TextView.
        descriptionTextView.setText(currentInfo.getLocation());

        // Return the whole list item layout so that it can be shown in
        // the ListView.
        return lisItemView;
    }
}
