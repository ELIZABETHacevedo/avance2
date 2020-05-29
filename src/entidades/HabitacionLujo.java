/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfac.Habitacion;
import interfac.habitacionInterface;


/**
 *
 * @author Mery Acevedo
 */
public class HabitacionLujo extends Habitacion implements habitacionInterface {
    
    
    public Boolean verificarDisponibilidad(){
        for (int i = 0; i < this.lreservas.size(); i++) {
            
        }
        return false;
    }
    public void crearReserva(){
        this.lreservas.add(new Reserva());
    }
 

    @Override
    public double generarPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarPaquete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
