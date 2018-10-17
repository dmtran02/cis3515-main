package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String colors[];
    String colorTable[];

    public CustomAdapter(Context context, String[] colors, String[] colorList){
        this.context = context;
        this.colors = colors;
        this.colorTable = colorList;

    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView colorView = new TextView(context);
        colorView.setText(colors[position]);
        colorView.setBackgroundColor(Color.parseColor(colorTable[position]));

        return colorView;

    }
}
