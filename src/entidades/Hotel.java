/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfac.Habitacion;
import java.util.ArrayList;

/**
 *
 * @author Mery Acevedo
 */
public class Hotel {
    public admin admin1;
   public ArrayList<HabitacionLujo> habitacionesLujo =new ArrayList<>();
   
   public ArrayList<habitacionMedia> habitacionesMedia =new ArrayList<>();
   
   public ArrayList<habitacionFamiliar> habitacionesFamilia =new ArrayList<>();
   
  
    public Hotel(){
        for (int i = 0; i < 3; i++) {
            this.habitacionesFamilia.add(new habitacionFamiliar());
            this.habitacionesLujo.add(new HabitacionLujo());
            this.habitacionesMedia.add(new habitacionMedia());
        }
        this.admin1=new admin("jklele","123","jose pedro","125123-3");
    }
    
    public void generarReserva(int opcion){
        switch (opcion) {
            case 1:
                
                break;
            case 2:
                break;
            case 3:
                break;
                
            default:
                throw new AssertionError();
        }
        
    }
    
    
    
}
