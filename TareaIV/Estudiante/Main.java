package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Cajero{

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

Estudiante Es = new Estudiante("JUAN BRITO","8vo C");

           do {

               Es.Mostrar();
               Es.Promedio();

               if (Es.getPromedio() > 100){
                   System.out.println("----------------------------------------------------------");
                   System.out.println("El promedio No puede ser Mayor que 100, Revise las Notas");
                   System.out.println("----------------------------------------------------------");
               }else {
                   System.out.println("----------------------------------------");
                   System.out.println("Tiene un Promedio de "+" "+Es.getPromedio());
               }    System.out.println("---------------------------------------");
           }while (Es.getPromedio() > 100);





        }
    }

