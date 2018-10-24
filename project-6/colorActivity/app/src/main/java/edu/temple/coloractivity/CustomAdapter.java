package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String colors1[];
    private String colors2[];

    public CustomAdapter(Context context, String[] colors1, String[] colors2){
        this.context = context;
        this.colors1 = colors1;
        this.colors2 = colors2;

    }

    @Override
    public int getCount() {

        return colors2.length;
    }

    @Override
    public Object getItem(int position) {

        return colors2[position];
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView colorView = new TextView(context);
        colorView.setText(colors2[position]);
        colorView.setBackgroundColor(Color.parseColor(colors1[position]));

        return colorView;

    }
}
