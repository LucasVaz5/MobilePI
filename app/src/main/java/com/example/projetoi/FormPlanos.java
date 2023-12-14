package com.example.projetoi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class FormPlanos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_planos);

        ImageView voltar = findViewById(R.id.voltar);
        ImageView perfil = findViewById(R.id.profile);


        perfil.setOnClickListener(view -> {
            startActivity(new Intent(this, Conta.class));

        });

        voltar.setOnClickListener(view -> {
            startActivity(new Intent(this, FormLogin.class));

        });
    }
}


