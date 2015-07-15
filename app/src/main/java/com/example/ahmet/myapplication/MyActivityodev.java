package com.example.ahmet.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivityodev extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activityodev);
        final EditText vize1=(EditText) findViewById(R.id.vize1);
        final EditText vize2=(EditText) findViewById(R.id.vize2);
        final EditText vize3=(EditText) findViewById(R.id.vize2);
        final EditText vize4=(EditText) findViewById(R.id.vize4);
        final EditText final1=(EditText) findViewById(R.id.final1);
        final EditText final2=(EditText) findViewById(R.id.final2);
        final EditText final3=(EditText) findViewById(R.id.final3);
        final EditText final4=(EditText) findViewById(R.id.final4);
        final TextView ortalama1=(TextView) findViewById(R.id.ort1);
        final TextView ortalama2=(TextView) findViewById(R.id.ort2);
        final TextView ortalama3=(TextView) findViewById(R.id.ort3);
        final TextView ortalama4=(TextView) findViewById(R.id.ort4);


        Button hesapla=(Button) findViewById(R.id.button);
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float vize11=Float.parseFloat(vize1.getText().toString());
                float vize22=Float.parseFloat(vize2.getText().toString());
                float vize33=Float.parseFloat(vize3.getText().toString());
                float vize44=Float.parseFloat(vize4.getText().toString());
                float final11=Float.parseFloat(final1.getText().toString());
                float final22=Float.parseFloat(final2.getText().toString());
                float final33=Float.parseFloat(final3.getText().toString());
                float final44=Float.parseFloat(final4.getText().toString());
                ortalama1.setText(String.valueOf((vize11*0.4)+(final11*0.6)));
                ortalama2.setText(String.valueOf((vize22*0.4)+(final22*0.6)));
                ortalama3.setText(String.valueOf((vize33*0.4)+(final33*0.6)));
                ortalama4.setText(String.valueOf((vize44*0.4)+(final44*0.6)));


            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_activityodev, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
