/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author villa
 */
@Entity
public class Folders {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_folder;
    
    @Basic
    private String nombre;
    
    @OneToMany
    List<Items> listItems;

    public Folders() {
    }

    public Folders(int id_folder, String nombre) {
        this.id_folder = id_folder;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_folder() {
        return id_folder;
    }

    public void setId_folder(int id_folder) {
        this.id_folder = id_folder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("folders{id_folder=").append(id_folder);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
}
