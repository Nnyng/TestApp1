package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Main_QrCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_qr_code);

        if (savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentFragmentMain, new Main_FragmentQrCode())
                    .commit();
        }
    }
}
