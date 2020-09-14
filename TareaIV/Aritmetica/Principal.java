package com.company;
import java.util.Scanner;


public class Principal extends Aritmetica{
        public static void main(String[] args) {

Scanner Sc = new Scanner(System.in);
Aritmetica Ar = new Aritmetica();

do {
Ar.Menu();
System.out.println("***************************");
System.out.println("Digite La Opcion Deseada");

Ar.Opcion = Sc.nextInt();
Ar.Solicitud();
Ar.Result();
}while (Ar.Opcion != 5);

        }
    }