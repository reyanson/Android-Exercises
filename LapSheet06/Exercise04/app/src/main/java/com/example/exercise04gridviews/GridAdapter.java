package com.example.exercise04gridviews;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class GridAdapter extends BaseAdapter {
    private Context context;
    private int[] itemImages;

    public GridAdapter(Context context, int[] itemImages) {
        this.context = context;
        this.itemImages = itemImages;
    }

    @Override
    public int getCount() {
        return itemImages.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200)); // Adjust image size
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(itemImages[i]);

        // Set click listener to display Toast with item name
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemName = getItemName(i);
                Toast.makeText(context, itemName, Toast.LENGTH_SHORT).show();
            }
        });

        return imageView;
    }
    // Helper method to get item name based on position
    private String getItemName(int position) {

        String[] itemNames = {"Bull", "Cat", "Cow", "Dog", "Lion", "Pig", "Sheep", "Tiger"};
        if (position >= 0 && position < itemNames.length) {
            return itemNames[position];
        }
        return "Unknown";
    }
}
