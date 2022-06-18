package com.three;

public class Simbolo {
    private String simbolo;
    private String def;

    public Simbolo() {

    }

    public Simbolo(String simbolo, String def) {
        this.simbolo = simbolo;
        this.def = def;
    }
    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

}
