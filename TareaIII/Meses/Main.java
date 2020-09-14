package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends DuplicarNumero {

        public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
       Meses m = new Meses();

        System.out.println("Digite el Numero del Mes(1 al 12)");

        if (m.Mes < 13){
            m.Mes = Scan.nextInt();
            m.Mostrar();
        }else{

            return;
        }




    }
}
