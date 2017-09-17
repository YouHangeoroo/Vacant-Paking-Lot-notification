package com.example.ivic.parking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void openVac(View target){
        Intent intent = new Intent(getApplicationContext(), OpenFlor.class);
        startActivity(intent);
    }

}
