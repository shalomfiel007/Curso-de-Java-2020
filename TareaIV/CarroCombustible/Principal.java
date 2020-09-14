package com.company;
import jdk.dynalink.Operation;

import java.util.Scanner;


public class Principal extends Aritmetica {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
     Carro Cr = new Carro();
     Cr.Carro("TOYOTA","NEGRO","","COROLLA","");
     Cr.Mostrar();

     Cr.CantidadCombustible = 5;
     do {
         System.out.println("EL AUTO ESTA ENCENDIDO");
         System.out.println("Su Combustible es "+" "+Cr.CantidadCombustible+" "+"Galones");
         System.out.println("Precio 1 Para Abanzar en el Auto");
         Cr.Abanzar = Sc.nextInt();
         if (Cr.Abanzar == 1){
             Cr.Encender();
             Cr.CantidadCombustible --;

         }else {
             System.out.println("---------------------------------");
             System.out.println("Solo Puede Avanzar Si Preciona 1");
             System.out.println("---------------------------------");
             System.out.println("");
         }

         if (Cr.CantidadCombustible == 0){
             System.out.println("El Auto ya no Tiene Mas Combustible, Se Apagara");
         }
     }while (Cr.CantidadCombustible > 0);

      System.out.println("*****************");
      System.out.println("AUTO APAGADO");
      System.out.println("*****************");
    }
}