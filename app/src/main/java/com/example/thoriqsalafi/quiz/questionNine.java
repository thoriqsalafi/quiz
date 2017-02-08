package com.example.thoriqsalafi.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class questionNine extends AppCompatActivity {

    Button yesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_nine);

        yesButton= (Button)findViewById(R.id.yesButton);
        yesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(questionNine.this, questionTen.class);
                startActivity(i);
            }
        });

    }
}
