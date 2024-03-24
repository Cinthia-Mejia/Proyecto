/* //codigo de Darío
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package miumg.edu.gt.programaigrupo62024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  Proyecto{
    static int con1 =0;
    static int con2 =0;
    static int con3 =0;
 static Scanner scanner = new Scanner(System.in);
        private static List<Carro> carros = new ArrayList<>();
        private static List<Avion> aviones = new ArrayList<>();
         private static List<Balsa> balsas = new ArrayList<>();
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

      private static void mostrarSubMenu() 
      {
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
                    MostrarDatos();                         
                    break;
                case 'c':
                    TorreHanoi();         
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
            System.out.println("\nOpción no válida. Intente de nuevo.\n");
    }
} //Codigo de Darío
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
    carros.add(con1, carro);
           con1++;
    System.out.println("¿Que desea hacer a continuación?:\n 1. Finalizar Programa\n2. Volver a Sub-Menu");     
    opcion = scanner.next().charAt(0);
    switch(opcion){
            case '1':
            System.out.println("\nGracias por utilizar nuestro programa :D\n       ¡Hasta luego!");
            System.exit(opcion);
            break;
            default:
            System.out.println("\nVolviendo a Sub-Menu\n");
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
    balsas.add(con2, balsa);
            con2++;
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
    aviones.add(con3, avion);
            con3++;
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
 private static void  MostrarDatos (){
    int opcion;
    Carro carrito=new Carro();
    Balsa balsita=new Balsa();
    Avion avioncito=new Avion();
    
        Scanner scanner = new Scanner(System.in);
             System.out.println("\n¿Que vehículo desea consultar?\n\n1. Carro\n2. Balsa\n3. Avion\n\n----Ingrese su opción:");
             opcion = scanner.next().charAt(0);
             switch(opcion){
                 case '1':////////////Carro   
         
                     if ( carros.isEmpty() == false){ 
                         for (int i=0; i< carros.size();i++  ){
                             System.out.println("\n---------Datos Ingresados (CARRO):\nTipo de Gasolina: " + carros.get(i).getGas() +
                     "\nColor: " + carros.get(i).getColor() + "\nMarca: " + carros.get(i).getMarca() + "\nModelo: " + carros.get(i).getModelo() ); 
                     }
                         }
                     
                     else{
                         System.out.println("\nNo se han registrado datos previamente\n");
                     }                    
             break;
                 case '2'://///////////balsa 
                     if ( balsas.isEmpty() == false){ 
                         for (int i=0; i< balsas.size();i++  ){
                             System.out.println("\n---------Datos Ingresados (BALSA):\nMotor o remo: " + balsas.get(i).getMotor() +
                     "\nColor: " + balsas.get(i).getColor() + "\nMarca: " + balsas.get(i).getMarca() + "\nModelo: " + balsas.get(i).getModelo() ); 
                     }
                         }
                     else{
                         System.out.println("\nNo se han registrado datos previamente\n");
                     }
             break;
             case '3'://///////////avion
                 if ( aviones.isEmpty() == false){ 
                         for (int i=0; i< aviones.size();i++  ){
                             System.out.println("\n---------Datos Ingresados (AVION):\nTipo de Gasolina: " + aviones.get(i).getPasajeros() +
                     "\nColor: " + aviones.get(i).getColor() + "\nMarca: " + aviones.get(i).getMarca() + "\nModelo: " + aviones.get(i).getModelo() ); 
                     }
                         }
             else{
                         System.out.println("\nNo se han registrado datos previamente\n");
                     }
             break;
             }   
}   
 public static void  TorreHanoi (){
            int numDiscos;
        do {
            System.out.print("Ingrese la cantidad de discos (mínimo 3): ");
            numDiscos = scanner.nextInt();
            if (numDiscos < 3) {
                System.out.println("Debe ingresar al menos 3 discos.");
            }
        } while (numDiscos < 3);

        System.out.println("\nMovimientos de la Torre de Hanoi:");
        torreHanoi(numDiscos, 1, 3, 2);

        System.out.print("\n¿Desea regresar al submenú? (s/n): ");
        char regresar = scanner.next().charAt(0);
        if (regresar != 's') {
            System.out.println("Regresando al menú principal...");
        }
}
        public static void torreHanoi(int numDiscos, int torreOrigen, int torreDestino, int torreAuxiliar) {
        if (numDiscos == 1) {
            System.out.println(torreOrigen + " --> " + torreDestino);
        } else {
            torreHanoi(numDiscos - 1, torreOrigen, torreAuxiliar, torreDestino);
            System.out.println(torreOrigen + " --> " + torreDestino);
            torreHanoi(numDiscos - 1, torreAuxiliar, torreDestino, torreOrigen);
        }
    }

}  
