package com.example.newfyp.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.newfyp.Common.LoginPage.ClientSignUp;
import com.example.newfyp.Common.LoginPage.Info2;
import com.example.newfyp.R;

public class OwnerInfo extends AppCompatActivity {
    ImageView one, two, three;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_info);
        one =findViewById(R.id.bublik);
        two =findViewById(R.id.chicken);
        three =findViewById(R.id.center);
    }

    public void info1(View V){
        Intent i = new Intent(OwnerInfo.this, Info1.class);
        startActivity(i);
        //finish();
    }
    public void info2(View V){
        Intent i = new Intent(OwnerInfo.this, Info2.class);
        startActivity(i);
        //finish();
    }
    public void info3(View V){
        Intent i = new Intent(OwnerInfo.this, Info3.class);
        startActivity(i);
        //finish();
    }




}