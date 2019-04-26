package com.example.demo_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondScreen extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.fisherman_fishing);
    }
}
