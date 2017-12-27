package com.example.gonghe.mlcubeandroid.lcrown.mlcubeandroid;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private BottomNavigationViewEx bnve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBottomNavigationViewEx();

    }


    private void initBottomNavigationViewEx() {

        bnve = (BottomNavigationViewEx) findViewById(R.id.bnve);

        bnve.enableAnimation(false);
        bnve.enableShiftingMode(false);
        bnve.enableItemShiftingMode(false);

        bnve.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.bottom_navigation_view_device:

                        Log.d(TAG, "onNavigationItemSelected: 111111111111111111");

                        return true;

                    case R.id.bottom_navigation_view_other:

                        Intent intent = new Intent(MainActivity.this,DeviceActivity.class);

                        startActivity(intent);

                        Log.d(TAG, "onNavigationItemSelected: 22222222222222222222");

                        return true;

                    case R.id.bottom_navigation_view_quit:

                        Intent intent2 = new Intent(MainActivity.this,OtherActivity.class);

                        startActivity(intent2);

                        Log.d(TAG, "onNavigationItemSelected: 3333333333333333333333");

                        return true;

                    default:

                        return true;

                }

            }

        });


    }

}
