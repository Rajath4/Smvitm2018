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
public class AboutSmvitmHomeFragment extends Fragment {


    public AboutSmvitmHomeFragment() {
        // Required empty public constructor
    }



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.news_fragment:
                    AboutSmvitmFragment aboutSmvitmFragment = new AboutSmvitmFragment();
                    FragmentManager fragmentManagerlatestNewsFragment = getChildFragmentManager();
                    fragmentManagerlatestNewsFragment.beginTransaction().replace(R.id.espacioLineas, aboutSmvitmFragment).commit();
                    return true;
                case R.id.contact_us_fragment:
                    MapsFragment mapsFragment = new MapsFragment();
                    FragmentManager fragmentManagercontactSmvitmFragment = getChildFragmentManager();
                    fragmentManagercontactSmvitmFragment.beginTransaction().replace(R.id.espacioLineas, mapsFragment).commit();
                    return true;

            }
            return false;
        }

    };




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_about_smvitm_home, container, false);
        BottomNavigationView navegacion = (BottomNavigationView) rootView.findViewById(R.id.navbartransporte);
        navegacion.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        AboutSmvitmFragment aboutSmvitmFragment = new AboutSmvitmFragment();
        FragmentManager fragmentManagerlatestNewsFragment = getChildFragmentManager();
        fragmentManagerlatestNewsFragment.beginTransaction().replace(R.id.espacioLineas, aboutSmvitmFragment).commit();


        return rootView;
    }

}
