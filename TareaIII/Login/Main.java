package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Login {

        public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Login lg = new Login();


        do {

            System.out.println("Digite El Usuario");
            lg.Usuario = Scan.next();
            System.out.println("Digite La Clave");
            lg.Clave = Scan.next();

            System.out.println(Login(lg.Usuario, lg.Clave));

            lg.Mostrar();
        }while (Login(lg.Usuario, lg.Clave) == false);




    }
}
