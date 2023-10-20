
package com.mycompany.consesecionaria.logica;

import com.mycompany.consesecionaria.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladoraLogica {
    
   ControladoraPersistencia controlPersis = new ControladoraPersistencia();

   public void agregarAuto(String modelo, String marca, String motor, String color, String patente, int puertas) {
        
       Automovil auto = new Automovil();
       auto.setModelo(modelo);
       auto.setColor(color);
       auto.setMarca(marca);
       auto.setPatente(patente);
       auto.setPuertas(puertas);
       auto.setMotor(motor);
       
       
       controlPersis.agregarAuto(auto);
       
       
     }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
        
    }

    public Automovil traerAuto(int idAuto) {
       return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int puertas) {
    
       auto.setModelo(modelo);
       auto.setColor(color);
       auto.setMarca(marca);
       auto.setPatente(patente);
       auto.setPuertas(puertas);
       auto.setMotor(motor);
       
       
       controlPersis.editarAuto(auto);
    
    
    }

    

    
    
 }
