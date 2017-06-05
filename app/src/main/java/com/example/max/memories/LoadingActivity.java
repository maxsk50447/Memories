package com.example.max.memories;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Max on 4/6/2560.
 */

public class LoadingActivity extends AppCompatActivity{
    private Handler handler;
    private Runnable runnable;
    private long delayTime, time = 3000L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(LoadingActivity.this, MainActivity.class));
                finish();
            }
        };
    }

    @Override
    public void onResume() {
        super.onResume();
        handler.postDelayed(runnable, delayTime = time);
        time = System.currentTimeMillis();
    }

    @Override
    public void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
        time = delayTime - (System.currentTimeMillis() - time);
    }
}
