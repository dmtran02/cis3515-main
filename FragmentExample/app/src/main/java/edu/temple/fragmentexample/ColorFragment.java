package edu.temple.fragmentexample;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    public static String COLOR_KEY = "color";

    int color;

    /*
    Leave the basic constructor untouched
    */
    public ColorFragment() {
        // Required empty public constructor
    }

    Context context; // no purpose as of right now

    /*
    Added Oct 9, 2018
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Bundle bundle = getArguments();

        this.color = bundle.getInt(COLOR_KEY);
    }

    public static ColorFragment newInstance(int color){
        ColorFragment colorFragment = new ColorFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ColorFragment.COLOR_KEY, color);
        colorFragment.setArguments(bundle);
        return colorFragment;
    }

    /*
    --------------------------------------------------------
     */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Button button;

        final View v = inflater.inflate(R.layout.fragment_color, container, false);

        button = v.findViewById(R.id.change_color_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.setBackgroundColor((new Random()).nextInt() % 2 == 0 ? Color.RED : Color.GREEN);
            }
        });

        v.setBackgroundColor(color);

        //v.setBackgroundColor((new Random()).nextInt() % 2 == 0 ? Color.RED : Color.GREEN);

        v.setBackgroundColor(color);

        return v;
    }

}
