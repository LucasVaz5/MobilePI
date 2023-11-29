package com.example.projetoi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class FormCadastro extends AppCompatActivity {

        private Intent id;
        private EditText NOME;
        private EditText SbNOME;
        private EditText EMAIL;
        private EditText SENHA;
        private UserDAO dao;

        String[] mensagens = {"Preencha todos os campos", "Cadastro Realizado com Sucesso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);
        iniciarComp();

        ImageView voltar = findViewById(R.id.back);
        voltar.setOnClickListener(view -> {
            startActivity(new Intent(FormCadastro.this, FormLogin.class));

        });



}
    public void salvar(View view){

        String nome = NOME.getText().toString();
        String sbnome = SbNOME.getText().toString();
        String email = EMAIL.getText().toString();
        String senha = SENHA.getText().toString();


        if (nome.isEmpty() || sbnome.isEmpty() || email.isEmpty() || senha.isEmpty()){
            Snackbar snackbar = Snackbar.make(view, mensagens[0], Snackbar.LENGTH_SHORT );
            snackbar.setBackgroundTint(Color.WHITE);
            snackbar.setTextColor(Color.BLACK);
            snackbar.show();
        }else{
            Users u = new Users();
            u.setNOME(NOME.getText().toString());
            u.setEMAIL(EMAIL.getText().toString());
            u.setSENHA(Integer.parseInt(SENHA.getText().toString()));
            dao.inserir(u);
            long id = dao.inserir(u);
            Snackbar snackbar = Snackbar.make(view, mensagens[1], Snackbar.LENGTH_SHORT);
            snackbar.setBackgroundTint(Color.WHITE);
            snackbar.setTextColor(Color.BLACK);
            snackbar.show();

        }



    }
    public void iniciarComp(){
        NOME = findViewById(R.id.edit_nome);
        SbNOME = findViewById(R.id.edit_sbnome);
        EMAIL = findViewById(R.id.edit_email);
        SENHA = findViewById(R.id.edit_senha);
        dao = new UserDAO(this);
    }
}