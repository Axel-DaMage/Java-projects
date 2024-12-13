/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author cetecom
 */
public class C_Vehiculo {
    private ArrayList<Vehiculo> vehiculos;
    

    public C_Vehiculo() {
        this.vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo v){
        vehiculos.add(v);
    }
    
    public ArrayList<Vehiculo> listarVehiculo(){
        int i = 0;
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculos.get(i));
        i +=1;
        }
        return vehiculos;
    }
    
    public Vehiculo getVehiculo(int i){
        return vehiculos.get(i-1);
    } 

    @Override
    public String toString() {
        String lista = "";
        for (Vehiculo vehiculo : vehiculos) {
            lista += vehiculo.toString()+"\n";
        }
        return lista;
    }
    
    
}
