package com.example.homework02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ── للشاشة الأولى (RelativeLayout) ──
        setContentView(R.layout.activity_main);

        // ── للشاشة الثانية (ConstraintLayout) ──
        // علّق السطر أعلاه وفعّل هذا السطر بدلاً منه:
//         setContentView(R.layout.activity_profile_constraint);
    }
}