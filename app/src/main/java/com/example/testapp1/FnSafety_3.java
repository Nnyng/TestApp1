package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class FnSafety_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fn_safety_3);

        ImageView im_back_arrowfn3 = (ImageView) findViewById(R.id.im_back_arrowfn3);
        Button btn_save_fn3 = (Button)findViewById(R.id.btn_save_fn3);
        Spinner spinner_num3_0 = (Spinner) findViewById(R.id.spinner_fnsafety3_0);
        Spinner spinner_locat3_1 = (Spinner) findViewById(R.id.spinner_fnsafety3_1);
        Spinner spinner_deviceType3_2 = (Spinner) findViewById(R.id.spinner_fnsafety3_2);
        Spinner spinner_generality_subfn3_3 = (Spinner) findViewById(R.id.spinner_fnsafety3_3);
        Spinner spinner_generality_subfn3_4 = (Spinner) findViewById(R.id.spinner_fnsafety3_4);
        Spinner spinner_generality_subfn3_5 = (Spinner) findViewById(R.id.spinner_fnsafety3_5);
        Spinner spinner_generality_subfn3_6 = (Spinner) findViewById(R.id.spinner_fnsafety3_6);
        Spinner spinner_generality_subfn3_7 = (Spinner) findViewById(R.id.spinner_fnsafety3_7);
        Spinner spinner_generality_subfn3_8 = (Spinner) findViewById(R.id.spinner_fnsafety3_8);



        im_back_arrowfn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_3.this, Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_fn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_3.this, Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });


        final String[] Number_Fn3 = getResources().getStringArray(R.array.No_Fn3);
        ArrayAdapter<String> adapter_Number_Fn3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Number_Fn3);
        spinner_num3_0.setAdapter(adapter_Number_Fn3);
//
        final String[] device_Fn3 = getResources().getStringArray(R.array.Type_Device_Fn3);
        ArrayAdapter<String> adapter_device_Fn3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,device_Fn3);
        spinner_deviceType3_2.setAdapter(adapter_device_Fn3);
//
        String[] locat_fn3 = getResources().getStringArray(R.array.location_Fn3);
        ArrayAdapter<String> adapter_locat3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locat_fn3);
        spinner_locat3_1.setAdapter(adapter_locat3);

        final String[] generality1 = getResources().getStringArray(R.array.generality_Fn3);
        ArrayAdapter<String> adapter_generality1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality1);
        spinner_generality_subfn3_3.setAdapter(adapter_generality1);
//
        final String[] generality2 = getResources().getStringArray(R.array.generality_Fn3);
        ArrayAdapter<String> adapter_generality2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality2);
        spinner_generality_subfn3_4.setAdapter(adapter_generality2);

        final String[] generality3 = getResources().getStringArray(R.array.generality_Fn3);
        ArrayAdapter<String> adapter_generality3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality3);
        spinner_generality_subfn3_5.setAdapter(adapter_generality3);

        final String[] generality4 = getResources().getStringArray(R.array.generality_Fn3);
        ArrayAdapter<String> adapter_generality4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality4);
        spinner_generality_subfn3_6.setAdapter(adapter_generality4);

        final String[] generality5 = getResources().getStringArray(R.array.generality_Fn3);
        ArrayAdapter<String> adapter_generality5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality5);
        spinner_generality_subfn3_7.setAdapter(adapter_generality5);

        final String[] generality6 = getResources().getStringArray(R.array.generality_Fn3);
        ArrayAdapter<String> adapter_generality6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality6);
        spinner_generality_subfn3_8.setAdapter(adapter_generality6);
//


        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn3);
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
