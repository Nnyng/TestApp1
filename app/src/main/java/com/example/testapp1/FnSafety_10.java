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

public class FnSafety_10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fn_safety_10);

        ImageView im_back_arrowfn10 = (ImageView) findViewById(R.id.im_back_arrowfn10);
        Button btn_save_fb10 = (Button) findViewById(R.id.btn_save_fb10);
        Spinner spinner_id10 = (Spinner) findViewById(R.id.spinner_fnsafety10_1);
        Spinner spinner_locationFn10 = (Spinner) findViewById(R.id.spinner_fnsafety10_2);
        Spinner spinner_generality10_1 = (Spinner) findViewById(R.id.spinner_fnsafety10_3);
        Spinner spinner_generality10_2 = (Spinner) findViewById(R.id.spinner_fnsafety10_4);
        Spinner spinner_generality10_3 = (Spinner) findViewById(R.id.spinner_fnsafety10_5);
        Spinner spinner_generality10_4 = (Spinner) findViewById(R.id.spinner_fnsafety10_6);
        Spinner spinner_generality10_5 = (Spinner) findViewById(R.id.spinner_fnsafety10_7);
        Spinner spinner_generality10_6 = (Spinner) findViewById(R.id.spinner_fnsafety10_8);
        Spinner spinner_generality10_7 = (Spinner) findViewById(R.id.spinner_fnsafety10_9);

        im_back_arrowfn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_10.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_fb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_10.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        final String[] id_Device10 = getResources().getStringArray(R.array.id_valve);
        ArrayAdapter<String> adapter_idDevicec10 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,id_Device10);
        spinner_id10.setAdapter(adapter_idDevicec10);
        spinner_id10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        final String[] locat_fn10 = getResources().getStringArray(R.array.location_valve);
        ArrayAdapter<String> adapter_locat_Fn10 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locat_fn10);
        spinner_locationFn10.setAdapter(adapter_locat_Fn10);

        final String[] generality10_1 = getResources().getStringArray(R.array.generality_valve);
        ArrayAdapter<String> adapter_generality10_1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality10_1);
        spinner_generality10_1.setAdapter(adapter_generality10_1);

        final String[] generality10_2 = getResources().getStringArray(R.array.generality_valve);
        ArrayAdapter<String> adapter_generality10_2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality10_2);
        spinner_generality10_2.setAdapter(adapter_generality10_2);

        final String[] generality10_3 = getResources().getStringArray(R.array.generality_valve);
        ArrayAdapter<String> adapter_generality10_3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality10_3);
        spinner_generality10_3.setAdapter(adapter_generality10_3);

        final String[] generality10_4 = getResources().getStringArray(R.array.generality_valve);
        ArrayAdapter<String> adapter_generality10_4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality10_4);
        spinner_generality10_4.setAdapter(adapter_generality10_4);

        final String[] generality10_5 = getResources().getStringArray(R.array.generality_valve);
        ArrayAdapter<String> adapter_generality10_5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality10_5);
        spinner_generality10_5.setAdapter(adapter_generality10_5);

        final String[] generality10_6 = getResources().getStringArray(R.array.generality_valve);
        ArrayAdapter<String> adapter_generality10_6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality10_6);
        spinner_generality10_6.setAdapter(adapter_generality10_6);

        final String[] generality10_7 = getResources().getStringArray(R.array.generality_valve);
        ArrayAdapter<String> adapter_generality10_7 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality10_7);
        spinner_generality10_7.setAdapter(adapter_generality10_7);


        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn10);
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
