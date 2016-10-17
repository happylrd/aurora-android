package com.happylrd.aurora.ui.dialog;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.happylrd.aurora.R;
import com.happylrd.aurora.adapter.TabAdapter;
import com.happylrd.aurora.ui.fragment.CircleUnitFragment;

import me.relex.circleindicator.CircleIndicator;

public class RotationTabDialog extends DialogFragment {

    private ViewPager viewPager;
    private CircleIndicator circleIndicator;

    private RecyclerView mRecyclerView;
    private ColorAdapter mColorAdapter;

    private Button btn_ok;

    public static RotationTabDialog newInstance() {
        RotationTabDialog rotationTabDialog = new RotationTabDialog();
        return rotationTabDialog;
    }

    public RotationTabDialog() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_tab, container);

        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        circleIndicator = (CircleIndicator)
                view.findViewById(R.id.circle_indicator);

        TabAdapter adapter = new TabAdapter(getChildFragmentManager());

        adapter.addFragment(CircleUnitFragment.newInstance(Color.YELLOW), "1");
        adapter.addFragment(CircleUnitFragment.newInstance(Color.RED), "2");
        adapter.addFragment(CircleUnitFragment.newInstance(Color.CYAN), "3");
        adapter.addFragment(CircleUnitFragment.newInstance(Color.GREEN), "4");
        adapter.addFragment(CircleUnitFragment.newInstance(Color.MAGENTA), "5");

        viewPager.setAdapter(adapter);
        circleIndicator.setViewPager(viewPager);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 8));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mColorAdapter = new ColorAdapter();
        mRecyclerView.setAdapter(mColorAdapter);

        btn_ok = (Button) view.findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return view;
    }

    private class ColorHolder extends RecyclerView.ViewHolder {

        public ColorHolder(View itemView) {
            super(itemView);

        }

        public void bindColor() {

        }
    }

    private class ColorAdapter extends RecyclerView.Adapter<ColorHolder> {

        private static final int LENGTH = 3;

        @Override
        public ColorHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            View view = inflater
                    .inflate(R.layout.item_color_circle, parent, false);
            return new ColorHolder(view);
        }

        @Override
        public void onBindViewHolder(ColorHolder holder, int position) {
        }

        @Override
        public int getItemCount() {
            return LENGTH;
        }
    }
}
