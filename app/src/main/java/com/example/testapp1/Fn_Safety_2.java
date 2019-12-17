package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class Fn_Safety_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fn_safety_2);

        Spinner spinner_fnsafety2_locat = (Spinner) findViewById(R.id.spinner_fnsafety2_1);
        Spinner spinner_fnsafety2_electricity = (Spinner) findViewById(R.id.spinner_fnsafety2_2);
        Spinner spinner_fnsafety2_generality = (Spinner) findViewById(R.id.spinner_fnsafety2_3);
        ImageView im_back_arrowfn2 = (ImageView)findViewById(R.id.im_back_arrowfn2);
        Button btn_save_fn2 = (Button)findViewById(R.id.btn_save_fn2);

        im_back_arrowfn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety_2.this, Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_fn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety_2.this, Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        final String[] locationFn2 = getResources().getStringArray(R.array.location_FnSafety2);
        ArrayAdapter<String> adapterlocatfn2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locationFn2);
        spinner_fnsafety2_locat.setAdapter(adapterlocatfn2);

        spinner_fnsafety2_locat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(FnSafety_1.this,
//                        "Select : " + totalFn1[position],
//                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final String[] electricityFn2 = getResources().getStringArray(R.array.electricity_emergency_Type);
        ArrayAdapter<String> adapter_electricityFn2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,electricityFn2);
        spinner_fnsafety2_electricity.setAdapter(adapter_electricityFn2);

        spinner_fnsafety2_electricity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final String[] Generality_electricityFn2 = getResources().getStringArray(R.array.generality_electricity);
        ArrayAdapter<String> adaptergenerality_Fn2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Generality_electricityFn2);
        spinner_fnsafety2_generality.setAdapter(adaptergenerality_Fn2);
        spinner_fnsafety2_generality.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn2);
                                long date = System.currentTimeMillis();
                                SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy\nhh-mm-ss a");
                                String dateString = sdf.format(date);
                                tdate.setText(dateString);
                            }
                        });
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}
