package edu.temple.fragmentexample;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Added Oct 9, 2018
         */
        ColorFragment colorFragment = ColorFragment.newInstance(Color.RED);
        /*
        ------------------------------------------------------
         */

        FragmentManager fm = getSupportFragmentManager();

        fm.beginTransaction()
                .replace(R.id.container_1, colorFragment.newInstance(Color.RED))
                .addToBackStack(null)
                .commit();

        fm.beginTransaction()
                .replace(R.id.container_2, ColorFragment.newInstance(Color.BLUE))
                .addToBackStack(null)
                .commit();
        /*
        fm.beginTransaction().add(R.id.container_2,
                new BlankFragment())
                .commit();
        */

        /*
        fm.beginTransaction().replace(R.id.container_2,
                ColorFragment.newInstance(Color.TRANSPARENT))
                .commit();
         */
    }
}
