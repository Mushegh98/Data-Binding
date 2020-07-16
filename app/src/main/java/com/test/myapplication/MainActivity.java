package com.test.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.test.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        //Binding static Texts
//        binding.setName("Mushegh");
//        binding.setLastName("Sahakyan");

        //Binding viewmodel
        binding.setViewmodel(new ViewModelProvider(this).get(MainActivityViewModel.class));
        binding.setLifecycleOwner(this);
    }
}