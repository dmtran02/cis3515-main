package edu.temple.coloractivity;


import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PaletteFragment extends Fragment {

    ColorListener select;


    public PaletteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.frag_palette, container, false);
        Context context = getActivity();
        Resources res = context.getResources();
        String[] gridLabels = res.getStringArray(R.array.colors_array);
        String[] gridLabels2 = res.getStringArray(R.array.colors_array2);

        final GridView gridView = (GridView) v.findViewById(R.id.gridView);

        CustomAdapter adapter = new CustomAdapter(context, gridLabels, gridLabels2);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*String s = parent.getItemAtPosition(position).toString();
                select.setColor(s);*/
                select.setColor(parent.getItemAtPosition(position).toString());
            }
        });
        return v;
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof ColorListener){
            select = (ColorListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }
}
