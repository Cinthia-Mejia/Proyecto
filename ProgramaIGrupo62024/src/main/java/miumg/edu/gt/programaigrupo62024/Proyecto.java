/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package miumg.edu.gt.programaigrupo62024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  Proyecto{
//    static int con1 =0;
//    static int con2 =0;
//    static int con3 =0;
 static Scanner scanner = new Scanner(System.in);
//        private static List<Carro> carros = new ArrayList<>();
//        private static List<Avion> aviones = new ArrayList<>();
//        private static List<Balsa> balsas = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cerrar el scanner al finalizar
        mostrarMenu();
    }

    private static void mostrarMenu() {
        
  
      int opcion;
        do {
            System.out.println("\n    Menú Principal");
            System.out.println("1: Fase 1 – Objetos y recursividad\n2: Fase 2\n3: Fase 3\n4: Salir del programa");
            System.out.print("\n----Ingrese su opción: ");
            opcion = Integer.parseInt(scanner.next());
            switch (opcion) {
                case 1:
                    mostrarSubMenu();
                    break;
                case 2:
                    // Fase 2
                    break;
                case 3:
                    //  Fase 3
                    break;
                case 4:
                    System.out.println("\nGracias por utilizar nuestro programa :D\n       ¡Hasta luego!");
                    break;
                default:
                    System.out.println("\n\n      Opción no válida. Intente de nuevo");
            }
        } while (opcion != 4);
    }

      private static void mostrarSubMenu() {
        char opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n    Submenú: Fase 1");
            System.out.println("a: Ingresar datos de vehículos\nb: Mostrar datos del vehículo\n"
                    + "c: Crear una torre de Hanoi\nd: Regresar al menú principal");
            System.out.print("\n-----Ingrese su opción: ");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'a':
                    ingresarDatosVehiculo();
                    break;
                case 'b':
                   // MostrarDatos();
                            
                    break;
                case 'c':
                //TorreHanoi();
                    
                    break;
                case 'd':
                    System.out.println("Regresando al menú principal...");
                    return; // Regresar al menú principal
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (true);
    }  

      
    private static void ingresarDatosVehiculo() {
        int opcion;
        Scanner scanner = new Scanner(System.in);
    System.out.println("\n    Seleccione el tipo de vehículo:\n1. Carro\n2. Balsa\n3. Avión");
    System.out.println("\n-----Ingrese su opción: ");
    opcion = scanner.next().charAt(0);
    switch (opcion) {
        case '1':
        //Carro();
            break;
        case '2':
        //Balsa();    
            break;
        case '3':
        //Avion();    
            break;
        default:
            System.out.println("Opción no válida. Intente de nuevo.");
}
}
  }  