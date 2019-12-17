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

public class Safety_11_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.safety_11_4);

        ImageView im_back_arrowfn11_4 = (ImageView) findViewById(R.id.im_back_arrowfn11_4);
        Button btn_save_fb11_4 = (Button) findViewById(R.id.btn_save_fb11_4);
        Spinner spinner_numTreater_eMonths = (Spinner) findViewById(R.id.spinner_fnsafety11_4_0);
        Spinner spinner_zoneTreater_eMonths = (Spinner) findViewById(R.id.spinner_fnsafety11_4_1);
        Spinner spinner_locatTreater_eMonths = (Spinner) findViewById(R.id.spinner_fnsafety11_4_2);
        Spinner spinner_generalityTreater_eMonths = (Spinner) findViewById(R.id.spinner_fnsafety11_4_3);

        im_back_arrowfn11_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Safety_11_4.this,Safety_11.class);
                startActivity(intent);
                finish();
            }
        });

        btn_save_fb11_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Safety_11_4.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        String[] numTreater11_4 = getResources().getStringArray(R.array.no_Auto_Smoke_eMonths);
        ArrayAdapter<String> adapter_numTreater11_4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,numTreater11_4);
        spinner_numTreater_eMonths.setAdapter(adapter_numTreater11_4);

        String[] zoneTreater11_4 = getResources().getStringArray(R.array.Zone_Auto_Treater_eMonths);
        ArrayAdapter<String> adapter_zoneTreater11_4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,zoneTreater11_4);
        spinner_zoneTreater_eMonths.setAdapter(adapter_zoneTreater11_4);

        String[] locatTreater11_4 = getResources().getStringArray(R.array.locat_Auto_Treater_eMonths);
        ArrayAdapter<String> adapter_locatTreater11_4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locatTreater11_4);
        spinner_locatTreater_eMonths.setAdapter(adapter_locatTreater11_4);

        String[] generalityTreater11_4 = getResources().getStringArray(R.array.generality_auto_Treater_eMonths);
        ArrayAdapter<String> adapter_generalityTreater11_4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generalityTreater11_4);
        spinner_generalityTreater_eMonths.setAdapter(adapter_generalityTreater11_4);

        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn11_4);
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
