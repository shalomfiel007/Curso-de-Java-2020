package com.company;

public class Pvectorial {

  int v[] = { 2,4,6}, w[]= { 1,3,5};

    /*
    Matriz 3x2
    2 1
    4 3
    6 5
    */
    public void LlenarMatriz(){

        int[][] matriz = new int[3][2];
        matriz[0][0] = v[0]*w[0];
        matriz[0][1] = v[1]*w[1];
        matriz[1][1] = v[2]*w[2];

        System.out.println("El Producto Vectorial es:"+" "+"Columna[1] Fila[1]---> "+matriz[0][0]+" "+"Columna[1] Fila[2]---> "+matriz[0][1]+" "+"Columna[1] Fila[3]---> "+matriz[1][1]);

    }



}
