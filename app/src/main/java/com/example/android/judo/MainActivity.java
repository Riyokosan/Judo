package com.example.android.judo;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // more code in the oncreate
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }else{
            View decorView = getWindow().getDecorView();
            // Hide the status bar.
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }

        // code is above this method.
        setContentView(R.layout.activity_main);

        // more code in the oncreate
        View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Give 10 points for Team A
     */
    public void addThreeForTeamA (View view){
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Give 10 points for Team B
     */
    public void addThreeForTeamB (View view){
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Gives 7 points for Team A
     */
    public void addTwoForTeamA (View view){
        scoreTeamA = scoreTeamA + 7;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Gives 7 points for Team B
     */
    public void addTwoForTeamB (View view){
        scoreTeamB = scoreTeamB + 7;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Gives 5 point for Team A
     */
    public void addOneForTeamA (View view){
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Gives 5 point for Team B
     */
    public void addOneForTeamB (View view){
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Gives 3 point for Team A
     */
    public void addZeroForTeamA (View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Gives 3 point for Team B
     */
    public void addZeroForTeamB (View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset the score
     */
    public void reset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
