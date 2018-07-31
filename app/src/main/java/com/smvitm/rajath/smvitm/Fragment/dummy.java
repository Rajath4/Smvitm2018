package com.smvitm.rajath.smvitm.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smvitm.rajath.smvitm.R;

import java.util.ArrayList;
import java.util.List;

import eu.long1.spacetablayout.SpaceTabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class dummy extends Fragment {
    SpaceTabLayout tabLayout;


    public dummy() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.dummy, container, false);

        FragmentManager fragManager = getActivity().getSupportFragmentManager(); //If using fragments from support v4


        //add the fragments you want to display in a List
       List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new TimeTableFragment());
        fragmentList.add(new TimeTableFragment());
        fragmentList.add(new TimeTableFragment());

        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.viewPager);
        tabLayout = (SpaceTabLayout) rootView.findViewById(R.id.spaceTabLayout);

        //we need the savedInstanceState to get the position
        tabLayout.initialize(viewPager,fragManager,fragmentList, savedInstanceState);

        return rootView;
    }
    //we need the outState to save the position
    @Override
    public void onSaveInstanceState(Bundle outState) {
        tabLayout.saveState(outState);
        super.onSaveInstanceState(outState);
    }

}
