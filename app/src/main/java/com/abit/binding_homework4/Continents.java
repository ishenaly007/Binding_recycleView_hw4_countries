package com.abit.binding_homework4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.abit.binding_homework4.databinding.FragmentContinentsBinding;

import java.util.ArrayList;

public class Continents extends Fragment implements OnClickListener{
    private ContinentAdapter adapter;
    private FragmentContinentsBinding binding;
    private ArrayList<String> continentList= new ArrayList<>();
    ArrayList<CountryValues> CountryList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentsBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter= new ContinentAdapter(continentList, this);
        loadData();
        binding.recyclerView.setAdapter(adapter);

    }
    private void loadData() {
        continentList.clear();
        continentList.add("Europa");
        continentList.add("Asia");
        continentList.add("Africa");
        continentList.add("America");
    }

    @Override
    public void OnClick(int position) {
        String countryName = continentList.get(position);
        Bundle bundle=new Bundle();
        bundle.putString("name",countryName);//bundle.putSerializable(); отправка целого класса
                                             // и класс нужно будет имлементировать от сориалайзбл
        Fragment fragment=new Countries();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().
                beginTransaction().replace(R.id.container, fragment).addToBackStack(null).commit();
    }
}