package com.example.projetoi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FormCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        ImageView voltar = findViewById(R.id.back);

        voltar.setOnClickListener(view -> {
            startActivity(new Intent(FormCadastro.this, FormLogin.class));
    });

}
}