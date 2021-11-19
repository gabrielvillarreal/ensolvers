/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Items;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author villa
 */
public class ControladoraPersistencia {
    
    ItemsJpaController itemJPA = new ItemsJpaController();
    
    //crear una nueva tarea
    public void crearItem(Items item){
        itemJPA.create(item);
    }

    public List<Items> traerItems() {
        return itemJPA.findItemsEntities();
    }

    public void borrarItem(int id) {
        try {
            itemJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public Items buscarItem(int id) {
        return itemJPA.findItems(id);
    }
    
    public void modificarItem(Items item){
        try {
            itemJPA.edit(item);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
}
