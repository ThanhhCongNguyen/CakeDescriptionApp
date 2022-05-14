package com.example.cakedescriptionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    CakeAdapter cakeAdapter;
    ArrayList<Cake> cakeArrayList;
    public static final String IMAGE_KEY = "image";
    public static final String TITTLE_KEY = "title";
    public static final String DESCRIPTION_KEY = "description";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        cakeArrayList = new ArrayList<>();

        cakeArrayList.add(new Cake(R.drawable.coffee_cake, getString(R.string.coffee_cake), getString(R.string.coffee_cake_des)));
        cakeArrayList.add(new Cake(R.drawable.banana_cake, getString(R.string.banana_cake), getString(R.string.banana_cake_des)));
        cakeArrayList.add(new Cake(R.drawable.funfetti_cake, getString(R.string.funfettti_cake), getString(R.string.funfettti_cake_des)));
        cakeArrayList.add(new Cake(R.drawable.pineapple_upside_down_cake, getString(R.string.pineapple), getString(R.string.pineapple_des)));
        cakeArrayList.add(new Cake(R.drawable.lemon_cake, getString(R.string.lemon_cake), getString(R.string.lemon_cake_des)));
        cakeArrayList.add(new Cake(R.drawable.black_forest_cake, getString(R.string.black_forest_cake), getString(R.string.black_forest_cake_des)));
        cakeArrayList.add(new Cake(R.drawable.cheesecake, getString(R.string.cheese_cake), getString(R.string.cheese_cake_des)));

        cakeAdapter = new CakeAdapter(cakeArrayList);
        recyclerView.setAdapter(cakeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}