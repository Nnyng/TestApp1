package com.example.testapp1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

public class Fn_Safety extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fn_safety);

        ImageView im_back_arrow = (ImageView)findViewById(R.id.im_back_arrow);
        RelativeLayout safety1 = (RelativeLayout)findViewById(R.id.safety1);
        RelativeLayout safety2 = (RelativeLayout)findViewById(R.id.safety2);
        RelativeLayout safety3 = (RelativeLayout)findViewById(R.id.safety3);
        RelativeLayout safety4 = (RelativeLayout)findViewById(R.id.safety4);
        RelativeLayout safety5 = (RelativeLayout)findViewById(R.id.safety5);
        RelativeLayout safety6 = (RelativeLayout)findViewById(R.id.safety6);
        RelativeLayout safety7 = (RelativeLayout)findViewById(R.id.safety7);
        RelativeLayout safety8 = (RelativeLayout)findViewById(R.id.safety8);
        RelativeLayout safety9 = (RelativeLayout)findViewById(R.id.safety9);
        RelativeLayout safety10 = (RelativeLayout)findViewById(R.id.safety10);
        RelativeLayout safety11 = (RelativeLayout)findViewById(R.id.safety11);
        RelativeLayout safety12 = (RelativeLayout)findViewById(R.id.safety12);


        im_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this, Main_Menu.class);
                startActivity(intent);
                finish();
            }
        });

        safety1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this,FnSafety_1.class);
                startActivity(intent);
            }
        });

        safety2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this,Fn_Safety_2.class);
                startActivity(intent);
            }
        });

        safety3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this,FnSafety_3.class);
                startActivity(intent);
            }
        });

        safety4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this,FnSafety_4.class);
                startActivity(intent);
            }
        });

        safety5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this,FnSafety_5.class);
                startActivity(intent);
            }
        });

        safety6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this,FnSafety_6.class);
                startActivity(intent);
            }
        });

        safety7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this,FnSafety_7.class);
                startActivity(intent);
            }
        });

        safety8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this,FnSafety_8.class);
                startActivity(intent);
            }
        });

        safety9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this,FnSafety_9.class);
                startActivity(intent);
            }
        });

        safety10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this,FnSafety_10.class);
                startActivity(intent);
            }
        });

        safety11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this,Safety_11.class);
                startActivity(intent);
            }
        });

        safety12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fn_Safety.this,FnSafety_12.class);
                startActivity(intent);
            }
        });

    }
}
