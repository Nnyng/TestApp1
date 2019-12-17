package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FnSafety_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fn_safety_1);

        Spinner spinner_deviceType = (Spinner) findViewById(R.id.spinner_fnsafety1_2);
        Spinner spinner_fntotalType = (Spinner) findViewById(R.id.spinner_fnsafety1_3_1);
        Spinner spinner_fntotal = (Spinner) findViewById(R.id.spinner_fnsafety1_3);
        Spinner spinner_fngenerality = (Spinner) findViewById(R.id.spinner_fnsafety1_4);
        final Spinner spinner_fnlocation = (Spinner) findViewById(R.id.spinner_fnsafety1_1);
        ImageView im_back_arrow = (ImageView)findViewById(R.id.im_back_arrow);
        Button btn_save = (Button)findViewById(R.id.btn_save);
        im_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_1.this, Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_1.this, Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        final String[] totalFn1 = getResources().getStringArray(R.array.total);
        ArrayAdapter<String> adapterTotal = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,totalFn1);
        spinner_fntotal.setAdapter(adapterTotal);

        spinner_fntotal.setOnItemSelectedListener(new OnItemSelectedListener() {
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


        final String[] deviceTypeFn1 = getResources().getStringArray(R.array.device_Type);
        ArrayAdapter<String> adapterDevice_Type = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,deviceTypeFn1);
        spinner_deviceType.setAdapter(adapterDevice_Type);
        spinner_deviceType.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(FnSafety_1.this,
//                        "Select : " + deviceTypeFn1[position],
//                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final String[] totalTypeFn1 = getResources().getStringArray(R.array.Total_Type);
        ArrayAdapter<String> adapterTotal_Type = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,totalTypeFn1);
        spinner_fntotalType.setAdapter(adapterTotal_Type);
        spinner_fntotalType.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(FnSafety_1.this,
//                        "Select : " + totalTypeFn1[position],
//                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final String[] generalityFn1 = getResources().getStringArray(R.array.Generality);
        ArrayAdapter<String> adapterGenerality = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, generalityFn1);
        spinner_fngenerality.setAdapter(adapterGenerality);

        spinner_fngenerality.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(FnSafety_1.this,
//                        "Select : " + generalityFn1[position],
//                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        final String[] locatFn1 = getResources().getStringArray(R.array.Location);
        ArrayAdapter<String> adapterLocation = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, locatFn1);
        spinner_fnlocation.setAdapter(adapterLocation);

        spinner_fnlocation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(FnSafety_1.this,
//                        "Select : " + locatFn1[position],
//                        Toast.LENGTH_SHORT).show();

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
                                TextView tdate = (TextView) findViewById(R.id.date);
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
