package com.example.projetoi;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UserDAO {

    private Conexao conexao;
    private SQLiteDatabase banco;


    public UserDAO(Context context) {
        conexao = new Conexao(context);
        banco = conexao.getReadableDatabase();
    }
    public long inserir (Users user){
        ContentValues  values = new ContentValues();
        values.put("NOME", user.getNOME());
        values.put("EMAIL",user.getEMAIL());
        values.put("SENHA",user.getSENHA());
        banco.insert("USERS",null, values);
        return banco.insert("USERS", null , values);

    }

}
