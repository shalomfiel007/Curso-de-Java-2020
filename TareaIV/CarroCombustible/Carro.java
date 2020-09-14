package com.company;

public class Carro {

   /* Cree una clase Carro, con un campo llamado _cantidadCombustible y un método que se llame
    Encender el cual en base a la gasolina disponible mostrara si el carro pudo o no avanzar. Cada
    vez que el método se ejecute, deberá restarse 1 a la gasolina disponible. La cantidad de gasolina
    debe establecerse al momento de instanciar un objeto de del tipo de la Clase*/


    int CantidadCombustible = 0;
    String Marca;
    String Color;
    String Tipo;
    String Modelo;
    String Placa;
    int Abanzar;


    public void Carro(String M,String C,String T,String Mod,String P){

        Marca = M;
        Color = C;
        Tipo = T;
        Modelo = Mod;
        Placa = P;
    }
    public void Mostrar() {
        System.out.println("La Marca del Auto es:" +Marca+ " "+ "El Color es:" + " " + Color + " " + "Modelo:" + " " + Modelo);

    }
        public void Encender(){

    if (CantidadCombustible > 0){

        System.out.println("El Auto Abanzo");
    }

    }
}
