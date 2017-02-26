package com.example.android.learnspanishquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playQuiz(View view) {
        Intent play = new Intent(this, quiz.class);
        startActivity(play);

    }

    public void learnSpanish(View view) {
        Intent learn = new Intent(this, learnSpanish.class);
        startActivity(learn);

    }


}
