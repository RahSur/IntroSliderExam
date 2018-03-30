package com.example.ngoctri.introsliderexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class slider_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_7);
    }

    public void washmac(View view) {
        Toast.makeText(getApplicationContext(),"sucess",Toast.LENGTH_SHORT).show();

    }
}
