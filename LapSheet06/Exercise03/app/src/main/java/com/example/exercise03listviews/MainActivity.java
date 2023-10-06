package com.example.exercise03listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String [] animalList = {"Dog","Cat","Lion","Cow","Bull","Sheep","Pig","Tiger"};
    int [] animalImages ={R.drawable.dog,R.drawable.cat,R.drawable.lion,R.drawable.cow,R.drawable.bull,R.drawable.sheep,R.drawable.pig,R.drawable.tiger};
    int animalImageResource = R.drawable.dog; // Replace with your image resource
    ListView AnimalView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnimalView = findViewById(R.id.listViewAnimals);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(this, animalList, animalImages);
        AnimalView.setAdapter(customBaseAdapter);

//        AnimalView = (ListView) findViewById(R.id.listViewAnimals);
//       CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(),animalList,animalImages);
//
//      AnimalView.setAdapter(customBaseAdapter);



        //AnimalView.setAdapter(Animals);
    }
}