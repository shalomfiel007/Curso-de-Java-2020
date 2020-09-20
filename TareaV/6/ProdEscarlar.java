package com.company;

public class ProdEscarlar {

    static int v[] = { 2,4,6}, w[]= { 1,3,5};
    public  void llenarVector(){

        for(int i = 0; i < v.length; i++){

        }

        for(int j = 0; j < w.length; j++){

        }
    }

    public  double pEscalar(){
        int xEscalar = 0;

        for(int i = 0; i < v.length; i++){
            xEscalar = xEscalar + (v[i] * w[i]);
        }

        return xEscalar;
    }
}
