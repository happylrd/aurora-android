package com.happylrd.aurora.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.pavlospt.CircleView;
import com.happylrd.aurora.R;

public class CircleSetFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private CircleAdapter mCircleAdapter;

    public static CircleSetFragment newInstance() {
        CircleSetFragment circleSetFragment = new CircleSetFragment();
        return circleSetFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_circle_set, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mCircleAdapter = new CircleAdapter();
        mRecyclerView.setAdapter(mCircleAdapter);

        return view;
    }

    private class CircleHolder extends RecyclerView.ViewHolder {

        private CircleView cv_item;
        private TextView tv_pattern_description;

        public CircleHolder(View itemView) {
            super(itemView);

            cv_item = (CircleView) itemView.findViewById(R.id.cv_item);
            tv_pattern_description = (TextView) itemView.findViewById(R.id.tv_pattern_description);

            cv_item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

        public void bindCircle() {

        }
    }

    private class CircleAdapter extends RecyclerView.Adapter<CircleHolder> {

        private static final int LENGTH = 18;

        @Override
        public CircleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            View view = inflater
                    .inflate(R.layout.item_circle, parent, false);
            return new CircleHolder(view);
        }

        @Override
        public void onBindViewHolder(CircleHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return LENGTH;
        }
    }
}
