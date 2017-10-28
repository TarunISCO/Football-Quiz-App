package com.example.tarun.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    final int answerOne = R.id.queOne_optionD;
    final int answerTwo = R.id.queTwo_optionC;
    final int answerThree = R.id.queThree_optionA;
    final int answerFour = R.id.queFour_optionC;
    final int answerFive = R.id.queFive_optionD;
    final int answerSix = R.id.queSix_optionB;
    final String answerSeven = "cristiano ronaldo";

    public void submitAnswers(View view) {
        int correctAnswers = 0;
        ArrayList<String> incorrectAnswers = new ArrayList<String>();

        if(checkQuestionOne())
            correctAnswers++;
        else
            incorrectAnswers.add("Question 1");

        if(checkQuestionTwo())
            correctAnswers++;
        else
            incorrectAnswers.add("Question 2");

        if(checkQuestionThree())
            correctAnswers++;
        else
            incorrectAnswers.add("Question 3");

        if(checkQuestionFour())
            correctAnswers++;
        else
            incorrectAnswers.add("Question 4");

        if(checkQuestionFive())
            correctAnswers++;
        else
            incorrectAnswers.add("Question 5");

        if(checkQuestionSix())
            correctAnswers++;
        else
            incorrectAnswers.add("Question 6");

        if(checkQuestionSeven())
            correctAnswers++;
        else
            incorrectAnswers.add("Question 7");

        if(checkQuestionEight())
            correctAnswers++;
        else
            incorrectAnswers.add("Question 8");

        StringBuilder sb = new StringBuilder();
        for (String s : incorrectAnswers)
        {
            sb.append(s);
            sb.append("\n");
        }

        String result = "You got " + correctAnswers + " correct answers out of 8.";
        if(sb.length()>0)
            result = result + "\n\nIncorrect answer(s)\n" + sb.toString();
        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
    }

    private boolean checkQuestionOne() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.queOneRadioGroup);
        return radioGroup.getCheckedRadioButtonId() == answerOne;
    }

    private boolean checkQuestionTwo() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.queTwoRadioGroup);
        return radioGroup.getCheckedRadioButtonId() == answerTwo;
    }
    private boolean checkQuestionThree() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.queThreeRadioGroup);
        return radioGroup.getCheckedRadioButtonId() == answerThree;
    }
    private boolean checkQuestionFour() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.queFourRadioGroup);
        return radioGroup.getCheckedRadioButtonId() == answerFour;
    }
    private boolean checkQuestionFive() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.queFiveRadioGroup);
        return radioGroup.getCheckedRadioButtonId() == answerFive;
    }
    private boolean checkQuestionSix() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.queSixRadioGroup);
        return radioGroup.getCheckedRadioButtonId() == answerSix;
    }
    private boolean checkQuestionSeven() {
        EditText et = (EditText) findViewById(R.id.queSevenAnswer);
        String text = et.getText().toString();
        return text.equalsIgnoreCase(answerSeven);
    }
    private boolean checkQuestionEight() {
        CheckBox cb1 = (CheckBox) findViewById(R.id.quesEight_optionA);
        CheckBox cb2 = (CheckBox) findViewById(R.id.quesEight_optionB);
        CheckBox cb3 = (CheckBox) findViewById(R.id.quesEight_optionC);
        CheckBox cb4 = (CheckBox) findViewById(R.id.quesEight_optionD);

        return cb1.isChecked() && cb2.isChecked() && !cb3.isChecked() && cb4.isChecked();
    }
}
