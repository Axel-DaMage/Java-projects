/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cetecom
 */
public class Vehiculo_camioneta extends Vehiculo{
private int capacidad_carga;

    public Vehiculo_camioneta() {
    }

    public Vehiculo_camioneta(int capacidad_carga, String patente, String marca, String modelo, int kilometraje, String tipo) {
        super(patente, marca, modelo, kilometraje, tipo);
        this.capacidad_carga = capacidad_carga;
    }

    public int getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(int capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    @Override
    public String toString() {
        return "Automovil{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", kilometraje=" + kilometraje + ", tipo=" + tipo + ", capacidad de carga=" + capacidad_carga + '}';    }

    
}
