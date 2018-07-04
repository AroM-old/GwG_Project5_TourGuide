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
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.info_list, container, false);
        //Add fragment title to the toolbar
        getActivity().setTitle(getString(R.string.hotels));

        //Create a list with information about hotels
        final ArrayList<Info> info = new ArrayList<>();
        info.add(new Info(R.drawable.sheraton_santo, getString(R.string.sheraton_name), getString(R.string.sheraton_descr), getString(R.string.sheraton_location), getString(R.string.sheraton_contact), getString(R.string.sheraton_website)));
        info.add(new Info(R.drawable.dummy_640x400_hannover, getString(R.string.placeholder_name), getString(R.string.placehoder_desc), getString(R.string.placeholder_location), getString(R.string.placeholder_contact), getString(R.string.placeholder_website)));
        info.add(new Info(R.drawable.dummy_640x400_hannover, getString(R.string.placeholder_name), getString(R.string.placehoder_desc), getString(R.string.placeholder_location), getString(R.string.placeholder_contact), getString(R.string.placeholder_website)));
        info.add(new Info(R.drawable.dummy_640x400_hannover, getString(R.string.placeholder_name), getString(R.string.placehoder_desc), getString(R.string.placeholder_location), getString(R.string.placeholder_contact), getString(R.string.placeholder_website)));
        info.add(new Info(R.drawable.dummy_640x400_hannover, getString(R.string.placeholder_name), getString(R.string.placehoder_desc), getString(R.string.placeholder_location), getString(R.string.placeholder_contact), getString(R.string.placeholder_website)));
        info.add(new Info(R.drawable.dummy_640x400_hannover, getString(R.string.placeholder_name), getString(R.string.placehoder_desc), getString(R.string.placeholder_location), getString(R.string.placeholder_contact), getString(R.string.placeholder_website)));
        info.add(new Info(R.drawable.dummy_640x400_hannover, getString(R.string.placeholder_name), getString(R.string.placehoder_desc), getString(R.string.placeholder_location), getString(R.string.placeholder_contact), getString(R.string.placeholder_website)));
        info.add(new Info(R.drawable.dummy_640x400_hannover, getString(R.string.placeholder_name), getString(R.string.placehoder_desc), getString(R.string.placeholder_location), getString(R.string.placeholder_contact), getString(R.string.placeholder_website)));
        info.add(new Info(R.drawable.dummy_640x400_hannover, getString(R.string.placeholder_name), getString(R.string.placehoder_desc), getString(R.string.placeholder_location), getString(R.string.placeholder_contact), getString(R.string.placeholder_website)));
        info.add(new Info(R.drawable.dummy_640x400_hannover, getString(R.string.placeholder_name), getString(R.string.placehoder_desc), getString(R.string.placeholder_location), getString(R.string.placeholder_contact), getString(R.string.placeholder_website)));


        //Create an {@link InfoAdapter}, whose data source is a list of {@link Info}s.
        //The adapter create list items for each item in the list;
        InfoAdapter adapter = new InfoAdapter(getActivity(), info);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // info_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.info_list);

        // Make the {@link ListView} use the {@link InfoAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Info} in the list.
        listView.setAdapter(adapter);


        // Set a click listener to show a open activity_description.xml when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the item position on the list
                Info infoPosition = info.get(position);

                // Generate a new intent to open the {@link DescriptionActivity}
                Intent intent = new Intent(getActivity().getBaseContext(), DescriptionActivity.class);

                // Add information to share with the {@link DescriptionActivity}
                intent.putExtra("ResID", infoPosition.getResourceID());
                intent.putExtra("NAME_KEY", infoPosition.getName());
                intent.putExtra("DESC_KEY", infoPosition.getDescription());
                intent.putExtra("LOCATION_KEY", infoPosition.getLocation());
                intent.putExtra("CONTACT_KEY", infoPosition.getContact());
                intent.putExtra("WEBSITE_KEY", infoPosition.getWebsite());


                //Start the new activity
                getActivity().startActivity(intent);
            }
        });

        // Return a list of items
        return rootView;
    }

}
