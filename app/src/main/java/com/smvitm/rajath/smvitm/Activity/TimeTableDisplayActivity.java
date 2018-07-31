package com.smvitm.rajath.smvitm.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.smvitm.rajath.smvitm.R;
import com.smvitm.rajath.smvitm.Data.TimeTableDisplay;

import java.util.Calendar;

import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;

public class TimeTableDisplayActivity extends AppCompatActivity {

    Button Day,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8;
    Button pb1,pb2,pb3,pb4,pb5,pb6,pb7,pb8,prevDay,nextDay;
    String year;
    String branch;
    String section;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_time_table_dislayout);


        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        SharedPreferences loginData = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = loginData.edit();


        year = loginData.getString("yeAr", "");
        branch = loginData.getString("branCh", "");
        section = loginData.getString("sectiOn", "");
        final Boolean z = loginData.getBoolean("Data", false);
        if (!z) {

            startActivity(new Intent(TimeTableDisplayActivity.this,Login.class));



        }else {
            pb1 = (Button)findViewById(R.id.p1);
            pb2 = (Button)findViewById(R.id.p2);
            pb3 = (Button)findViewById(R.id.p3);
            pb4 = (Button)findViewById(R.id.p4);
            pb5 = (Button)findViewById(R.id.p5);
            pb6 = (Button)findViewById(R.id.p6);
            pb7 = (Button)findViewById(R.id.p7);
            pb8 = (Button)findViewById(R.id.p8);
            prevDay = (Button)findViewById(R.id.previousday);
            nextDay = (Button)findViewById(R.id.nextday);


            Day = (Button)findViewById(R.id.day);
            sub1 = (Button)findViewById(R.id.sub1);
            sub2 = (Button)findViewById(R.id.sub2);
            sub3 = (Button)findViewById(R.id.sub3);
            sub4 = (Button)findViewById(R.id.sub4);
            sub5 = (Button)findViewById(R.id.sub5);
            sub6 = (Button)findViewById(R.id.sub6);
            sub7 = (Button)findViewById(R.id.sub7);
            sub8 = (Button)findViewById(R.id.sub8);







            String weekDay = "";

            Calendar c = Calendar.getInstance();
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            int time = c.get(Calendar.HOUR_OF_DAY);


            if (Calendar.MONDAY == dayOfWeek) {
                weekDay = "Monday";
            } else if (Calendar.TUESDAY == dayOfWeek) {
                weekDay = "Tuesday";
            } else if (Calendar.WEDNESDAY == dayOfWeek) {
                weekDay = "Wednesday";
            } else if (Calendar.THURSDAY == dayOfWeek) {
                weekDay = "Thursday";
            } else if (Calendar.FRIDAY == dayOfWeek) {
                weekDay = "Friday";
            } else if (Calendar.SATURDAY == dayOfWeek) {
                weekDay = "Saturday";
            } else if (Calendar.SUNDAY == dayOfWeek) {
                weekDay = "Sunday";
            }


            switch (weekDay) {
                case "Monday":
                    if (time<16) {
                        showtimetable("Monday");

                    }else {
                        showtimetable("Tuesday");
                    }
                    break;
                case "Tuesday":if (time<16) {
                    showtimetable("Tuesday");

                }else {
                    showtimetable("Wednesday");
                }
                    break;
                case "Wednesday":if (time<16) {

                    showtimetable("Wednesday");
                }else {
                    showtimetable("Thursday");
                }
                    break;
                case "Thursday":
                    if (time<16) {
                        showtimetable("Thursday");
                    }else {
                        showtimetable("Friday");
                    }
                    break;
                case "Friday":
                    if (time<16) {
                        showtimetable("Friday");
                    }else {
                        showtimetable("Saturday");
                    }
                    break;
                case "Saturday":
                    if (time<14) {
                        showtimetable("Saturday");
                    }else {
                        showtimetable("Monday");
                    }
                    break;
                case "Sunday":
                    showtimetable("Monday");
                    break;
            }


        }
    }






    void showtimetable(final String day){
/*
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.scale);
*/
        final Animation animScale2 = AnimationUtils.loadAnimation(this, R.anim.scale_day);
        final Animation right = AnimationUtils.loadAnimation(this, R.anim.translate);




        Day.setText(day);
        Day.setPaintFlags(Day.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        setTitle("Time Table");
        Day.startAnimation(animScale2);
        pb1.setText("09:00 - 09:55");
        pb2.setText("09:55 - 10:50");
        pb3.setText("11:10 - 12:05");
        pb4.setText("12:05 - 01:00");
        pb5.setText("01:00 - 01:55");
        pb6.setText("01:55 - 02:50");
        pb7.setText("03:00 - 03:55");
        pb8.setText("03:55 - 04:50");
        sub1.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p1"));
        sub2.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p2"));
        sub3.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p3"));
        sub4.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p4"));
        sub5.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p5"));
        sub6.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p6"));
        sub7.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p7"));
        sub8.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p8"));
/*
        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isub1.putExtra("key",sub1.getText());
                v.startAnimation(right);
                startActivity(isub1);

            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isub2.putExtra("key",sub2.getText());
                v.startAnimation(right);
                startActivity(isub2);
            }
        });
        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isub3.putExtra("key",sub3.getText());
                v.startAnimation(right);
                startActivity(isub3);
            }
        });
        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = (String) sub4.getText();
                if(a.equalsIgnoreCase("Lunch Break")){
                    Intent smvitmcafe = new Intent(MainActivity.this,SmvitmCafiteria.class);
                    smvitmcafe.putExtra("key","CAFE");
                    v.startAnimation(right);
                    startActivity(smvitmcafe);
                }else {
                    isub4.putExtra("key", sub4.getText());
                    v.startAnimation(right);
                    startActivity(isub4);
                }
            }
        });
        sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = (String) sub5.getText();
                if(a.equalsIgnoreCase("Lunch Break")){
                    Intent smvitmcafe = new Intent(MainActivity.this,SmvitmCafiteria.class);
                    smvitmcafe.putExtra("key","CAFE");
                    v.startAnimation(right);
                    startActivity(smvitmcafe);
                }else {
                    isub5.putExtra("key", sub5.getText());
                    v.startAnimation(right);
                    startActivity(isub5);
                }
            }
        });
        sub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isub6.putExtra("key",sub6.getText());
                v.startAnimation(right);
                startActivity(isub6);
            }
        });
        sub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isub7.putExtra("key",sub7.getText());
                v.startAnimation(right);
                startActivity(isub7);
            }
        });
        sub8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isub8.putExtra("key",sub8.getText());
                v.startAnimation(right);
                startActivity(isub8);
            }
        });
*/
        nextDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*
                v.startAnimation(animScale);
*/
                showNextDay(day);
            }
        });
        prevDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*
                v.startAnimation(animScale);
