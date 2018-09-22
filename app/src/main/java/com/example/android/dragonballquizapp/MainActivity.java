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
    // Track the count of the score
    int count = 0;
    // Radio Groups
    RadioGroup rg1;
    RadioGroup rg2;
    RadioGroup rg3;
    RadioGroup rg4;
    RadioGroup rg5;
    RadioGroup rg6;
    RadioGroup rg7;
    // Submit Button
    Button btn1;
    // Score TextView
    TextView scoreView;
    // Check if the button is clicked or not
    boolean isButtonClicked = false;

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
        // SubmitAnswer Button
        Button btn1 = (Button) findViewById(R.id.btn1);
        // Score TextView
        scoreView = (TextView) findViewById(R.id.score_text_view);
        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is "Majin Vegeta"
        //------------------------------------------------------------------------------------------
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton) findViewById(checkedId);
                count++;
                // if the selected answer is "Majin Vegeta"
                if (rb.getText().equals(getResources().getString(R.string.majin_vegeta))) {
                // increase the baseScore by 1 point
                    baseScore++;
                // if the wrong answer is selected
                } else {
                // decrease the baseScore by 1 point
                    baseScore--;
                }
            }
            });
        //------------------------------------------------------------------------------------------
        //  Question 2 - Correct Answer is "Instant Transmission"
        //------------------------------------------------------------------------------------------
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton) findViewById(checkedId);
                count++;
                // if the selected answer is "Instant Transmission"
                if (rb.getText().equals(getResources().getString(R.string.instant_transmission))) {
                // increase the baseScore by 1 point
                    baseScore++;
                // if the wrong answer is selected
                } else {
                // decrease the baseScore by 1 point
                    baseScore--;
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //  Question 3 - Correct Answer is "Frieza"
        //------------------------------------------------------------------------------------------
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton) findViewById(checkedId);
                count++;
                // if the selected answer is "Frieza"
                if (rb.getText().equals(getResources().getString(R.string.frieza))) {
                // increase the baseScore by 1 point
                    baseScore++;
                // if the wrong answer is selected
                } else {
                // decrease the baseScore by 1 point
                    baseScore--;
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //  Question 4 - Correct Answer is "Recoome"
        //------------------------------------------------------------------------------------------
        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton) findViewById(checkedId);
                count++;
                // if the selected answer is "Recoome"
                if (rb.getText().equals(getResources().getString(R.string.recoome))) {
                // increase the baseScore by 1 point
                    baseScore++;
                // if the wrong answer is selected
                } else {
                // decrease the baseScore by 1 point
                    baseScore--;
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //  Question 5 - Correct Answer is "Piccolo"
        //------------------------------------------------------------------------------------------
        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton) findViewById(checkedId);
                count++;
                // if the selected answer is "Piccolo"
                if (rb.getText().equals(getResources().getString(R.string.piccolo))) {
                // increase the baseScore by 1 point
                    baseScore++;
                // if the wrong answer is selected
                } else {
                // decrease the baseScore by 1 point
                    baseScore--;
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //  Question 6 - Correct Answer is "Jackie Chun"
        //------------------------------------------------------------------------------------------
        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton) findViewById(checkedId);
                count++;
                // if the selected answer is "Jackie Chun"
                if (rb.getText().equals(getResources().getString(R.string.jackie_chun))) {
                // increase the baseScore by 1 point
                    baseScore++;
                // if the wrong answer is selected
                } else {
                // decrease the baseScore by 1 point
                    baseScore--;
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //  Question 7 - Correct Answer is "Kamehameha"
        //------------------------------------------------------------------------------------------
        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                count++;
                RadioButton rb = (RadioButton) findViewById(checkedId);
                // if the correct answer selected is "Kamehameha"
                if (rb.getText().equals(getResources().getString(R.string.kamehameha))) {
                // increase the baseScore by 1 point
                    baseScore++;
                // if the wrong answer is selected
                } else {
                // decrease the baseScore by 1 point
                    baseScore--;
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //  Submit Answers Button
        //------------------------------------------------------------------------------------------
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // when the submitAnswer button has not been clicked yet
                if(!isButtonClicked) {
                    // when all the questions are not answered
                    if (count < 7) {
                        Toast.makeText(getApplicationContext(), "You need to answer all the questions", Toast.LENGTH_SHORT).show();

                    } else {
                        // when all the questions are answered
                        isButtonClicked = true;
                        displayScore(baseScore);
                    }
                }else{
                    // refresh activity
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            }
        });

        /**
         * This method is called when the submitAnswer button is clicked.
         */
    }
        public void displayScore (int score){

            scoreView.setText(String.valueOf(score));
        }

    }

