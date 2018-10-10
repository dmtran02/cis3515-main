package edu.temple.coloractivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        /*
        Added Oct 10, 2018 / Project-5
         */

        //final ListView colorView = (ListView) findViewById(R.id.colorView);

        final GridView colorGrid = (GridView) findViewById(R.id.gridColor);
        //colorGrid.setAdapter(new ImageAdapter(this));

        Resources res = getResources();

        String[] colorArray = res.getStringArray(R.array.colorArray);

        CustomAdapter gridAdapter = new CustomAdapter(this, colorArray);

        Spinner colorSpinner = (Spinner) findViewById(R.id.spinnerColor);

        colorSpinner.setAdapter(gridAdapter);

        colorGrid.setAdapter(gridAdapter);

        ColorFragment colorFragment = ColorFragment.newInstance(Color.WHITE);

        FragmentManager fm = getSupportFragmentManager();

        fm.beginTransaction().replace(R.id.container, colorFragment.newInstance(Color.RED))
                .addToBackStack(null)
                .commit();

        //----------------------------

        /*

        final View colorView = findViewById(R.id.paletteView);

        String colors[] = {"White", "Red", "Yellow", "Green", "Blue", "Magenta"};

        CustomAdapter colorAdapter = new CustomAdapter(this, colorArray);

        Spinner colorSpinner = (Spinner) findViewById(R.id.spinnerColor);

        colorSpinner.setAdapter(colorAdapter);

        */

    /*
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

        */
    }
}
