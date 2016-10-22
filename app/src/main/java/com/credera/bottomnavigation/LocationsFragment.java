package com.credera.bottomnavigation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LocationsFragment extends Fragment {

    public static final String TAG = LocationsFragment.class.getSimpleName();

    public LocationsFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new LocationsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_locations, container, false);
    }

}
