package com.example.max.memories;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
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
    }
}
