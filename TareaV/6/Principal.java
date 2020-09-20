package com.company;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Principal {

    static Scanner sn = new Scanner(System.in);

            public static void main(String[] args) {

            ProdEscarlar pe = new ProdEscarlar();

            pe.llenarVector();
            System.out.println("El Producto Escalar es:"+" "+pe.pEscalar());
    }

}



