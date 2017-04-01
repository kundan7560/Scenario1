package com.kundan.demoform.demo.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.kundan.demoform.demo.Fragment.HomeFragment;


public class MainActivity extends AppCompatActivity {
    private Context mContext;
    Fragment fragment ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        fragment = fm.findFragmentByTag("homeFragmentTag");
        if (fragment == null) {
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            fragment =new HomeFragment();
            ft.add(android.R.id.content,fragment,"homeFragmentTag");
            ft.commit();
        }
    }
}
