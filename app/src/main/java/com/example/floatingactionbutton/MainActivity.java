package com.example.floatingactionbutton;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.btnFab);

        floatingActionButton.setOnClickListener(v -> Toast.makeText(
                        MainActivity.this,
                        "You have clicked Floating Action Button",
                        Toast.LENGTH_SHORT)
                .show());
    }
}