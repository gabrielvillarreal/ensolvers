/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author villa
 */
import Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
    public void crearItem(String descripcion, boolean taskFinish){
        Items item = new Items();
        item.setDescription(descripcion);
        item.setItemFinish(taskFinish);
        
        controlPersistencia.crearItem(item);
    }
    
    public List<Items> traerItems(){
        return controlPersistencia.traerItems();
    }

    public void borrarItem(int id) {
        controlPersistencia.borrarItem(id);
    }
    
    public Items buscarItems(int id){
        return controlPersistencia.buscarItem(id);
    }

    public void modificarItem(Items item) {
        controlPersistencia.modificarItem(item);
    }
}
