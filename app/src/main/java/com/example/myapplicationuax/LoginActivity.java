package com.example.myapplicationuax;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    EditText user;
    EditText password;
    Button login;
    TextView createAccount;
    TextView forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        createAccount = findViewById(R.id.Cuenta);
        forgotPassword = findViewById(R.id.Olvido);


        password.setOnEditorActionListener(
                new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId == EditorInfo.IME_ACTION_DONE){
                    attemptLogin();
                    return true;
                }
                return false;
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attemptLogin();
            }
        });


        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNew(v);
            }
        });


        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);            }
        });

    }

    private void getNew(View v) {
        Snackbar.make(v, "Proximamente", Snackbar.LENGTH_LONG).show();
    }


    private void attemptLogin() {

            Intent i = new Intent(LoginActivity.this, WelcomeActivity.class);
            i.putExtra("username", user.getText().toString());
            startActivity(i);


    }

}
