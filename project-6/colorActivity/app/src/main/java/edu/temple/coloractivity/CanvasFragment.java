package edu.temple.coloractivity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class CanvasFragment extends Fragment {

    public CanvasFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_canvas, container, false);
    }

    /*
    public static String COLOR_KEY = "color";
    int color;
    View v;

    public CanvasFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();

        this.color = bundle.getInt(COLOR_KEY);
    }

    public static CanvasFragment newInstance(int color){
        CanvasFragment canvasFragment = new CanvasFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(CanvasFragment.COLOR_KEY, color);
        canvasFragment.setArguments(bundle);
        return canvasFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_canvas, container, false);
        v.setBackgroundColor(color);
        return v;
    }*/

}
