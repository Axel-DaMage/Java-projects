/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automac;

import Controlador.C_Cliente;
import Controlador.C_Vehiculo;
import Controlador.C_Venta;
import Modelo.Vehiculo_automovil;
import Modelo.Vehiculo_camioneta;
import Modelo.Cliente;
import Modelo.Vehiculo;
import Modelo.Venta;
import Vista.Principal;
import java.util.Scanner;

/**
 *
 * @author cetecom
 */
public class AutoMac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        C_Vehiculo C_vehiculo = new C_Vehiculo();
        C_Cliente C_cliente = new C_Cliente();
        C_Venta C_venta = new C_Venta();
        Scanner input = new Scanner(System.in);
        
        int opcion = 0;
        
        while(opcion!=3){
            System.out.println("Elegir Entorno:\n1.-Interfaz Grafica\n2.-Consola\n3.-Salir");
            opcion = input.nextInt();
            input.nextLine();
            
            switch (opcion) {
                case 1 -> {
                    Principal vistaPrincipal = new Principal();
                    vistaPrincipal.setVisible(true);
                }
                case 2 -> menuConsola(C_vehiculo,C_cliente,C_venta,input);
                case 3 -> System.out.println("Terminando");
                default -> System.out.println("Opcion incorrecta!");
            }
        }
    }
    
    private static void menuConsola(C_Vehiculo C_vehiculo,C_Cliente C_cliente,C_Venta C_venta,Scanner scanner){
        int opcion = 0;
        while(opcion != 4){
            System.out.println("Seleccione Menu:\n1.-Vehiculo\n2.-Cliente\n3.-Venta\n4.-Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1 -> {
                    System.out.println("Patente : ");
                    String patente = scanner.nextLine();
                    
                    System.out.println("Marca : ");
                    String marca = scanner.nextLine();
                            
                    System.out.println("Modelo : ");
                    String modelo = scanner.nextLine();
                            
                    System.out.println("Kilometraje : ");
                    int kilometraje = scanner.nextInt();
                    scanner.nextLine();
                        
                    int tipo = 0;
                    while(tipo == 0){
                        System.out.println("Tipo (1.-Automovil /2.-Camioneta) : ");
                        tipo = scanner.nextInt();
                        scanner.nextLine();
                    
                        switch (tipo) {
                            case 1 -> {
                                System.out.println("Tipo de energia (Convencional,Electrico,Hibrido) :");
                                String energia = scanner.nextLine();
                                System.out.println("Aire acondicionado (1.-Si/2.-No) :");
                                int aire = scanner.nextInt();
                                if (aire == 1){
                                    Vehiculo_automovil vehiculo_automovil = new Vehiculo_automovil(energia, "Si" , patente, marca, modelo, kilometraje, "Automovil");
                                    C_vehiculo.agregarVehiculo(vehiculo_automovil);
                                }
                                else if (aire == 2){
                                    Vehiculo_automovil vehiculo_automovil = new Vehiculo_automovil(energia, "No" , patente, marca, modelo, kilometraje, "Automovil");
                                    C_vehiculo.agregarVehiculo(vehiculo_automovil);
                                }
                            }
                            case 2 -> {
                                System.out.println("Capacidad de carga (Kilos):");
                                int capacidad = scanner.nextInt();
                                scanner.nextLine();
                                Vehiculo_camioneta vehiculo_camioneta = new Vehiculo_camioneta(capacidad, patente, marca, modelo, kilometraje, "Camioneta");
                                C_vehiculo.agregarVehiculo(vehiculo_camioneta);
                            }
                            default -> {
                                System.out.println("Opcion incorrecta!");
                                tipo = 0;
                            }
                        }
                    }    
                    System.out.println(C_vehiculo.toString());
                }
                case 2 -> {
                    System.out.println("Rut :");
                    String rut = scanner.nextLine();
                    
                    System.out.println("nombre : ");
                    String nombre = scanner.nextLine();
                            
                    System.out.println("apellido : ");
                    String apellido = scanner.nextLine();
                            
                    System.out.println("telefono : ");
                    int telefono = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("correo electronico :");
                    String correo = scanner.nextLine();
                    
                    Cliente cliente = new Cliente(rut, nombre, apellido, telefono, correo);
                    C_cliente.agregarCliente(cliente);
                    
                    System.out.println(C_cliente.toString());
                }
                case 3 -> {
                    System.out.println("Fecha de venta :");
                    String fecha = scanner.nextLine();
                    
                    System.out.println("\nSeleccione cliente (Numero en orden descendiente, 1, 2, etc):");
                    C_cliente.listarClientes();
                    int n_cliente = scanner.nextInt();
                    
                    System.out.println("Seleccione vehiculo (Numero en orden descendiente, 1, 2, etc):");
                    C_vehiculo.listarVehiculo();
                    int n_vehiculo = scanner.nextInt();
                    
                    System.out.println("Valor :");
                    double valor = scanner.nextInt();
                    
                    Cliente cliente = C_cliente.getCliente(n_cliente); 
                    
                    Vehiculo vehiculo = C_vehiculo.getVehiculo(n_vehiculo);
                    Venta venta = new Venta(fecha, cliente, vehiculo, valor);
                    C_venta.agregarVentas(venta);
                }
                case 4 -> {
                    System.out.println("Salir");
                }
                default -> throw new AssertionError();
            }
        }
    }
    
}
