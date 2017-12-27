package com.festeam.win7.eoq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_d, et_cp, et_c, et_i, et_q, et_p, et_h, et_Q, et_CT, et_IP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        et_d = findViewById(R.id.editText_d);
        et_cp = findViewById(R.id.editText_cp);
        et_c = findViewById(R.id.editText_c);
        et_i = findViewById(R.id.editText_i);
        et_q = findViewById(R.id.editText_q);
        et_p = findViewById(R.id.editText_p);
        et_h = findViewById(R.id.editText_h);

        et_Q = findViewById(R.id.editText_Q);
        et_CT = findViewById(R.id.editText_CT);
        et_IP = findViewById(R.id.editText_IP);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = Double.parseDouble(et_d.getText().toString());
                double cp = Double.parseDouble(et_cp.getText().toString());
                double c = Double.parseDouble(et_c.getText().toString());
                double i = Double.parseDouble(et_i.getText().toString());
                double q = Double.parseDouble(et_q.getText().toString());
                double p = Double.parseDouble(et_p.getText().toString());
                double h = Double.parseDouble(et_h.getText().toString());

                double IP = i * p;
                double Q = Math.sqrt((2 * d * c) / IP);
                double CT = (d * c) + ((d / q) * cp) +((q / 2)*(i * c));

                et_Q.setText(String.valueOf(Q));
                et_CT.setText(String.valueOf(CT));
                et_IP.setText(String.valueOf(IP));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
