package com.example.myhp.sustain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by my hp on 11/21/2015.
 */
public class MenuList extends Activity implements View.OnClickListener {
    Button abt,ht,nu,wm,alter,gogreen;
    Intent in;
/*<!uses-permission android:name="android.permission.INTERNET"/>
    <!uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menunew);
        abt = (Button) findViewById(R.id.button2);
        ht=(Button)findViewById(R.id.button5);
        wm=(Button)findViewById(R.id.button3);
        nu=(Button)findViewById(R.id.button6);
        alter=(Button)findViewById(R.id.button7);
        gogreen=(Button)findViewById(R.id.button8);
        abt.setOnClickListener(this);
        ht.setOnClickListener(this);
        nu.setOnClickListener(this);
        wm.setOnClickListener(this);
        alter.setOnClickListener(this);
        gogreen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.button2):
                Class ch = null;
                try {
                    ch = Class.forName("com.example.myhp.sustain.About");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                in = new Intent(MenuList.this, ch);
                 this.startActivity(in);
                break;

            case (R.id.button5):
                Class ch1 = null;
                try {
                    ch1 = Class.forName("com.example.myhp.sustain.Form");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                in = new Intent(MenuList.this, ch1);
                startActivity(in);
                break;
            case (R.id.button6):
                Class ch2 = null;
                try {
                    ch2 = Class.forName("com.example.myhp.sustain.Web");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                in = new Intent(MenuList.this, ch2);
                startActivity(in);
                break;
            case (R.id.button3):
                Class ch3 = null;
                try {
                    ch3 = Class.forName("com.example.myhp.sustain.Waste");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                in = new Intent(MenuList.this, ch3);
                startActivity(in);
                break;
            case(R.id.button7):
                Class ch4 = null;
                try {
                    ch4 = Class.forName("com.example.myhp.sustain.Alter");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                in = new Intent(MenuList.this, ch4);
                startActivity(in);
                break;
            case(R.id.button8):
                Class ch5 = null;
                try {
                    ch5 = Class.forName("com.example.myhp.sustain.Green");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                in = new Intent(MenuList.this, ch5);
                startActivity(in);
                break;

        }






    }


}
