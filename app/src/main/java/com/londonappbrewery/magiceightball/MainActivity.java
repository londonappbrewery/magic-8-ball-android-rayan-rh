package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.askButton);
        final ImageView image = findViewById(R.id.image_eightBall);

        final int[] images = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rng = new Random();
                int ans = rng.nextInt(5);
                Log.d("Magic", "The ans is image " + ans);
                image.setImageResource(images[ans]);
            }
        });
    }
}
