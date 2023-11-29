package com.example.projetoi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class FormCadastro extends AppCompatActivity {

        private Intent id;
        private EditText NOME;
        private EditText SbNOME;
        private EditText EMAIL;
        private EditText SENHA;
        private UserDAO dao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        ImageView voltar = findViewById(R.id.back);

        NOME = findViewById(R.id.edit_nome);
        SbNOME = findViewById(R.id.edit_sbnome);
        EMAIL = findViewById(R.id.edit_email);
        SENHA = findViewById(R.id.edit_senha);
        dao = new UserDAO(this);


        voltar.setOnClickListener(view -> {
            startActivity(new Intent(FormCadastro.this, FormLogin.class));

        });



}
    public void salvar(View view){

        Users u = new Users();
        u.setNOME(NOME.getText().toString());
        u.setEMAIL(EMAIL.getText().toString());
        u.setSENHA(Integer.parseInt(SENHA.getText().toString()));
        dao.inserir(u);
        long id = dao.inserir(u);
        Toast.makeText(this ,"Usuário cadastrado com sucesso! id:"+ id, Toast.LENGTH_SHORT).show();




    }

}