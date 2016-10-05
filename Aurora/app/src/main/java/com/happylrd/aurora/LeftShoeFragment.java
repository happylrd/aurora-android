package com.happylrd.aurora;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.happylrd.aurora.view.ShoeView;

public class LeftShoeFragment extends Fragment {

    private ShoeView mLeftShoe;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.fragment_left_shoe, container, false);

        mLeftShoe = (ShoeView) view.findViewById(R.id.left_shoe);
        return view;
    }

    public void setColor(int color) {
        mLeftShoe.setTempColor(color);
    }

    public String[] getLC() {
        return mLeftShoe.getLC();
    }
}
