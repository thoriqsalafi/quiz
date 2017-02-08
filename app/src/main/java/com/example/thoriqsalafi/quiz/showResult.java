package com.example.thoriqsalafi.quiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class showResult extends Activity {

    Button yesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);

        yesButton = (Button)findViewById(R.id.yesButton);
        yesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(showResult.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
