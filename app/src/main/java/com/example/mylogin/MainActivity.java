package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      email = findViewById(R.id.email);
      password = findViewById(R.id.password);
      loginButton = findViewById(R.id.loginButton);

      loginButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (email.getText().toString().equals("User") && password.getText().toString().equals("12345")){
                  Toast.makeText(MainActivity.this,"Login Sucessful!",Toast.LENGTH_SHORT).show();
              }
              else {
                  Toast.makeText(MainActivity.this,"Login Failed!",Toast.LENGTH_SHORT).show();
              }
          }
      });
    }
}