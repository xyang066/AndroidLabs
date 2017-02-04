package com.example.henry.androidlabs;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.app.PendingIntent.getActivity;

public class LoginActivity extends AppCompatActivity {

    protected static final String ACTIVITY_NAME = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Log.i(ACTIVITY_NAME, "In onCreate()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(ACTIVITY_NAME, "In onResume()");
    }




    EditText email = (EditText) findViewById(R.id.editTextLogin);

    @Override
    protected void onStart(){
        super.onStart();

/*
        Button button = (Button) findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SharedPreferences sharedpreferences = getSharedPreferences("MyloginFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                EditText email = (EditText) findViewById(R.id.editTextLogin);
                String e = email.getText().toString();
                editor.putString("DefaultEmail", e);
                editor.commit();
                Intent intent=new Intent(LoginActivity.this,StartActivity.class);
                startActivity(intent);
            }
        });
        SharedPreferences sharedpreferences = getSharedPreferences("MyloginFile", Context.MODE_PRIVATE);
        int numTimeRun=sharedpreferences.getInt("TIMES_RUN",0);
        EditText email = (EditText) findViewById(R.id.editTextLogin);
        email.setText(sharedpreferences.getString("DefaultEmail","email@domain.com"));
*/

        Log.i(ACTIVITY_NAME, "In onStart()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(ACTIVITY_NAME, "In onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(ACTIVITY_NAME, "In onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(ACTIVITY_NAME, "In onDestroy()");
    }
}
