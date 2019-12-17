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

public class Safety_11_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.safety_11_5);

        ImageView im_back_arrowfn11_5 = (ImageView) findViewById(R.id.im_back_arrowfn11_5);
        Button  btn_save_fb11_5 = (Button) findViewById(R.id.btn_save_fb11_5);
        Spinner spinner_numTreater_3Months = (Spinner) findViewById(R.id.spinner_fnsafety11_5_0);
        Spinner spinner_zoneTreater_3Months = (Spinner) findViewById(R.id.spinner_fnsafety11_5_1);
        Spinner spinner_locationTreater_3Months  = (Spinner) findViewById(R.id.spinner_fnsafety11_5_2);
        Spinner spinner_testWorkTreater_3Months = (Spinner) findViewById(R.id.spinner_fnsafety11_5_3);

        im_back_arrowfn11_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Safety_11_5.this,Safety_11.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_fb11_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Safety_11_5.this,Safety_11.class);
                startActivity(intent);
                finish();
            }
        });

        String[] numTreater11_5 = getResources().getStringArray(R.array.no_Auto_Smoke_3Months);
        ArrayAdapter<String> adapter_numTreater11_5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,numTreater11_5);
        spinner_numTreater_3Months.setAdapter(adapter_numTreater11_5);

        String[] zoneTreater11_5 = getResources().getStringArray(R.array.Zone_Auto_Treater_3Months);
        ArrayAdapter<String> adapter_zoneTreater11_5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,zoneTreater11_5);
        spinner_zoneTreater_3Months.setAdapter(adapter_zoneTreater11_5);

        String[] locationTreater11_5 = getResources().getStringArray(R.array.locat_Auto_Treater_3Months);
        ArrayAdapter<String> adapter_locationTreater11_5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locationTreater11_5);
        spinner_locationTreater_3Months.setAdapter(adapter_locationTreater11_5);

        String[] testWorkTreater11_5 = getResources().getStringArray(R.array.testWork_AutoTreater_3Months);
        ArrayAdapter<String> adapter_testWorkTreater11_5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,testWorkTreater11_5);
        spinner_testWorkTreater_3Months.setAdapter(adapter_testWorkTreater11_5);


        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn11_5);
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
