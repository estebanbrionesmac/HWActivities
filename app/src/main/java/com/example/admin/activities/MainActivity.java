package com.example.admin.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("FT App", "Main on Resuming...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("FT App", "Main on Destroying...");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("FT App", "Main on Pausing...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("FT App", "Main on Restarting...");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("FT App", "Main on Resuming...");
    }

    public void go22(View view) {
        Intent i = new Intent(this, Second.class);
        startActivity(i);
    }


    public void goX(View v) {

        Log.d("FT App", "Logging...");
    }

}

