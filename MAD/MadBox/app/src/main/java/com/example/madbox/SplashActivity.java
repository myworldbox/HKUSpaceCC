package com.example.madbox;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends BaseActivity {

    int splashTime = 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        HideNav();

        //start timer and take action after timer ends
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //move to next activity
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        }, splashTime);
    }
}
