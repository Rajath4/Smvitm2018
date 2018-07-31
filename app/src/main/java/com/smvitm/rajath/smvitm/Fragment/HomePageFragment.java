package com.smvitm.rajath.smvitm.Fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.smvitm.rajath.smvitm.R;
import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;
/**
 * A simple {@link Fragment} subclass.
 */
public class HomePageFragment extends Fragment {


    public HomePageFragment() {
        // Required empty public constructor
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                   /* case R.id.news_fragment:
                        LatestNewsFragment latestNewsFragment = new LatestNewsFragment();
                        FragmentManager fragmentManagerlatestNewsFragment = getChildFragmentManager();
                        fragmentManagerlatestNewsFragment.beginTransaction().replace(R.id.espacioLineas, latestNewsFragment).commit();
                        return true;*/
                    case R.id.contact_us_fragment:
                        TimeTableFragment mapsFragment = new TimeTableFragment();
                        FragmentManager fragmentManagermapsFragment = getChildFragmentManager();
                        fragmentManagermapsFragment.beginTransaction().replace(R.id.espacioLineas, mapsFragment).commit();
                        return true;
                    case R.id.maps_fragments:
                        CalenderHomeFragment calenderHomeFragment = new CalenderHomeFragment();
                        FragmentManager fragmentManagercontactSmvitmFragment = getChildFragmentManager();
                        fragmentManagercontactSmvitmFragment.beginTransaction().replace(R.id.espacioLineas, calenderHomeFragment).commit();
                        return true;
                }
                return false;
            }

        };




        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment

            View rootView = inflater.inflate(R.layout.fragment_home_page, container, false);
            BottomNavigationView navegacion = (BottomNavigationView) rootView.findViewById(R.id.navbartransporte);
            navegacion.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
            TimeTableFragment mapsFragment = new TimeTableFragment();
            FragmentManager fragmentManagermapsFragment = getChildFragmentManager();
            fragmentManagermapsFragment.beginTransaction().replace(R.id.espacioLineas, mapsFragment).commit();

                        /* LatestNewsFragment latestNewsFragment = new LatestNewsFragment();
            FragmentTransaction fragmentTransaction = HomePageFragment.this.getActivity().getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.espacioLineas, latestNewsFragment);
            fragmentTransaction.commit();*/

            return rootView;
        }

    }
