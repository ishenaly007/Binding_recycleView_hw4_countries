package com.abit.binding_homework4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abit.binding_homework4.databinding.ItemContinentsBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ViewHolder> {
    private ArrayList<String> continentList;
    private OnClickListener onClickListener;

    public ContinentAdapter(ArrayList<String> continentList, OnClickListener onClickListener) {
        this.continentList = continentList;
        this.onClickListener = onClickListener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemContinentsBinding.inflate
                (LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(continentList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickListener.OnClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private ItemContinentsBinding binding;

        public ViewHolder(ItemContinentsBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
        public void bind(String continent){
            binding.tvContinent.setText(continent);
    }

    }
}
