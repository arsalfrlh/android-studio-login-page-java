package com.example.text;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("123")) {
                    new AlertDialog.Builder(MainActivity.this).setTitle("Login Sukses").setMessage("Selamat datang, " + username.getText().toString() + "!").setPositiveButton("OK", (dialog, which) -> {}).show();
                } else {
                    new AlertDialog.Builder(MainActivity.this).setTitle("Login Gagal").setMessage("Username atau password salah!").setPositiveButton("Coba Lagi", (dialog, which) -> {}).show();
                }
            }
        });

    }
}