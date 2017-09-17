package com.example.ivic.parking;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class IntroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        ActionBar actionBar = getActionBar();
        actionBar.hide();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        }, 2000);
    }
}
