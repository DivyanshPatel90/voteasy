package com.example.voteasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button voterbtn = (Button) findViewById(R.id.voterbtn);
        Button adminbtn = (Button) findViewById(R.id.adminbtn);

        voterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent myIntent = new Intent(getBaseContext(), user_login.class);
               startActivity(myIntent);
            }
        });

        adminbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),admin_login.class);
                startActivity(myIntent);
            }
        });
    }
}