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

public class Safety_11_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.safety_11_3);

        ImageView im_back_arrowfn11_3 = (ImageView)findViewById(R.id.im_back_arrowfn11_3);
        Button btn_save_fb11_3 = (Button)findViewById(R.id.btn_save_fb11_3);
        Spinner spinner_numAuto_3Months = (Spinner)findViewById(R.id.spinner_fnsafety11_3_0);
        Spinner spinner_zoneAuto_3Months = (Spinner)findViewById(R.id.spinner_fnsafety11_3_1);
        Spinner spinner_locatAuto_3Months = (Spinner)findViewById(R.id.spinner_fnsafety11_3_2);
        Spinner spinner_MainBoard11_3 = (Spinner) findViewById(R.id.spinner_fnsafety11_3_4);
        Spinner spinner_Office11_3 = (Spinner) findViewById(R.id.spinner_fnsafety11_3_5);
        Spinner spinner_Walkway11_3 = (Spinner) findViewById(R.id.spinner_fnsafety11_3_6);

        im_back_arrowfn11_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Safety_11_3.this,Safety_11.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_fb11_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Safety_11_3.this,Safety_11.class);
                startActivity(intent);
                finish();
            }
        });

        String[] numAuto_3Months = getResources().getStringArray(R.array.no_Automatic_3Months);
        ArrayAdapter<String> adapter_numAuto_3Months = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,numAuto_3Months);
        spinner_numAuto_3Months.setAdapter(adapter_numAuto_3Months);
        spinner_numAuto_3Months.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        String[] zoneAuto_3Months = getResources().getStringArray(R.array.zone_Automatic_3Months);
        ArrayAdapter<String> adapter_zoneAuto_3Months = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,zoneAuto_3Months);
        spinner_zoneAuto_3Months.setAdapter(adapter_zoneAuto_3Months);

        String[] locatAuto_3Months = getResources().getStringArray(R.array.Location_Automatic_3Months);
        ArrayAdapter<String> adapter_locatAuto_3Months = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locatAuto_3Months);
        spinner_locatAuto_3Months.setAdapter(adapter_locatAuto_3Months);

        String[] MainBoard11_3 = getResources().getStringArray(R.array.testWork_Auto_3Months);
        ArrayAdapter<String> adapter_MainBoard11_3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,MainBoard11_3);
        spinner_MainBoard11_3.setAdapter(adapter_MainBoard11_3);

        String[] Office11_3 = getResources().getStringArray(R.array.testWork_Auto_3Months);
        ArrayAdapter<String> adapter_Office11_3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Office11_3);
        spinner_Office11_3.setAdapter(adapter_Office11_3);

        String[] Walkway11_3 = getResources().getStringArray(R.array.testWork_Auto_3Months);
        ArrayAdapter<String> adapter_Walkway11_3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Walkway11_3);
        spinner_Walkway11_3.setAdapter(adapter_Walkway11_3);

        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn11_3);
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
