package com.company;

public class Login {

    String Usuario;
    String Clave;
    int Intentos;




    static boolean Login(String Usu,String Cla){

        if (Usu.equals("Admin") && Cla.equals("123456")){
            return true;

        }else {
            return false;
        }

    }

    public void Mostrar(){

        if (Usuario.equals("Admin") && Clave.equals("123456")){

            System.out.println("Acceco Correcto");

        }else {
            System.out.println("Usuario O Clave Inconrrectos");
        }

    }
}
