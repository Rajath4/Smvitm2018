package com.smvitm.rajath.smvitm;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;


import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;


public class HomeFragment extends Fragment {

    NavigationIconClickListener navigationIconClickListener;
    View rootView;
    Boolean menuIconEvent = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment with the ProductGrid theme
        rootView = inflater.inflate(R.layout.shr_product_grid_fragment, container, false);

        Button opt1= (Button)rootView.findViewById(R.id.backdrop_home);
        Button faculty = (Button)rootView.findViewById(R.id.backdrop_faculty);
        Button facility = (Button)rootView.findViewById(R.id.backdrop_facility);
        Button study_material = (Button)rootView.findViewById(R.id.backdrop_study_material);
        Button about_smvitm = (Button)rootView.findViewById(R.id.backdrop_about_smvitm);
        Button newsNotifiaction = (Button)rootView.findViewById(R.id.backdrop_news_and_notification);

        HomePageFragment homePageFragment = new HomePageFragment();
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.homePageFragment, homePageFragment);
        fragmentTransaction.commit();

        // Set up the tool bar
        setUpToolbar(rootView);

       navigationIconClickListener =  new NavigationIconClickListener(
               getContext(),
               rootView.findViewById(R.id.product_grid),
               new AccelerateDecelerateInterpolator(),
               getContext().getResources().getDrawable(R.drawable.ic_outline_menu_24px), // Menu open icon
               getContext().getResources().getDrawable(R.drawable.ic_close));



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            rootView.findViewById(R.id.product_grid).setBackground(getContext().getDrawable(R.drawable.aaa));
        }

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigationIconClickListener.close();
                mymenu.getItem(0).setIcon(ContextCompat.getDrawable(getContext(), R.drawable.ic_outline_menu_24px));
                menuIconEvent = !menuIconEvent;


                dummy homePageFragment = new dummy();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.homePageFragment, homePageFragment);
                fragmentTransaction.commit();

            }
        });

        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigationIconClickListener.close();
                mymenu.getItem(0).setIcon(ContextCompat.getDrawable(getContext(), R.drawable.ic_outline_menu_24px));
                menuIconEvent = !menuIconEvent;

                DepartmentListFragment departmentListFragment = new DepartmentListFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.homePageFragment, departmentListFragment);
                fragmentTransaction.commit();

            }
        });

        facility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigationIconClickListener.close();
                mymenu.getItem(0).setIcon(ContextCompat.getDrawable(getContext(), R.drawable.ic_outline_menu_24px));
                menuIconEvent = !menuIconEvent;

                FacilitiesHomeFragment facilitiesHomeFragment = new FacilitiesHomeFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.homePageFragment, facilitiesHomeFragment);
                fragmentTransaction.commit();
            }
        });

        study_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigationIconClickListener.close();
                mymenu.getItem(0).setIcon(ContextCompat.getDrawable(getContext(), R.drawable.ic_outline_menu_24px));
                menuIconEvent = !menuIconEvent;

                StudyMaterialsHomeFragment studyMaterialsHomeFragment = new StudyMaterialsHomeFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.homePageFragment, studyMaterialsHomeFragment);
                fragmentTransaction.commit();
            }
        });

        about_smvitm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigationIconClickListener.close();
                mymenu.getItem(0).setIcon(ContextCompat.getDrawable(getContext(), R.drawable.ic_outline_menu_24px));
                menuIconEvent = !menuIconEvent;

                AboutSmvitmHomeFragment aboutSmvitmHomeFragment = new AboutSmvitmHomeFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.homePageFragment, aboutSmvitmHomeFragment);
                fragmentTransaction.commit();
            }
        });

        newsNotifiaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigationIconClickListener.close();
                mymenu.getItem(0).setIcon(ContextCompat.getDrawable(getContext(), R.drawable.ic_outline_menu_24px));
                menuIconEvent = !menuIconEvent;

                NewsHomeFragment newsHomeFragment = new NewsHomeFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.homePageFragment, newsHomeFragment);
                fragmentTransaction.commit();
            }
        });


        return rootView;

    }

    private void setUpToolbar(View view) {
        Toolbar toolbar = view.findViewById(R.id.app_bar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        if (activity != null) {
            activity.setSupportActionBar(toolbar);
        }

       /* toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View mview) {
                navigationIconClickListener.open();

            }
        });*/

        // Menu close icon


    }

    public Menu mymenu;


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.shr_toolbar_menu, menu);
        this.mymenu = menu;

        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.main_menu) {
            navigationIconClickListener.open();
            if(!menuIconEvent) {
                mymenu.getItem(0).setIcon(ContextCompat.getDrawable(getContext(), R.drawable.ic_close));
                menuIconEvent = true;
            }else {
                mymenu.getItem(0).setIcon(ContextCompat.getDrawable(getContext(), R.drawable.ic_outline_menu_24px));
                menuIconEvent = false;
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
