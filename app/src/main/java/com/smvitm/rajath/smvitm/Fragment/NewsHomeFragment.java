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
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.smvitm.rajath.smvitm.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsHomeFragment extends Fragment {

    WebView webView;

    public NewsHomeFragment() {
        // Required empty public constructor
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.vtu_notification_menu:
                       return true;
                case R.id.vtu_news_menu:
                   return true;
                case R.id.vtu_results:
                  return true;
            }
            return false;
        }

    };



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_news_home, container, false);
        BottomNavigationView navegacion = (BottomNavigationView) rootView.findViewById(R.id.navbartransporte);
        navegacion.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        webView = (WebView) rootView.findViewById(R.id.webview);
        webView.loadUrl("google.com");

        // Enable Javascript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return rootView;
    }

}
