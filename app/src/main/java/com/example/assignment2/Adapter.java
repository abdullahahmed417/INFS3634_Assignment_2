package com.example.assignment2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.RestaurantViewHolder> {
    private ArrayList<Restaurants> mDataset;
    private OnNoteListener mOnNoteListener;

    public Adapter(ArrayList<Restaurants> myDataset, OnNoteListener onNoteListener) {
        this.mDataset = myDataset;
        this.mOnNoteListener = onNoteListener;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        RestaurantViewHolder restaurantViewHolder = new RestaurantViewHolder(view, mOnNoteListener);
        return restaurantViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurants currentRestaurant = mDataset.get(position);
        holder.textView.setText(currentRestaurant.getRestaurantName());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView textView;
        OnNoteListener onNoteListener;

        public RestaurantViewHolder(@NonNull View itemView, OnNoteListener onNoteListener) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(this);
            this.onNoteListener = onNoteListener;
        }

        @Override
        public void onClick(View v) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }

    public interface OnNoteListener {
        void onNoteClick(int position);
    }
}
