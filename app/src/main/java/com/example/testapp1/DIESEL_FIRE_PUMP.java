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

public class DIESEL_FIRE_PUMP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diesel__fire__pump);

        ImageView im_back_arrow_Diesel_FirePump = (ImageView) findViewById(R.id.im_back_arrow_Diesel_FirePump);
        Button btn_save_diesel_firepump = (Button) findViewById(R.id.btn_save_diesel_firepump);
        Spinner Firepump_Motor1 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Motor1);
        Spinner Firepump_Motor2 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Motor2);
        Spinner Firepump_Motor3 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Motor3);
        Spinner Firepump_Motor4 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Motor4);
        Spinner Firepump_Motor5 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Motor5);
        Spinner Firepump_Motor6 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Motor6);
        Spinner Firepump_jockey1 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_jockey1);
        Spinner Firepump_jockey2 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_jockey2);
        Spinner Firepump_jockey3 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_jockey3);
        Spinner Firepump_jockey4 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_jockey4);
        Spinner Firepump_jockey5 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_jockey5);
        Spinner Firepump_jockey6 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_jockey6);
        Spinner Firepump_Battery1 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_ฺBattery1);
        Spinner Firepump_Battery2 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_ฺBattery2);
        Spinner Firepump_Battery3 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Battery3);
        Spinner Firepump_Battery4 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Battery4);
        Spinner Firepump_Battery5 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Battery5);
        Spinner Firepump_Battery6 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Battery6);
        Spinner Firepump_Water1  = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Water1);
        Spinner Firepump_Water2 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Water2);
        Spinner Firepump_Water3 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Water3);
        Spinner Firepump_Water4 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Water4);
        Spinner Firepump_Control1 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Electronic_Control1);
        Spinner Firepump_Control2 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Electronic_Control2);
        Spinner Firepump_Control3 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Electronic_Control3);
        Spinner Firepump_Control4 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Electronic_Control4);
        Spinner Firepump_TestWork1 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_TestWork1);
        Spinner Firepump_TestWork2 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_TestWork2);
        Spinner Firepump_TestWork3 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_TestWork3);
        Spinner Firepump_TestWork4 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_TestWork4);
        Spinner Firepump_TestWork5 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_TestWork5);
        Spinner Firepump_Room_FirePump1 = (Spinner)  findViewById(R.id.spinner_fnsafety12_DieselFirepump_Room_FirePump1);
        Spinner Firepump_Room_FirePump2 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Room_FirePump2);
        Spinner Firepump_Room_FirePump3 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Room_FirePump3);
        Spinner Firepump_Room_FirePump4 = (Spinner) findViewById(R.id.spinner_fnsafety12_DieselFirepump_Room_FirePump4);


        im_back_arrow_Diesel_FirePump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DIESEL_FIRE_PUMP.this,FnSafety_12.class);
                startActivity(intent);
                finish();
            }
        });

       btn_save_diesel_firepump.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(DIESEL_FIRE_PUMP.this,FnSafety_12.class);
               startActivity(intent);
               finish();
           }
       });

       String[] Motor1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Motor1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Motor1);
        Firepump_Motor1.setAdapter(adapter_Motor1);


        String[] Motor2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Motor2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Motor2);
        Firepump_Motor2.setAdapter(adapter_Motor2);

        String[] Motor3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Motor3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Motor3);
        Firepump_Motor3.setAdapter(adapter_Motor3);

        String[] Motor4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Motor4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Motor4);
        Firepump_Motor4.setAdapter(adapter_Motor4);

        String[] Motor5 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Motor5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Motor5);
        Firepump_Motor5.setAdapter(adapter_Motor5);

        String[] Motor6 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Motor6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Motor6);
        Firepump_Motor6.setAdapter(adapter_Motor6);

        String[] jockey1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_jockey1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,jockey1);
        Firepump_jockey1.setAdapter(adapter_jockey1);

        String[] jockey2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_jockey2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,jockey2);
        Firepump_jockey2.setAdapter(adapter_jockey2);

        String[] jockey3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_jockey3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,jockey3);
        Firepump_jockey3.setAdapter(adapter_jockey3);

        String[] jockey4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_jockey4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,jockey4);
        Firepump_jockey4.setAdapter(adapter_jockey4);

        String[] jockey5 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_jockey5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,jockey5);
        Firepump_jockey5.setAdapter(adapter_jockey5);

        String[] jockey6 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_jockey6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,jockey6);
        Firepump_jockey6.setAdapter(adapter_jockey6);

        String[] Battery1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Battery1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Battery1);
        Firepump_Battery1.setAdapter(adapter_Battery1);

        String[] Battery2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Battery2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Battery2);
        Firepump_Battery2.setAdapter(adapter_Battery2);

        String[] Battery3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Battery3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Battery3);
        Firepump_Battery3.setAdapter(adapter_Battery3);

        String[] Battery4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Battery4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Battery4);
        Firepump_Battery4.setAdapter(adapter_Battery4);

        String[] Battery5 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Battery5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Battery5);
        Firepump_Battery5.setAdapter(adapter_Battery5);

        String[] Battery6 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Battery6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Battery6);
        Firepump_Battery6.setAdapter(adapter_Battery6);

        String[] Water1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Water1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Water1);
        Firepump_Water1.setAdapter(adapter_Water1);

        String[] Water2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Water2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Water2);
        Firepump_Water2.setAdapter(adapter_Water2);

        String[] Water3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Water3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Water3);
        Firepump_Water3.setAdapter(adapter_Water3);

        String[] Water4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Water4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Water4);
        Firepump_Water4.setAdapter(adapter_Water4);

        String[] Control1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Control1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Control1);
        Firepump_Control1.setAdapter(adapter_Control1);

        String[] Control2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Control2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Control2);
        Firepump_Control2.setAdapter(adapter_Control2);

        String[] Control3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Control3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Control3);
        Firepump_Control3.setAdapter(adapter_Control3);

        String[] Control4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Control4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Control4);
        Firepump_Control4.setAdapter(adapter_Control4);

        String[] TestWork1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_TestWork1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,TestWork1);
        Firepump_TestWork1.setAdapter(adapter_TestWork1);

        String[] TestWork2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_TestWork2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,TestWork2);
        Firepump_TestWork2.setAdapter(adapter_TestWork2);

        String[] TestWork3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_TestWork3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,TestWork3);
        Firepump_TestWork3.setAdapter(adapter_TestWork3);

        String[] TestWork4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_TestWork4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,TestWork4);
        Firepump_TestWork4.setAdapter(adapter_TestWork4);

        String[] TestWork5 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_TestWork5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,TestWork5);
        Firepump_TestWork5.setAdapter(adapter_TestWork5);

        String[] Room_FirePump1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Room_FirePump1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Room_FirePump1);
        Firepump_Room_FirePump1.setAdapter(adapter_Room_FirePump1);

        String[] Room_FirePump2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Room_FirePump2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Room_FirePump2);
        Firepump_Room_FirePump2.setAdapter(adapter_Room_FirePump2);

        String[] Room_FirePump3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Room_FirePump3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Room_FirePump3);
        Firepump_Room_FirePump3.setAdapter(adapter_Room_FirePump3);


        String[] Room_FirePump4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Room_FirePump4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Room_FirePump4);
        Firepump_Room_FirePump4.setAdapter(adapter_Room_FirePump4);


        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn12_Dieselfirepump);
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
