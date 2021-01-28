//package com.example.newfyp.Common;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.viewpager2.widget.ViewPager2;
//
//import android.os.Bundle;
//import android.widget.LinearLayout;
//
//import com.example.newfyp.HelperClasses.SliderAdapter;
//import com.example.newfyp.R;
//
//public class Onboarding extends AppCompatActivity {
//    ViewPager2 viewPager2;
//    LinearLayout dots;
//
//    SliderAdapter sliderAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_onboarding);
//
//        viewPager2 = findViewById(R.id.slider);
//        dots = findViewById(R.id.dots);
//
//        //Call adapter
//
//        sliderAdapter =new SliderAdapter(this);
//
//        viewPager2.setAdapter(sliderAdapter);
//    }
//}