package com.example.a1cadm.smilematches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StatistikActivity extends AppCompatActivity {

    TextView tRound, tWinP, tWinC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistik);

        tRound = (TextView) findViewById(R.id.tRound);
        tWinP = (TextView) findViewById(R.id.tWinP);
        tWinC = (TextView) findViewById(R.id.tWinC);


    }
}
