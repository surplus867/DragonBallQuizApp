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
    // Track the score of the quiz
    int baseScore = 0;
    // Radio Groups
    RadioGroup rg1;
    RadioGroup rg2;
    RadioGroup rg3;
    RadioGroup rg4;
    RadioGroup rg5;
    RadioGroup rg6;
    RadioGroup rg7;
    // Radio Buttons
    RadioButton rb1;
    RadioButton rb6;
    RadioButton rb11;
    RadioButton rb13;
    RadioButton rb17;
    RadioButton rb23;
    RadioButton rb25;
    // Submit Button
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
        Button btn1 = (Button) findViewById(R.id.btn1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton question1a = findViewById(R.id.rb1);

                if (question1a.isChecked()) {
                    baseScore = baseScore++;

                } else {
                    // Minus one point if the wrong answer is selected
                    baseScore = baseScore - 1;

                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton Selected
                RadioButton question2b = findViewById(R.id.rb6);

                if (question2b.isChecked()) {
                    baseScore = baseScore++;

                } else {
                    baseScore = baseScore - 1;


                }
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton Selected
                RadioButton question3C = findViewById(R.id.rb11);

                if (question3C.isChecked()) {
                    baseScore = baseScore++;

                } else {
                    baseScore = baseScore - 1;


                }
            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton Selected
                RadioButton question4A = findViewById(R.id.rb13);

                if (question4A.isChecked()) {
                    baseScore = baseScore++;

                } else {
                    baseScore = baseScore - 1;


                }
            }
        });

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton Selected
                RadioButton question5A = findViewById(R.id.rb17);

                if (question5A.isChecked()) {
                    baseScore = baseScore++;

                } else {
                    baseScore = baseScore -1;


                }
            }
        });

        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton Selected
                RadioButton question6C = findViewById(R.id.rb23);

                if (question6C.isChecked()) {
                     baseScore = baseScore++;
                    } else {
                    baseScore = baseScore - 1;

                }

            }
        });

        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton Selected
                RadioButton question7A = findViewById(R.id.rb25);

                if (question7A.isChecked()) {
                    baseScore = baseScore++;
                    } else {
                    baseScore = baseScore - 1;

                }
            }
        });

        // Button

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScore(baseScore);
            }
        });

        /**
         * This method is called when the submitAnswer button is clicked.
         */
    }
       /*   public void submitAnswers (View view) {

          displayScore(baseScore);


          }*/


        public void displayScore (int score){
            TextView scoreView = (TextView) findViewById(R.id.score_text_view);
            scoreView.setText(String.valueOf(score));
        }

    }