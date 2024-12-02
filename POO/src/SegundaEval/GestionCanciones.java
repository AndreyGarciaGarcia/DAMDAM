package SegundaEval;

import java.util.ArrayList;
import java.util.Scanner;
import Utilidades.Cancion;

public class GestionCanciones {
    
    public static final int OPCION_ALTA = 1;
    public static final int OPCION_LISTADO = 2;
    public static final int OPCION_SALIR = 3;

    public static ArrayList<Cancion> listaCanciones = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        
        while (opcion != OPCION_SALIR) {
            mostrarMenu();
            opcion = obtenerOpcion();
            procesarOpcion(opcion);
        }
        
        System.out.println("¡Hasta luego!");
    }

    // Mostrar el menú
    private static void mostrarMenu() {
        System.out.println("MENU:");
        System.out.println(OPCION_ALTA + ". Alta");
        System.out.println(OPCION_LISTADO + ". Listado");
        System.out.println(OPCION_SALIR + ". Salir");
    }

    //Obtener la opcion que el ususario escriba
    private static int obtenerOpcion() {
        System.out.print("Elige una opción: ");
        return sc.nextInt();
    }

    //Elegir opcion
    private static void procesarOpcion(int opcion) {
        sc.nextLine();  //Para limpiar Buffer
        switch (opcion) {
            case OPCION_ALTA:
                alta();
                break;
            case OPCION_LISTADO:
                listado();
                break;
            case OPCION_SALIR:
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Método Alta
    private static void alta() {
        System.out.print("Introduce el nombre de la canción: ");
        String nombre = sc.nextLine();
        
        System.out.print("Introduce el nombre del grupo de música: ");
        String grupo = sc.nextLine();
        
        System.out.print("Introduce el año de publicación: ");
        int anio = sc.nextInt();
        
        sc.nextLine();

        Cancion nuevaCancion = new Cancion(nombre, grupo, anio);
        listaCanciones.add(nuevaCancion);
        
        System.out.println("Canción añadida con éxito.");
    }
    
    // Método Listado
    private static void listado() {
        if (listaCanciones.isEmpty()) {
            System.out.println("No hay canciones registradas.");
            
        } else {
            System.out.println("\nListado de canciones:");
            for (Cancion cancion : listaCanciones) {
                System.out.println(cancion);
            }
        }
    }
}

