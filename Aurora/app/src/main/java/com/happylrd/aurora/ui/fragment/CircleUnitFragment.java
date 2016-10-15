package com.happylrd.aurora.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.pavlospt.CircleView;
import com.happylrd.aurora.R;

public class CircleUnitFragment extends Fragment {

    private CircleView cv_item_circle;

    public static CircleUnitFragment newInstance() {
        CircleUnitFragment circleUnitFragment = new CircleUnitFragment();
        return circleUnitFragment;
    }

    public CircleUnitFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_circle_unit, container, false);

        initView(view);
        initListener();

        return view;
    }

    private void initView(View view) {
        cv_item_circle = (CircleView) view.findViewById(R.id.cv_item_circle);
    }

    private void initListener() {
        cv_item_circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
