package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends NumerosYsuma {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);


        System.out.println("Use El cero(0) para salir");
        System.out.println("Introduce Números.");

        NumerosYsuma n = new NumerosYsuma();
        n.Numero = Scan.nextInt();

        do {
            try {
                n.Numero = Scan.nextDouble();
                n.lista.add(n.Numero);


            } catch (InputMismatchException ime){
                System.out.println("¡Solo Puede Digitar Numero!.");
                Scan.next();
            }
        } while (n.Numero!=0);

        n.Mostrar();


        for(int i = 0; i < n.lista.size(); i++)
        {
            n.Suma += n.lista.get(i);
        }
        System.out.println("La suma de los Numero es:"+" "+n.Suma);
        System.out.println("La Cantida de Numero Digitados fue:"+" "+n.lista.stream().count());




    }
}
