
package com.mycompany.consesecionaria.persistencia;

import com.mycompany.consesecionaria.logica.Automovil;
import com.mycompany.consesecionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
   AutomovilJpaController autojpa = new AutomovilJpaController();

   public void agregarAuto(Automovil auto) {
       
       autojpa.create(auto);
       
    }

    public List<Automovil> traerAutos() {
        return autojpa.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
        
       try {
           autojpa.destroy(idAuto);
       } catch (NonexistentEntityException ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }

    public Automovil traerAuto(int idAuto) {
       return autojpa.findAutomovil(idAuto);
    }

    public void editarAuto(Automovil auto) {
       try {
           autojpa.edit(auto);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    
}
