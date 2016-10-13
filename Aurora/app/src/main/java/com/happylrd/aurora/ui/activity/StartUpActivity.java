package com.happylrd.aurora.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.happylrd.aurora.R;

import java.util.Timer;
import java.util.TimerTask;

public class StartUpActivity extends AppCompatActivity {
    private static final long JUMP_DELAY = 3000L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);

        jumpToLoginPageWithDelay(JUMP_DELAY);
    }

    private void jumpToLoginPageWithDelay(long delay) {
        final Intent intent = new Intent();
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                intent.setClass(StartUpActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        };
        timer.schedule(timerTask, delay);
    }
}
