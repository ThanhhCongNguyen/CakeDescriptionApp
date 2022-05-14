package com.example.cakedescriptionapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CakeAdapter extends RecyclerView.Adapter<CakeAdapter.CakeViewHolder> {
    ArrayList<Cake> cakeArrayList;

    public CakeAdapter(ArrayList<Cake> cakeArrayList) {
        this.cakeArrayList = cakeArrayList;
    }

    @NonNull
    @Override
    public CakeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cake_item, parent, false);
        return new CakeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CakeViewHolder holder, int position) {
        Cake cake = cakeArrayList.get(position);
        holder.tittle.setText(cake.getCakeTittle());
        holder.description.setText(cake.getCakeDescription());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra(MainActivity.IMAGE_KEY, cake.getCakeImage());
                intent.putExtra(MainActivity.TITTLE_KEY, cake.getCakeTittle());
                intent.putExtra(MainActivity.DESCRIPTION_KEY, cake.getCakeDescription());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return cakeArrayList.size();
    }

    class CakeViewHolder extends RecyclerView.ViewHolder{
        TextView tittle, description;
        CardView cardView;
        public CakeViewHolder(@NonNull View itemView) {
            super(itemView);
            tittle = itemView.findViewById(R.id.tittle_text);
            description = itemView.findViewById(R.id.description_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
