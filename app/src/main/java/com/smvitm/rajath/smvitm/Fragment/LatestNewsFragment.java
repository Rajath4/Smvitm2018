package com.smvitm.rajath.smvitm.Fragment;


import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smvitm.rajath.smvitm.Adapter.NewRecycleViewAdapter;
import com.smvitm.rajath.smvitm.R;
import com.smvitm.rajath.smvitm.Data.SmvitmEventsManegerMyData;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;




import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;
/**
 * A simple {@link Fragment} subclass.
 */
public class LatestNewsFragment extends Fragment {
    private String TAG = "HIII";
    private ProgressDialog pDialog;

    final ArrayList<SmvitmEventsManegerMyData> pname = new ArrayList<SmvitmEventsManegerMyData>();



    public LatestNewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_latest_news, container, false);

        final ArrayList<SmvitmEventsManegerMyData> pname = new ArrayList<>();
         AsyncTask<Integer,Void,Void> task = new AsyncTask<Integer, Void, Void>() {
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                // Showing progress dialog
                pDialog = new ProgressDialog(getActivity());
                pDialog.setMessage("Please wait...");
                pDialog.setCancelable(true);
                pDialog.show();


            }
            @Override
            protected Void doInBackground(Integer... integers) {

                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("http://vtu-help.tk/GetSmvitmEvent.php?id=0")
                        .build();

                try {
                    Response response = client.newCall(request).execute();

                    JSONArray array = new JSONArray(response.body().string());



                    for (int i=0; i<array.length(); i++){

                        JSONObject object = array.getJSONObject(i);

                        SmvitmEventsManegerMyData data = new SmvitmEventsManegerMyData(object.getInt("id"),
                                object.getString("title"),
                                object.getString("description"),
                                object.getString("image")


                        );

                        pname.add(data);
                    }



                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    System.out.println("End of content");
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                if (pDialog.isShowing())
                    pDialog.dismiss();
                final NewRecycleViewAdapter itemsAdapter = new NewRecycleViewAdapter(LatestNewsFragment.this.getActivity(), pname, null);
                final RecyclerView clv = (RecyclerView) rootView.findViewById(R.id.elist);
               clv.setLayoutManager(new LinearLayoutManager(LatestNewsFragment.this.getActivity()));
               // clv.setLayoutManager(new VegaLayoutManager());
                clv.setHasFixedSize(true);
                clv.setAdapter(itemsAdapter);


            }
        };

        task.execute();

        return rootView;
    }




}
