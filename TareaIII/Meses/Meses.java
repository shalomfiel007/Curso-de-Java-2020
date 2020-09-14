package com.company;

public class Meses {

    int Mes;
    String Mensaje = "Digite Otro Mes";


    public int ResivirMes(int elmes){

        if (elmes == 1 ){
            System.out.println("Enero");

        }else if (elmes == 2 ){

            System.out.println("Febrero");

        }else if (elmes == 3 ){

            System.out.println("Marzo");

        }else if (elmes == 4 ){

            System.out.println("Abrir");

        }else if (elmes == 5 ){

            System.out.println("Mayo");

        }else if (elmes == 6 ){

            System.out.println("Junio");

        }else if (elmes == 7 ){

            System.out.println("Julio");

        }else if (elmes == 8 ){

            System.out.println("Agosto");

        }else if (elmes == 9 ){

            System.out.println("Septiembre");

        }else if (elmes == 10 ){

            System.out.println("Octubre");

        }else if (elmes == 11 ){

            System.out.println("Noviembre");

        }else if (elmes == 12 ){

            System.out.println("Diciembre");

        }else {
            System.out.println("El Año Solo Tiene 12 Meses");
        }

        return (elmes);

    }
    public void Mostrar(){

        System.out.println("Es el Mes:"+" "+ResivirMes(Mes));
    }
}
