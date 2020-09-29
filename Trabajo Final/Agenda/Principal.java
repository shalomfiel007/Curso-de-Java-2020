package Agenda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean salir = false;
        boolean Salir1 = false;
        int opcion;
        int Opcion2;
        int Opcion3 = 0;

        Agenda agendaTelefonica = new Agenda(15);
        agendaTelefonica.Agregados();

        Contacto c;

        String nombre;
        String telefono;
        int id = 0;

        while (!salir) {
            System.out.println("***MENU DE OPCIONES***");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Contactos disponibles");
            System.out.println("6. Actualizar Contacto");
            System.out.println("7. Salir");

            try {
                System.out.println("...................");
                System.out.println("Digita una opcion");
                System.out.println("...................");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                            System.out.println("Escribe un nombre");
                            nombre = sn.next();

                            System.out.println("Escribe un telefono");
                            telefono = sn.next();

                            id = agendaTelefonica.contador;

                            c = new Contacto(id,nombre, telefono);

                            agendaTelefonica.aniadirContacto(c);

                                while (!Salir1){
                                System.out.println("");
                                System.out.println("Desea Agregar Otro Contacto");
                                System.out.println("1-Si");
                                System.out.println("2-No");
                                Opcion3 = sn.nextInt();
                                    if (Opcion3 == 1){
                                    System.out.println("Escribe un nombre");
                                    nombre = sn.next();

                                    System.out.println("Escribe un telefono");
                                    telefono = sn.next();

                                    id = agendaTelefonica.contador;

                                    c = new Contacto(id,nombre, telefono);

                                    agendaTelefonica.aniadirContacto(c);

                                }else {
                                        Salir1 = true;

                                    }
                               }

                         break;

                    case 2:
                        agendaTelefonica.listarContactos();
                        System.out.println("----------------------------------------------------");

                        break;
                    case 3:
                        System.out.println("1-Por Nombre");
                        System.out.println("2-Por Id");
                        System.out.println("3-Salir");
                        System.out.println("Escribe una de las opciones Para Buscar");
                        Opcion2 = sn.nextInt();
                        switch (Opcion2){
                            case 1:

                                System.out.println("Escribe un nombre");
                                nombre = sn.next();

                                agendaTelefonica.buscarPorNombre(nombre);
                           break;

                            case 2:

                                System.out.println("Escribe un Id");
                                id = sn.nextInt();

                                agendaTelefonica.buscarPorId(id);
                           break;
                            case 3:
                                break;
                        }

                        break;

                    case 4:

                        System.out.println("Escribe un nombre");
                        nombre = sn.next();

                        c = new Contacto(id,nombre, "");
                        agendaTelefonica.eliminarContacto(c);
                        break;
                    case 5:
                        System.out.println("Hay " + agendaTelefonica.CotactosLibres() + " contactos Disponible");

                        break;

                    case 6:
                        System.out.println("Escribe el id del Contacto");
                        id = sn.nextInt();
                        agendaTelefonica.buscarPorId(id);
                        System.out.println("Escribe el Nuevo nombre");
                        nombre = sn.next();
                        System.out.println("Escribe el Nuevo Telefono");
                        telefono = sn.next();

                        c = new Contacto(id,nombre,telefono);
                        agendaTelefonica.Actualizar(c,id);

                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números de las Opciones entre 1 y 7");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }

        }

    }

}

