package com.example.tap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int count = 0;

    public void addCount(View view){
        TextView txtCount = findViewById(R.id.txtCount);
        count += 1;
        txtCount.setText(Integer.toString(count));
    }

    public void reset(View view){
        TextView txtCount = findViewById(R.id.txtCount);
        count = 0;
        txtCount.setText(Integer.toString(0));
    }
}