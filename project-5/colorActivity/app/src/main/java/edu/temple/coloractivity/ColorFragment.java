package edu.temple.coloractivity;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    public static String COLOR_KEY = "color";

    int color;

    public ColorFragment() {
        // Required empty public constructor
    }

    Context context;

    @Override
    public void onCreate(@Nullable Bundle savedInstancesState){
        super.onCreate(savedInstancesState);

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_color, container, false);

        v.setBackgroundColor(color);

        return v;
    }

}
