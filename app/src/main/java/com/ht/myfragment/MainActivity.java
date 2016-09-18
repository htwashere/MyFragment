package com.ht.myfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Configuration configInfo = getResources().getConfiguration();

        if (configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            FragmentLandscape fragmentLandscape = new FragmentLandscape();
            fragmentTransaction.replace(android.R.id.content, fragmentLandscape);
        }
        else {
            FragmentPortrait fragmentPortrait = new FragmentPortrait();
            fragmentTransaction.replace(android.R.id.content, fragmentPortrait);
        }

        fragmentTransaction.commit();

        */

    }


    public void btnClickMe(View view) {
        Intent myIntent = new Intent(getApplicationContext(), FragmentPortrait.class);
        startActivity(myIntent);
    }
}
