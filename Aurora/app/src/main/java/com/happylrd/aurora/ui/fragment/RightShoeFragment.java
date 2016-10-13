package com.happylrd.aurora.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.happylrd.aurora.R;
import com.happylrd.aurora.ui.view.ShoeView;

public class RightShoeFragment extends Fragment {
    private ShoeView mShoeView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.fragment_right_shoe, container, false);

        mShoeView = (ShoeView) view.findViewById(R.id.right_shoe);
        return view;
    }
}
