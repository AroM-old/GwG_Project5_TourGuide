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


/**
 * {@link AttractionsFragment} Display a list with various attractions
 * with a thumbnail image, name, short description also save data
 * with location, contact and website to be show when user touch
 * the item list.
 */

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);
        //Add fragment title to the toolbar
        getActivity().setTitle(getString(R.string.attractions));

        //Create a list with information about attractions
        final ArrayList<Info> info = new ArrayList<>();
        info.add(new Info(R.drawable.faro_colon, getString(R.string.columbus_lighthouse), getString(R.string.columbus_desc), getString(R.string.columbus_location), getString(R.string.columbus_contact), getString(R.string.none_website)));
        info.add(new Info(R.drawable.acuario_nacional, getString(R.string.national_aquarium), getString(R.string.aquarium_desc), getString(R.string.aquarium_location), getString(R.string.aquarium_contact), getString(R.string.none_website)));
        info.add(new Info(R.drawable.alcazar_colon, getString(R.string.columbus_house), getString(R.string.columbus_house_desc), getString(R.string.columbus_house_location), getString(R.string.columbus_house_contact), getString(R.string.none_website)));
        info.add(new Info(R.drawable.basilica_higuey, getString(R.string.basilica_higuey), getString(R.string.basilica_desc), getString(R.string.basilica_location), getString(R.string.basilica_contact), getString(R.string.basilica_website)));
        info.add(new Info(R.drawable.bitanical_garden, getString(R.string.botanical_garden), getString(R.string.botanical_desc), getString(R.string.botanical_location), getString(R.string.botanical_contact), getString(R.string.botanical_website)));
        info.add(new Info(R.drawable.dunas_bani, getString(R.string.dunas_bani), getString(R.string.dunas_desc), getString(R.string.dunas_location), getString(R.string.dunas_contact), getString(R.string.none_website)));
        info.add(new Info(R.drawable.monumento_santiago, getString(R.string.monumento_santiago), getString(R.string.monumento_description), getString(R.string.monumento_location), getString(R.string.monumento_contact), getString(R.string.monumento_website)));
        info.add(new Info(R.drawable.puerta_conde, getString(R.string.puerta_conde), getString(R.string.puerta_description), getString(R.string.puerta_location), getString(R.string.none_website), getString(R.string.none_website)));
        info.add(new Info(R.drawable.teleferico, getString(R.string.cable_car), getString(R.string.cable_description), getString(R.string.cable_location), getString(R.string.cable_contact), getString(R.string.cable_website)));

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
