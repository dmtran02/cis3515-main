package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String colorArray[];

    public CustomAdapter(Context context, String[] colorArray){
        this.context = context;
        this.colorArray = colorArray;
    }

    @Override
    public int getCount() {
        return colorArray.length;
    }

    @Override
    public Object getItem(int position) {
        return colorArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView colorGrid = new TextView(context);
        colorGrid.setText(colorArray[position]);
        colorGrid.setBackgroundColor(Color.parseColor(colorArray[position]));

        return colorGrid;

    }
}
