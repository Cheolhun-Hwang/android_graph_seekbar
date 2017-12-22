package com.example.hooney.tailing_12_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private static String TAG = "Main2Activity";

    private TextView mainText;
    private Button Back;

    private String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();

        setUI();

        setEvent();
    }

    private void init(){
        user = getIntent().getStringExtra("user");
        if(user == null){
            Toast.makeText(getApplicationContext(), "User Data Not find.", Toast.LENGTH_SHORT).show();
            Log.e(TAG, "User Data Not find.");
            finish();
        }

        mainText = (TextView) findViewById(R.id.main2_showText);
        Back = (Button) findViewById(R.id.main2_backButton);
    }

    private void setUI(){
        mainText.setText("User : " + this.user);
    }

    private void setEvent(){
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
