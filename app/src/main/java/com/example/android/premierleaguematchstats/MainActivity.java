package com.example.android.premierleaguematchstats;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeScore = 0;
    int homeCorners = 0;
    int homeOffSides = 0;
    int homeFouls = 0;
    int homeYellowCards = 0;
    int homeRedCards = 0;
    int awayScore = 0;
    int awayCorners = 0;
    int awayOffSides = 0;
    int awayFouls = 0;
    int awayYellowCards = 0;
    int awayRedCards = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    /**
     * Increase the stats for Home team by 1.
     */
    public void setGoalsForHomeTeam(View v) {
        homeScore = homeScore + 1;
        display(R.id.home_score, homeScore);
    }

    public void setCornersForHomeTeam(View v) {
        homeCorners = homeCorners + 1;
        display(R.id.home_corners, homeCorners);
    }

    public void setOffSidesOnHomeTeam(View v) {
        homeOffSides = homeOffSides + 1;
        display(R.id.home_offsides, homeOffSides);
    }

    public void setFoulsOnHomeTeam(View v) {
        homeFouls = homeFouls + 1;
        display(R.id.home_fouls, homeFouls);
    }

    public void setYellowCardsForHomeTeam(View v) {
        homeYellowCards = homeYellowCards + 1;
        display(R.id.home_yellow_cards, homeYellowCards);
    }

    public void setRedCardsForHomeTeam(View v) {
        homeRedCards = homeRedCards + 1;
        display(R.id.home_red_cards, homeRedCards);
    }


    /**
     * Increase the stats for Away team by 1.
     */
    public void setGoalsForAwayTeam(View v) {
        awayScore = awayScore + 1;
        display(R.id.away_score, awayScore);
    }

    public void setCornersForAwayTeam(View v) {
        awayCorners = awayCorners + 1;
        display(R.id.away_corners, awayCorners);
    }

    public void setOffSidesOnAwayTeam(View v) {
        awayOffSides = awayOffSides + 1;
        display(R.id.away_offsides, awayOffSides);
    }

    public void setFoulsOnAwayTeam(View v) {
        awayFouls = awayFouls + 1;
        display(R.id.away_fouls, awayFouls);
    }

    public void setYellowCardsForAwayTeam(View v) {
        awayYellowCards = awayYellowCards + 1;
        display(R.id.away_yellow_cards, awayYellowCards);
    }

    public void setRedCardsForAwayTeam(View v) {
        awayRedCards = awayRedCards + 1;
        display(R.id.away_red_cards, awayRedCards);
    }


    /**
     * Reset the score for both Home and Away Teams
     */
    public void resetBoard(View v) {
        homeScore = 0;
        homeCorners = 0;
        homeOffSides = 0;
        homeFouls = 0;
        homeYellowCards = 0;
        homeRedCards = 0;
        awayScore = 0;
        awayCorners = 0;
        awayOffSides = 0;
        awayFouls = 0;
        awayYellowCards = 0;
        awayRedCards = 0;
        display(R.id.home_score, homeScore);
        display(R.id.away_score, awayScore);
        display(R.id.home_corners, homeCorners);
        display(R.id.away_corners, awayCorners);
        display(R.id.home_offsides, homeOffSides);
        display(R.id.away_offsides, awayOffSides);
        display(R.id.home_fouls, homeFouls);
        display(R.id.away_fouls, awayFouls);
        display(R.id.home_yellow_cards, homeYellowCards);
        display(R.id.away_yellow_cards, awayYellowCards);
        display(R.id.home_red_cards, homeRedCards);
        display(R.id.away_red_cards, awayRedCards);
    }


    /**
     * Displays the given value to a TextView depending on its ResourceId.
     */
    public void display(int resourceId, int value) {
        TextView count = (TextView) findViewById(resourceId);
        count.setText(String.valueOf(value));
    }
}