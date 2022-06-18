package com.three;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.FileNotFoundException;


public class Interfaz extends JFrame {

    //Variables Globales
    JLabel lbl;
    JPanel panelSuperior;
    JPanel panelInferior;


    public Interfaz() throws FileNotFoundException {


        //Label Titulo Principal
        lbl = new JLabel("Analizador Lexico");
        lbl.setFont(new Font("Serif", Font.PLAIN, 44));
        panelSuperior = new JPanel();
        panelSuperior.add(lbl);

        //Declaracion y Estilos de la Tabla

        JTable jt = new JTable();
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        panelInferior = new JPanel();
        panelInferior.add(sp);

        //Se añaden las columnas
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Sintaxis");
        tableModel.addColumn("Token");
        tableModel.addColumn("Definicion");
        jt.setModel(tableModel);

        //llamado del objeto
        Concentrador vc = new Concentrador();

        String[] rows = new String[3];

        //Recorremos el Arraylist
        for (String lex : vc.regresar_todo()) {

            //Asignacion de Lexema
            rows[0] = String.valueOf(lex);

            //Asignacion de Token
            rows[1] = String.valueOf(lex);

            //Evaluacion y asignacion de definicion
            if (lex.matches("|;|[()]|[{}]")) {

                rows[2] = "Simbolo";

            } else if (lex.matches("[+]|[=]|[*]|[/][-]")) {

                rows[2] = "Operador Aritmetico";
            } else if (lex.matches("int|double|float|String|char|public|void|if")) {

                rows[2] = "Palabras Reservadas";
            } else if (lex.matches("[0-9]+")) {

                rows[2] = "Numero";
            }
            tableModel.addRow(rows);
        }




        // Añadimos todos los componentes
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(panelSuperior, BorderLayout.CENTER);
        this.getContentPane().add(panelInferior, BorderLayout.SOUTH);
        this.setVisible(true);
//        this.setLocationRelativeTo(null);
        this.setSize(1200, 680);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

