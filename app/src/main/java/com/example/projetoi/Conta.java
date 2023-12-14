package com.example.projetoi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;


public class Conta extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_profile);
        AppCompatButton sair = findViewById(R.id.sair);

        sair.setOnClickListener(view -> {
            startActivity(new Intent(this, FormLogin.class));

        });
    }
}
