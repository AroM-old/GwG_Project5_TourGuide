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
*{@link AttractionsFragment} Show a list with various attractions
* with a thumbnail image, name, short description also save data
* with location, contact and website to be show when user touch
* the item list.
* */

public class AttractionsFragment extends Fragment {

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        //Create a list with information about attractions
        final ArrayList<Info> info = new ArrayList<>();
        info.add(new Info(R.drawable.faro_colon, "Columbus Lighthouse", "Construction began in 1986 using plans drawn by Scottish architect J.L. Gleave in 1931, in time for the 500th anniversary of the \"Discovery of America\" by Europeans, the monument was inaugurated in 1992. It was funded by the Latin American states and the total cost of construction was approximately US$70 million.", "Santo Domingo Este", "+1 809-591-4844", "None"));
        info.add(new Info(R.drawable.ic_home_black_24dp, "Colon", "Monumento a Colon", "Sto, Dgo", "809-599-6652", "www.idt.com"));
        info.add(new Info(R.drawable.ic_home_black_24dp, "Colon", "Monumento a Colon", "Sto, Dgo", "809-599-6652", "www.idt.com"));
        info.add(new Info(R.drawable.ic_home_black_24dp, "Colon", "Monumento a Colon", "Sto, Dgo", "809-599-6652", "www.idt.com"));
        info.add(new Info(R.drawable.ic_home_black_24dp, "Colon", "Monumento a Colon", "Sto, Dgo", "809-599-6652", "www.idt.com"));


        InfoAdapter adapter = new InfoAdapter(getActivity(), info);

        ListView listView = rootView.findViewById(R.id.info_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Info infoPosition = info.get(position);
                Intent intent = new Intent(getActivity().getBaseContext(), DescriptionActivity.class);
                intent.putExtra("NAME_KEY", infoPosition.getName());
                intent.putExtra("LOCATION_KEY", infoPosition.getLocation());
                getActivity().startActivity(intent);


            }
        });

        return rootView;
    }

}
