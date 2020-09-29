package Agenda;

import java.util.Scanner;

public class Agenda {
    Scanner sn = new Scanner(System.in);

    private Contacto[]  contactos;
    int contador = 11;
    private int id;


    public Agenda(int tamanio) {
        this.contactos = new Contacto[tamanio];

    }

    public void Agregados(){

        this.contactos[0] = new Contacto(1,"JUAN BRITO","8099586964");
        this.contactos[1] = new Contacto(2,"JHON ADRIEL","8498808056");
        this.contactos[2] = new Contacto(3,"RAHEL GARABITOS","8099586965");
        this.contactos[3] = new Contacto(4,"JESUS MATEO","849546586");
        this.contactos[4] = new Contacto(5,"SANTA BAEZ","8095426256");
        this.contactos[5] = new Contacto(6,"CARLOS LARA","8499586423");
        this.contactos[6] = new Contacto(7,"ELVIN BRITO","8094586965");
        this.contactos[7] = new Contacto(8,"ALAN BRITO","8498569654");
        this.contactos[8] = new Contacto(9,"CAROL DE JESUS","8094253689");
        this.contactos[9] = new Contacto(10,"MANUEL PEREZ","8494586965");
    }

    public void aniadirContacto(Contacto c) {

        if (existeContacto(c)) {
            System.out.println("El contacto con ese nombre ya existe");
        } else if (agendaLlena()) {
            System.out.println("La agenda esta llena, no se pueden Agregar mas contactos");
        } else {

            boolean encontrado = false;
            for (int i = 0; i < contactos.length && !encontrado; i++) {
                if (contactos[i] == null) {
                    contactos[i] = c;
                    encontrado = true;
                }
            }

            if (encontrado) {
                System.out.println("Contacto Agregado");
                contador++;
            } else {
                System.out.println("Contacto No Agregar");
            }
        }

    }

    public boolean existeContacto(Contacto c) {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && c.equals(contactos[i])) {
                return true;
            }
        }
        return false;
    }

    public void listarContactos() {

        if (CotactosLibres() == contactos.length) {
            System.out.println("Agenda Vacia");
        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    System.out.println(contactos[i]);
                }
            }
        }

    }

    public void buscarPorNombre(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {

            if (contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("---------------------------------------------------");
                System.out.println("Su telefono es " + contactos[i].getTelefono()+" "+"Del Contacto #"+" "+contactos[i].getId());
                System.out.println("---------------------------------------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }

    }

    public void buscarPorId(int id) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {

            if (contactos[i].getId() == id) {
                System.out.println("---------------------------------------------------");
                System.out.println("Su telefono es--> " + contactos[i].getTelefono()+" "+"Del Contacto--> "+" "+contactos[i].getNombre());
                System.out.println("---------------------------------------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }

    }

    public boolean agendaLlena() {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                return false;
            }
        }

        return true;

    }

    public void eliminarContacto(Contacto c) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].equals(c)) {
                contactos[i] = null;
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Se ha eliminado el contacto");
        } else {
            System.out.println("No se ha eliminado el contacto");

        }

    }

    public int CotactosLibres() {

        int contadorLibres = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                contadorLibres++;
            }
        }

        return contadorLibres;

    }

    public void Actualizar(Contacto c,int id) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].getId() == id) {
                contactos[i] = null;
                contactos[i] = c;
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Se ha Actualizado el Contacto");
        } else {
            System.out.println("No se ha Actualizado el contacto");

        }

    }


}
