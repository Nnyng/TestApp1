package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class Safety_11_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.safety_11_2);

        ImageView im_back_arrowfn11_2 = (ImageView) findViewById(R.id.im_back_arrowfn11_2);
        Button btn_save_fb11_2 = (Button) findViewById(R.id.btn_save_fb11_2);
        Spinner spinner_numAuto_eMonths = (Spinner) findViewById(R.id.spinner_fnsafety11_2_0);
        Spinner spinner_zoneAuto_eMonths= (Spinner) findViewById(R.id.spinner_fnsafety11_2_1);
        Spinner spinner_locatAuto_eMonths = (Spinner) findViewById(R.id.spinner_fnsafety11_2_2);
        Spinner spinner_generality_eMonths = (Spinner) findViewById(R.id.spinner_fnsafety11_2_3);

        im_back_arrowfn11_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Safety_11_2.this,Safety_11.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_fb11_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Safety_11_2.this,Safety_11.class);
                startActivity(intent);
                finish();
            }
        });

        String[] Number_Auto_eMonths = getResources().getStringArray(R.array.no_Automatic_eMonths);
        ArrayAdapter<String> adapter_Number_Auto_eMonths = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Number_Auto_eMonths);
        spinner_numAuto_eMonths.setAdapter(adapter_Number_Auto_eMonths);
        spinner_numAuto_eMonths.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        String[] zoneAuto_eMonths = getResources().getStringArray(R.array.zone_Automatic_eMonths);
        ArrayAdapter<String> adapter_zoneAuto_eMonths = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,zoneAuto_eMonths);
        spinner_zoneAuto_eMonths.setAdapter(adapter_zoneAuto_eMonths);

        String[] locat_Auto_eMonths = getResources().getStringArray(R.array.Location_Automatic_eMonths);
        ArrayAdapter<String> adapter_locat_Auto_eMonths = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locat_Auto_eMonths);
        spinner_locatAuto_eMonths.setAdapter(adapter_locat_Auto_eMonths);

        String[] generalityAuto_eMonths = getResources().getStringArray(R.array.generality_Auto_eMonths);
        ArrayAdapter<String> adapter_genneralityAuto_eMonths = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generalityAuto_eMonths);
        spinner_generality_eMonths.setAdapter(adapter_genneralityAuto_eMonths);

        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn11_2);
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
