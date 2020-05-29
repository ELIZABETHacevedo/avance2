/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Mery Acevedo
 */
public class Reserva {
    public Date fechaInicio,fechaFinal;
    private double total;
    private String numReserva;
    public cliente c;
    
    
    
    public void agregarCliente(String nombre,String Dui,String numReserva){
        this.c=new cliente(numReserva,nombre,Dui);
    }
    
    
}
