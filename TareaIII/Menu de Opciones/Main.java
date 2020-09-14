package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends MenuOpciones{

        public static void main(String[] args) {

            Scanner Scan = new Scanner(System.in);
            MenuOpciones Mo = new MenuOpciones();


            do {
                System.out.println("MENU DE OPCIONES");
                System.out.println("1-Convertir grados a Celsiu= s a Fahrenheit");
                System.out.println("2-Convertir dólar a pesos");
                System.out.println("3-Convertir metros a pies");
                System.out.println("4-Salir");

                Mo.Elegir = Scan.nextInt();
                Mo.Opcion();
                System.out.println("");
            }while (Mo.Elegir != 4);



    }
}
