package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;

import java.text.SimpleDateFormat;

public class FnSafety_5 extends AppCompatActivity {
    DatePickerDialog datePickerDialog;
    int year;
    int month;
    int dayOfMonth;
    Calendar calendar;
    String date;
    TextView tvCalendarTextFn5;
    ImageView imCalendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fn_safety_5);

        imCalendar = findViewById(R.id.imCalendar);
        tvCalendarTextFn5 = findViewById(R.id.tvCalendarTextFn5);
        tvCalendarTextFn5.setText(date);
        ImageView imCalendar = (ImageView) findViewById(R.id.imCalendar);
        ImageView im_back_arrowfn5 = (ImageView) findViewById(R.id.im_back_arrowfn5);
        Button btn_save_fb5 = (Button) findViewById(R.id.btn_save_fb5);
        Spinner spinner_fn5locat = (Spinner) findViewById(R.id.spinner_fnsafety5_2);
        Spinner spinner_fn5_deviceType = (Spinner) findViewById(R.id.spinner_fnsafety5_3);
        Spinner spinner_id_devicefn5 = (Spinner) findViewById(R.id.spinner_fnsafety5_1);
        Spinner generalityFire_Fn5_1 = (Spinner) findViewById(R.id.spinner_fnsafety5_4);
        Spinner generalityFire_Fn5_2 = (Spinner) findViewById(R.id.spinner_fnsafety5_5);
        Spinner generalityFire_Fn5_3 = (Spinner) findViewById(R.id.spinner_fnsafety5_6);
        Spinner generalityFire_Fn5_4 = (Spinner) findViewById(R.id.spinner_fnsafety5_7);
        Spinner generalityFire_Fn5_5 = (Spinner) findViewById(R.id.spinner_fnsafety5_8);
        Spinner generalityFire_Fn5_6 = (Spinner) findViewById(R.id.spinner_fnsafety5_9);


        date = getIntent().getStringExtra("date");
        Log.e("date", "onCreate: "+date);


        imCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(FnSafety_5.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                                tvCalendarTextFn5.setText(day + "/" + (month + 1) + "/" + year);
                            }
                        }, year, month, dayOfMonth);
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
                datePickerDialog.show();
            }
        });

        im_back_arrowfn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_5.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });


        btn_save_fb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FnSafety_5.this,Fn_Safety.class);
                startActivity(intent);
                finish();
            }
        });

        final String[] locationFn5 = getResources().getStringArray(R.array.locationFire_cabinetfn5);
        ArrayAdapter<String> adapterlocatfn5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,locationFn5);
        spinner_fn5locat.setAdapter(adapterlocatfn5);
        spinner_fn5locat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        final String[] deviceType_Fire_Fn5 = getResources().getStringArray(R.array.deviceType_Fire_cabinetFn5);
        ArrayAdapter<String> adapterTypefn5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,deviceType_Fire_Fn5);
        spinner_fn5_deviceType.setAdapter(adapterTypefn5);

        final String[] id_devicefire_Fn5 = getResources().getStringArray(R.array.id_devicefire_cabinetfn5);
        ArrayAdapter<String> adapterid_devicefirefn5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,id_devicefire_Fn5);
        spinner_id_devicefn5.setAdapter(adapterid_devicefirefn5);

        final String[] generality_Fn5_1 = getResources().getStringArray(R.array.generalityFire_cabinetfn5);
        ArrayAdapter<String> adapterid_generalityfn5_1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_Fn5_1);
        generalityFire_Fn5_1.setAdapter(adapterid_generalityfn5_1);

        final String[] generality_Fn5_2 = getResources().getStringArray(R.array.generalityFire_cabinetfn5);
        ArrayAdapter<String> adapterid_generalityfn5_2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_Fn5_2);
        generalityFire_Fn5_2.setAdapter(adapterid_generalityfn5_2);

        final String[] generality_Fn5_3 = getResources().getStringArray(R.array.generalityFire_cabinetfn5);
        ArrayAdapter<String> adapterid_generalityfn5_3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_Fn5_3);
        generalityFire_Fn5_3.setAdapter(adapterid_generalityfn5_3);

        final String[] generality_Fn5_4 = getResources().getStringArray(R.array.generalityFire_cabinetfn5);
        ArrayAdapter<String> adapterid_generalityfn5_4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_Fn5_4);
        generalityFire_Fn5_4.setAdapter(adapterid_generalityfn5_4);

        final String[] generality_Fn5_5 = getResources().getStringArray(R.array.generalityFire_cabinetfn5);
        ArrayAdapter<String> adapterid_generalityfn5_5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_Fn5_5);
        generalityFire_Fn5_5.setAdapter(adapterid_generalityfn5_5);

        final String[] generality_Fn5_6 = getResources().getStringArray(R.array.generalityFire_cabinetfn5);
        ArrayAdapter<String> adapterid_generalityfn5_6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,generality_Fn5_6);
        generalityFire_Fn5_6.setAdapter(adapterid_generalityfn5_6);


        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    while (!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.datefn5);
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
