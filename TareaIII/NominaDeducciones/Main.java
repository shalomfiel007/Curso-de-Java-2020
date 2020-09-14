package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Nomina{

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

     Nomina Nm = new  Nomina();

           Nm.Calcula();


           System.out.println("DEDUCCCIONES");
           System.out.println("AFP"+" "+Nm.Afp);
           System.out.println("");
            System.out.println("SFS"+" "+Nm.Ars);
            System.out.println("");
            System.out.println("ISR"+" "+Nm.Isr);
            System.out.println("");
            System.out.println("Tota Deducciones"+" "+Nm.Deducciones+ Nm.Isr);
            System.out.println("");
           System.out.println("El sueldo a Cobrar es:"+" "+Nm.Sueldo);

        }
    }

