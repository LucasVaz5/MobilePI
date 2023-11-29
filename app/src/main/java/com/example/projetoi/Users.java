package com.example.projetoi;

import java.io.Serializable;

public class Users implements Serializable {
    private int ID;
    private String NOME;
    private String EMAIL;
    private int SENHA;





    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public int getSENHA() {
        return SENHA;
    }

    public void setSENHA(int SENHA) {
        this.SENHA = SENHA;
    }
}
