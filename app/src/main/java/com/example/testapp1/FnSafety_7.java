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

public class FnSafety_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fn_safety_7);

       ImageView im_back_arrowfn7 = (ImageView) findViewById(R.id.im_back_arrowfn7);
        Button btn_save_fb7 = (Button) findViewById(R.id.btn_save_fb7);
        Spinner spinner_DeviceFoamfire7 = (Spinner) findViewById(R.id.spinner_fnsafety7_1);
        Spinner spinner_locat_Devicefoam7 = (Spinner) findViewById(R.id.spinner_fnsafety7_2);
        Spinner spinner_generality_DeviceFoam7 = (Spinner) findViewById(R.id.spinner_fnsafety7_3);
        Spinner spinner_generality_DeviceFoam7_1 = (Spinner) findViewById(R.id.spinner_fnsafety7_4);
        Spinner spinner_generality_DeviceFoam7_2 = (Spinner) findViewById(R.id.spinner_fnsafety7_5);
        Spinner spinner_generality_DeviceFoam7_3 = (Spinner) findViewById(R.id.spinner_fnsafety7_6);
        Spinner spinner_generality_DeviceFoam7_4 = (Spinner) findViewById(R.id.spinner_fnsafety7_7);
        Spinner spinner_generality_DeviceFoam7_5 = (Spinner) findViewById(R.id.spinner_fnsafety7_8);

        im_back_arrowfn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_7.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_fb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_7.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        final String[] locationFn7 = getResources().getStringArray(R.array.location_Device_Foam_Fire);
        ArrayAdapter<String> adapterlocatfn7 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locationFn7);
        spinner_locat_Devicefoam7.setAdapter(adapterlocatfn7);
        spinner_locat_Devicefoam7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        final String[] device_Fn7 = getResources().getStringArray(R.array.Device_Foam_Fire);
        ArrayAdapter<String> adapter_devicefn7 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,device_Fn7);
        spinner_DeviceFoamfire7.setAdapter(adapter_devicefn7);

        final String[] generality_fn7 = getResources().getStringArray(R.array.generality_EyeShower);
        ArrayAdapter<String> adapter_generalityfn7 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_fn7);
        spinner_generality_DeviceFoam7.setAdapter(adapter_generalityfn7);

        final String[] generality_fn7_1 = getResources().getStringArray(R.array.generality_Device_Foam);
        ArrayAdapter<String> adapter_generalityfn7_1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_fn7_1);
        spinner_generality_DeviceFoam7_1.setAdapter(adapter_generalityfn7_1);

        final String[] generality_fn7_2 = getResources().getStringArray(R.array.generality_Device_Foam);
        ArrayAdapter<String> adapter_generalityfn7_2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_fn7_2);
        spinner_generality_DeviceFoam7_2.setAdapter(adapter_generalityfn7_2);

        final String[] generality_fn7_3 = getResources().getStringArray(R.array.generality_Device_Foam);
        ArrayAdapter<String> adapter_generalityfn7_3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_fn7_3);
        spinner_generality_DeviceFoam7_3.setAdapter(adapter_generalityfn7_3);

        final String[] generality_fn7_4 = getResources().getStringArray(R.array.generality_Device_Foam);
        ArrayAdapter<String> adapter_generalityfn7_4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_fn7_4);
        spinner_generality_DeviceFoam7_4.setAdapter(adapter_generalityfn7_4);

        final String[] generality_fn7_5 = getResources().getStringArray(R.array.generality_Device_Foam);
        ArrayAdapter<String> adapter_generalityfn7_5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_fn7_5);
        spinner_generality_DeviceFoam7_5.setAdapter(adapter_generalityfn7_5);

        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn7);
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
