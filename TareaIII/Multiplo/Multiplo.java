package com.company;

public class Multiplo {

    int Hasta = 1000;
    int Multiplo = 5;
    int i ;

    public void Multip(){

        for (i=1; i <=Hasta; i++) {

            if (i % Multiplo == 0)
                System.out.println(i);

        }

    }
}
