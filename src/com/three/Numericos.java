package com.three;

import java.util.ArrayList;

public class Numericos {
    public ArrayList<String> numeros(ArrayList<String> lista){
        ArrayList<String> list_ = new ArrayList<>();
        for (String numeros: lista) {

            if (numeros.matches("[0-9]+")){
                 list_.add(numeros);
//                list_.add(" este es un NUmero");
            }

        }
        return list_;
    }
}
