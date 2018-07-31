package com.smvitm.rajath.smvitm.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Activity.FacultyListActivity;
import com.smvitm.rajath.smvitm.R;
import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class DepartmentListFragment extends Fragment {


    CardView deptOfCivil,deptOfCS,deptOfMech,deptOfECE,deptOfPhy,deptOfChe,deptOfMath;

    public DepartmentListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dapartment_list, container, false);

       getActivity().setTitle("");





        final Intent pass = new Intent(getActivity(),FacultyListActivity.class);

        deptOfCivil = (CardView) rootView.findViewById(R.id.card_civil);
        deptOfCivil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass.putExtra("branch","CV");
                startActivity(pass);
            }
        });

        deptOfCS = (CardView)rootView.findViewById(R.id.card_cse);
        deptOfCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass.putExtra("branch","CSE");
                startActivity(pass);
            }
        });


        deptOfECE = (CardView) rootView.findViewById(R.id.card_ece);
        deptOfECE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass.putExtra("branch","EC");
                startActivity(pass);
            }
        });

        deptOfMech = (CardView) rootView.findViewById(R.id.card_mech);
        deptOfMech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass.putExtra("branch","ME");
                startActivity(pass);
            }
        });

        deptOfPhy = (CardView)rootView.findViewById(R.id.card_physics);
        deptOfPhy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass.putExtra("branch","PHYSICS");
                startActivity(pass);
            }
        });

        deptOfChe = (CardView)rootView.findViewById(R.id.card_chemistry);
        deptOfChe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass.putExtra("branch","CHEMISTRY");
                startActivity(pass);
            }
        });

        deptOfMath = (CardView)rootView.findViewById(R.id.card_math);
        deptOfMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass.putExtra("branch","MATHEMATICS");
                startActivity(pass);
            }
        });

        return rootView;
    }

}
