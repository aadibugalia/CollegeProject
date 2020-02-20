package com.aditya.collegeproject.ui.tipsntaxes;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aditya.collegeproject.R;

public class TipsTaxesFragment extends Fragment {

    private TipsTaxesViewModel mViewModel;

    public static TipsTaxesFragment newInstance() {
        return new TipsTaxesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tips_taxes_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TipsTaxesViewModel.class);
        // TODO: Use the ViewModel
    }

}
