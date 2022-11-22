package com.abit.binding_homework4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.abit.binding_homework4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new Continents()).addToBackStack(null).commit();
        }
    }
}