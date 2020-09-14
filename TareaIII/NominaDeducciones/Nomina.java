package com.company;
import java.util.Scanner;

public class Nomina {


    /*8- Realizar un programa que reciba por teclado el sueldo de un empleado y le aplique los
    cálculos de ISR (ver tabla DGII), ARS, y AFP (investigar porcentajes)*/

    Scanner sc = new Scanner(System.in);

    double Sueldo;
    double Isr;
    double Ars;
    double Afp;
    double SueldoAnual;
    double Deducciones;

    public void Calcula(){

        System.out.println("Digite El Sueldo Bruto");
        Sueldo = sc.nextDouble();

        //ARS
        Ars = Sueldo * 0.0304;
        //AFP
        Afp  = Sueldo * 0.0287;

        //ISR
        //Sumo el Total de Deducciones
        Deducciones = Ars+Afp;
        //Resto Las Deducciones del Sueldo Anual
        Sueldo =  Sueldo - Deducciones;
        //calculo el Sueldo Anual
        SueldoAnual = Sueldo * 12;

                if (SueldoAnual > 416220.00 && SueldoAnual < 624329.00) {
                    SueldoAnual = SueldoAnual - 416220.00;
                          SueldoAnual  *= 0.15;

                } else if (SueldoAnual > 624329.00 && SueldoAnual < 867123.00) {
                    SueldoAnual = SueldoAnual - 624329.00;
                    SueldoAnual  *= 0.20;
                    SueldoAnual = SueldoAnual +  31216.00;

                } else if (SueldoAnual > 867123.01) {
                    SueldoAnual = SueldoAnual - 867123.01;
                    SueldoAnual  *= 0.25;
                    SueldoAnual = SueldoAnual +  79776.00;
            }
                Isr = SueldoAnual / 12;
                Sueldo = Sueldo - Isr;
        }
    }



