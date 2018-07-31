package com.smvitm.rajath.smvitm.Fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.smvitm.rajath.smvitm.R;
import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;

import java.util.ArrayList;
import java.util.List;

import eu.long1.spacetablayout.SpaceTabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class FacilitiesHomeFragment extends Fragment {

    SpaceTabLayout tabLayout;

    public FacilitiesHomeFragment() {
        // Required empty public constructor
    }



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                    case R.id.cafeteria_fragment:
                        CafeteriaFragment cafeteriaFragment = new CafeteriaFragment();
                        FragmentManager fragmentManagerlatestNewsFragment = getChildFragmentManager();
                        fragmentManagerlatestNewsFragment.beginTransaction().replace(R.id.espacioLineas, cafeteriaFragment).commit();
                        return true;
                case R.id.college_bus_fragment:
                    CollegeBusFragment collegeBusFragment = new CollegeBusFragment();
                    FragmentManager fragmentManagermapsFragment = getChildFragmentManager();
                    fragmentManagermapsFragment.beginTransaction().replace(R.id.espacioLineas, collegeBusFragment).commit();
                    return true;
                case R.id.librery_fragments:
                    LibraryFragment libraryFragment = new LibraryFragment();
                    FragmentManager fragmentManagercontactSmvitmFragment = getChildFragmentManager();
                    fragmentManagercontactSmvitmFragment.beginTransaction().replace(R.id.espacioLineas, libraryFragment).commit();
                    return true;
            }
            return false;
        }

    };




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_facilities_home, container, false);
        BottomNavigationView navegacion = (BottomNavigationView) rootView.findViewById(R.id.navbartransporte);
        navegacion.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        CafeteriaFragment cafeteriaFragment = new CafeteriaFragment();
        FragmentManager fragmentManagerlatestNewsFragment = getChildFragmentManager();
        fragmentManagerlatestNewsFragment.beginTransaction().replace(R.id.espacioLineas, cafeteriaFragment).commit();

        return rootView;
    }

}

