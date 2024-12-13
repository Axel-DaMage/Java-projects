/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Venta;
import java.util.ArrayList;

/**
 *
 * @author cetecom
 */
public class C_Venta {
    private ArrayList<Venta> ventas;

    public C_Venta() {
        this.ventas = new ArrayList<>();
    }
    
    public void agregarVentas(Venta venta){
        ventas.add(venta);
    }
    
    public ArrayList<Venta> listarVentas(){
    int i = 0;
        for (Venta venta : ventas) {
            System.out.println(ventas.get(i));
            i +=1;
        }
        return ventas;
    }

    @Override
    public String toString() {
        return "VentaController{" + "ventas=" + ventas + '}';
    }
}
