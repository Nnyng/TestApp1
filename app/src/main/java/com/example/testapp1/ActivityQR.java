package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivityQR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);

        if (savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentFragmentQR, new QrFragment())
                    .commit();
        }
    }
}
