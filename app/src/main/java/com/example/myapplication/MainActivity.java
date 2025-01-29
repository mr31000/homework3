package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void go(View view) {
        Button btn = findViewById(R.id.btn);
        final int[] count = {0};

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count[0]++;
                if (count[0] > 6) {
                    btn.setText("Enough to click. Go to new start!");
                    count[0] = 0;
                } else {
                    btn.setText("This is a click number: " + count[0]);
                }
            }


        });
    }

    }