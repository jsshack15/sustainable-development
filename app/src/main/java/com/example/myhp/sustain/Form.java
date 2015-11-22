
package com.example.myhp.sustain;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;

        import com.example.myhp.sustain.R;

/**
 * Created by my hp on 11/21/2015.
 */
public class Form extends Activity implements  View.OnClickListener{
    Button b;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);


        b = (Button)findViewById(R.id.button15);

        b.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        Class ch = null;
        try {
            ch = Class.forName("com.example.myhp.sustain.HealthTips");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        in = new Intent(Form.this, ch);
        startActivity(in);
    }
}