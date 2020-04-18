package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // teamAScore tracks the score for Team A.
    private int teamAScore = 0;
    // teamBScore tracks the score for Team B.
    private int teamBScore = 0;

    // Represents the points added for a touch down.
    private final int POINTS_FOR_TOUCHDOWN = 6;
    // Represents the points added for a successful field goal after a touch down.
    private final int POINTS_FOR_EXTRA_POINT = 1;
    // Represents the points added for a safety.
    private final int POINTS_FOR_SAFETY = 2;
    // Represents the points added for a field goal.
    private final int POINTS_FOR_FIELD_GOAL = 3;
    // Represents the points added for a two point conversion.
    private final int POINTS_FOR_CONVERSION = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // updateScore updates the appropriate score variable
    // by the given amount (specified in score) and
    // updates the appropriate TextView.
    private void updateScore(int idToUpdate, int score) {
        if (idToUpdate == R.id.team_a_score) {
            teamAScore += score;
        } else {
            teamBScore += score;
        }

        updateTextViews();
    }

    // updateTextViews updates both of the team's score
    // displays based on the current value of their variable.
    private void updateTextViews() {
        TextView scoreAView = findViewById(R.id.team_a_score);
        TextView scoreBView = findViewById(R.id.team_b_score);

        scoreAView.setText(String.valueOf(teamAScore));
        scoreBView.setText(String.valueOf(teamBScore));
    }

    // Resets the score for both teams to 0 and updates the
    // display.
    public void resetScore(View v) {
        teamAScore = 0;
        teamBScore = 0;

        updateTextViews();
    }

    // Adds a touchdown to the score for Team A.
    public void addTouchdownForTeamA(View v) {
        updateScore(R.id.team_a_score, POINTS_FOR_TOUCHDOWN);
    }

    // Adds an extra point to the score for Team A.
    public void addExtraPointForTeamA(View v) {
        updateScore(R.id.team_a_score, POINTS_FOR_EXTRA_POINT);
    }

    // Adds a conversion to the score for Team A.
    public void addTwoPointConversionForTeamA(View v) {
        updateScore(R.id.team_a_score, POINTS_FOR_CONVERSION);
    }

    // Adds a field goal to the score for Team A.
    public void addFieldGoalForTeamA(View v) {
        updateScore(R.id.team_a_score, POINTS_FOR_FIELD_GOAL);
    }

    // Adds a safety to the score for Team A.
    public void addSafetyForTeamA(View v) {
        updateScore(R.id.team_a_score, POINTS_FOR_SAFETY);
    }

    // Adds a touchdown to the score for Team A.
    public void addTouchdownForTeamB(View v) {
        updateScore(R.id.team_b_score, POINTS_FOR_TOUCHDOWN);
    }

    // Adds an extra point to the score for Team A.
    public void addExtraPointForTeamB(View v) {
        updateScore(R.id.team_b_score, POINTS_FOR_EXTRA_POINT);
    }

    // Adds a conversion to the score for Team A.
    public void addTwoPointConversionForTeamB(View v) {
        updateScore(R.id.team_b_score, POINTS_FOR_CONVERSION);
    }

    // Adds a field goal to the score for Team A.
    public void addFieldGoalForTeamB(View v) {
        updateScore(R.id.team_b_score, POINTS_FOR_FIELD_GOAL);
    }

    // Adds a safety to the score for Team A.
    public void addSafetyForTeamB(View v) {
        updateScore(R.id.team_b_score, POINTS_FOR_SAFETY);
    }
}
