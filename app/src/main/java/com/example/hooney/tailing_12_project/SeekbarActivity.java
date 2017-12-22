package com.example.hooney.tailing_12_project;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import org.w3c.dom.Text;


public class SeekbarActivity extends AppCompatActivity {

    private TextView middleText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        CircularProgressBar circularProgressBar = (CircularProgressBar)findViewById(R.id.seek);
        circularProgressBar.setColor(ContextCompat.getColor(this, R.color.colorAccent));
        circularProgressBar.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
        circularProgressBar.setProgressBarWidth(getResources().getDimension(R.dimen.default_stroke_width));
        circularProgressBar.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.default_background_stroke_width));

        int animationDuration = 2500; // 2500ms = 2,5s
        circularProgressBar.setProgressWithAnimation(40, animationDuration); // Default duration = 1500ms

        middleText = (TextView) findViewById(R.id.middle_text);
        middleText.setText(40+"%");

        Animation a = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        a.setDuration(6000);
        middleText.setAnimation(a);

        button = (Button) findViewById(R.id.seek_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "HELLO!!", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
