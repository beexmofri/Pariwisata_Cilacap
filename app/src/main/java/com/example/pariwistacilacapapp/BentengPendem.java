package com.example.pariwistacilacapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class BentengPendem extends AppCompatActivity {

    Button button;
    RatingBar ratingBar;

    float myRating = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benteng_pendem);
        button = findViewById(R.id.btrtbp);
        ratingBar =findViewById(R.id.rtbp);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                int rating = (int) v;
                String message = null;

                myRating = (int) ratingBar.getRating();

                switch (rating){
                    case 1:
                        message = "Sangat Buruk";
                        break;
                    case 2:
                        message = "Buruk";
                        break;
                    case 3:
                        message = "Cukup";
                        break;
                    case 4:
                        message = "Baik";
                        break;
                    case 5:
                        message = "Sangat Baik";
                        break;
                }

                Toast.makeText(BentengPendem.this, message, Toast.LENGTH_SHORT).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BentengPendem.this, String.valueOf(myRating), Toast.LENGTH_SHORT).show();
            }
        });
    }
}