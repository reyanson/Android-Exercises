package com.example.example04gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    TextView textView;
    String [] carBrands = {"Ferrari","McLaren","Jaguar","Skoda","Suzuki","Hyundai","Toyota","Renault","Mercedes","BMW","Ford","Hond","Chevrolet","Volkswagon"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gride);
        textView = (TextView)  findViewById(R.id.textView);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.grid_item,R.id.textView,carBrands);
        gridView.setAdapter(adapter);
    }
}