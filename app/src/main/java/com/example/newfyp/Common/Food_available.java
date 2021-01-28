package com.example.newfyp.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.newfyp.R;

public class Food_available extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_available);
    }
    public void pastry(View v){
        Intent i = new Intent(Food_available.this, Meal.class);
        startActivity(i);
        //finish();
    }

    public void meal(View v){
        Intent i = new Intent(Food_available.this, Pastry.class);
        startActivity(i);
        //finish();
    }
    public void fruits(View v){
        Intent i = new Intent(Food_available.this, Fruits.class);
        startActivity(i);
        //finish();
    }
    public void grocery(View v){
        Intent i = new Intent(Food_available.this, Grocery.class);
        startActivity(i);
        //finish();
    }
}