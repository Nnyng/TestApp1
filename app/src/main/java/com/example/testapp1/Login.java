package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        LinearLayout linearLayout_textLogin = (LinearLayout)findViewById(R.id.linearLayout_textLogin);
        LinearLayout linearLayout_textQrLogin= (LinearLayout)findViewById(R.id.linearLayout_textQrLogin);

        linearLayout_textLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Login_User.class);
                startActivity(intent);
            }
        });

        linearLayout_textQrLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Main_QrCode.class);
                startActivity(intent);
            }
        });

   }

}
