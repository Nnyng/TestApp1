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

public class PORTABLE_GENERATOR_SAKARI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portable_generator_sakari);

        ImageView im_back_arrow_fnPORTABLE_GENERATOR_SAKARI = (ImageView) findViewById(R.id.im_back_arrow_fnPORTABLE_GENERATOR_SAKARI);
        Spinner fnsafety12_GENERATOR_SAKARI_Motor1 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Motor1);
        Spinner fnsafety12_GENERATOR_SAKARI_Motor2 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Motor2);
        Spinner fnsafety12_GENERATOR_SAKARI_Motor3 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Motor3);
        Spinner fnsafety12_GENERATOR_SAKARI_Motor4 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Motor4);
        Spinner fnsafety12_GENERATOR_SAKARI_Motor5 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Motor5);
        Spinner fnsafety12_GENERATOR_SAKARI_PullRope1 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_PullRope1);
        Spinner fnsafety12_GENERATOR_SAKARI_Dynamo1 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Dynamo1);
        Spinner fnsafety12_GENERATOR_SAKARI_Dynamo2 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Dynamo2);
        Spinner fnsafety12_GENERATOR_SAKARI_Dynamo3 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Dynamo3);
        Spinner fnsafety12_GENERATOR_SAKARI_Dynamo4 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Dynamo4);
        Spinner fnsafety12_GENERATOR_SAKARI_Dynamo5 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Dynamo5);
        Spinner fnsafety12_GENERATOR_SAKARI_Dynamo6 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Dynamo6);
        Spinner fnsafety12_GENERATOR_SAKARI_Dynamo7 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Dynamo7);
        Spinner fnsafety12_GENERATOR_SAKARI_Dynamo8 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Dynamo8);
        Spinner fnsafety12_GENERATOR_SAKARI_Clean1 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_Clean1);
        Spinner fnsafety12_GENERATOR_SAKARI_TestWork1 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_TestWork1);
        Spinner fnsafety12_GENERATOR_SAKARI_TestWork2 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_TestWork2);
        Spinner fnsafety12_GENERATOR_SAKARI_TestWork3 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_TestWork3);
        Spinner fnsafety12_GENERATOR_SAKARI_TestWork4 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_TestWork4);
        Spinner fnsafety12_GENERATOR_SAKARI_TestWork5 = (Spinner) findViewById(R.id.spinner_fnsafety12_GENERATOR_SAKARI_TestWork5);
        Button  btn_save_generator_sakari = (Button) findViewById(R.id.btn_save_generator_sakari);


        im_back_arrow_fnPORTABLE_GENERATOR_SAKARI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PORTABLE_GENERATOR_SAKARI.this,FnSafety_12.class);
                startActivity(intent);
                finish();
            }
        });

        String[] GENERATOR_SAKARI_Motor1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Motor1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Motor1);
        fnsafety12_GENERATOR_SAKARI_Motor1.setAdapter(adapter_GENERATOR_SAKARI_Motor1);


        String[] GENERATOR_SAKARI_Motor2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Motor2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Motor2);
        fnsafety12_GENERATOR_SAKARI_Motor2.setAdapter(adapter_GENERATOR_SAKARI_Motor2);


        String[] GENERATOR_SAKARI_Motor3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Motor3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Motor3);
        fnsafety12_GENERATOR_SAKARI_Motor3.setAdapter(adapter_GENERATOR_SAKARI_Motor3);


        String[] GENERATOR_SAKARI_Motor4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Motor4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Motor4);
        fnsafety12_GENERATOR_SAKARI_Motor4.setAdapter(adapter_GENERATOR_SAKARI_Motor4);


        String[] GENERATOR_SAKARI_Motor5 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Motor5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Motor5);
        fnsafety12_GENERATOR_SAKARI_Motor5.setAdapter(adapter_GENERATOR_SAKARI_Motor5);


        String[] GENERATOR_SAKARI_PullRope1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_PullRope1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_PullRope1);
        fnsafety12_GENERATOR_SAKARI_PullRope1.setAdapter(adapter_GENERATOR_SAKARI_PullRope1);


        String[] GENERATOR_SAKARI_Dynamo1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Dynamo1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Dynamo1);
        fnsafety12_GENERATOR_SAKARI_Dynamo1.setAdapter(adapter_GENERATOR_SAKARI_Dynamo1);


        String[] GENERATOR_SAKARI_Dynamo2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Dynamo2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Dynamo2);
        fnsafety12_GENERATOR_SAKARI_Dynamo2.setAdapter(adapter_GENERATOR_SAKARI_Dynamo2);


        String[] GENERATOR_SAKARI_Dynamo3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Dynamo3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Dynamo3);
        fnsafety12_GENERATOR_SAKARI_Dynamo3.setAdapter(adapter_GENERATOR_SAKARI_Dynamo3);

        String[] GENERATOR_SAKARI_Dynamo4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Dynamo4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Dynamo4);
        fnsafety12_GENERATOR_SAKARI_Dynamo4.setAdapter(adapter_GENERATOR_SAKARI_Dynamo4);

        String[] GENERATOR_SAKARI_Dynamo5 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Dynamo5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Dynamo5);
        fnsafety12_GENERATOR_SAKARI_Dynamo5.setAdapter(adapter_GENERATOR_SAKARI_Dynamo5);

        String[]  GENERATOR_SAKARI_Dynamo6 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Dynamo6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Dynamo6);
        fnsafety12_GENERATOR_SAKARI_Dynamo6.setAdapter(adapter_GENERATOR_SAKARI_Dynamo6);

        String[] GENERATOR_SAKARI_Dynamo7 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Dynamo7 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Dynamo7);
        fnsafety12_GENERATOR_SAKARI_Dynamo7.setAdapter(adapter_GENERATOR_SAKARI_Dynamo7);

        String[] GENERATOR_SAKARI_Dynamo8 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Dynamo8 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Dynamo8);
        fnsafety12_GENERATOR_SAKARI_Dynamo8.setAdapter(adapter_GENERATOR_SAKARI_Dynamo8);

        String[] GENERATOR_SAKARI_Clean1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_Clean1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_Clean1);
        fnsafety12_GENERATOR_SAKARI_Clean1.setAdapter(adapter_GENERATOR_SAKARI_Clean1);

        String[] GENERATOR_SAKARI_TestWork1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_TestWork1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_TestWork1);
        fnsafety12_GENERATOR_SAKARI_TestWork1.setAdapter(adapter_GENERATOR_SAKARI_TestWork1);

        String[] GENERATOR_SAKARI_TestWork2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_TestWork2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_TestWork2);
        fnsafety12_GENERATOR_SAKARI_TestWork2.setAdapter(adapter_GENERATOR_SAKARI_TestWork2);

        String[] GENERATOR_SAKARI_TestWork3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_TestWork3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_TestWork3);
        fnsafety12_GENERATOR_SAKARI_TestWork3.setAdapter(adapter_GENERATOR_SAKARI_TestWork3);


        String[] GENERATOR_SAKARI_TestWork4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_TestWork4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_TestWork4);
        fnsafety12_GENERATOR_SAKARI_TestWork4.setAdapter(adapter_GENERATOR_SAKARI_TestWork4);


        String[] GENERATOR_SAKARI_TestWork5 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_GENERATOR_SAKARI_TestWork5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,GENERATOR_SAKARI_TestWork5);
        fnsafety12_GENERATOR_SAKARI_TestWork5.setAdapter(adapter_GENERATOR_SAKARI_TestWork5);


        btn_save_generator_sakari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PORTABLE_GENERATOR_SAKARI.this,FnSafety_12.class);
                startActivity(intent);
                finish();
            }
        });

        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn12_PORTABLE_GENERATOR_SAKARI);
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
