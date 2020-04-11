package com.example.scambialayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout lay1, lay2;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lay1= findViewById(R.id.lay1);
        lay2= findViewById(R.id.lay2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        lay1.setVisibility(View.VISIBLE);
        lay2.setVisibility(View.GONE);
    }

        boolean scambia = true;

    public void change(View view) {
        if (scambia==true){
            lay1.setVisibility(View.GONE);
            lay2.setVisibility(View.VISIBLE);
            scambia = false;
        } else {
            lay1.setVisibility(View.VISIBLE);
            lay2.setVisibility(View.GONE);
            scambia = true;
        }
    }
}
