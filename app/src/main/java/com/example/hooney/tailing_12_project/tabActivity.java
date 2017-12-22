package com.example.hooney.tailing_12_project;

import android.graphics.Color;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hooney.tailing_12_project.Fragment.Tab1Fragment;
import com.example.hooney.tailing_12_project.Fragment.Tab2Fragment;
import com.example.hooney.tailing_12_project.Fragment.Tab3Fragment;

public class tabActivity extends AppCompatActivity {

    private Button tab1;
    private Button tab2;
    private Button tab3;

    private Tab1Fragment tab1Fragment;
    private Tab2Fragment tab2Fragment;
    private Tab3Fragment tab3Fragment;

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        init();
        event();
    }

    private void init(){
        manager=getSupportFragmentManager();

        tab1Fragment = new Tab1Fragment();
        tab2Fragment = new Tab2Fragment();
        tab3Fragment = new Tab3Fragment();


        tab1 = (Button) findViewById(R.id.nav_tab1);
        tab2 = (Button) findViewById(R.id.nav_tab2);
        tab3 = (Button) findViewById(R.id.nav_tab3);

        switchFragment(1);
        setOnclick(1);
    }

    private void event(){
        tab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchFragment(1);
                setOnclick(1);
            }
        });

        tab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchFragment(2);
                setOnclick(2);
            }
        });

        tab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchFragment(3);
                setOnclick(3);
            }
        });
    }

    private void switchFragment(int i){
        switch (i){
            case 1:
                manager.beginTransaction().replace(R.id.nav_contain, tab1Fragment).commit();
                break;
            case 2:
                manager.beginTransaction().replace(R.id.nav_contain, tab2Fragment).commit();
                break;
            case 3:
                manager.beginTransaction().replace(R.id.nav_contain, tab3Fragment).commit();
                break;
            default:
                break;
        }
    }

    private void setOnclick(int i){
        switch (i){
            case 1:
                tab1.setTextColor(Color.WHITE);
                tab2.setTextColor(Color.DKGRAY);
                tab3.setTextColor(Color.DKGRAY);
                break;
            case 2:
                tab1.setTextColor(Color.DKGRAY);
                tab2.setTextColor(Color.WHITE);
                tab3.setTextColor(Color.DKGRAY);
                break;
            case 3:
                tab1.setTextColor(Color.DKGRAY);
                tab2.setTextColor(Color.DKGRAY);
                tab3.setTextColor(Color.WHITE);
                break;
            default:
                break;
        }
    }
}
