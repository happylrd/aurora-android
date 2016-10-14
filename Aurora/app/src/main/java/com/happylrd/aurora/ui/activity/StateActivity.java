package com.happylrd.aurora.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.happylrd.aurora.R;

public class StateActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    private RecyclerView mRecyclerView;
    private CircleAdapter mCircleAdapter;

    private ImageView iv_current_state;
    private ImageView iv_pre_state;

    public static Intent newIntent(Context packageContext) {
        Intent intent = new Intent(packageContext, StateActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        initView();
        initListener();
    }

    private void initView() {
        iv_current_state = (ImageView) findViewById(R.id.iv_current_state);
        iv_pre_state = (ImageView) findViewById(R.id.iv_pre_state);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("状态选择");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(StateActivity.this, 2));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mCircleAdapter = new CircleAdapter();
        mRecyclerView.setAdapter(mCircleAdapter);
    }

    private void initListener() {
        iv_current_state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = ShoesActivity.newIntent(StateActivity.this);
                startActivity(intent);
            }
        });

        iv_pre_state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = ShoesActivity.newIntent(StateActivity.this);
                startActivity(intent);
            }
        });
    }

    private class CircleHolder extends RecyclerView.ViewHolder {

        private ImageView iv_item_circle;

        public CircleHolder(View itemView) {
            super(itemView);

            iv_item_circle = (ImageView) itemView.findViewById(R.id.iv_item_circle);
            iv_item_circle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = ShoesActivity.newIntent(StateActivity.this);
                    startActivity(intent);
                }
            });
        }

        public void bindCircle() {

        }
    }

    private class CircleAdapter extends RecyclerView.Adapter<CircleHolder> {

        private static final int LENGTH = 100;

        @Override
        public CircleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(StateActivity.this);
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
