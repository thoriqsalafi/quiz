package com.example.thoriqsalafi.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class questionEight extends AppCompatActivity {

    Button noButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_eight);

        noButton = (Button)findViewById(R.id.noButton);
        noButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(questionEight.this, questionNine.class);
                startActivity(i);
            }
        });

    }
}
