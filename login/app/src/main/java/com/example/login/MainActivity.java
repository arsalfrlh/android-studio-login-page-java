package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username; //variabel text|seperti JTextField
    EditText password; //variabel text|seperti JTextField
    Button loginButton; //variabel button|seperti JButton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username); //variabel username|id dari xml|contohnya seperti name di html|seperti txt_username.setText(username)
        password = findViewById(R.id.password); //variabel password|id dari xml
        loginButton = findViewById(R.id.loginButton); //variabel button|id dari xml

        loginButton.setOnClickListener(new View.OnClickListener() { //button menggunakan action listener
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("user") && password.getText().toString().equals("123")){
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}