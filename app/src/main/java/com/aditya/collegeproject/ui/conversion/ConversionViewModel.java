package com.aditya.collegeproject.ui.conversion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConversionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ConversionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Currency Conversion fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}