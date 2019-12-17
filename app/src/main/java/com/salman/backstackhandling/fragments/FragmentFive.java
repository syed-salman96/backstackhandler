package com.salman.backstackhandling.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.salman.backstackhandling.R;

public class FragmentFive extends Fragment {
    public FragmentFive() {
        // Required empty public constructor
    }

    public static FragmentFive newInstance() {
        FragmentFive fragment = new FragmentFive();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_five, container, false);
    }

}
