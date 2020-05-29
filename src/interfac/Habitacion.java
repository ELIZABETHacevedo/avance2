/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfac;

import entidades.Reserva;
import java.util.ArrayList;

/**
 *
 * @author Mery Acevedo
 */
public abstract class Habitacion {
     public String numHabitacion;
    public double precio;
    public int tipo;
    public ArrayList<Reserva>lreservas=new ArrayList<>();
}
