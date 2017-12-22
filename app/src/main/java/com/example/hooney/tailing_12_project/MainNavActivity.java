package com.example.hooney.tailing_12_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainNavActivity extends AppCompatActivity {

    private Button exam0;
    private Button exam1;
    private Button exam2;
    private Button exam3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nav);

        init();
        event();
    }

    private void init(){
        exam0 = (Button) findViewById(R.id.exam0_tab);
        exam1 = (Button) findViewById(R.id.exam1_btn);
        exam2=(Button) findViewById(R.id.exam2_linegraph);
        exam3=(Button) findViewById(R.id.exam3_seek);
    }

    private void event(){
        exam0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), tabActivity.class));
            }
        });
        exam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ArcheActivity.class));
            }
        });
        exam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LineGraphActivity.class));
            }
        });
        exam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SeekbarActivity.class));
            }
        });
    }
}
