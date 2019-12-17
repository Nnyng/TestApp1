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

public class FnSafety_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fn_safety_6);

        ImageView im_back_arrowfn6 = (ImageView) findViewById(R.id.im_back_arrowfn6);
        Button btn_save_fb6 = (Button) findViewById(R.id.btn_save_fb6);
        Spinner spinner_fn6_locat = (Spinner) findViewById(R.id.spinner_fnsafety6_1);
        Spinner spinner_fn6_device = (Spinner) findViewById(R.id.spinner_fnsafety6_2);
        Spinner spinner_fn6_1 = (Spinner) findViewById(R.id.spinner_fnsafety6_3);
        Spinner spinner_fn6_2 = (Spinner) findViewById(R.id.spinner_fnsafety6_4);
        Spinner spinner_fn6_3 = (Spinner) findViewById(R.id.spinner_fnsafety6_5);
        Spinner spinner_fn6_4 = (Spinner) findViewById(R.id.spinner_fnsafety6_6);
        Spinner spinner_fn6_5 = (Spinner) findViewById(R.id.spinner_fnsafety6_7);

        im_back_arrowfn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_6.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_fb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_6.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        final String[] locationFn6 = getResources().getStringArray(R.array.locat_EyeShower);
        ArrayAdapter<String> adapterlocatfn6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locationFn6);
        spinner_fn6_locat.setAdapter(adapterlocatfn6);
        spinner_fn6_locat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        final String[] device_Fn6 = getResources().getStringArray(R.array.device_Type_EyeShower);
        ArrayAdapter<String> adapter_devicefn6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,device_Fn6);
        spinner_fn6_device.setAdapter(adapter_devicefn6);


        final String[] generality_fn6_1 = getResources().getStringArray(R.array.generality_EyeShower);
        ArrayAdapter<String> adapter_generalityfn6_1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_fn6_1);
        spinner_fn6_1.setAdapter(adapter_generalityfn6_1);

        final String[] generality_fn6_2 = getResources().getStringArray(R.array.generality_EyeShower);
        ArrayAdapter<String> adapter_generalityfn6_2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_fn6_2);
        spinner_fn6_2.setAdapter(adapter_generalityfn6_2);

        final String[] generality_fn6_3 = getResources().getStringArray(R.array.generality_EyeShower);
        ArrayAdapter<String> adapter_generalityfn6_3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_fn6_3);
        spinner_fn6_3.setAdapter(adapter_generalityfn6_3);

        final String[] generality_fn6_4 = getResources().getStringArray(R.array.generality_EyeShower);
        ArrayAdapter<String> adapter_generalityfn6_4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_fn6_4);
        spinner_fn6_4.setAdapter(adapter_generalityfn6_4);

        final String[] generality_fn6_5 = getResources().getStringArray(R.array.generality_EyeShower);
        ArrayAdapter<String> adapter_generalityfn6_5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_fn6_5);
        spinner_fn6_5.setAdapter(adapter_generalityfn6_5);


        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn6);
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
