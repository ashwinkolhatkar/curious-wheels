package com.neeraja.curiouswheels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView takeBikeCard, earnPointsCard, redeemPointsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // defining cards
        takeBikeCard = findViewById(R.id.takebike);
        earnPointsCard = findViewById(R.id.earnpoints);
        redeemPointsCard = findViewById(R.id.redeempoints);

        // setting click listeners for each card
        takeBikeCard.setOnClickListener(this);
        earnPointsCard.setOnClickListener(this);
        redeemPointsCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.takebike: i = new Intent(this, TakeBikeActivity.class); startActivity(i); break;
            case R.id.earnpoints: i = new Intent(this, EarnPointsActivity.class); startActivity(i); break;
            case R.id.redeempoints: i = new Intent(this, RedeemPointsActivity.class); startActivity(i); break;
            default: break;
        }
    }
}