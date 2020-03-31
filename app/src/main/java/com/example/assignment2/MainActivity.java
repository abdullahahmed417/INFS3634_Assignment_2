package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Adapter.OnNoteListener {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    public static final String EXTRA_MESSAGE = "position of clicked item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Setting up recyclerView:
        ArrayList<Restaurants> restaurantsArrayList = Restaurants.getRestaurants();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new Adapter(restaurantsArrayList, this);
        recyclerView.setAdapter(mAdapter);
    }
//Passing position of clicked itemView to the DetailActivtiy through an intent:
    @Override
    public void onNoteClick(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, position);
        startActivity(intent);
    }
}
