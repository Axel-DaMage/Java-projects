/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cetecom
 */
public class Vehiculo_automovil extends Vehiculo {
    private String tipo_energia;
    private String aire_acondicionado;

    public Vehiculo_automovil(String tipo_energia, String aire_acondicionado, String patente, String marca, String modelo, int kilometraje, String tipo) {
        super(patente, marca, modelo, kilometraje, tipo);
        this.tipo_energia = tipo_energia;
        this.aire_acondicionado = aire_acondicionado;
    }

    public String getTipo_energia() {
        return tipo_energia;
    }

    public void setTipo_energia(String tipo_energia) {
        this.tipo_energia = tipo_energia;
    }

    public String getAire_acondicionado() {
        return aire_acondicionado;
    }

    public void setAire_acondicionado(String aire_acondicionado) {
        this.aire_acondicionado = aire_acondicionado;
    }

    @Override
    public String toString() {
        return "Automovil{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", kilometraje=" + kilometraje + ", tipo=" + tipo + "tipo_energia=" + tipo_energia + ", aire_acondicionado=" + aire_acondicionado + '}';
    }
    
}
