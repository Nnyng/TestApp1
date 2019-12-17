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

public class FnSafety_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fn_safety_4);

        Spinner spinner_fnsafety4_locat = (Spinner) findViewById(R.id.spinner_fnsafety4_1);
        Spinner spinner_fnsafety4_Type  = (Spinner) findViewById(R.id.spinner_fnsafety4_2);
        Spinner spinner_fnsafety4_generality_fire  = (Spinner) findViewById(R.id.spinner_fnsafety4_3);
        ImageView im_back_arrowfn4 = (ImageView) findViewById(R.id.im_back_arrowfn4);
        Button btn_save_fb4 = (Button) findViewById(R.id.btn_save_fb4);

        im_back_arrowfn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_4.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });


        btn_save_fb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_4.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        final String[] locationFn4 = getResources().getStringArray(R.array.Location_fire_exit);
        ArrayAdapter<String> adapterlocatfn4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locationFn4);
        spinner_fnsafety4_locat.setAdapter(adapterlocatfn4);
        spinner_fnsafety4_locat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        final String[] Type_fireexitFn4 = getResources().getStringArray(R.array.Type_fire_exit);
        ArrayAdapter<String> adapterTypefn4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Type_fireexitFn4);
        spinner_fnsafety4_Type.setAdapter(adapterTypefn4);

        final String[] generalityfn4 = getResources().getStringArray(R.array.generality_fire_exit);
        ArrayAdapter<String> adaptergeneralityfn4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generalityfn4);
        spinner_fnsafety4_generality_fire.setAdapter(adaptergeneralityfn4);



        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn4);
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
