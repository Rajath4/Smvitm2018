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
public class StudyMaterialsHomeFragment extends Fragment {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.news_fragment:
                    SyllabusFragment syllabusFragment = new SyllabusFragment();
                    FragmentManager fragmentManagerlatestNewsFragment = getChildFragmentManager();
                    fragmentManagerlatestNewsFragment.beginTransaction().replace(R.id.espacioLineas, syllabusFragment).commit();
                    return true;
                case R.id.contact_us_fragment:
                    OldQuestionPaperFragment oldQuestionPaperFragment = new OldQuestionPaperFragment();
                    FragmentManager fragmentManagercontactSmvitmFragment = getChildFragmentManager();
                    fragmentManagercontactSmvitmFragment.beginTransaction().replace(R.id.espacioLineas, oldQuestionPaperFragment).commit();
                    return true;

            }
            return false;
        }

    };




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_study_materials_home, container, false);
        BottomNavigationView navegacion = (BottomNavigationView) rootView.findViewById(R.id.navbartransporte);
        navegacion.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        SyllabusFragment syllabusFragment = new SyllabusFragment();
        FragmentManager fragmentManagerlatestNewsFragment = getChildFragmentManager();
        fragmentManagerlatestNewsFragment.beginTransaction().replace(R.id.espacioLineas, syllabusFragment).commit();


        return rootView;
    }

}
