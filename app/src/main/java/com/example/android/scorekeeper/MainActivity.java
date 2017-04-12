package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    //Tracks the score for Team A
    int scoreRealMadrid = 0;
    //Tracks the score for Team B
    int scoreBarcelona = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForRealMadrid(scoreRealMadrid);

    }
       public void addOneForRealMadrid(View v) {
        scoreRealMadrid = scoreRealMadrid +1;
        displayForRealMadrid(scoreRealMadrid);

    }
       public void addOneFoulForRealMadrid(View v) {
        scoreRealMadrid = scoreRealMadrid +1;
        displayForRealMadrid(scoreRealMadrid);

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForRealMadrid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addOneForBarcelona(View v) {
        scoreBarcelona = scoreBarcelona + 1;
        displayForBarcelona(scoreBarcelona);
    }

    public void addOneFoulForBarcelona(View v) {
        scoreBarcelona = scoreBarcelona + 1;
        displayForBarcelona(scoreBarcelona);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForBarcelona(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        scoreRealMadrid = 0;
        scoreBarcelona = 0;
        displayForRealMadrid(scoreRealMadrid);
        displayForBarcelona(scoreBarcelona);

    }



}
