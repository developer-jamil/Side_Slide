package com.jamillabltd.sideslide;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    TextView appName;
    Animation side_slide;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for animation
        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.appName);

            side_slide = AnimationUtils.loadAnimation(MainActivity.this, R.anim.side_slide);
            logo.setAnimation(side_slide);
            appName.setAnimation(side_slide);

            logo.setVisibility(View.VISIBLE);
            appName.setVisibility(View.VISIBLE);


    }
}