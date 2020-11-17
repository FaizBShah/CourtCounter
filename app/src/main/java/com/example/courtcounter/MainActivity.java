package com.example.courtcounter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Constant keys for Bundle arguments
    private static final String SCORE_TEAM_A = "scoreTeamA";
    private static final String SCORE_TEAM_B = "scoreTeamB";

    // TextViews to display the team scores
    private TextView textScoreTeamA, textScoreTeamB;

    // Variables to track the scores
    private int scoreTeamA = 0, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textScoreTeamA = findViewById(R.id.team_A_score);
        textScoreTeamB = findViewById(R.id.team_B_score);

        // Checking if there was a previous saved state or not
        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey(SCORE_TEAM_A)) {
                scoreTeamA = savedInstanceState.getInt(SCORE_TEAM_A);
                displayScoreTeamA(scoreTeamA);
            }
            if (savedInstanceState.containsKey(SCORE_TEAM_B)) {
                scoreTeamB = savedInstanceState.getInt(SCORE_TEAM_B);
                displayScoreTeamB(scoreTeamB);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(SCORE_TEAM_A, scoreTeamA);
        outState.putInt(SCORE_TEAM_B, scoreTeamB);
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