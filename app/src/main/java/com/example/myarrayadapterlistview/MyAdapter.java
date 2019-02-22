package com.example.myarrayadapterlistview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends ArrayAdapter<MyItem> {
    private int resourceView;
    private Context context;
    private List<MyItem> myItems;

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<MyItem> objects) {
        super(context, resource, objects);
        resourceView=resource;
        this.context=context;
        myItems=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = ((Activity)context).getLayoutInflater().inflate(resourceView,parent,false);
        TextView name = convertView.findViewById(R.id.tv_name);
        name.setText(myItems.get(position).getName());
        TextView beschreibung = convertView.findViewById(R.id.tv_beschreibung);
        beschreibung.setText(myItems.get(position).getBeschreibung());
        CheckBox isKunde = convertView.findViewById(R.id.cb_is_kunde);
        isKunde.setChecked(myItems.get(position).isKunde());
        ImageView image = convertView.findViewById(R.id.image);
        image.setImageResource(myItems.get(position).getIcon());


        return convertView;
    }
}
