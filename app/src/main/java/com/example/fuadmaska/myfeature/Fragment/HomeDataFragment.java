package com.example.fuadmaska.myfeature.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fuadmaska.myfeature.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeDataFragment extends Fragment {


    public HomeDataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_data, container, false);
    }

}
