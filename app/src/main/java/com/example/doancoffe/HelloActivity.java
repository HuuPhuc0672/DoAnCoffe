package com.example.doancoffe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class HelloActivity extends AppCompatActivity {
    private ConstraintLayout constraintChyen;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        constraintChyen = (ConstraintLayout) findViewById(R.id.constraint_chyen);
        Handler  handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                constraintChyen.setVisibility(View.GONE);
                Intent intent=new Intent(HelloActivity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },3680);
    }
}