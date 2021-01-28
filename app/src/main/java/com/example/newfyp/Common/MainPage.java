package com.example.newfyp.Common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.newfyp.Common.LoginPage.ClientSignUp;
import com.example.newfyp.R;

public class MainPage extends AppCompatActivity {

    //Toolbar toolbar = findViewById(R.id.toolbar);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        TextView av =findViewById(R.id.available_block);
        TextView ow =findViewById(R.id.information_block);
        TextView my_c =findViewById(R.id.my_cart_block);


//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("KOD Dev");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void available(View v){
        Intent i = new Intent(MainPage.this, Food_available.class);
        startActivity(i);
        //finish();
    }


    public void ownerInfo(View v){
        Intent i = new Intent(MainPage.this, OwnerInfo.class);
        startActivity(i);
        //finish();
    }


    public void my_cart(View v){
        Intent i = new Intent(MainPage.this, Food_profile.class);
        startActivity(i);
        //finish();
    }

}