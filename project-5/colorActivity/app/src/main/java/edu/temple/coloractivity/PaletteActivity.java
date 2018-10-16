package edu.temple.coloractivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        final View colorView = findViewById(R.id.paletteView);
        final GridView gridColor;
        final String colorLabels[];

        Resources res = getResources();
        colorLabels = res.getStringArray(R.array.colors_array);

        //String[] colors = {"White", "Red", "Yellow", "Green", "Blue", "Magenta"};

        CustomAdapter colorAdapter = new CustomAdapter(this, colorLabels);

        //Spinner colorSpinner = (Spinner) findViewById(R.id.spinnerColor);

        //colorSpinner.setAdapter(colorAdapter);

        gridColor = (GridView) findViewById(R.id.gridLayout);
        gridColor.setAdapter(colorAdapter);

        gridColor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(PaletteActivity.this, colorLabels[position], Toast.LENGTH_SHORT).show();
                colorView.setBackgroundColor(Color.parseColor(((TextView)view).getText().toString()));
            }
        });

        AdapterView.OnItemSelectedListener colorOISL = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                colorView.setBackgroundColor(Color.parseColor(((TextView)view).getText().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        gridColor.setOnItemSelectedListener(colorOISL);

    }
}
