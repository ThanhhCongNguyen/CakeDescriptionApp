package com.example.cakedescriptionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView tittleText, descriptionText;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tittleText = findViewById(R.id.tittle_text);
        descriptionText = findViewById(R.id.des_text);
        imageView = findViewById(R.id.cake_image);

        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra(MainActivity.IMAGE_KEY, R.drawable.coffee_cake));
        tittleText.setText(intent.getStringExtra(MainActivity.TITTLE_KEY));
        descriptionText.setText(intent.getStringExtra(MainActivity.DESCRIPTION_KEY));
    }
}