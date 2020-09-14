package com.company;
import jdk.dynalink.Operation;

import java.util.Scanner;


public class Principal extends Aritmetica {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int Opcion = 0;
        do {


            System.out.println("ELIJA EL PERSONAJE");
            System.out.println("");
            System.out.println("1-Mario");
            System.out.println("2-Koopa");
            System.out.println("3-Salir");
            Opcion = Sc.nextInt();

            Koopa kp = new Koopa();
            Mario Mr = new Mario();
            if (Opcion == 1) {
                int Mover = 0;
                System.out.println("Elejiste a:" + " " + Mr.Nombre);
                System.out.println("");
                System.out.println("1-Mover Arriba");
                System.out.println("2-Mover Abajo");
                System.out.println("3-Mover A la Derecha");
                System.out.println("4-Mover A la Izquierda");
                Mover = Sc.nextInt();
                if (Mover == 1) {
                    Mr.MoverArriba();
                } else if (Mover == 2) {
                    Mr.MoverAbajo();
                } else if (Mover == 3) {
                    Mr.MoverDerecha();
                } else if (Mover == 4) {
                    Mr.MoverIzquierda();
                }

            } else if (Opcion == 2) {
                int Mover = 0;
                System.out.println("Elejiste a:" + " " + kp.Nombre);
                System.out.println("");
                System.out.println("1-Mover Arriba");
                System.out.println("2-Mover Abajo");
                System.out.println("3-Mover A la Derecha");
                System.out.println("4-Mover A la Izquierda");
                Mover = Sc.nextInt();
                if (Mover == 1) {
                    Mr.MoverArriba();
                } else if (Mover == 2) {
                    Mr.MoverAbajo();
                } else if (Mover == 3) {
                    Mr.MoverDerecha();
                } else if (Mover == 4) {
                    Mr.MoverIzquierda();
                }

            }


        }while (Opcion !=3);
    }
}