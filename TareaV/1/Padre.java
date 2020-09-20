package com.company;

public class Padre {


    String Ms ;

    public Padre(){

        this.Ms = "Hola desde La Clase Padre";
    }

    public  void ShowMessage( String Mesaje){

        this.Ms = Mesaje;
         System.out.println(Ms);
    }


}
