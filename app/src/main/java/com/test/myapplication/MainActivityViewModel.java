package com.test.myapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int number = 0;
    public MutableLiveData<Integer> liveData = new MutableLiveData<>(0);
    public LiveData<Integer> liveDataInteger = liveData;
    public String getName(){
        return "Mushegh";
    }

    public String getLastName(){
        return "Sahakyan";
    }

    public void increment(){
        number++;
        liveData.setValue(number);
    }
}
