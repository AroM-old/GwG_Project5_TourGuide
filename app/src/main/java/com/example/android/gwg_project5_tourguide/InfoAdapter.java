package com.example.android.gwg_project5_tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<Info> {

    public InfoAdapter(Activity context, ArrayList<Info> info){
        super(context,0, info);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View lisItemView = convertView;
        if (lisItemView == null);
        lisItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);

        Info currentInfo = getItem(position);

        ImageView iconImage = lisItemView.findViewById(R.id.places_imageview);
        iconImage.setImageResource(currentInfo.getResourceID());

        TextView nameTextView = lisItemView.findViewById(R.id.place_name_textview);
        nameTextView.setText(currentInfo.getName());

        TextView descriptionTextView = lisItemView.findViewById(R.id.place_location_textview);
        descriptionTextView.setText(currentInfo.getLocation());

        return lisItemView;
    }
}
