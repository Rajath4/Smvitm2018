package com.smvitm.rajath.smvitm.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.MyCafeteriaBean;
import com.smvitm.rajath.smvitm.R;
import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;
/**
 * A simple {@link Fragment} subclass.
 */
public class CollegeBusFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cafeteria, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<MyCafeteriaBean> pname = new ArrayList<MyCafeteriaBean>();
        try {
            InputStream is;
            String obj;
            is = CollegeBusFragment.this.getActivity().getAssets().open("smvitm_college_bus.json");
            obj = "collegebustimings";


            int size = is.available();
            byte[] byteArra = new byte[size];
            is.read(byteArra);
            is.close();
            String buffer = new String(byteArra, "UTF-8");
            JSONObject jsnfil = new JSONObject(buffer);

            JSONArray array = jsnfil.getJSONArray(obj);
            for (int i = 0; i < array.length(); i++) {
                JSONObject object = array.getJSONObject(i);
                String valueName = object.optString("name");
                String valueId = object.optString("id");
                String valueCost = object.optString("rate");

                MyCafeteriaBean bean = new MyCafeteriaBean();
                bean.setName(valueName);
                bean.setId(valueId);
                bean.setPhno(valueCost);

                pname.add(bean);

            }
        } catch (Exception e) {

        }

        final CafeteriaRecycleViewAdapter itemsAdapter = new CafeteriaRecycleViewAdapter(CollegeBusFragment.this.getActivity(), pname, null);
        final RecyclerView clv = (RecyclerView) view.findViewById(R.id.clist);
        clv.setLayoutManager(new LinearLayoutManager(CollegeBusFragment.this.getActivity()));
        //clv.setLayoutManager(new VegaLayoutManager());
        clv.setHasFixedSize(true);
        clv.setAdapter(itemsAdapter);

    }
}
