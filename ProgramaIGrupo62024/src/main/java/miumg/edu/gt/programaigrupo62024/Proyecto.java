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
//         private static List<Balsa> balsas = new ArrayList<>();
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
        Carro();
            break;
        case '2':
        Balsa();    
            break;
        case '3':
        Avion();    
            break;
        default:
            System.out.println("Opción no válida. Intente de nuevo.");
}
}
  
       public static void Carro() {
        int opcion;
    Carro carro =new Carro();
        Scanner scanner = new Scanner(System.in);
    System.out.println("\n    Vahículo: CARRO");
    System.out.println("-Tipo de Gasolina:\n ");
    carro.setGas(scanner.nextLine());
    System.out.println("-Marca:\n");            
    carro.setMarca(scanner.nextLine());
    System.out.println("-Modelo:\n"); 
    carro.setModelo(scanner.nextLine());
    System.out.println("-Color:\n"); 
    carro.setColor(scanner.nextLine());
    //carros.add(con1, carro);
     //       con1++;
    System.out.println("¿Que desea hacer a continuación?:\n 1. Finalizar Programa\n2. Volver a Sub-Menu");     
    opcion = scanner.next().charAt(0);
    switch(opcion){
            case '1':
            System.out.println("\nGracias por utilizar nuestro programa :D\n       ¡Hasta luego!");
            System.exit(opcion);
            break;
            default:
            System.out.println("Volviendo a Sub-Menu");
       }
} 
    
       
              private static void Balsa() {
        int opcion;
     Balsa balsa =new Balsa();
        Scanner scanner = new Scanner(System.in);
    System.out.println("\n    Vahículo: BALSA");
    System.out.println("\n-Motor o remo: ");
    balsa.setMotor(scanner.nextLine());
    System.out.println("\n-Marca:");            
    balsa.setMarca(scanner.nextLine());
    System.out.println("\n-Modelo:"); 
    balsa.setModelo(scanner.nextLine());
    System.out.println("\n-Color:"); 
    balsa.setColor(scanner.nextLine());
    //balsas.add(con2, balsa);
         //   con2++;
    System.out.println("¿Que desea hacer a continuación?:\n 1. Finalizar Programa\n2. Volver a Sub-Menu"); 
    opcion = scanner.next().charAt(0);
    switch(opcion){
            case '1':
            System.out.println("\nGracias por utilizar nuestro programa :D\n       ¡Hasta luego!");
            System.exit(opcion);
            break;
            default:
            System.out.println("Volviendo a Sub-Menu");
       }
}
                 
              private static void Avion() {
        int opcion;
        Avion avion =new Avion();
        Scanner scanner = new Scanner(System.in);
    System.out.println("\n    Vahículo: AVION");
    System.out.println("-Pasajeros(cantidad): ");
    avion.setPasajeros(scanner.nextInt());
    System.out.println("-Modelo:"); 
    avion.setModelo(scanner.nextLine());
    System.out.println("-Color:"); 
    avion.setColor(scanner.nextLine());
    System.out.println("-Marca:");            
    avion.setMarca(scanner.nextLine());
    //aviones.add(con3, avion);
          //  con3++;
    System.out.println("¿Que desea hacer a continuación?:\n1. Finalizar Programa\n2. Volver a Sub-Menu"); 
    opcion = scanner.next().charAt(0);
    switch(opcion){
            case '1':
            System.out.println("\nGracias por utilizar nuestro programa :D\n       ¡Hasta luego!");
            System.exit(opcion);
            break;
            default:
            System.out.println("Volviendo a Sub-Menu");
       }
} 
}