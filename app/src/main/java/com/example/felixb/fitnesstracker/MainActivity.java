package com.example.felixb.fitnesstracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Open a new activity for the 'Weight Training'
    public void openWorkoutActivity(View view)
    {

        // TODO: Add Function to get previous user data
        // TODO: Add Function to get stats

    for(int i = 0; i < 10; i++)
    {

    }
        Intent intent = new Intent(this, WorkoutTrainingTracker.class);
        startActivity(intent);
    }


}
