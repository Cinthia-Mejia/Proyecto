package miumg.edu.gt.programaigrupo62024;


import clases_db.Aviondb;
import clases_db.AviondbJpaController;
import clases_db.Balsadb;
import clases_db.BalsadbJpaController;
import clases_db.Carrodb;
import clases_db.CarrodbJpaController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class  Proyecto{
    static int contGlobal=0;
    static int con1 =0;
    static int con2 =0;
    static int con3 =0;
 static Scanner scanner = new Scanner(System.in);
        private static List<Carro> carros = new ArrayList<>();
        private static List<Avion> aviones = new ArrayList<>();
        private static List<Balsa> balsas = new ArrayList<>();
        private static Vehiculo[] vehiculos= new Vehiculo[10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cerrar el scanner al finalizar
        inicializarVehiculos();
        mostrarMenu();
    }
    private static void inicializarVehiculos() {
    for (int i = 0; i < vehiculos.length; i++) {
        vehiculos[i] = new Vehiculo(); // O inicializa como un objeto de la clase base Vehiculo
    }
}  
    private static void mostrarMenu() {
      int opcion;
        do {
            System.out.println("\n    Menú Principal");
            System.out.println("1: Fase 1 – Objetos y recursividad\n2: Fase 2 - Arreglos\n3: Fase 3 - Base de datos\n4: Salir del programa");
            System.out.print("\n----Ingrese su opción: ");
            opcion = Integer.parseInt(scanner.next());
            switch (opcion) {
                case 1:
                    mostrarSubMenu1();
                    break;
                case 2:
                    mostrarSubMenu2();
                    break;
                case 3:
                    mostrarSubMenu3();
                    break;
                case 4:
                    System.out.println("\nGracias por utilizar nuestro programa :D\n       ¡Hasta luego!"); 
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\n      Opción no válida. Intente de nuevo");
            }
        } while (opcion != 4);
    }

      private static void mostrarSubMenu1() 
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
                    System.out.println("\nRegresando al menú principal...");                   
                    return; // Regresar al menú principal
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (true);
    }  
      private static void mostrarSubMenu2() {
      char opcion;
        do {
            System.out.println("\n    Sub Menú: Fase 2");
            System.out.println("a: Agregar Carro\nb: Agregar Balsa\nc: Agregar Avión\nd: Ordenar Arreglo\ne: Mostrar Arreglo\n");
            System.out.print("\n----Ingrese su opción: ");
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'a':
                    Carro();
                    break;
                case 'b':
                    Balsa();
                    break;
                case 'c':
                    Avion();
                    break;
                case 'd':
                    ordenarArreglo();
                    break;
                 case 'e':
                    imprimirArreglo();    
                    break;
                default:
                    System.out.println("\n\n      Opción no válida. Intente de nuevo");
            }
        } while (opcion != 4);
    }
      
      private static void mostrarSubMenu3() 
      {
        char opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n    Submenú: Fase 3");
            System.out.println("a: Trabajar con Carros\nb: Trabajar con Balsas\n"
                    + "c: Trabajar con Aviones\nd: Regresar al menú principal");
            System.out.print("\n-----Ingrese su opción: ");
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'a':
                    trabajarCarro();
                    break;
                case 'b':
                    trabajarBalsa();                         
                    break;
                case 'c':
                    trabajarAvion ();         
                    break;
                case 'd':
                    System.out.println("\nRegresando al menú principal...");
                    mostrarMenu();
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
            System.out.println("\nOpción no válida. INTENTELO NUEVAMENTE.\n");
    }
} //Codigo de Darío
        public static void Carro() {
            if(contGlobal <= 9){             
         int opcion;
     Carro carro =new Carro();
        Scanner scanner = new Scanner(System.in);
     System.out.println("\n    Vahículo: CARRO");
     System.out.println("-ID:");
     int identificador=scanner.nextInt();
      scanner.nextLine();
     if(buscarId(identificador)==false){
         carro.setIdentificador(identificador);
     System.out.println("-Tipo de Gasolina: ");
     carro.setGas(scanner.nextLine());
     System.out.println("-Marca:");            
     carro.setMarca(scanner.nextLine());
     System.out.println("-Modelo:"); 
     carro.setModelo(scanner.nextLine());
     System.out.println("-Color:"); 
     carro.setColor(scanner.nextLine());
     vehiculos[contGlobal] = carro;   
             contGlobal++;
     System.out.println("\n¿Que desea hacer a continuación?:\n 1. Ir al Menú Principal\n2. Agregar otro vehículo");     
     opcion = scanner.next().charAt(0);
     switch(opcion){
             case '1':   
             System.out.println("\nVolviendo a Menú Principal\n");
             mostrarMenu();  
             break;
             default:
             System.out.println("\nVolviendo a Sub-Menu\n");
     }     
        }
     else{System.out.println("\nEl ID Ingresado se encuentra regristrado \n       INTENTELO NUEVAMENTE \n");
     Carro();} 
 } 
            else{
                System.out.println("\nAlmacenamiento de Vehiculos lleno\n");
                mostrarSubMenu2();
            }
        }      
    
       private static void Balsa() {
        int opcion;
       if(contGlobal <= 9){
     Balsa balsa =new Balsa();
        Scanner scanner = new Scanner(System.in);
    System.out.println("\n    Vahículo: BALSA");
    System.out.println("-ID:\n ");
    int identificador=scanner.nextInt();
    scanner.nextLine();
    if(buscarId(identificador)==false){
        balsa.setIdentificador(identificador);
    System.out.println("\n-Motor o remo: ");
    balsa.setMotor(scanner.nextLine());
    System.out.println("\n-Marca:");            
    balsa.setMarca(scanner.nextLine());
    System.out.println("\n-Modelo:"); 
    balsa.setModelo(scanner.nextLine());
    System.out.println("\n-Color:"); 
    balsa.setColor(scanner.nextLine());
    vehiculos[contGlobal] = balsa;   
            contGlobal++;
    System.out.println("\n¿Que desea hacer a continuación?:\n\n1. Ir al Menú Principal\n2. Agregar otro vehículo");     
    opcion = scanner.next().charAt(0);
    switch(opcion){
            case '1':   
            System.out.println("\nVolviendo a Menú Principal\n");
            mostrarMenu();  
            break;
            default:
            System.out.println("\nVolviendo a Sub-Menu\n");
    }     
       }
    else{System.out.println("\nEl ID Ingresado se encuentra regristrado \n       INTENTELO NUEVAMENTE \n");
    Balsa();
    } 
} else{
               System.out.println("\nAlmacenamiento de Vehiculos lleno\n");
               mostrarSubMenu2();
           }
       }    

       private static void Avion() {
        int opcion;
        if(contGlobal <= 9){
        Avion avion =new Avion();
        Scanner scanner = new Scanner(System.in);
    System.out.println("\n    Vahículo: AVION");
    System.out.println("-ID:\n ");
    int identificador=scanner.nextInt();
    scanner.nextLine();
    if(buscarId(identificador)==false){
    avion.setIdentificador(identificador);
    System.out.println("-Pasajeros(cantidad): ");
    avion.setPasajeros(scanner.nextInt());
    System.out.println("-Modelo:"); 
    avion.setModelo(scanner.nextLine());
    scanner.nextLine();
    System.out.println("-Color:"); 
    avion.setColor(scanner.nextLine());
    System.out.println("-Marca:");            
    avion.setMarca(scanner.nextLine());
    vehiculos[contGlobal] = avion;   
            contGlobal++;
    System.out.println("\n¿Que desea hacer a continuación?:\n\n1. Ir al Menú Principal\n2. Agregar otro vehículo");     
    opcion = scanner.next().charAt(0);
    switch(opcion){
            case '1':   
            System.out.println("\nVolviendo a Menú Principal\n");
            mostrarMenu();  
            break;
            default:
            System.out.println("\nVolviendo a Sub-Menu\n");
    }     
       }
    else{System.out.println("\nEl ID Ingresado se encuentra regristrado \n       INTENTELO NUEVAMENTE \n");
    Avion();} 
} 
        else{
               System.out.println("\nAlmacenamiento de Vehiculos lleno\n");
               mostrarSubMenu2();
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
public static boolean buscarId(int id){
    int  d=id;
    if(vehiculos!=null){
for(int i=0; i < vehiculos.length; i++){   
    if(vehiculos[i].getIdentificador()==d){
        return true;
    }
}
    }
        return false;
}
  private static void ordenarArreglo() {
        if (contGlobal == 0) {
            System.out.println("    \nEl array está vacío. No se puede ordenar.\n           INGRESE VEHICULOS\n");
            return;
        }

        System.out.print("     ¿En que orden desea imprimir el Array? \na. Ascendente \nb. Descendente\n ");
        char orden = scanner.next().charAt(0);

        Arrays.sort(vehiculos, 0, contGlobal, (v1, v2) -> {
            if (orden == 'b') {
                return Integer.compare(v2.getIdentificador(), v1.getIdentificador()); // Orden descendente
            } else {
                return Integer.compare(v1.getIdentificador(), v2.getIdentificador()); // Orden ascendente
            }
        });

        System.out.println("\n  El array se ha ordenado.\n");
        mostrarArreglo(); // Llamar a mostrarArreglo después de ordenar
    }
  private static void mostrarArreglo() {
    if (contGlobal == 0) {
        System.out.println("\nEl array está vacío. No hay elementos para mostrar.\n           INGRESE VEHICULOS\n");
        return;
        }

        System.out.println("\nElementos del array:");
     for (int i = 0; i < contGlobal; i++) {
        Vehiculo vehiculo = vehiculos[i];
        System.out.println("Identificador: " + vehiculo.getIdentificador());
     if (vehiculo instanceof Carro) {
         Carro carro = (Carro) vehiculo;
         System.out.println("Tipo de Gasolina: " + carro.getGas());
         System.out.println("Marca: " + carro.getMarca());
         System.out.println("Modelo: " + carro.getModelo());
         System.out.println("Color: " + carro.getColor());
     } else if (vehiculo instanceof Balsa) {
         Balsa balsa = (Balsa) vehiculo;
         System.out.println("Motor o remo: " + balsa.getMotor());
         System.out.println("Marca: " + balsa.getMarca());
         System.out.println("Modelo: " + balsa.getModelo());
         System.out.println("Color: " + balsa.getColor());
     } else if (vehiculo instanceof Avion) {
        Avion avion = (Avion) vehiculo;
        System.out.println("Pasajeros: " + avion.getPasajeros());
        System.out.println("Marca: " + avion.getMarca());
        System.out.println("Modelo: " + avion.getModelo());
        System.out.println("Color: " + avion.getColor());
        }         
        System.out.println();  
}
}
  private static void imprimirArreglo() {
    if (contGlobal == 0) {
        System.out.println("\nEl array está vacío. No hay elementos para mostrar.\n           INGRESE VEHICULOS\n");
        return;
    }
    System.out.println("\nElementos del array:");
    for (int i = 0; i < contGlobal; i++) {
        Vehiculo vehiculo = vehiculos[i];
        System.out.println("Identificador: " + vehiculo.getIdentificador());
 System.out.println(); // Salto de línea para separar los registros     
}
}
                            ///////////////////////////////////////// FASE 3 ////////////////////////////////////////
  public static void preguntaFinal(){
      Scanner sc = new Scanner(System.in);
      System.out.println("\n¿Qué desea hacer a continuación?:\n1. Ir al Menú Principal\n2. Continuar en FASE 3");     
        int opcion = sc.nextInt();  
        sc.nextLine(); 
    switch (opcion) {
        case 1:   
            System.out.println("\nVolviendo a Menú Principal\n");
            mostrarMenu();  
            break;
        case 2:
            mostrarSubMenu3();
            break;
        default:
            System.out.println("\nOpción no válida. Volviendo a Sub-Menu\n");
            break;
    }
  }
  
       private static void trabajarCarro (){
        char opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n       Trabajando con CARROS");
            System.out.println(" C: Insertar\n R: Consultar\n"
                    + " U: Actualizar\n D: Eliminar\n A: Volver al Menu Principal");
            System.out.print("\n------Ingrese su opción: ");
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'C':
                    insertCarro();
                    break;
                case 'R':
                    consultCarro();                      
                    break;
                case 'U':
                    actualizarCarro();      
                    break;
                case 'D':
                    deleteCarro();         
                    break;
                case 'A':
                    System.out.println("\nRegresando al menú principal...");
                    mostrarMenu();
                    break; // Regresar al menú principal
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (true);
    }
    
public static void insertCarro() { 
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("miumg.edu.gt_Proyecto_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    Scanner sc = new Scanner(System.in);  // Definir Scanner al inicio y usar el mismo en todo el método
    Carrodb inCarro = new Carrodb();      
    
    System.out.println("\n    Insertar: CARRO");
    System.out.println("-Tipo de Gasolina: ");
    String gas = sc.nextLine();
    inCarro.setGas(gas);
    System.out.println("-Marca:");
    String marca = sc.nextLine();
    inCarro.setMarca(marca);
    System.out.println("-Modelo:");
    String modelo = sc.nextLine();
    inCarro.setModelo(modelo);
    System.out.println("-Color:"); 
    String color = sc.nextLine();
    inCarro.setColor(color);

    try {
        em.getTransaction().begin();
        em.persist(inCarro);
        em.getTransaction().commit();
        System.out.println("Carro insertado correctamente.");
    } catch (Exception e) {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
        System.out.println("Exception-> " + e);
    } finally {
        em.close();
    }
    preguntaFinal();
} 
public static void consultCarro() { 
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("miumg.edu.gt_Proyecto_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    Scanner sc=new Scanner (System.in);
    List<Carrodb> carroArray = new ArrayList<>();
    CarrodbJpaController carroConsult=new CarrodbJpaController(emf);
    try{
       carroArray= carroConsult.findCarrodbEntities();
    }catch(Exception e){
        e.printStackTrace();
    }finally{
        em.close();
    }
    for (Carrodb carro:carroArray){
        System.out.println("\n      -REGISTROS ALMACENNADOS:");
        System.out.println("\nID: "+ carro.getIdCarro());
        System.out.println("Gas: "+ carro.getGas());
        System.out.println("Marca: "+ carro.getMarca());
        System.out.println("Modelo: "+ carro.getModelo());
        System.out.println("Color: "+ carro.getColor());
}
    preguntaFinal();
}

public static void actualizarCarro() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("miumg.edu.gt_Proyecto_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    Scanner sc = new Scanner(System.in);
    CarrodbJpaController carroConsult = new CarrodbJpaController(emf);
    System.out.println("\nIngrese el ID para modificar:");
    int id = sc.nextInt();   
    Carrodb actCarro = carroConsult.findCarrodb(id);
    if (actCarro != null) {
        try {
            System.out.println("Ingrese el nuevo color:");
            String nuevoColor = sc.next();
            System.out.println("Ingrese el nuevo tipo de gas:");
            String nuevoGas = sc.next();
            System.out.println("Ingrese la nueva marca:");
            String nuevaMarca = sc.next();
            System.out.println("Ingrese el nuevo modelo:");
            String nuevoModelo = sc.next();            
            em.getTransaction().begin();
            actCarro.setColor(nuevoColor);
            actCarro.setGas(nuevoGas);
            actCarro.setMarca(nuevaMarca);
            actCarro.setModelo(nuevoModelo);
            em.merge(actCarro);// método merge para actualizar el objeto 
            em.getTransaction().commit();
            System.out.println("\n  El registro ha sido actualizado exitosamente :D");
            preguntaFinal();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    } else {
        System.out.println("\n  El ID no se encuentra registrado\n     INTENTE NUEVAMENTE");
        actualizarCarro();
    }
}
public static void deleteCarro() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("miumg.edu.gt_Proyecto_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    Scanner sc = new Scanner(System.in);
    CarrodbJpaController carroConsult = new CarrodbJpaController(emf);
    System.out.println("\nIngrese el ID para eliminar:");
    int id = sc.nextInt();   
    Carrodb delCarro = carroConsult.findCarrodb(id);
    if (delCarro != null) {
        try {            
            em.getTransaction().begin();
            delCarro = em.find(Carrodb.class, id);
            em.remove(delCarro);
            em.getTransaction().commit();
            System.out.println("\n  El registro ha sido eliminado exitosamente :D");
            preguntaFinal();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    } else {
        System.out.println("\n  El ID no se encuentra registrado\n     INTENTE NUEVAMENTE");
        deleteCarro();
    }
}

//codigo Realizado por Juan Y Miguel 
private static void trabajarBalsa (){
        char opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n       Trabajando con BALSAS");
            System.out.println(" C: Insertar\n R: Consultar\n"
                    + " U: Actualizar\n D: Eliminar\n A: Volver al Menu Principal");
            System.out.print("\n------Ingrese su opción: ");
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'C':
                    insertBalsa();
                    break;
                case 'R':
                    consultBalsa();                      
                    break;
                case 'U':
                    actualizarBalsa();      
                    break;
                case 'D':
                    deleteBalsa();         
                    break;
                case 'A':
                    System.out.println("\nRegresando al menú principal...");
                    mostrarMenu();
                    break; // Regresar al menú principal
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (true);
}

public static void insertBalsa() { 
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("miumg.edu.gt_Proyecto_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    Scanner sc = new Scanner(System.in);  // Definir Scanner al inicio y usar el mismo en todo el método
    Balsadb inBalsa = new Balsadb();      
    
    System.out.println("\n    Insertar: BALSA");
    System.out.println("-Motor o Remo: ");
    String Motor = sc.nextLine();
    inBalsa.setMotor(Motor);
    System.out.println("-Marca:");
    String marca = sc.nextLine();
    inBalsa.setMarca(marca);
    System.out.println("-Modelo:");
    String modelo = sc.nextLine();
    inBalsa.setModelo(modelo);
    System.out.println("-Color:"); 
    String color = sc.nextLine();
    inBalsa.setColor(color);

    try {
        em.getTransaction().begin();
        em.persist(inBalsa);
        em.getTransaction().commit();
        System.out.println("Balsa insertado correctamente.");
    } catch (Exception e) {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
System.out.println("Exception-> " + e);
    } finally {
        em.close();
    }
    preguntaFinal();
} 

public static void consultBalsa() { 
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("miumg.edu.gt_Proyecto_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    Scanner sc=new Scanner (System.in);
    List<Balsadb> balsaArray = new ArrayList<>();
    BalsadbJpaController balsaConsult=new BalsadbJpaController(emf);
    try{
       balsaArray= balsaConsult.findBalsadbEntities();
    }catch(Exception e){
        e.printStackTrace();
    }finally{
        em.close();
    }
    for (Balsadb balsa:balsaArray){
        System.out.println("\n      -REGISTROS ALMACENNADOS:");
        System.out.println("\nID: "+ balsa.getIdBalsa());
        System.out.println("Gas: "+ balsa.getMotor());
        System.out.println("Marca: "+ balsa.getMarca());
        System.out.println("Modelo: "+ balsa.getModelo());
        System.out.println("Color: "+ balsa.getColor());
}
    preguntaFinal();
}

public static void actualizarBalsa() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("miumg.edu.gt_Proyecto_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    Scanner sc = new Scanner(System.in);
    BalsadbJpaController balsaConsult = new BalsadbJpaController(emf);
    System.out.println("\nIngrese el ID para modificar:");
    int id = sc.nextInt();   
    Balsadb actBalsa = balsaConsult.findBalsadb(id);
    if (actBalsa != null) {
        try {
            System.out.println("Ingrese el nuevo color:");
            String nuevoColor = sc.next();
            System.out.println("Ingrese el nuevo tipo de Motor o remo:");
            String nuevoMotor = sc.next();
            System.out.println("Ingrese la nueva marca:");
            String nuevaMarca = sc.next();
            System.out.println("Ingrese el nuevo modelo:");
            String nuevoModelo = sc.next();            
            em.getTransaction().begin();
            actBalsa.setColor(nuevoColor);
            actBalsa.setMotor(nuevoMotor);
            actBalsa.setMarca(nuevaMarca);
            actBalsa.setModelo(nuevoModelo);
            em.merge(actBalsa);// método merge para actualizar el objeto 
            em.getTransaction().commit();
            System.out.println("\n  El registro ha sido actualizado exitosamente :D");
            preguntaFinal();
 } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    } else {
        System.out.println("\n  El ID no se encuentra registrado\n     INTENTE NUEVAMENTE");
        actualizarBalsa();
    }
}

public static void deleteBalsa() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("miumg.edu.gt_Proyecto_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    Scanner sc = new Scanner(System.in);
    BalsadbJpaController balsaConsult = new BalsadbJpaController(emf);
    System.out.println("\nIngrese el ID para eliminar:");
    int id = sc.nextInt();   
    Balsadb delBalsa = balsaConsult.findBalsadb(id);
    if (delBalsa != null) {
        try {            
            em.getTransaction().begin();
            delBalsa = em.find(Balsadb.class, id);
            em.remove(delBalsa);
            em.getTransaction().commit();
            System.out.println("\n  El registro ha sido eliminado exitosamente :D");
            preguntaFinal();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    } else {
        System.out.println("\n  El ID no se encuentra registrado\n     INTENTE NUEVAMENTE");
        deleteBalsa();
}

}
//Codigo Realizado Cinthia Y Dario
   private static void trabajarAvion (){
        char opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n       Trabajando con AVIONES");
            System.out.println(" C: Insertar\n R: Consultar\n"
                    + " U: Actualizar\n D: Eliminar\n A: Volver al Menu Principal");
            System.out.print("\n------Ingrese su opción: ");
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'C':
                    insertAvion();
                    break;
                case 'R':
                    consultAvion();                      
                    break;
                case 'U':
                    actualizarAvion();      
                    break;
                case 'D':
                    deleteAvion();         
                    break;
                case 'A':
                    System.out.println("\nRegresando al menú principal...");
                    mostrarMenu();
                    break; // Regresar al menú principal
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (true);
   }
   public static void insertAvion() { 
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("miumg.edu.gt_Proyecto_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    Scanner sc = new Scanner(System.in);  // Definir Scanner al inicio y usar el mismo en todo el método
    Aviondb inAvion = new Aviondb();      
    
    System.out.println("\n    Insertar: AVION");
    System.out.println("-Pasajeros: ");
    int pasajeros = sc.nextInt();
    sc.nextLine(); // Limpiar el buffer
    inAvion.setPasajeros(pasajeros);
    
    System.out.println("-Marca:");
    String marca = sc.nextLine();
    inAvion.setMarca(marca);
    
    System.out.println("-Modelo:");
    String modelo = sc.nextLine();
    inAvion.setModelo(modelo);
    
    System.out.println("-Color:"); 
    String color = sc.nextLine();
    inAvion.setColor(color);
try {
        em.getTransaction().begin();
        em.persist(inAvion);
        em.getTransaction().commit();
        System.out.println("Avion insertado correctamente.");
    } catch (Exception e) {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
        System.out.println("Exception-> " + e);
    } finally {
        em.close();
    }
    preguntaFinal();
}
public static void consultAvion() { 
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("miumg.edu.gt_Proyecto_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    Scanner sc=new Scanner (System.in);
    List<Aviondb> avionArray = new ArrayList<>();
    AviondbJpaController avionConsult=new AviondbJpaController(emf);
    try{
       avionArray= avionConsult.findAviondbEntities();
    }catch(Exception e){
        e.printStackTrace();
    }finally{
        em.close();
    }
    for (Aviondb avion:avionArray){
        System.out.println("\n      -REGISTROS ALMACENNADOS:");
        System.out.println("\nID: "+ avion.getIdAvion());
        System.out.println("Pasajeros: "+ avion.getPasajeros());
        System.out.println("Marca: "+ avion.getMarca());
        System.out.println("Modelo: "+ avion.getModelo());
        System.out.println("Color: "+ avion.getColor());
}
    preguntaFinal();
}
public static void actualizarAvion() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("miumg.edu.gt_Proyecto_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    Scanner sc = new Scanner(System.in);
    AviondbJpaController avionConsult = new AviondbJpaController(emf);
    System.out.println("\nIngrese el ID para modificar:");
    int id = sc.nextInt();   
    Aviondb actAvion = avionConsult.findAviondb(id);
    if (actAvion != null) {
        try {
            System.out.println("Ingrese el nuevo color:");
            String nuevoColor = sc.next();
            System.out.println("Ingrese el nuevo tipo de Pasajeros:");
            int nuevoPasajero = sc.nextInt();
            System.out.println("Ingrese la nueva marca:");
            String nuevaMarca = sc.next();
            System.out.println("Ingrese el nuevo modelo:");
            String nuevoModelo = sc.next();            
            em.getTransaction().begin();
            actAvion.setPasajeros(nuevoPasajero);
            actAvion.setMarca(nuevaMarca);
            actAvion.setModelo(nuevoModelo);
            em.merge(actAvion);// método merge para actualizar el objeto 
            em.getTransaction().commit();
            System.out.println("\n  El registro ha sido actualizado exitosamente :D");
            preguntaFinal();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
em.close();
            emf.close();
        }
    } else {
        System.out.println("\n  El ID no se encuentra registrado\n     INTENTE NUEVAMENTE");
        actualizarAvion();
    }
}
public static void deleteAvion() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("miumg.edu.gt_Proyecto_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    Scanner sc = new Scanner(System.in);
    AviondbJpaController avionConsult = new AviondbJpaController(emf);
    System.out.println("\nIngrese el ID para eliminar:");
    int id = sc.nextInt();   
    Aviondb delAvion = avionConsult.findAviondb(id);
    if (delAvion != null) {
        try {            
            em.getTransaction().begin();
            delAvion = em.find(Aviondb.class, id);
            em.remove(delAvion);
            em.getTransaction().commit();
            System.out.println("\n  El registro ha sido eliminado exitosamente :D");
            preguntaFinal();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    } else {
        System.out.println("\n  El ID no se encuentra registrado\n     INTENTE NUEVAMENTE");
        deleteAvion();
}
}
}
