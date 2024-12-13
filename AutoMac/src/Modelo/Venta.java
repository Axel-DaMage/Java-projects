/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cetecom
 */
public class Venta {
     private String fecha;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double valor;

    public Venta() {
    }

    public Venta(String fecha, Cliente cliente, Vehiculo vehiculo, double valor) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.valor = valor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", valor=" + valor + '}';
    }
    
    
}
