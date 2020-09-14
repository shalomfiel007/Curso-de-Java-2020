package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends DuplicarNumero {

        public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        DuplicarNumero Dp = new DuplicarNumero();

        System.out.println("Digite el numero Para Duplicarlo");
        Dp.NumeroDuplicar = Scan.nextInt();
        Dp.Duplica(Dp.NumeroDuplicar);
        Dp.Mostrar();


    }
}
