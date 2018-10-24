package edu.temple.coloractivity;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        final Intent receivedIntent = getIntent();

        String color = receivedIntent.getStringExtra("message");

        final ConstraintLayout canvasConstraint = (ConstraintLayout) findViewById(R.id.canvasConstraint);

        canvasConstraint.setBackgroundColor(Color.parseColor(color));
    }
}
