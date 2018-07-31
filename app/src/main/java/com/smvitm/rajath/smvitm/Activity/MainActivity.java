package com.smvitm.rajath.smvitm.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import com.smvitm.rajath.smvitm.Data.SmvitmEventsManegerMyData;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    String year;
    String branch;
    String section;
    static final ArrayList<SmvitmEventsManegerMyData> pname = new ArrayList<SmvitmEventsManegerMyData>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     /*  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();*/


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        Menu menu = navigationView.getMenu();


        for(int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            SpannableString spanString = new SpannableString(menu.getItem(i).getTitle().toString());
            spanString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF4081")), 0, spanString.length(), 0); //fix the color to white
            item.setTitle(spanString);
        }
        navigationView.setNavigationItemSelectedListener(this);
        SharedPreferences loginData = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = loginData.edit();


        year = loginData.getString("yeAr", "");
        branch = loginData.getString("branCh", "");
        section = loginData.getString("sectiOn", "");
        final Boolean z = loginData.getBoolean("Data", false);
        if (!z) {

            startActivity(new Intent(MainActivity.this,Login.class));



        }else {
           /* HomePageFragment homePageFragment = new HomePageFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.flContent, homePageFragment);
            fragmentTransaction.commit();*/


            dummy homePageFragment = new dummy();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.flContent, homePageFragment);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if(id== R.id.home){
            HomePageFragment homePageFragment = new HomePageFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.flContent, homePageFragment);
            fragmentTransaction.commit();
        }
        else if (id == R.id.study_materials){
            StudyMaterialsHomeFragment studyMaterialsHomeFragment = new StudyMaterialsHomeFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.flContent, studyMaterialsHomeFragment);
            fragmentTransaction.commit();
        }
        else if (id == R.id.facilities) {
            FacilitiesHomeFragment facilitiesHomeFragment = new FacilitiesHomeFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.flContent, facilitiesHomeFragment);
            fragmentTransaction.commit();
        }else if (id == R.id.about_smvitm) {
            AboutSmvitmHomeFragment aboutSmvitmHomeFragment = new AboutSmvitmHomeFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.flContent, aboutSmvitmHomeFragment);
            fragmentTransaction.commit();
        }else if(id == R.id.smvitmfaculty){
            DepartmentListFragment departmentListFragment = new DepartmentListFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.flContent, departmentListFragment);
            fragmentTransaction.commit();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }





}
