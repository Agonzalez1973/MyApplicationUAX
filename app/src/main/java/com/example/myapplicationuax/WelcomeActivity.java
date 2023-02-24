package com.example.myapplicationuax;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView welcome = findViewById(R.id.Text_Bienv_user);

        Bundle extras = getIntent().getExtras();
        welcome.setText(extras.getString("username"));

    }
}
