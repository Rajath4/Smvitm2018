package com.smvitm.rajath.smvitm.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.smvitm.rajath.smvitm.R;

public class Login extends AppCompatActivity {
    private Button AnsBr,AnsYr,AnsSec,Submit,qbr;
    static String br="",yr="a",se="" ;
    Boolean aa=false,bb=false,cc=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tooosimplelogin);

        SharedPreferences loginData = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = loginData.edit();

       /* TextView textView = (TextView)findViewById(R.id.day);
        textView.setPaintFlags(textView.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);*/

       /* ImageView backg = (ImageView)findViewById(R.id.loginimage);

        try{
            backg.setBackgroundResource(R.drawable.bg_toosimple);
        }catch (Exception e){

        }
*/
        /*AnsBr = (Button) findViewById(R.id.abr);
        AnsBr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating the instance of PopupMenu
                PopupMenu popup1 = new PopupMenu(Login.this, AnsBr);
                //Inflating the Popup using xml file
                popup1.getMenuInflater()
                        .inflate(R.menu.mbranch, popup1.getMenu());

                //registering popup with OnMenuItemClickListener
                popup1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {


                        AnsBr.setText(item.getTitle());
                        br = (String) item.getTitle();
                        AnsBr.setError(null);

                        aa = true;
                        if((br.equalsIgnoreCase("Civil Engineering"))&& (!yr.equalsIgnoreCase("1st year")))
                        {
                            cc = true;
                            AnsSec.setEnabled(false);
                            se = "A";
                            AnsSec.setError(null);
                        }else {
                            cc = false;
                            AnsSec.setEnabled(true);
                        }

                        return true;
                    }
                });

                popup1.show(); //showing popup menu
            }
        }); //clo
        AnsYr = (Button) findViewById(R.id.ayr);
        AnsYr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating the instance of PopupMenu
                PopupMenu popup2 = new PopupMenu(Login.this, AnsYr);
                //Inflating the Popup using xml file
                popup2.getMenuInflater()
                        .inflate(R.menu.myear, popup2.getMenu());

                //registering popup with OnMenuItemClickListener
                popup2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {

                        AnsYr.setText(item.getTitle());
                        yr = (String) item.getTitle();
                        AnsYr.setError(null);

                        bb = true;

                        cc = false;
                        AnsSec.setText("Enter Section");
                        if((br.equalsIgnoreCase("Civil Engineering")) && (!yr.equalsIgnoreCase("1st year")))
                        {
                            cc = true;
                            AnsSec.setEnabled(false);
                            se = "A";
                            AnsSec.setError(null);
                        }else {
                            cc = false;
                            AnsSec.setEnabled(true);
                        }
                        return true;
                    }
                });

                popup2.show(); //showing popup menu
            }
        }); //closing the setOnClickListener method
        //year ends

        //Section starts
        AnsSec = (Button) findViewById(R.id.ase);
        AnsSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating the instance of PopupMenu
                PopupMenu popup3 = new PopupMenu(Login.this, AnsSec);
                //Inflating the Popup using xml file


                if (!(yr.equalsIgnoreCase("1st year"))) {
                    popup3.getMenuInflater()
                            .inflate(R.menu.msection, popup3.getMenu());
                } else {
                    popup3.getMenuInflater()
                            .inflate(R.menu.firstsection, popup3.getMenu());
                }


                //registering popup with OnMenuItemClickListener
                popup3.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {

                        AnsSec.setText(item.getTitle());
                        se = (String) item.getTitle();
                        cc = true;
                        AnsSec.setError(null);


                        return true;
                    }
                });

                popup3.show(); //showing popup menu
            }
        }); //closing the setOnClickListener method
        //Section ends
        Submit = (Button) findViewById(R.id.submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(aa && bb && cc)) {

                    if (!aa) {
                        AnsBr.setError("Error");
                    }else if(!bb){
                        AnsYr.setError("Error");
                    }else if (!cc){
                        AnsSec.setError("Error");
                    }
                    AlertDialog.Builder b = new AlertDialog.Builder(Login.this);
                    b.setTitle("Invalid Selection");
                    b.setMessage("Please Select Proper Year, Branch And Section!");
                    b.create();
                    b.show();

                }
                else {
                    editor.putString("yeAr", yr);
                    editor.putString("branCh", br);
                    editor.putString("sectiOn", se);
                    editor.putBoolean("Data", true);
                    editor.apply();

                    Intent intent = new Intent(Login.this,MainActivity.class);

                    finish();
                    startActivity(intent);


                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Enter your details to continue", Toast.LENGTH_SHORT).show();


    }*/
    }
}
