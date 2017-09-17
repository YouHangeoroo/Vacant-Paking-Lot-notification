package com.example.ivic.parking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class OpenFlor extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flor);
    }

    public void B1(View target){
        Intent intent = new Intent(getApplicationContext(), OpenVac.class);
        startActivity(intent);
    }
}

