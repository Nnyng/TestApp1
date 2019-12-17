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

public class PORTABLE_FIRE_PUMP extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portable_fire_pump);

        ImageView im_back_arrow_Portable_firePump = (ImageView) findViewById(R.id.im_back_arrow_Portable_firePump);
        Button btn_save_portable_firepump = (Button) findViewById(R.id.btn_save_portable_firepump);
        Spinner Portable_FirePump_Battrey1 = (Spinner) findViewById(R.id.spinner_fn12_Portable_FirePump_Battrey1);
        Spinner Portable_FirePump_Battrey2 = (Spinner) findViewById(R.id.spinner_fn12_Portable_FirePump_Battrey2);
        Spinner Portable_FirePump_Battrey3 = (Spinner) findViewById(R.id.spinner_fn12_Portable_FirePump_Battrey3);
        Spinner Portable_FirePump_Chargebattery1 = (Spinner) findViewById(R.id.spinner_fn12_Portable_FirePump_Chargebattery1);
        Spinner Portable_FirePump_Chargebattery2 = (Spinner) findViewById(R.id.spinner_fn12_Portable_FirePump_Chargebattery2);
        Spinner Portable_FirePump_Rope1 = (Spinner) findViewById(R.id.spinner_fn12_Portable_FirePump_Rope1);
        Spinner Portable_FirePump_Motor1 = (Spinner) findViewById(R.id.spinner_fn12_Portable_FirePump_Motor1);
        Spinner Portable_FirePump_Motor2 = (Spinner) findViewById(R.id.spinner_fn12_Portable_FirePump_Motor2);
        Spinner Portable_FirePump_Motor3 = (Spinner) findViewById(R.id.spinner_fn12_Portable_FirePump_Motor3);
        Spinner Portable_FirePump_Motor4 = (Spinner) findViewById(R.id.spinner_fn12_Portable_FirePump_Motor4);
        Spinner Portable_FirePump_Motor5 = (Spinner) findViewById(R.id.spinner_fn12_Portable_FirePump_Motor5);
        Spinner Portable_FirePump_TestWork1 = (Spinner) findViewById(R.id.spinner_fn12_Portable_FirePump_TestWork1);

        im_back_arrow_Portable_firePump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PORTABLE_FIRE_PUMP.this,FnSafety_12.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_portable_firepump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PORTABLE_FIRE_PUMP.this,FnSafety_12.class);
                startActivity(intent);
                finish();
            }
        });

        String[] Portable_Battrey1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Portable_Battrey1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Portable_Battrey1);
        Portable_FirePump_Battrey1.setAdapter(adapter_Portable_Battrey1);

        String[] Portable_Battrey2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Portable_Battery2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Portable_Battrey2);
        Portable_FirePump_Battrey2.setAdapter(adapter_Portable_Battery2);

        String[] Portable_Battery3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Portable_Battery3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Portable_Battery3);
        Portable_FirePump_Battrey3.setAdapter(adapter_Portable_Battery3);

        String[] Portable_Chargebattery1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Portable_Chargebattery1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Portable_Chargebattery1);
        Portable_FirePump_Chargebattery1.setAdapter(adapter_Portable_Chargebattery1);

        String[] Portable_Chargebattery2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Portable_Chargebattery2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Portable_Chargebattery2);
        Portable_FirePump_Chargebattery2.setAdapter(adapter_Portable_Chargebattery2);

        String[] Portable_Rope1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Portable_Rope1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Portable_Rope1);
        Portable_FirePump_Rope1.setAdapter(adapter_Portable_Rope1);

        String[] Portable_Motor1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Portable_Motor1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Portable_Motor1);
        Portable_FirePump_Motor1.setAdapter(adapter_Portable_Motor1);

        String[] Portable_Motor2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Portable_Motor2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Portable_Motor2);
        Portable_FirePump_Motor2.setAdapter(adapter_Portable_Motor2);

        String[] Portable_Motor3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Portable_Motor3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Portable_Motor3);
        Portable_FirePump_Motor3.setAdapter(adapter_Portable_Motor3);

        String[] Portable_Motor4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Portable_Motor4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Portable_Motor4);
        Portable_FirePump_Motor4.setAdapter(adapter_Portable_Motor4);

        String[] Portable_Motor5 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Portable_Motor5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Portable_Motor5);
        Portable_FirePump_Motor5.setAdapter(adapter_Portable_Motor5);

        String[] Portable_TestWork1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Portable_TestWork1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Portable_TestWork1);
        Portable_FirePump_TestWork1.setAdapter(adapter_Portable_TestWork1);


        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn12_PortableFirePump);
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
