package com.three;

import java.util.ArrayList;

public class Aritmeticos {
    public ArrayList<String> operadores_aritmeticos(ArrayList<String> lista){
        ArrayList<String> lista_ = new ArrayList<>();
        for (String operadores: lista ) {
            if (operadores.matches("[+]|[=]|[*]|[/][-]")){
                lista_.add(operadores );
             //   lista_.add(" Es un operador Aritmetico");
            }

        }
        return lista_;
    }
}
