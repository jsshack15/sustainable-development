package com.example.myhp.sustain;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class StartingPoint extends Activity implements View.OnClickListener {
    Button b;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_starting_point);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        b = (Button)findViewById(R.id.button);

        b.setOnClickListener(this);
    }

@Override
            public void onClick(View v) {

        Class ch = null;
        try {
            ch = Class.forName("com.example.myhp.sustain.MenuList");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        in = new Intent(StartingPoint.this, ch);
        startActivity(in);
    }

    }






