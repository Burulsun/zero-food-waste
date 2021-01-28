package com.example.newfyp.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.newfyp.Common.LoginPage.ClientSignUp;
import com.example.newfyp.Common.LoginPage.SignUp;
import com.example.newfyp.R;

public class Choice extends AppCompatActivity {


    Button ownerChoice;
    Button clientChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        ownerChoice = (Button)findViewById(R.id.ownerChoice);
        clientChoice = (Button)findViewById(R.id.clientChoice);

        ownerChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Choice.this, SignUp.class);
                startActivity(i);
                //finish();


            }
        });
        clientChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Choice.this, ClientSignUp.class);
                startActivity(i);
                //finish();


            }
        });

    }
}