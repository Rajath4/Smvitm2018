package com.smvitm.rajath.smvitm.Activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.smvitm.rajath.smvitm.R;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;

public class EventDetailInfomationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail_infomations);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        Intent getData = getIntent();
        String title = getData.getStringExtra("title");
        String Description = getData.getStringExtra("description");
        TextView titleTextView = (TextView)findViewById(R.id.title);
        TextView descriptionTextView = (TextView)findViewById(R.id.description);
        ImageView imageOfEvent = (ImageView)findViewById(R.id.imageDispl);
        String urlOfEventPic = getData.getStringExtra("url");
        Picasso.get().load(urlOfEventPic).into(imageOfEvent);



        setTitle("Latest News");
        titleTextView.setText(title);
        descriptionTextView.setText(Description);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==android.R.id.home)
            super.onBackPressed();

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
