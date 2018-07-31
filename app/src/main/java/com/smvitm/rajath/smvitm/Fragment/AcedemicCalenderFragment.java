package com.smvitm.rajath.smvitm.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smvitm.rajath.smvitm.Adapter.CalenderRecyclerViewAdapter;
import com.smvitm.rajath.smvitm.Data.MyCalenderBean;
import com.smvitm.rajath.smvitm.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;
/**
 * A simple {@link Fragment} subclass.
 */
public class AcedemicCalenderFragment extends Fragment {


    public AcedemicCalenderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_acedemic_calender, container, false);
        ArrayList<MyCalenderBean> pname = new ArrayList<MyCalenderBean>();
        try {

            InputStream is;
            String obj;

            is = getActivity().getAssets().open("smvitm_calender.json");
            obj = "smvitmcalender";

            int size = is.available();
            byte[] byteArra = new byte[size];
            is.read(byteArra);
            is.close();
            String buffer = new String(byteArra,"UTF-8");

            JSONObject jsnfil  = new JSONObject(buffer);

            JSONArray array = jsnfil.getJSONArray(obj);
            for (int i =0;i<array.length();i++){
                JSONObject object = array.getJSONObject(i);
                String id = object.optString("id");
                String month = object.optString("month");
                String date = object.optString("date");
                String day = object.optString("day");
                String info = object.optString("info");


                MyCalenderBean bean1 =new MyCalenderBean();

                bean1.setId(id);
                bean1.setMonth(month);
                bean1.setDate(date);
                bean1.setDay(day);
                bean1.setInfo(info);

                pname.add(bean1);

            }
        }
        catch (Exception e){

        }
        final CalenderRecyclerViewAdapter itemsAdapter = new CalenderRecyclerViewAdapter(AcedemicCalenderFragment.this.getActivity(), pname, null);
        final RecyclerView clv = (RecyclerView)rootView.findViewById(R.id.clist);
       clv.setLayoutManager(new LinearLayoutManager(getActivity()));
       // clv.setLayoutManager(new VegaLayoutManager());
        clv.setHasFixedSize(true);
        clv.setAdapter(itemsAdapter);
        return rootView;
    }

}
