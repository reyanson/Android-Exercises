package com.example.exercise03listviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
    private Context context;
    private String[] animalList;
    private int[] animalImageResource;

    public CustomBaseAdapter(Context context, String[] animalList, int[] animalImageResource) {
        this.context = context;
        this.animalList = animalList;
        this.animalImageResource = animalImageResource;
    }

    @Override
    public int getCount() {
        return animalList.length;
    }

    @Override
    public Object getItem(int i) {
        return animalList[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.activity_custom_list_view, viewGroup, false);
        }

        TextView textView = view.findViewById(R.id.textView);
        ImageView imageView = view.findViewById(R.id.imageView);

        textView.setText(animalList[i]);
        imageView.setImageResource(animalImageResource[i]);

        return view;


    }
}
