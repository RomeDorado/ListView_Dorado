package com.example.simon.listview_dorado.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.simon.listview_dorado.Model.College;
import com.example.simon.listview_dorado.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Simon on 9/7/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context c;
    List<College> colleges;
    ImageView iv_Logo;
    TextView tv_Year;
    TextView tv_Name;

    public CustomAdapter(Context c, List<College> colleges){
        this.c = c;
        this.colleges = colleges;
    }
    @Override
    public int getCount() {
        return colleges.size();
    }

    @Override
    public Object getItem(int i) {
        return colleges.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view.inflate(c, R.layout.row_layout, null);
        iv_Logo = (ImageView) v.findViewById(R.id.logo);
        tv_Name = (TextView) v.findViewById(R.id.tvCollege);
        tv_Year = (TextView) v.findViewById(R.id.tvYear);
        tv_Name.setText(colleges.get(i).getName());
        tv_Year.setText(colleges.get(i).getYear());
        iv_Logo.setImageResource(colleges.get(i).getLogo());
        return v;
    }
}
