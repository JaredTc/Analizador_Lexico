package com.three;

import java.util.ArrayList;

public class Simbolos {

    public ArrayList<String> simbolos(ArrayList<String> lista){
        ArrayList<String> lista_ = new ArrayList<>();
        for (String sin : lista){
            if (sin.equals(";")){
                 lista_.add(";");

            }
            if (sin.equals("(")){
                lista_.add("(");


            }
            if (sin.equals(")")){
                lista_.add(")");


            }
            if (sin.equals("{")){
                lista_.add("{");

            }
            if (sin.equals("}")){
                lista_.add("}");


            }
            if (sin.equals(".")){
                lista_.add(".");


            }

//            switch (sin){
//                case ";":
//                    lista_.add("; es un simbolo");
//                    break;
//                case "(":
//                    lista_.add("( es un simbolo");
//                    break;
//                case ")":
//                    lista_.add(") es un simbolo");
//                    break;
//                case  "{":
//                    lista_.add("{ es un simbolo");
//                    break;
//                case  "}":
//                    lista_.add("} es un simbolo");
//                    break;
//                case  ".":
//                    lista_.add(". es un simbolo");
//
//            }


        }
        return lista_;
    }

}
