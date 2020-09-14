package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main extends Nenteros {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);


        System.out.println("Usa  El cero(0) para salir");
        System.out.println("Introduce Números.");

        Nenteros n = new Nenteros();
        n.Numero = Scan.nextInt();

        do {
            try {
                n.Numero = Scan.nextInt();
                n.lista.add(n.Numero);


            } catch (InputMismatchException ime){
                System.out.println("¡Solo Puede Digitar Numero Enteros!.");
                Scan.next();
            }
        } while (n.Numero!=0);

        n.Mostrar();





    }
}
