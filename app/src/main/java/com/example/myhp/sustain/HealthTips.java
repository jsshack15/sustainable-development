
package com.example.myhp.sustain;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import com.example.myhp.sustain.R;

/**
 * Created by my hp on 11/21/2015.
 */
public class HealthTips  extends Activity implements View.OnClickListener{
    int counter;
    Button b1,b2,b3,b4,b5,check;
    TextView display;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_tips);

        b1 = (Button)findViewById(R.id.button17);
        b2=(Button)findViewById(R.id.button16);
        b3=(Button)findViewById(R.id.button18);
        b4=(Button)findViewById(R.id.button19);
        b5=(Button)findViewById(R.id.button20);
        check=(Button)findViewById(R.id.button21);
        display=(TextView)findViewById(R.id.textView14);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                display.setText("YOUR POINTS:"+counter);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                display.setText("YOUR POINTS:"+counter);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                display.setText("YOUR POINTS:"+counter);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                display.setText("YOUR POINTS:"+counter);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                display.setText("YOUR POINTS:"+counter);
            }
        });
        check.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        Class ch = null;
        try {
            ch = Class.forName("com.example.myhp.sustain.Offers");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        intent = new Intent(HealthTips.this, ch);
        startActivity(intent);
    }
    }
