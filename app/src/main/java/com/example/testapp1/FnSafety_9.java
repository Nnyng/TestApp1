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

public class FnSafety_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fn_safety_9);

        ImageView im_back_arrowfn9 = (ImageView) findViewById(R.id.im_back_arrowfn9);
        Button btn_save_fb9 = (Button) findViewById(R.id.btn_save_fb9);
        Spinner spinner_deviceFn9 = (Spinner) findViewById(R.id.spinner_fnsafety9_1);
        Spinner spinner_locatFn9 = (Spinner) findViewById(R.id.spinner_fnsafety9_2);
        Spinner spinner_generalityFn9 =(Spinner) findViewById(R.id.spinner_fnsafety9_3);
        Spinner spinner_generalityFn9_1 =(Spinner) findViewById(R.id.spinner_fnsafety9_4);
        Spinner spinner_generalityFn9_2 =(Spinner) findViewById(R.id.spinner_fnsafety9_5);
        Spinner spinner_generalityFn9_3 =(Spinner) findViewById(R.id.spinner_fnsafety9_6);
        Spinner spinner_generalityFn9_4 =(Spinner) findViewById(R.id.spinner_fnsafety9_7);

        im_back_arrowfn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_9.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_fb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_9.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        final String[] idDevice_Fn9 = getResources().getStringArray(R.array.Device_CO2fn9);
        ArrayAdapter<String> adapter_Devicefn9 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,idDevice_Fn9);
        spinner_deviceFn9.setAdapter(adapter_Devicefn9);
        spinner_deviceFn9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        final String[] locat_Fn9 = getResources().getStringArray(R.array.Locat_CO2fn9);
        ArrayAdapter<String> adapter_locatfn9 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locat_Fn9);
        spinner_locatFn9.setAdapter(adapter_locatfn9);

        final String[] generality_Fn9 = getResources().getStringArray(R.array.Generality_fn9);
        ArrayAdapter<String> adapter_generalityfn9 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_Fn9);
        spinner_generalityFn9.setAdapter(adapter_generalityfn9);

        final String[] generality_Fn9_1 = getResources().getStringArray(R.array.Generality_fn9);
        ArrayAdapter<String> adapter_generalityfn9_1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_Fn9_1);
        spinner_generalityFn9_1.setAdapter(adapter_generalityfn9_1);

        final String[] generality_Fn9_2 = getResources().getStringArray(R.array.Generality_fn9);
        ArrayAdapter<String> adapter_generalityfn9_2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_Fn9_2);
        spinner_generalityFn9_2.setAdapter(adapter_generalityfn9_2);

        final String[] generality_Fn9_3 = getResources().getStringArray(R.array.Generality_fn9);
        ArrayAdapter<String> adapter_generalityfn9_3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_Fn9_3);
        spinner_generalityFn9_3.setAdapter(adapter_generalityfn9_3);

        final String[] generality_Fn9_4 = getResources().getStringArray(R.array.Generality_fn9);
        ArrayAdapter<String> adapter_generalityfn9_4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_Fn9_4);
        spinner_generalityFn9_4.setAdapter(adapter_generalityfn9_4);

        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn9);
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
