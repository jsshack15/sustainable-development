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
    Button frwd;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list);
        frwd = (Button) findViewById(R.id.button2);
        frwd.setOnClickListener(this);

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
        }
    }
}
