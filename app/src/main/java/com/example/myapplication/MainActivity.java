package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private int counter = 0;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("AAAA", "onCreate");
        btn = findViewById(R.id.button);
        btn.setOnClickListener(view -> {
            counter++;
            tv.setText(Integer.toString(counter));
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outstate) {
        super.onSaveInstanceState(outstate);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAAA", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAAA", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAAA", "onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAAA", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAAA", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAAA", "onPause");
    }
}