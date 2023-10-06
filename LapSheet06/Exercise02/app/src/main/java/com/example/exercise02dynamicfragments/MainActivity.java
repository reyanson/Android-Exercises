package com.example.exercise02dynamicfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method for displaying the appropriate fragment according to the clicked button

    public void selectFragment(View view){

        // create object for fragment
        Fragment fr;

        //displaying name fragment if name button clicked
        if (view == findViewById(R.id.nameBtn)){
            fr = new NameFragment();
        }//displaying address fragment if address button clicked
        else if (view == findViewById(R.id.addressBtn)) {
            fr = new AddressFragment();
        }//displaying phone fragment if phone button clicked
        else if (view == findViewById(R.id.phoneBtn)) {
            fr = new PhoneFragment();
        }//displaying email fragment if email button clicked
        else {
            fr = new EmailFragment();
        }

        FragmentManager fm = getFragmentManager();

        //fragment transaction to add or replace
        //fragment while activity is running
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.textFragment,fr);

        //making a commit after the transaction to assure that the change is effective

        fragmentTransaction.commit();
    }

}