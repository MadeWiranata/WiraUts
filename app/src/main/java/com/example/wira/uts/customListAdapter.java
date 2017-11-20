package com.example.wira.uts;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by made on 20/11/2017.
 */

public class customListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] osname;
    private final Integer[] imgid;


    customListAdapter(Activity context, String[] osname, Integer[] imgid) {
        super(context, R.layout.custom_list_adapter, osname);

        this.context=context;
        this.osname=osname;
        this.imgid=imgid;
    }

    @NonNull
    public View getView(int position, View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        @SuppressLint({"ViewHolder", "InflateParams"}) View rowView=inflater.inflate(R.layout.custom_list_adapter, null,true);
        TextView txtTitle = rowView.findViewById(R.id.os);
        ImageView imageView = rowView.findViewById(R.id.icon);

        txtTitle.setText(osname[position]);
        imageView.setImageResource(imgid[position]);
        return rowView;

    }
}
