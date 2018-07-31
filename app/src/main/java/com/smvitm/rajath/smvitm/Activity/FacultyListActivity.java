package com.smvitm.rajath.smvitm.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.smvitm.rajath.smvitm.Adapter.FacultyProfileInformationRecyclerViewAdapter;
import com.smvitm.rajath.smvitm.Data.MyImageBean;
import com.smvitm.rajath.smvitm.R;
import com.stone.vega.library.VegaLayoutManager;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;

public class FacultyListActivity extends AppCompatActivity {
    static String Branch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Branch = intent.getStringExtra("branch");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);


        }




        setContentView(R.layout.activity_faculty_list);


        ArrayList<MyImageBean> pname = new ArrayList<MyImageBean>();
        try {
            InputStream is;
            String filename;

            if (Branch.equalsIgnoreCase("CSE")) {
                is = FacultyListActivity.this.getAssets().open("smvitm_faculty.json");
                filename = "deptofcse";
                setTitle("Department of Computer Science Engineering");

            }else if(Branch.equalsIgnoreCase("EC"))
            {
                is = FacultyListActivity.this.getAssets().open("ec_faculty.json");
                filename = "deptofec";
                setTitle("Department of Electronics & Communication Engineering");
            }
            else if(Branch.equalsIgnoreCase("CV"))
            {
                is = FacultyListActivity.this.getAssets().open("cv_faculty.json");
                filename = "deptofcv";
                setTitle("Department of Civil Engineering");
            }
            else if(Branch.equalsIgnoreCase("ME"))
            {
                is = FacultyListActivity.this.getAssets().open("me_faculty.json");
                filename = "deptofme";
                setTitle("Department of Mechanical Engineering");
            }
            else if(Branch.equalsIgnoreCase("CHEMISTRY"))
            {
                is = FacultyListActivity.this.getAssets().open("chemistry_faculty.json");
                filename = "deptofchemistry";
                setTitle("Department of Chemistry");
            }
            else if(Branch.equalsIgnoreCase("MATHEMATICS"))
            {
                is = FacultyListActivity.this.getAssets().open("ma_faculty.json");
                filename = "deptofma";
                setTitle("Department of Mathematics");
            }
            else if(Branch.equalsIgnoreCase("PHYSICS"))
            {
                is = FacultyListActivity.this.getAssets().open("phy_faculty.json");
                filename = "deptofphy";
                setTitle("Department of Physics");
            }
            else
            {
                is = FacultyListActivity.this.getAssets().open("ec_faculty.json");
                filename = "deptofcse";
            }

            int size = is.available();
            byte[] byteArra = new byte[size];
            is.read(byteArra);
            is.close();
            String buffer = new String(byteArra,"UTF-8");

            JSONObject jsnfil  = new JSONObject(buffer);

            JSONArray array = jsnfil.getJSONArray(filename);
            for (int i =0;i<array.length();i++){
                JSONObject object = array.getJSONObject(i);

                String SvalueName = object.optString("name");
                String SDesignation = object.optString("Designation");
                String SEducationalQualification = object.optString("EducationalQualification");
                String SAreaOfSpecialization = object.optString("AreaofSpecialization");
                String SExperience = object.optString("Experience");
                String SMemberships = object.optString("Memberships");
                String SAward = object.optString("Awards");
                String SAreaOfInterest = object.optString("AreaOfInterest");
                String SPublications = object.optString("Publications");
                String SNoOfPhd = object.optString("NoofPGPhDThesesguided");
                String SContactDetail = object.optString("ContactDetails");


                MyImageBean bean1 =new MyImageBean();
                bean1.setItemName(SvalueName);
                bean1.setDesignation(SDesignation);
                bean1.setAreaOfInterest(SAreaOfInterest);
                bean1.setAreaofSpecialization(SAreaOfSpecialization);
                bean1.setExperience(SExperience);
                bean1.setMemberships(SMemberships);
                bean1.setAwards(SAward);
                bean1.setEducationalQualification(SEducationalQualification);
                bean1.setPublications(SPublications);
                bean1.setNoofPGPhDThesesguided(SNoOfPhd);
                bean1.setContactDetails(SContactDetail);

                pname.add(bean1);

            }
        }
        catch (Exception e){

        }


        final FacultyProfileInformationRecyclerViewAdapter itemsAdapter = new FacultyProfileInformationRecyclerViewAdapter(this, pname, null);
        final RecyclerView clv = (RecyclerView)findViewById(R.id.clist);


        //  gridLayoutManager = new GridLayoutManager(getActivity(),3);
        //  clv.setLayoutManager(gridLayoutManager);
        clv.setLayoutManager(new VegaLayoutManager());

        //clv.setLayoutManager(new LinearLayoutManager(getActivity()));
        clv.setHasFixedSize(true);
        clv.setAdapter(itemsAdapter);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
