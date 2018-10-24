package edu.temple.coloractivity;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PaletteActivity extends AppCompatActivity implements ColorListener{

    PaletteFragment pF;
    CanvasFragment cF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        pF = new PaletteFragment();
        cF = new CanvasFragment();


        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .add(R.id.pFragment, pF)
                .addToBackStack(null)
                .commit();


        if(findViewById(R.id.land) != null){
            FragmentManager fm2 = getSupportFragmentManager();
            fm2.beginTransaction()
                    .replace(R.id.cFragment, cF)
                    .commit();
        }

    }

    public void setColor(String color) {
        if(findViewById(R.id.portrait) != null){
            FragmentManager fm3 = getSupportFragmentManager();
            fm3.beginTransaction()
                    .replace(R.id.pFragment, pF)
                    .addToBackStack(null)
                    .commit();
            fm3.executePendingTransactions();
            findViewById(R.id.pFragment).setBackgroundColor(Color.parseColor(color));

        }else if(findViewById(R.id.land) != null){
            findViewById(R.id.cFragment).setBackgroundColor(Color.parseColor(color));
        }

    }
}



