package com.github.brijoe.androidinterview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast();
    }

    private void showToast() {
        Toast.makeText(getApplicationContext(), "测试", Toast.LENGTH_SHORT).show();
    }
}