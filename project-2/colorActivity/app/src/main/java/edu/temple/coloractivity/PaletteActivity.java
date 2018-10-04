package edu.temple.coloractivity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        final View colorView = findViewById(R.id.paletteView);

        String colors[] = {"White", "Red", "Yellow", "Green", "Blue", "Magenta"};

        CustomAdapter colorAdapter = new CustomAdapter(this, colors);

        Spinner colorSpinner = (Spinner) findViewById(R.id.spinnerColor);

        colorSpinner.setAdapter(colorAdapter);

        AdapterView.OnItemSelectedListener colorOISL = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                colorView.setBackgroundColor(Color.parseColor(((TextView)view).getText().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        colorSpinner.setOnItemSelectedListener(colorOISL);

    }
}
