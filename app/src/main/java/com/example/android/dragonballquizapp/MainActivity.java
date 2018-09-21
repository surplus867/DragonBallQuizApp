package com.example.android.dragonballquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int baseScore = 0;
    RadioGroup rg1;
    RadioGroup rg2;
    RadioGroup rg3;
    RadioGroup rg4;
    RadioGroup rg5;
    RadioGroup rg6;
    RadioGroup rg7;
    RadioButton rb1;
    RadioButton rb6;
    RadioButton rb11;
    RadioButton rb13;
    RadioButton rb17;
    RadioButton rb23;
    RadioButton rb25;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
        // Radio Groups
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg2 = (RadioGroup) findViewById(R.id.rg2);
        rg3 = (RadioGroup) findViewById(R.id.rg3);
        rg4 = (RadioGroup) findViewById(R.id.rg4);
        rg5 = (RadioGroup) findViewById(R.id.rg5);
        rg6 = (RadioGroup) findViewById(R.id.rg6);
        rg7 = (RadioGroup) findViewById(R.id.rg7);
        rg1.clearCheck();
        rg2.clearCheck();
        rg3.clearCheck();
        rg4.clearCheck();
        rg5.clearCheck();
        rg6.clearCheck();
        rg7.clearCheck();
        // Button
        btn1 = (Button) findViewById(R.id.btn1);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton question1aChecked = (RadioButton) findViewById(R.id.rb1);

                if (question1aChecked.isChecked()) {
                    baseScore = baseScore + 1;
                } else {
                }
                baseScore = 0;

            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton Selected
                RadioButton question2bChecked = (RadioButton) findViewById(R.id.rb6);

                if (question2bChecked.isChecked()) {
                    baseScore = baseScore + 1;
                } else {

                }
                baseScore = 0;
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton Selected
                RadioButton question3cChecked = (RadioButton) findViewById(R.id.rb11);

                if (question3cChecked.isChecked()) {
                    baseScore = baseScore + 1;
                } else {

                }
                baseScore = 0;
            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton Selected
                RadioButton question4aChecked = (RadioButton) findViewById(R.id.rb13);

                if (question4aChecked.isChecked()) {
                    baseScore = baseScore + 1;
                } else {

                }
                baseScore = 0;
            }
        });

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton Selected
                RadioButton question5aChecked = (RadioButton) findViewById(R.id.rb17);

                if (question5aChecked.isChecked()) {
                    baseScore = baseScore + 1;
                } else {

                }
                baseScore = 0;
            }
        });

        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton Selected
                RadioButton question6cChecked = (RadioButton) findViewById(R.id.rb23);

                if (question6cChecked.isChecked()) {
                    baseScore = baseScore + 1;
                } else {

                }
                baseScore = 0;
            }
        });

        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton Selected
                RadioButton question7aChecked = (RadioButton) findViewById(R.id.rb25);

                if (question7aChecked.isChecked()) {
                    baseScore = baseScore + 1;
                } else {

                }
                baseScore = 0;
            }
        });
    }

    /**
     * This method is called when the submit answers button is clicked.
     */
    public void submitAnswers(View view) {

        // Type  on the Name Field
        EditText playerName = (EditText) findViewById(R.id.player_name);
        String name = playerName.getText().toString();


    }
}















