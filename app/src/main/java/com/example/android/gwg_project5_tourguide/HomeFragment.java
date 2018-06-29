package com.example.android.gwg_project5_tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Set the tittle name in the actionbar
        getActivity().setTitle(getString(R.string.app_name));
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.home_activity, container, false);

    }

}
