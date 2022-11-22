package com.abit.binding_homework4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abit.binding_homework4.databinding.FragmentContinentsBinding;
import com.abit.binding_homework4.databinding.FragmentFgCountriesBinding;

import java.util.ArrayList;

public class Countries extends Fragment {
    private CountriesAdapter adapter;
    private FragmentFgCountriesBinding binding;
    private ArrayList<CountryValues> CountryList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFgCountriesBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments()!=null){
            String countryName = getArguments().getString("name");
            //Нап:Country country = (Country) getArguments().getSerializable("key");
            // насильно заставляет стать сериалайзбл
            switch (countryName) {
                case "Europa":
                    loadData1();
                    break;
                case "Asia":
                    loadData2();
                    break;
                case "Africa":
                    loadData3();
                    break;
                case "America":
                    loadData4();
                    break;
            }
        }
        adapter = new CountriesAdapter(CountryList);



        binding.recyclerViewCountries.setAdapter(adapter);
    }

    private void loadData1() {

        CountryList.add(new CountryValues("asan", "https://www.flagistrany.ru/data/flags/ultra/de.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Flag_of_the_United_Kingdom_%283-5%29.svg/250px-Flag_of_the_United_Kingdom_%283-5%29.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_France_%281794%E2%80%931815%2C_1830%E2%80%931974%2C_2020%E2%80%93present%29.svg/250px-Flag_of_France_%281794%E2%80%931815%2C_1830%E2%80%931974%2C_2020%E2%80%93present%29.svg.png"));
        CountryList.add(new CountryValues("asan", "https://flagof.ru/wp-content/uploads/2018/10/2000px-Flag_of_Italy.svg_.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Flag_of_Poland.svg/250px-Flag_of_Poland.svg.png"));CountryList.add(new CountryValues("asan", "https://www.flagistrany.ru/data/flags/ultra/de.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Flag_of_the_United_Kingdom_%283-5%29.svg/250px-Flag_of_the_United_Kingdom_%283-5%29.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_France_%281794%E2%80%931815%2C_1830%E2%80%931974%2C_2020%E2%80%93present%29.svg/250px-Flag_of_France_%281794%E2%80%931815%2C_1830%E2%80%931974%2C_2020%E2%80%93present%29.svg.png"));
        CountryList.add(new CountryValues("asan", "https://flagof.ru/wp-content/uploads/2018/10/2000px-Flag_of_Italy.svg_.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Flag_of_Poland.svg/250px-Flag_of_Poland.svg.png"));CountryList.add(new CountryValues("asan", "https://www.flagistrany.ru/data/flags/ultra/de.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Flag_of_the_United_Kingdom_%283-5%29.svg/250px-Flag_of_the_United_Kingdom_%283-5%29.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_France_%281794%E2%80%931815%2C_1830%E2%80%931974%2C_2020%E2%80%93present%29.svg/250px-Flag_of_France_%281794%E2%80%931815%2C_1830%E2%80%931974%2C_2020%E2%80%93present%29.svg.png"));
        CountryList.add(new CountryValues("asan", "https://flagof.ru/wp-content/uploads/2018/10/2000px-Flag_of_Italy.svg_.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Flag_of_Poland.svg/250px-Flag_of_Poland.svg.png"));
    }

    private void loadData2() {
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/250px-Flag_of_Kyrgyzstan.svg.png"));
        CountryList.add(new CountryValues("asan", "https://ekd.me/wp-content/uploads/2020/06/800px-Flag_of_the_Peoples_Republic_of_China.svg_.jpg"));
        CountryList.add(new CountryValues("asan", "https://flagof.ru/wp-content/uploads/2018/10/yaponii-flag.png"));
        CountryList.add(new CountryValues("asan", "https://indianochka.ru/wp-content/uploads/2013/11/india-flag-870x400.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/250px-Flag_of_Vietnam.svg.png"));
       CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/250px-Flag_of_Kyrgyzstan.svg.png"));
        CountryList.add(new CountryValues("asan", "https://ekd.me/wp-content/uploads/2020/06/800px-Flag_of_the_Peoples_Republic_of_China.svg_.jpg"));
        CountryList.add(new CountryValues("asan", "https://flagof.ru/wp-content/uploads/2018/10/yaponii-flag.png"));
        CountryList.add(new CountryValues("asan", "https://indianochka.ru/wp-content/uploads/2013/11/india-flag-870x400.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/250px-Flag_of_Vietnam.svg.png"));
       CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/250px-Flag_of_Kyrgyzstan.svg.png"));
        CountryList.add(new CountryValues("asan", "https://ekd.me/wp-content/uploads/2020/06/800px-Flag_of_the_Peoples_Republic_of_China.svg_.jpg"));
        CountryList.add(new CountryValues("asan", "https://flagof.ru/wp-content/uploads/2018/10/yaponii-flag.png"));
        CountryList.add(new CountryValues("asan", "https://indianochka.ru/wp-content/uploads/2013/11/india-flag-870x400.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/250px-Flag_of_Vietnam.svg.png"));
    }

    private void loadData3() {
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Flag_of_Nigeria.svg/250px-Flag_of_Nigeria.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Flag_of_Sudan.svg/1200px-Flag_of_Sudan.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/500px-Flag_of_Morocco.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Kenya.svg/1280px-Flag_of_Kenya.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Flag_of_Ghana.svg/500px-Flag_of_Ghana.svg.png"));
    CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Flag_of_Nigeria.svg/250px-Flag_of_Nigeria.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Flag_of_Sudan.svg/1200px-Flag_of_Sudan.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/500px-Flag_of_Morocco.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Kenya.svg/1280px-Flag_of_Kenya.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Flag_of_Ghana.svg/500px-Flag_of_Ghana.svg.png"));
    CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Flag_of_Nigeria.svg/250px-Flag_of_Nigeria.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Flag_of_Sudan.svg/1200px-Flag_of_Sudan.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/500px-Flag_of_Morocco.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Kenya.svg/1280px-Flag_of_Kenya.svg.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Flag_of_Ghana.svg/500px-Flag_of_Ghana.svg.png"));
    }

    private void loadData4() {
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/250px-Flag_of_Canada_%28Pantone%29.svg.png"));
        CountryList.add(new CountryValues("asan", "https://flagshub.com/images/flag-of-brazil.png"));
        CountryList.add(new CountryValues("asan", "https://infoearth.ru/wp-content/uploads/2019/06/Flag_of_Argentina_1818.svg_-1024x640.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Civil_Flag_and_Ensign_of_Ecuador.svg/200px-Civil_Flag_and_Ensign_of_Ecuador.svg.png"));
        CountryList.add(new CountryValues("asan", "https://www.flagistrany.ru/data/flags/ultra/mx.png"));
    CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/250px-Flag_of_Canada_%28Pantone%29.svg.png"));
        CountryList.add(new CountryValues("asan", "https://flagshub.com/images/flag-of-brazil.png"));
        CountryList.add(new CountryValues("asan", "https://infoearth.ru/wp-content/uploads/2019/06/Flag_of_Argentina_1818.svg_-1024x640.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Civil_Flag_and_Ensign_of_Ecuador.svg/200px-Civil_Flag_and_Ensign_of_Ecuador.svg.png"));
        CountryList.add(new CountryValues("asan", "https://www.flagistrany.ru/data/flags/ultra/mx.png"));
    CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/250px-Flag_of_Canada_%28Pantone%29.svg.png"));
        CountryList.add(new CountryValues("asan", "https://flagshub.com/images/flag-of-brazil.png"));
        CountryList.add(new CountryValues("asan", "https://infoearth.ru/wp-content/uploads/2019/06/Flag_of_Argentina_1818.svg_-1024x640.png"));
        CountryList.add(new CountryValues("asan", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Civil_Flag_and_Ensign_of_Ecuador.svg/200px-Civil_Flag_and_Ensign_of_Ecuador.svg.png"));
        CountryList.add(new CountryValues("asan", "https://www.flagistrany.ru/data/flags/ultra/mx.png"));
    }
}