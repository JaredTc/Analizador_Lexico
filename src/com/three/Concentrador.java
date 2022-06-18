package com.three;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Concentrador {
    Cargar_documento lista_com = new Cargar_documento();
    Simbolos obj = new Simbolos();
    Numericos obj2 = new Numericos();
    Aritmeticos obj3 = new Aritmeticos();
    Palabras_reservadas obj4 = new Palabras_reservadas();



    public ArrayList<String> regresar_todo() throws FileNotFoundException {
        ArrayList<String> lista_todo = new ArrayList<>();
        for (String simbolos : obj.simbolos(lista_com.Cargar_doc())) {
            lista_todo.add( simbolos );

        }

        for (String numeros :obj2.numeros(lista_com.Cargar_doc())) {
            lista_todo.add( numeros );
        }

        for (String operadores : obj3.operadores_aritmeticos(lista_com.Cargar_doc())) {
            lista_todo.add( operadores );
        }
        for (String tipos_var :obj4.Tipos_var(lista_com.tipos_de_variables())) {
            lista_todo.add( tipos_var );
        }


        return lista_todo;
    }




}
