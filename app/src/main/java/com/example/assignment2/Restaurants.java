package com.example.assignment2;

import java.util.ArrayList;

public class Restaurants {
    private String restaurantName;
    private String cuisineType;
    private String restaurantLocation;
    private double rating;
    private String price;
    private String images;

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Restaurants() {
    }

    public Restaurants(String restaurantName, String cuisineType, String restaurantLocation, double rating, String price, String images) {
        this.restaurantName = restaurantName;
        this.cuisineType = cuisineType;
        this.restaurantLocation = restaurantLocation;
        this.rating = rating;
        this.price = price;
        this.images = images;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public static ArrayList<Restaurants> getRestaurants() {
        ArrayList<Restaurants> restC = new ArrayList<>();
        restC.add(new Restaurants("Number 16", "Family Style", "Campbelltown", 4.5, "$$$","7"));
        restC.add(new Restaurants("Milton Steakhouse", "Casual Dining", "Lakemba", 3.5, "$$","2"));
        restC.add(new Restaurants("Cail Bruich", "Family Style", "Kellyville", 4.5, "$$$","3"));
        restC.add(new Restaurants("Aye the Haggis", "Family Style", "Mascot", 2.5, "$","4"));
        restC.add(new Restaurants("Italiano", "Fast Casual", "Kensington", 4, "$$","4"));
        restC.add(new Restaurants("Pizza?", "Fast Casual", "Auburn", 3.5, "$","6"));
        restC.add(new Restaurants("I'm not having it", "Fast Food", "Randwick", 3, "$$","7"));
        restC.add(new Restaurants("Nessie by Loch Ness", "Buffet", "Leppington", 1.5, "$$","8"));
        restC.add(new Restaurants("RiverHill Courtyard", "Family Style", "Bankstown", 2, "$$$","9"));
        restC.add(new Restaurants("Breakfast: the most important meal of the day", "Buffet", "Wentworthville", 1.5, "$$$","10"));
        restC.add(new Restaurants("Where's my kebab?", "Fast Food", "Eastlakes", 2.5, "$$","3"));
        restC.add(new Restaurants("Aye Brekkie", "Buffet", "Pagewood", 3, "$", "3"));

        return restC;
    }
}

