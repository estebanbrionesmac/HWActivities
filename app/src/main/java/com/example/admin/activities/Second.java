package com.example.admin.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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
    }


    @Override
    protected void onStop() {
        super.onStop();

        Log.d("FT App", "Second on Resuming...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("FT App", "Second on Destroying...");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("FT App", "Second on Pausing...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("FT App", "Second on Restarting...");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("FT App", "Second on Resuming...");
    }

}