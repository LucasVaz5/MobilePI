package com.example.projetoi;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UserDAO {

    private Conexao conexao;
    private SQLiteDatabase D2W;


    public UserDAO(Context context) {
        conexao = new Conexao(context);
        D2W = conexao.getReadableDatabase();
        D2W = conexao.getWritableDatabase();
    }
    public long inserir (Users user){
        ContentValues  values = new ContentValues();
        values.put("NOME", user.getNOME());
        values.put("EMAIL",user.getEMAIL());
        values.put("SENHA",user.getSENHA());
        D2W.insert("USERS",null, values);
        return D2W.insert("USERS", null , values);

    }

}
