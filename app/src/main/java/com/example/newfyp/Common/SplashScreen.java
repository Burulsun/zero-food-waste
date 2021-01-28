package com.example.newfyp.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.app.admin.DevicePolicyManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newfyp.Common.LoginPage.RetailerStartUpScreen;
import com.example.newfyp.R;
import com.example.newfyp.User.UseDashboard;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIMER = 10000;

    ImageView backgroundImage;
    ImageView logoImage;
    TextView  bottomText;
    TextView logoText;


    //Animation
    Animation sideAnim, bottomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        //Hooks

        logoImage= findViewById(R.id.logo_image);
        bottomText =findViewById(R.id.bottom_text);
        logoText = findViewById(R.id.logo_text);

        //Animations
        sideAnim = AnimationUtils.loadAnimation(this,R.anim.side_anim);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        //set Animations on elements

        logoImage.setAnimation(sideAnim);
        logoText.setAnimation(sideAnim);
        bottomText.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this, Choice.class);
                startActivity(intent);
                finish();


            }
        },SPLASH_TIMER);


    }

}