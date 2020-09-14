package com.company;
import java.util.Scanner;
public class Estudiante {

   /* 2- Crear una clase llamada Estudiante con un campo llamado promedio, el cual solo podrá ser
    accedido mediante métodos accessores. El valor del promedio no puede estar por encima de
    100 que es la nota máxima.*/

    Scanner Sc = new Scanner(System.in);

    public String   Nombre;
    public String Curso;
    public int nota1;
    public int nota2;
    public int nota3;
    private int Promedio;

    public Estudiante(String N,String C){
        this.Nombre = N ;
        this.Curso = C;
    }

    public void Promedio(){

        System.out.println("Digite La Primera Nota");
        nota1 = Sc.nextInt();
        System.out.println("Digite La 2da Nota");
        nota2 = Sc.nextInt();
        System.out.println("Digite La 3ra Nota");
        nota3 = Sc.nextInt();

        Promedio = (nota1+nota2+nota3)/3;
    }


    public int getPromedio (){
    return Promedio;
    }

    public void Mostrar(){
        System.out.println("El Estudiate:"+" "+Nombre);
        System.out.println("Del Curso:"+" "+Curso);
    }
}
