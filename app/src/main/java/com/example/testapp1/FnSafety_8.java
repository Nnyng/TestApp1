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

public class FnSafety_8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fn_safety_8);

        ImageView im_back_arrowfn8 = (ImageView) findViewById(R.id.im_back_arrowfn8);
        Button btn_save_fb8 = (Button) findViewById(R.id.btn_save_fb8);
        Spinner spinner_idDevice8 = (Spinner) findViewById(R.id.spinner_fnsafety8_1);
        Spinner spinner_typeDevice8 = (Spinner) findViewById(R.id.spinner_fnsafety8_2);
        Spinner spinner_locat8 = (Spinner) findViewById(R.id.spinner_fnsafety8_3);
        Spinner spinner_generality8 = (Spinner) findViewById(R.id.spinner_fnsafety8_4);

        im_back_arrowfn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_8.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_fb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_8.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        final String[] idDevice_Fn8 = getResources().getStringArray(R.array.id_deviceFn8);
        ArrayAdapter<String> adapter_idDevicefn8 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,idDevice_Fn8);
        spinner_idDevice8.setAdapter(adapter_idDevicefn8);
        spinner_idDevice8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        final String[] typeDevice_Fn8 = getResources().getStringArray(R.array.Device_Fn8);
        ArrayAdapter<String> adapter_typeDevicefn8 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,typeDevice_Fn8);
        spinner_typeDevice8.setAdapter(adapter_typeDevicefn8);

        final String[] locat_Fn8 = getResources().getStringArray(R.array.locat_Fn8);
        ArrayAdapter<String> adapter_locatfn8 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locat_Fn8);
        spinner_locat8.setAdapter(adapter_locatfn8);

        final String[] generality_Fn8 = getResources().getStringArray(R.array.generality_Fn8);
        ArrayAdapter<String> adapter_generality8 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_Fn8);
        spinner_generality8.setAdapter(adapter_generality8);

        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn8);
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
