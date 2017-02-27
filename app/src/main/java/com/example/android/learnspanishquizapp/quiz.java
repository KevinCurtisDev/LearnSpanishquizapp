package com.example.android.learnspanishquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class quiz extends AppCompatActivity {

    private RadioButton ans1;
    private RadioButton ans2;
    private CheckBox questionThree;
    private CheckBox questionThree2;
    private EditText questionFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        ans1 = (RadioButton) findViewById(R.id.radioButton2);
        ans2 = (RadioButton) findViewById(R.id.radioButton5);
        questionThree = (CheckBox) findViewById(R.id.checkBox9);
        questionThree2 = (CheckBox) findViewById(R.id.checkBox12);
        questionFour = (EditText) findViewById(R.id.typedText);
    }


     /**
     * This method checks whether the correct radio button is checked for question 1 and returns a toast message.
     **/

    public void check1(View view) {
        Boolean questionOneCorrect = ans1.isChecked();

        if (questionOneCorrect) {
            Toast.makeText(this, "Great job", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method checks whether the correct radio button is checked for question 2 and returns a toast message.
     **/

    public void check2(View view) {
        boolean questionTwoCorrect = ans2.isChecked();

        if (questionTwoCorrect) {
            Toast.makeText(this, "Awesome, you're doing great", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method checks whether the correct checkbox is checked for question 3 and returns a toast message.
     **/

    public void check3(View view) {
        Boolean questionThreeCorrect = questionThree.isChecked();

        Boolean questionThreeCorrect2 = questionThree2.isChecked();

        if (questionThreeCorrect && questionThreeCorrect2) {
            Toast.makeText(this, "Don't stop now, you're on fire", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method checks whether the correct text is inputted for question 4 and returns a toast message.
     **/

    public void check4(View view) {
        String ans = questionFour.getText().toString();

        if (ans.equals("Quiero") || ans.equals("quiero")) {
            Toast.makeText(this, "Perfect, check your final score!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method checks if all, some, or none of the answers to the 4 questions are correct, and returns a toast message showing the score as a percentage.
     **/

    public void finalScore(View view) {

        boolean questionOneCorrect = ans1.isChecked();

        boolean questionTwoCorrect = ans2.isChecked();

        Boolean questionThreeCorrect = questionThree.isChecked();

        Boolean questionThreeCorrect2 = questionThree2.isChecked();

        String ans = questionFour.getText().toString();


        if(questionOneCorrect && questionTwoCorrect && questionThreeCorrect && questionThreeCorrect2 && (ans.equals("Quiero") || ans.equals("quiero"))){

            Toast.makeText(this, "100%, You'll be fluent in no time!", Toast.LENGTH_LONG).show();

        }else if(questionOneCorrect && questionTwoCorrect && questionThreeCorrect && questionThreeCorrect2 || questionOneCorrect && questionTwoCorrect && ans.equals("Quiero") || questionOneCorrect && questionThreeCorrect && questionThreeCorrect2 && ans.equals("Quiero")  || questionTwoCorrect && questionThreeCorrect && questionThreeCorrect2 && ans.equals("Quiero")){

            Toast.makeText(this, "75%, not bad! almost 100%", Toast.LENGTH_LONG).show();

        }else if(questionOneCorrect && questionTwoCorrect || questionThreeCorrect && questionThreeCorrect2 && questionOneCorrect || questionOneCorrect && ans.equals("Quiero") || questionTwoCorrect && questionThreeCorrect && questionThreeCorrect2 || ans.equals("Quiero") && questionThreeCorrect2 || questionThreeCorrect && questionThreeCorrect2 && ans.equals("Quiero") ){

            Toast.makeText(this, "50%, you're getting there", Toast.LENGTH_LONG).show();

        }else if(questionOneCorrect &&  !questionTwoCorrect && !questionThreeCorrect && !questionThreeCorrect2 && !ans.equals("Quiero") || questionTwoCorrect && !questionOneCorrect && !questionThreeCorrect && !questionThreeCorrect2 && !ans.equals("Quiero") || questionThreeCorrect && questionThreeCorrect2 && !questionTwoCorrect && !questionOneCorrect && !ans.equals("Quiero") || ans.equals("Quiero") && !questionThreeCorrect && !questionThreeCorrect2 && !questionOneCorrect &&  !questionTwoCorrect){

            Toast.makeText(this, "25%, Ouch! Let's go learn some phrases", Toast.LENGTH_LONG).show();

        }else if(!questionOneCorrect || !questionTwoCorrect|| !questionThreeCorrect || !questionThreeCorrect2 || ans.equals("Quiero") || ans.equals("quiero")){

            Toast.makeText(this, "0%... ummmm! Try again", Toast.LENGTH_LONG).show();


        }

    }


}
