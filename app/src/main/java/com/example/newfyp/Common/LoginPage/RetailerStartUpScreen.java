package com.example.newfyp.Common.LoginPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.example.newfyp.R;

public class RetailerStartUpScreen extends AppCompatActivity {

    private static int SPLASH_TIMER = 5000;
    Button logg;
    Button signn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer_start_up_screen);

        logg = (Button)findViewById(R.id.retLog);
        signn = (Button)findViewById(R.id.retSign);

        logg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RetailerStartUpScreen.this, LogIn.class);
                startActivity(i);
                finish();
            }
        });

        signn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RetailerStartUpScreen.this, SignUp.class);
                startActivity(i);
                finish();
            }
        });

    }



}