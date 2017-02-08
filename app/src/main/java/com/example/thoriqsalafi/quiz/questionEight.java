package com.example.thoriqsalafi.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class questionEight extends AppCompatActivity {

    Button yesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_eight);

        yesButton = (Button)findViewById(R.id.yesButton);
        yesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(questionEight.this, questionNine.class);
                startActivity(i);
            }
        });

    }
}
