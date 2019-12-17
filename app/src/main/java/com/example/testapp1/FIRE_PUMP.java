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

import javax.crypto.AEADBadTagException;

public class FIRE_PUMP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fire_pump);

        ImageView im_back_arrow_FirePump = (ImageView) findViewById(R.id.im_back_arrow_FirePump);
        Spinner fn12_Firepump_ฺBattery1 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_ฺBattery1);
        Spinner fn12_Firepump_ฺBattery2 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_ฺBattery2);
        Spinner fn12_Firepump_Battery3 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_Battery3);
        Spinner fn12_Firepump_Battery4 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_Battery4);
        Spinner fn12_Firepump_Motor1 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_Motor1);
        Spinner fn12_Firepump_Motor2 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_Motor2);
        Spinner fn12_Firepump_Motor3 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_Motor3);
        Spinner fn12_Firepump_Motor4 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_Motor4);
        Spinner fn12_Firepump_Motor5 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_Motor5);
        Spinner fn12_Firepump_Water1 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_Water1);
        Spinner fn12_Firepump_Water2 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_Water2);
        Spinner fn12_Firepump_Water3 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_Water3);
        Spinner fn12_Firepump_Electronic_Control1 =  (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_Electronic_Control1);
        Spinner fn12_Firepump_Electronic_Control2 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_Electronic_Control2);
        Spinner fn12_Firepump_ฺTestWork1 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_ฺTestWork1);
        Spinner fn12_Firepump_TestWork2 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork2);
        Spinner fn12_Firepump_TestWork3 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork3);
        Spinner fn12_Firepump_TestWork4 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork4);
        Spinner fn12_Firepump_TestWork5 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork5);
        Spinner fn12_Firepump_TestWork6 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork6);
        Spinner fn12_Firepump_TestWork7 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork7);
        Spinner fn12_Firepump_TestWork8 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork8);
        Spinner fn12_Firepump_TestWork9 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork9);
        Spinner fn12_Firepump_TestWork10 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork10);
        Spinner fn12_Firepump_TestWork11 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork11);
        Spinner fn12_Firepump_TestWork12 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork12);
        Spinner fn12_Firepump_TestWork13 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork13);
        Spinner fn12_Firepump_TestWork14 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_TestWork14);
        Spinner fn12_Firepump_RoomFirePump1 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_RoomFirePump1);
        Spinner fn12_Firepump_RoomFirePump2 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_RoomFirePump2);
        Spinner fn12_Firepump_RoomFirePump3 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_RoomFirePump3);
        Spinner fn12_Firepump_RoomFirePump4 = (Spinner) findViewById(R.id.spinner_fnsafety12_Firepump_RoomFirePump4);
        Button btn_save_firepump = (Button) findViewById(R.id.btn_save_firepump);

        im_back_arrow_FirePump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FIRE_PUMP.this,FnSafety_12.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_firepump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FIRE_PUMP.this,FnSafety_12.class);
                startActivity(intent);
            }
        });

        String[] Firepump_ฺBattery1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_ฺBattery1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_ฺBattery1);
        fn12_Firepump_ฺBattery1.setAdapter(adapter_Firepump_ฺBattery1);


        String[] Firepump_ฺBattery2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_ฺBattery2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_ฺBattery2);
        fn12_Firepump_ฺBattery2.setAdapter(adapter_Firepump_ฺBattery2);


        String[] Firepump_Battery3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_Battery3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_Battery3);
        fn12_Firepump_Battery3.setAdapter(adapter_Firepump_Battery3);


        String[]  Firepump_Battery4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_Battery4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_Battery4);
        fn12_Firepump_Battery4.setAdapter(adapter_Firepump_Battery4);


        String[] Firepump_Motor1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_Motor1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_Motor1);
        fn12_Firepump_Motor1.setAdapter(adapter_Firepump_Motor1);


        String[] Firepump_Motor2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_Motor2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_Motor2);
        fn12_Firepump_Motor2.setAdapter(adapter_Firepump_Motor2);

        String[] Firepump_Motor3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_Motor3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_Motor3);
        fn12_Firepump_Motor3.setAdapter(adapter_Firepump_Motor3);

        String[] Firepump_Motor4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_Motor4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_Motor4);
        fn12_Firepump_Motor4.setAdapter(adapter_Firepump_Motor4);

        String[] Firepump_Motor5 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_Motor5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_Motor5);
        fn12_Firepump_Motor5.setAdapter(adapter_Firepump_Motor5);

        String[] Firepump_Water1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_Water1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_Water1);
        fn12_Firepump_Water1.setAdapter(adapter_Firepump_Water1);

        String[] Firepump_Water2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_Water2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_Water2);
        fn12_Firepump_Water2.setAdapter(adapter_Firepump_Water2);

        String[] Firepump_Water3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_Water3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_Water3);
        fn12_Firepump_Water3.setAdapter(adapter_Firepump_Water3);

        String[] Firepump_Electronic_Control1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_Electronic_Control1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_Electronic_Control1);
        fn12_Firepump_Electronic_Control1.setAdapter(adapter_Firepump_Electronic_Control1);


        String[]  Firepump_Electronic_Control2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_Electronic_Control2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_Electronic_Control2);
        fn12_Firepump_Electronic_Control2.setAdapter(adapter_Firepump_Electronic_Control2);


        String[]  Firepump_TestWork1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork1);
        fn12_Firepump_ฺTestWork1.setAdapter(adapter_Firepump_TestWork1);


        String[] Firepump_TestWork2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork2);
        fn12_Firepump_TestWork2.setAdapter(adapter_Firepump_TestWork2);


        String[] Firepump_TestWork3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork3);
        fn12_Firepump_TestWork3.setAdapter(adapter_Firepump_TestWork3);


        String[] Firepump_TestWork4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork4);
        fn12_Firepump_TestWork4.setAdapter(adapter_Firepump_TestWork4);


        String[] Firepump_TestWork5 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork5);
        fn12_Firepump_TestWork5.setAdapter(adapter_Firepump_TestWork5);

        String[] Firepump_TestWork6 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork6);
        fn12_Firepump_TestWork6.setAdapter(adapter_Firepump_TestWork6);

        String[] Firepump_TestWork7 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork7 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork7);
        fn12_Firepump_TestWork7.setAdapter(adapter_Firepump_TestWork7);

        String[] Firepump_TestWork8 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork8 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork8);
        fn12_Firepump_TestWork8.setAdapter(adapter_Firepump_TestWork8);

        String[] Firepump_TestWork9 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork9 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork9);
        fn12_Firepump_TestWork9.setAdapter(adapter_Firepump_TestWork9);


        String[] Firepump_TestWork10 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork10 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork10);
        fn12_Firepump_TestWork10.setAdapter(adapter_Firepump_TestWork10);

        String[] Firepump_TestWork11 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork11 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork11);
        fn12_Firepump_TestWork11.setAdapter(adapter_Firepump_TestWork11);


        String[] Firepump_TestWork12 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork12 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork12);
        fn12_Firepump_TestWork12.setAdapter(adapter_Firepump_TestWork12);


        String[] Firepump_TestWork13 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork13 = new ArrayAdapter<String >(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork13);
        fn12_Firepump_TestWork13.setAdapter(adapter_Firepump_TestWork13);


        String[] Firepump_TestWork14 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_TestWork14 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_TestWork14);
        fn12_Firepump_TestWork14.setAdapter(adapter_Firepump_TestWork14);


        String[] Firepump_RoomFirePump1 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_RoomFirePump1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_RoomFirePump1);
        fn12_Firepump_RoomFirePump1.setAdapter(adapter_Firepump_RoomFirePump1);


        String[] Firepump_RoomFirePump2 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_RoomFirePump2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_RoomFirePump2);
        fn12_Firepump_RoomFirePump2.setAdapter(adapter_Firepump_RoomFirePump2);


        String[] Firepump_RoomFirePump3 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_RoomFirePump3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_RoomFirePump3);
        fn12_Firepump_RoomFirePump3.setAdapter(adapter_Firepump_RoomFirePump3);

        String[] Firepump_RoomFirepump4 = getResources().getStringArray(R.array.choice_Fn12);
        ArrayAdapter<String> adapter_Firepump_RoomfirePump4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Firepump_RoomFirepump4);
        fn12_Firepump_RoomFirePump4.setAdapter(adapter_Firepump_RoomfirePump4);


        btn_save_firepump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FIRE_PUMP.this,FnSafety_12.class);
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
                                TextView tdate = (TextView) findViewById(R.id.datefn12_FirePump);
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
