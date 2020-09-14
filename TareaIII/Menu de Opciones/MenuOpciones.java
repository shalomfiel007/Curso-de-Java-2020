package com.company;
import java.util.Scanner;

public class MenuOpciones {

 /*6- Realizar un programa que presente un menú con las siguientes opciones (usar  funciones)
1-Convertir grados a Celsiu= s a Fahrenheit
2-Convertir dólar a pesos
3-Convertir metros a pies
4-Salir
  */


 Scanner Scan = new Scanner(System.in);

    double Elegir;


    public void Opcion(){
//1-Convertir grados a Celsius a Fahrenheit
        if (Elegir == 1 ){
        int Gradof;
        int Celsius;
        System.out.println("Digite Los Grados en Fahrenheit ");
        Gradof = Scan.nextInt();
        Celsius = (Gradof - 32) * 5/9;

            System.out.println("Los Grados en Celsius Son:"+" "+Celsius);

        }else if (Elegir == 2 ){
//2-Convertir dólar a pesos

            double Dollar;
            double  Tasa = 57.73;
            double Pesos;

            //System.out.println("Digite La Tasa del Dollar");
            //Tasa = Scan.nextInt();
            System.out.println("Digite el Monto En  Dollar");
            Dollar = Scan.nextDouble();

            Pesos = Dollar * Tasa;
            System.out.println("El Monto en Pesos es:"+" "+Pesos);

        }else if (Elegir == 3 ){
//3-Convertir metros a pies
            double Metros;
            double Pies;
            double formula;

            formula = 3.28;

            System.out.println("Digite el Numero de Metros");
            Metros = Scan.nextDouble();

            Pies = Metros * formula;


            System.out.println("La cantidad de Pies es:"+" "+Pies);

        }else if (Elegir == 4 ){

  //4-Salir


            System.out.println("Saliendo del Sistema");

        }

    }
}
