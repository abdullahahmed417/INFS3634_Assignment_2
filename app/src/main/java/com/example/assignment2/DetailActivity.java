package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private Restaurants mDataSet;
    private TextView name;
    private TextView price;
    private TextView location;
    private TextView type;
    private RatingBar myRatings;
    private ImageView pic;
    private ImageView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
//Finding all of the views in the detailActivity by their IDs:
        name = findViewById(R.id.textView2);
        price = findViewById(R.id.textView4);
        type = findViewById(R.id.textView8);
        location = findViewById(R.id.textView9);
        this.myRatings = findViewById(R.id.ratingBar);
        pic = findViewById(R.id.imageView);
//        Restricting imageView to a particular size:
        pic.getLayoutParams().height = 400;
        pic.getLayoutParams().width = 400;
        search = findViewById(R.id.SearchIV);
//receiving intent from the mainActivity & then receiving all elements from that particular location in the restaurants arraylist
        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        mDataSet = Restaurants.getRestaurants().get(position);
        name.setText(mDataSet.getRestaurantName());
        price.setText(mDataSet.getPrice());
        type.setText(mDataSet.getCuisineType());
        location.setText(mDataSet.getRestaurantLocation());
//        RatingBar requires a float parameter:
        double d = mDataSet.getRating();
        float f = (float) d;
        myRatings.setRating(f);
        int res = getResources().getIdentifier("d" + mDataSet.getImages(), "drawable", "com.example.assignment2");
        pic.setImageResource(res);
//        Search icon for location:
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchLocation(mDataSet.getRestaurantLocation());
            }
        });


//        for upper left back button:
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
//Method to search location:
    private void searchLocation(String restaurantLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + restaurantLocation));
        startActivity(intent);
    }

//    for upper left back button:
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }
}
