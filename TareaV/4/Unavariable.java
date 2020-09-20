package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Unavariable {
    Scanner Sn = new Scanner(System.in);
    List<Integer> lista = new ArrayList<Integer>();
    int Numero;
    int Cantidad;
    int Contador;



    public  void ElegirNumeros(){

        System.out.println("Digite la Cantidad de Numeros");
        Cantidad = Sn.nextInt();
        do {
            System.out.println("Digite Los"+" "+Cantidad+" "+"Numeros");
            Numero = Sn.nextInt();

            lista.add(Numero);
            Contador ++;
        }while (Cantidad != Contador);



    }

    public void Mostrar(){
        Arrays.sort(new int[]{Numero});

            System.out.println("--------"+"Los Numeros Son"+"---------");
            System.out.println(Arrays.toString(new int[]{Numero}));
            System.out.println("---------------------------------");
        }
    }

