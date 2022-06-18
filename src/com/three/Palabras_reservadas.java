package com.three;

import java.util.ArrayList;

public class Palabras_reservadas {
    public ArrayList<String> Tipos_var(ArrayList<String> lista){
        ArrayList<String> lista_ = new ArrayList<>();
        for (String tipos_de_variables: lista) {
            if (tipos_de_variables.matches("int|double|float|String|char|public|void|if")){
               lista_.add(tipos_de_variables );

            }
        }
        return lista_;
    }
}
