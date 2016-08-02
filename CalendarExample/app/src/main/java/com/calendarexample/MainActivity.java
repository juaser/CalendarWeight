package com.calendarexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.plugin.calendarweight.KCalendarPop;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new KCalendarPop(MainActivity.this, btn, new KCalendarPop.onCompleteListener() {
                    @Override
                    public void complete(String date) {

                    }
                });
            }
        });
    }
}
