package com.aditya.collegeproject.ui.tipsntaxes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TipsTaxesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TipsTaxesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is shows tips and taxes");
    }

    public LiveData<String> getText() {
        return mText;
    }
}