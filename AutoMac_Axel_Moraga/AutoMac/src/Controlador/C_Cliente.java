/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author cetecom
 */
public class C_Cliente {
   private ArrayList<Cliente> clientes;

    public C_Cliente() {
        this.clientes = new ArrayList<>();
    }
   
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public ArrayList<Cliente> listarClientes(){
        int i = 0;
        for (Cliente cliente : clientes) {
            System.out.println(clientes.get(i));
        i +=1;
        }
 return clientes;
    }

    
    public Cliente getCliente(int i){
        return clientes.get(i-1);
    } 
    
    
    @Override
    public String toString() {
        String lista = "";
        for(Cliente cliente : clientes){
            lista += cliente.toString();
        }
        return lista;
    }
   
}
