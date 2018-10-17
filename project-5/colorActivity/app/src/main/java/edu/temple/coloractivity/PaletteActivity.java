package edu.temple.coloractivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
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

        //final View colorView = findViewById(R.id.paletteView);
        final GridView gridColor;
        final String colorLabels[];

        final CanvasFragment canvasFragment = CanvasFragment.newInstance(Color.WHITE);

        Resources res = getResources();
        colorLabels = res.getStringArray(R.array.colors_array);


        final String white = res.getString(R.string.colorWhite);
        final String red = res.getString(R.string.colorRed);
        final String yellow = res.getString(R.string.colorYellow);
        final String green = res.getString(R.string.colorGreen);
        final String blue = res.getString(R.string.colorBlue);
        final String magenta = res.getString(R.string.colorMagenta);
        final String black = res.getString(R.string.colorBlack);

        String colorLabel[] = {white, red, yellow, green, blue, magenta, black};
        final String colorList[] = {"WHITE", "RED", "YELLOW", "GREEN", "BLUE", "MAGENTA", "BLACK"};


        //String[] colors = {"White", "Red", "Yellow", "Green", "Blue", "Magenta"};

        CustomAdapter colorAdapter = new CustomAdapter(this, colorLabel, colorList);

        //Spinner colorSpinner = (Spinner) findViewById(R.id.spinnerColor);

        //colorSpinner.setAdapter(colorAdapter);

        gridColor = (GridView) findViewById(R.id.gridLayout);
        gridColor.setAdapter(colorAdapter);

        final FragmentManager fm = getSupportFragmentManager();

        gridColor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(PaletteActivity.this, colorLabels[position], Toast.LENGTH_SHORT).show();
                String colorSet = colorList[position];

                fm.beginTransaction()
                        .replace(R.id.container_1, canvasFragment.newInstance(Color.parseColor(colorList[position])))
                        .addToBackStack(null)
                        .commit();
            }
        });

        AdapterView.OnItemSelectedListener colorOISL = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Resources resources = getResources();
                String[] color = resources.getStringArray(R.array.colors_array);
                String colorSet = colorList[position];
                fm.beginTransaction()
                        .replace(R.id.container_1, canvasFragment.newInstance(Color.parseColor(colorList[position])))
                        .addToBackStack(null)
                        .commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        gridColor.setOnItemSelectedListener(colorOISL);

    }
}
