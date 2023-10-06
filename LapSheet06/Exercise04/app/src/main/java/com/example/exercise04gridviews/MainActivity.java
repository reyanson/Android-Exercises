package com.example.exercise04gridviews;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    TextView textView;
    String[] monthList = {"jan","feb","mar","apr","jun","jul","aug","sep","oct","nov","dec","jan"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);
        int[] itemImages = {R.drawable.bull,R.drawable.cat,R.drawable.cow,R.drawable.dog,R.drawable.lion,R.drawable.pig,R.drawable.sheep,R.drawable.tiger};

        GridAdapter adapter = new GridAdapter(this,itemImages);
        gridView.setAdapter(adapter);


    }

}