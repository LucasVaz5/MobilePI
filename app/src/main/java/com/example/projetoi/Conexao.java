package com.example.projetoi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao  extends SQLiteOpenHelper {

    private static final String name ="D2W.bd";

    private static final int version = 1;

    public Conexao(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE table USERS" +
                "(id integer primary key autoincrement," +
                "NOME varchar (30), " +
                "EMAIL varchar (50), " +
                "SENHA varchar(50))");



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
