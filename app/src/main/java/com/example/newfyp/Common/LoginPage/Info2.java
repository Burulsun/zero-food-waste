package com.example.newfyp.Common.LoginPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.newfyp.Common.Food_profile;
import com.example.newfyp.Common.Info3;
import com.example.newfyp.R;

public class Info2 extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info3);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Info2.this, Food_profile.class);
                startActivity(i);
                //finish();


            }
        });

    }
}