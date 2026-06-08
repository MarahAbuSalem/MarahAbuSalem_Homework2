package com.example.homework02;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRelative = findViewById(R.id.btnOpenRelative);
        Button btnConstraint = findViewById(R.id.btnOpenConstraint);

        btnRelative.setOnClickListener(v ->
                startActivity(new Intent(this, ProfileRelativeActivity.class))
        );

        btnConstraint.setOnClickListener(v ->
                startActivity(new Intent(this, ProfileConstraintActivity.class))
        );
    }
}