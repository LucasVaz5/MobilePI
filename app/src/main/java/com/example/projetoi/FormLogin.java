package com.example.projetoi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        AppCompatButton btn = findViewById(R.id.bt_criar_conta);
        AppCompatButton entrar = findViewById(R.id.bt_entrar);



        btn.setOnClickListener(view -> {
            startActivity(new Intent(FormLogin.this, FormCadastro.class));
        });
        entrar.setOnClickListener(view -> {
            startActivity(new Intent(FormLogin.this, form_planos.class));
        });
    }
}




