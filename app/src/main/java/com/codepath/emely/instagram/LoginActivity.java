package com.codepath.emely.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                login(username, password);

            }
        });
    }
    
    private void login(String username, String password) {
        // TODO: navigate to the new activity if the user has signed properly

    }
}
