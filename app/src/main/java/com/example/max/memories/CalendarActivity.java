package com.example.max.memories;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CalendarView;

/**
 * Created by Max on 4/6/2560.
 */

public class CalendarActivity extends AppCompatActivity{

    private static final String TAG = "CalendarActivity";
    private CalendarView mCalendarView;

    @Override
    protected  void onCreate(@Nullable Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.calendar_layout);
        mCalendarView = (CalendarView) findViewById(R.id.calendarView);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = dayOfMonth + "/" + (month + 1) + "/" + year;
                Log.d(TAG, "onSelectedDayChange: d/m/yyyy: " + date);

                Intent intent = new Intent(CalendarActivity.this, MainActivity.class);
                intent.putExtra("date", date);
                startActivity(intent);
            }
        });
    }
}
