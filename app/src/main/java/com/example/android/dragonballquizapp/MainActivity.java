package com.example.android.dragonballquizapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Track the score of the quiz
    int scoreForQuestionOne;
    int scoreForQuestionTwo;
    int scoreForQuestionThree;
    int scoreForQuestionFour;
    int scoreForQuestionFive;
    int scoreForQuestionSix;
    int scoreForQuestionSeven;
    // Track the count of the score
    int count;
    int baseScore;
    // Radio Groups
    RadioGroup rg1;
    RadioGroup rg2;
    RadioGroup rg3;
    RadioGroup rg4;
    RadioGroup rg5;
    // String Answer
    String answer = "Jackie Chun";
    // Check Boxes
    CheckBox   chk1;
    CheckBox   chk2;
    CheckBox   chk3;
    CheckBox   chk4;
    // Edit
    EditText  userAnswer;
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
        // CheckBox Groups
        chk1 = (CheckBox) findViewById(R.id.chk1);
        chk2 = (CheckBox) findViewById(R.id.chk2);
        chk3 = (CheckBox) findViewById(R.id.chk3);
        chk4 = (CheckBox) findViewById(R.id.chk4);
        userAnswer = (EditText) findViewById(R.id.user_answer);
        count = 0;
        baseScore = 0;
        // SubmitAnswer Button
        btn1 = (Button) findViewById(R.id.btn1);
        // Score TextView
        scoreView = (TextView) findViewById(R.id.score_text_view);
        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is "Majin Vegeta"
        //------------------------------------------------------------------------------------------
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton) findViewById(checkedId);
                count++;
                Log.i("MainActivity", " count the math" + String.valueOf(count));
                // if the selected answer is "Majin Vegeta"
                if (rb.getText().equals(getResources().getString(R.string.majin_vegeta))) {
                    // increase the baseScore by 1 point
                    scoreForQuestionOne = 1;
                    // if the wrong answer is selected
                } else {
                    // decrease the baseScore by 1 point
                    scoreForQuestionOne = 0;
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //  Question 2 - Correct Answer is "Instant Transmission"
        //------------------------------------------------------------------------------------------
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton) findViewById(checkedId);
                count++;
                Log.i("MainActivity", " count the math" + String.valueOf(count));
                // if the selected answer is "Instant Transmission"
                if (rb.getText().equals(getResources().getString(R.string.instant_transmission))) {
                    // increase the baseScore by 1 point
                    scoreForQuestionTwo = 1;
                    // if the wrong answer is selected
                } else {
                    // decrease the baseScore by 1 point
                    scoreForQuestionTwo = 0;
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //  Question 3 - Correct Answer is "Frieza"
        //------------------------------------------------------------------------------------------
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton) findViewById(checkedId);
                count++;
                Log.i("MainActivity", " count the math" + String.valueOf(count));
                // if the selected answer is "Frieza"
                if (rb.getText().equals(getResources().getString(R.string.frieza))) {
                    // increase the baseScore by 1 point
                    scoreForQuestionThree = 1;
                    // if the wrong answer is selected
                } else {
                    // decrease the baseScore by 1 point
                    scoreForQuestionThree = 0;
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //  Question 4 - Correct Answer is "Recoome"
        //------------------------------------------------------------------------------------------
        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton) findViewById(checkedId);
                count++;
                Log.i("MainActivity", " count the math" + String.valueOf(count));
                // if the selected answer is "Recoome"
                if (rb.getText().equals(getResources().getString(R.string.recoome))) {
                    // increase the baseScore by 1 point
                    scoreForQuestionFour = 1;
                    // if the wrong answer is selected
                } else {
                    // decrease the baseScore by 1 point
                    scoreForQuestionFive = 0;
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //  Question 5 - Correct Answer is "Piccolo"
        //------------------------------------------------------------------------------------------
        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton) findViewById(checkedId);
                count++;
                Log.i("MainActivity", " count the math" + String.valueOf(count));
                // if the selected answer is "Piccolo"
                if (rb.getText().equals(getResources().getString(R.string.piccolo))) {
                    // increase the baseScore by 1 point
                    scoreForQuestionFive = 1;
                    // if the wrong answer is selected
                } else {
                    // decrease the baseScore by 1 point
                    scoreForQuestionFive = 0;
                }
            }
        });
        //------------------------------------------------------------------------------------------
        //  Question 6 - Correct Answer is "Jackie Chun"
        //------------------------------------------------------------------------------------------

        userAnswer.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                count++;
                Log.i("MainActivity", " count the math" + String.valueOf(count));
            }

        });
        //------------------------------------------------------------------------------------------
        //  Question 7 - Correct Answer is "Kamehameha"
        //------------------------------------------------------------------------------------------
       chk1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  count++;
                  Log.i("MainActivity", " count the math" + String.valueOf(count));
                  if (chk1.isChecked() && !chk2.isChecked() && !chk3.isChecked()
                          && !chk4.isChecked()) {
                  scoreForQuestionSeven = 1;

                  } else {
                      // decrease the baseScore by 1 point
                      scoreForQuestionSeven = 0;
                  }
                  }
              });

        chk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
            }
        });

        chk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
            }
        });

        chk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
            }
        });
        //------------------------------------------------------------------------------------------
        //  Submit Answers Button
        //------------------------------------------------------------------------------------------
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // when the submitAnswer button has not been clicked yet
                answer = userAnswer.getText().toString();
                if (!isButtonClicked) {
                            // when all the questions are not answered
                            if (count < 7) {
                                count++;
                                Toast.makeText(getApplicationContext(), "You need to answer all the questions"+ String.valueOf(count), Toast.LENGTH_SHORT).show();

                            } else {

                                if (answer.equalsIgnoreCase("Jackie Chun")) {
                                    scoreForQuestionSix = 1;
                                } else {
                                    scoreForQuestionSix = 0;

                                }

                                baseScore = scoreForQuestionOne + scoreForQuestionTwo +scoreForQuestionThree + scoreForQuestionFour + scoreForQuestionFive + scoreForQuestionSix + scoreForQuestionSeven;

                                // when all the questions are answered
                                isButtonClicked = true;
                                displayScore(baseScore);
                                Toast.makeText(MainActivity.this, "Correct Answers:" + baseScore + " /7",
                                        Toast.LENGTH_LONG).show();
                            }
                } else {
                    // refresh activity
                    Intent intent = getIntent();
                    startActivity(intent);
                    finish();

                }
            }
        });

        /**
         * This method is called when the submitAnswer button is clicked.
         */
    }
      public void displayScore (int score) {
        scoreView.setText(String.valueOf(score));
      }
}



