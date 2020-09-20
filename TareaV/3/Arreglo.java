package com.company;
import javax.print.attribute.standard.NumberUp;
import javax.print.attribute.standard.PrinterURI;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Arreglo {



    int[] Numero= {9,15,1,14,8,7,6,5};
    int suma;
    int promedio;
    int menor;


    public void Sarreglo(){

        for (int i = 0; i < Numero.length; i++) {
            suma += Numero[i];

        }
        System.out.println("La suma es:"+" "+suma);
    }

    public void Promed(){

        promedio = suma / Numero.length;

        System.out.println("EL Promedio es:"+" "+promedio);
    }


    public void Ordenar(){

        Arrays.sort(Numero);

        System.out.println("--------"+"El Orden es"+"---------");
        System.out.println(Arrays.toString(Numero));
        System.out.println("----------------------------");
    }

}
