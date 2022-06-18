package com.three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cargar_documento {
    public ArrayList<String> Cargar_doc() throws FileNotFoundException {
                    ArrayList<String> lista = new ArrayList<>();
                    String contador = "";
                    Scanner txt = new Scanner(new File("C:\\Users\\Jared\\Documents\\texto.txt"));
                    while (txt.hasNextLine()) {
                        contador = contador + txt.nextLine();

                    }
                    String[] separar = contador.split("[a-zA-z]|  |");
                    for (String string : separar) {
                        if (!string.equals("")) {
                            lista.add(string);
            }

        }

        return lista;
    }

    public ArrayList<String> tipos_de_variables() throws FileNotFoundException {
        ArrayList<String> lista = new ArrayList<>();
        String contador = "";
        Scanner txt = new Scanner(new File("C:\\Users\\Jared\\Documents\\texto.txt"));
        while (txt.hasNextLine()) {
            contador = contador + txt.nextLine();

        }
        String[] separar = contador.split(" |;|[()]|[{}]");
        for (String string : separar) {
            if (!string.equals("")) {
                lista.add(string);
            }

        }

        return lista;
    }
}