*/
                showPrevDay(day);
            }
        });
    }
    void showNextDay(String day){

        if(day.equalsIgnoreCase("Monday")){
            showtimetable("Tuesday");
        }else if(day.equalsIgnoreCase("Tuesday")){
            showtimetable("Wednesday");
        }
        else if(day.equalsIgnoreCase("Wednesday")){
            showtimetable("Thursday");
        }
        else if(day.equalsIgnoreCase("Thursday")){
            showtimetable("Friday");
        }
        else if(day.equalsIgnoreCase("Friday")){
            showtimetable("Saturday");
        }
        else if(day.equalsIgnoreCase("Saturday")){
            showtimetable("Monday");
        }
    }
    void showPrevDay(String day){
        if(day.equalsIgnoreCase("Monday")){
            showtimetable("Saturday");
        }else if(day.equalsIgnoreCase("Tuesday")){
            showtimetable("Monday");
        }
        else if(day.equalsIgnoreCase("Wednesday")){
            showtimetable("Tuesday");
        }
        else if(day.equalsIgnoreCase("Thursday")){
            showtimetable("Wednesday");
        }
        else if(day.equalsIgnoreCase("Friday")){
            showtimetable("Thursday");
        }
        else if(day.equalsIgnoreCase("Saturday")){
            showtimetable("Friday");
        }
    }
    public static boolean checkInternetConnection(Context context) {

        ConnectivityManager con_manager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (con_manager.getActiveNetworkInfo() != null
                && con_manager.getActiveNetworkInfo().isAvailable()
                && con_manager.getActiveNetworkInfo().isConnected()) {
            return true;
        } else {
            return false;
        }
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
