package com.example.hooney.tailing_12_project;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.hooney.tailing_12_project.Draw.DrawingView;

public class ArcheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arche);

        LinearLayout First = (LinearLayout) findViewById(R.id.first_surface);
        LinearLayout Second = (LinearLayout) findViewById(R.id.second_Surface);
        LinearLayout Third = (LinearLayout) findViewById(R.id.third_surface);

        First.addView(new DrawingView(getApplicationContext(), 1));
        Second.addView(new DrawingView(getApplicationContext(), 2));
        Third.addView(new DrawingView(getApplicationContext(), 3));

    }
}
