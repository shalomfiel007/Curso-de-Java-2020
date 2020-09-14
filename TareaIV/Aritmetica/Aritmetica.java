package com.company;
import java.util.Scanner;
public class Aritmetica {

Scanner Sc = new Scanner(System.in);

    int valor1;
    int valor2;
    int Resultado;
    int Opcion;

    public void Suma(){
        Resultado = (valor1 + valor2);
    }

    public void Resta(){
        Resultado = (valor1 - valor2);
    }

    public void Multiplica(){
        Resultado = (valor1 * valor2);
    }

    public void Divide(){ Resultado = (valor1 / valor2);}


    public void Menu(){
        System.out.println("----------------------------------");
        System.out.println("MENU DE OPCIONES");
        System.out.println("----------------------------------");

        System.out.println("1-SUMAR");
        System.out.println("2-RESTAR");
        System.out.println("3-MULTIPLICAR");
        System.out.println("4-DIVIDIR");
        System.out.println("5-Salir");

    }

    public void Result(){
        if (Opcion == 1){
            Suma();
            System.out.println("-------------------------");
            System.out.println("La suma es:"+Resultado);
            System.out.println("-------------------------");
        }else if(Opcion == 2){
            Resta();
            System.out.println("-------------------------");
            System.out.println("La Resta es:"+Resultado);
            System.out.println("-------------------------");
        }else if(Opcion == 3){
            Multiplica();
            System.out.println("-------------------------");
            System.out.println("La Multiplicacion es:"+Resultado);
            System.out.println("-------------------------");
        }else if(Opcion == 4){
            Divide();
            System.out.println("-------------------------");
            System.out.println("La Divicion es:"+Resultado);
            System.out.println("-------------------------");
        }else if(Opcion == 5){
            Opcion = 5;
            System.out.println("-------------------------");
            System.out.println("Saliendo del Sistema");
            System.out.println("-------------------------");
        }


    }
    public void Solicitud(){
        System.out.println("Digite El 1er Valor");
        valor1 = Sc.nextInt();
        System.out.println("Digite El 2do Valor");
        valor2 = Sc.nextInt();

    }
}
