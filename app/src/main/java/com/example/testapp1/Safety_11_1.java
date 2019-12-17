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

public class Safety_11_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.safety_11_1);

        ImageView im_back_arrowfn11_1 = (ImageView) findViewById(R.id.im_back_arrowfn11_1);
        Button btn_save_fb11_1 = (Button) findViewById(R.id.btn_save_fb11_1);
        Spinner spinner_No11_1 = (Spinner) findViewById(R.id.spinner_fnsafety11_1_0);
        Spinner spinner_zone11_1 = (Spinner) findViewById(R.id.spinner_fnsafety11_1_1);
        Spinner spinner_locat11_1 = (Spinner) findViewById(R.id.spinner_fnsafety11_1_2);
        Spinner spinner_generality11_1 = (Spinner) findViewById(R.id.spinner_fnsafety11_1_3);
        Spinner spinner_MainBoard11_1 = (Spinner) findViewById(R.id.spinner_fnsafety11_1_4);
        Spinner spinner_Office11_1 = (Spinner) findViewById(R.id.spinner_fnsafety11_1_5);
        Spinner spinner_Walkway11_1 = (Spinner) findViewById(R.id.spinner_fnsafety11_1_6);

        im_back_arrowfn11_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Safety_11_1.this,Safety_11.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_fb11_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Safety_11_1.this,Safety_11.class);
                startActivity(intent);
                finish();
            }
        });

        String[] Number11_1 = getResources().getStringArray(R.array.No_Manual);
        ArrayAdapter<String> adapter_Number11_1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Number11_1);
        spinner_No11_1.setAdapter(adapter_Number11_1);
        spinner_No11_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

         String[] Zone11_1 = getResources().getStringArray(R.array.Zone_Manual);
         ArrayAdapter<String> adapter_Zone11_1 = new ArrayAdapter<String>(this,
                 android.R.layout.simple_dropdown_item_1line,Zone11_1);
        spinner_zone11_1.setAdapter(adapter_Zone11_1);

        String[] Locat11_1 = getResources().getStringArray(R.array.Locat_Manual);
        ArrayAdapter<String> adapter_Locat11_1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Locat11_1);
        spinner_locat11_1.setAdapter(adapter_Locat11_1);

        String[] generality11_1 = getResources().getStringArray(R.array.generality_Manual);
        ArrayAdapter<String> adapter_generality11_1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality11_1);
        spinner_generality11_1.setAdapter(adapter_generality11_1);

        String[] mainBoard11_1 = getResources().getStringArray(R.array.generality_Manual);
        ArrayAdapter<String> adapter_mainBoard11_1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,mainBoard11_1);
        spinner_MainBoard11_1.setAdapter(adapter_mainBoard11_1);

        String[] Office11_1 = getResources().getStringArray(R.array.generality_Manual);
        ArrayAdapter<String> adapter_Office11_1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Office11_1);
        spinner_Office11_1.setAdapter(adapter_Office11_1);

        String[] Walkway11_1 = getResources().getStringArray(R.array.generality_Manual);
        ArrayAdapter<String> adapter_Walkway11_1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Walkway11_1);
        spinner_Walkway11_1.setAdapter(adapter_Walkway11_1);

        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn11_1);
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
