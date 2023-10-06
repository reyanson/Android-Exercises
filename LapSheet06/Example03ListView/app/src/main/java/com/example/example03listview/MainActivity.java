package com.example.example03listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView MonthList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] List ={"Jan","Feb","Mar","Jun","Jul","Aug","Sep","Oct","Nov","Dec","Jan","Feb","Mar","Jun","Jul","Aug","Sep","Oct","Nov","Dec","Jan","Feb","Mar","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        ArrayAdapter Months = new ArrayAdapter<String>(this,R.layout.list_row,R.id.months,List);

        MonthList = (ListView) findViewById(R.id.listMonths);
        MonthList.setAdapter(Months);


    }
}