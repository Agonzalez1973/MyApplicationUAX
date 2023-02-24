package com.example.myapplicationuax;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText user;
    EditText password;
    EditText passwordAgain;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        user = findViewById(R.id.usuario_reg);
        password = findViewById(R.id.password_reg);
        register = findViewById(R.id.Registro);
        passwordAgain = findViewById(R.id.password_repeat);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attemptLogin();
            }
        });

    }

    private void attemptLogin() {
            Intent i = new Intent(RegisterActivity.this, WelcomeActivity.class);
            i.putExtra("username", user.getText().toString());
            startActivity(i);
        }
    }
}
