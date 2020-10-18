package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textScoreTeamA, textScoreTeamB;

    int scoreTeamA = 0, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textScoreTeamA = findViewById(R.id.team_A_score);
        textScoreTeamB = findViewById(R.id.team_B_score);
    }

    public void plusThreeTeamA(View view) {
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    public void plusTwoTeamA(View view) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    public void plusOneTeamA(View view) {
        scoreTeamA++;
        displayScoreTeamA(scoreTeamA);
    }

    public void plusThreeTeamB(View view) {
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    public void plusTwoTeamB(View view) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    public void plusOneTeamB(View view) {
        scoreTeamB++;
        displayScoreTeamB(scoreTeamB);
    }

    public void displayScoreTeamA(int score) {
        textScoreTeamA.setText(Integer.toString(score));
    }

    public void displayScoreTeamB(int score) {
        textScoreTeamB.setText(Integer.toString(score));
    }

    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
}