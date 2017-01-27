package com.example.android.sandascoring;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.sandascoring.R.id.fighter_a_score;
import static com.example.android.sandascoring.R.id.fighter_b_score;

public class MainActivity extends AppCompatActivity {

    int FighterA = 0;
    int FighterB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForFighterA(int score) {
        TextView scoreView = (TextView) findViewById(fighter_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForFighterB(int score) {
        TextView scoreView = (TextView) findViewById(fighter_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plus3a(View view) {
        FighterA = FighterA + 3;
        displayForFighterA(FighterA);
    }

    public void plus2a(View view) {
        FighterA = FighterA + 2;
        displayForFighterA(FighterA);
    }

    public void plus1a(View view) {
        FighterA = FighterA + 1;
        displayForFighterA(FighterA);
    }

    public void minus1a(View view) {
        FighterA = FighterA - 1;
        if (FighterA < 0)
        {
            FighterA = 0;
        }
        displayForFighterA(FighterA);
    }

    public void plus3b(View view) {
        FighterB = FighterB + 3;
        displayForFighterB(FighterB);
    }

    public void plus2b(View view) {
        FighterB = FighterB + 2;
        displayForFighterB(FighterB);
    }

    public void plus1b(View view) {
        FighterB = FighterB + 1;
        displayForFighterB(FighterB);
    }

    public void minus1b(View view) {
        FighterB = FighterB - 1;
        if (FighterB < 0)
        {
            FighterB = 0;
        }
        displayForFighterB(FighterB);
    }

    public void reset(View view) {
        FighterA = 0;
        FighterB = 0;
        displayForFighterA(FighterA);
        displayForFighterB(FighterB);
    }
}
