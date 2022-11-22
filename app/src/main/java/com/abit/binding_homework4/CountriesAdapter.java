package com.abit.binding_homework4;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abit.binding_homework4.databinding.ItemCountriesBinding;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.ViewHolder> {
    private ArrayList<CountryValues> CountryList;

    public CountriesAdapter(ArrayList<CountryValues> countryList) {
        this.CountryList = countryList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemCountriesBinding.inflate
                (LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(CountryList.get(position));
    }

    @Override
    public int getItemCount() {
        return CountryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private  ItemCountriesBinding binding;
        public ViewHolder(ItemCountriesBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
        public void bind(CountryValues country){
            binding.tvCountry.setText(country.getName());
            Glide.with(binding.imFlag).load(country.getFlag()).into(binding.imFlag);


        }
    }
}
