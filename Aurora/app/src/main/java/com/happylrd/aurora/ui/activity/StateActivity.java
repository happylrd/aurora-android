package com.happylrd.aurora.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.pavlospt.CircleView;
import com.happylrd.aurora.R;

public class StateActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    private RecyclerView mRecyclerView;
    private CircleAdapter mCircleAdapter;

    private CircleView cv_current_state;
    private CircleView cv_pre_state;

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
        cv_current_state = (CircleView) findViewById(R.id.cv_current_state);
        cv_pre_state = (CircleView) findViewById(R.id.cv_pre_state);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("状态选择");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(StateActivity.this));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mCircleAdapter = new CircleAdapter();
        mRecyclerView.setAdapter(mCircleAdapter);
    }

    private void initListener() {
        cv_current_state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = ShoesActivity.newIntent(StateActivity.this);
                startActivity(intent);
            }
        });

        cv_pre_state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = ShoesActivity.newIntent(StateActivity.this);
                startActivity(intent);
            }
        });
    }

    private class CircleHolder extends RecyclerView.ViewHolder {

        private CircleView cv_item_light;
        private CircleView cv_item_sound;

        private Button btn_toe;
        private Button btn_heel;
        private Button btn_stomp;
        private Button btn_kick_low;
        private Button btn_kick_mid;
        private Button btn_kick_high;

        public CircleHolder(View itemView) {
            super(itemView);

            cv_item_light = (CircleView) itemView.findViewById(R.id.cv_item_light);
            cv_item_sound = (CircleView) itemView.findViewById(R.id.cv_item_sound);

            btn_toe = (Button) itemView.findViewById(R.id.btn_toe);
            btn_heel = (Button) itemView.findViewById(R.id.btn_heel);
            btn_stomp = (Button) itemView.findViewById(R.id.btn_stomp);
            btn_kick_low = (Button) itemView.findViewById(R.id.btn_kick_low);
            btn_kick_mid = (Button) itemView.findViewById(R.id.btn_kick_mid);
            btn_kick_high = (Button) itemView.findViewById(R.id.btn_kick_high);

            cv_item_light.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = ShoesActivity.newIntent(StateActivity.this);
                    startActivity(intent);
                }
            });

            cv_item_sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = ShoesActivity.newIntent(StateActivity.this);
                    startActivity(intent);
                }
            });

            btn_toe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btn_toe.getBackground().setColorFilter(
                            getResources().getColor(R.color.colorAccent),
                            PorterDuff.Mode.MULTIPLY);
                }
            });

            btn_heel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btn_heel.getBackground().setColorFilter(
                            getResources().getColor(R.color.colorAccent),
                            PorterDuff.Mode.MULTIPLY);
                }
            });

            btn_stomp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btn_stomp.getBackground().setColorFilter(
                            getResources().getColor(R.color.colorAccent),
                            PorterDuff.Mode.MULTIPLY);
                }
            });

            btn_kick_low.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btn_kick_low.getBackground().setColorFilter(
                            getResources().getColor(R.color.colorAccent),
                            PorterDuff.Mode.MULTIPLY);
                }
            });

            btn_kick_mid.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btn_kick_mid.getBackground().setColorFilter(
                            getResources().getColor(R.color.colorAccent),
                            PorterDuff.Mode.MULTIPLY);
                }
            });

            btn_kick_high.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btn_kick_high.getBackground().setColorFilter(
                            getResources().getColor(R.color.colorAccent),
                            PorterDuff.Mode.MULTIPLY);
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
                    .inflate(R.layout.item_state_circle, parent, false);
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
