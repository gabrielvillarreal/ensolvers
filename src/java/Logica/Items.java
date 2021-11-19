/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author villa
 */
@Entity
public class Items implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_items;
    
    @Basic
    private String description;
    private boolean itemFinish;
    
    

    public Items() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Items{id_items=").append(id_items);
        sb.append(", description=").append(description);
        sb.append(", itemFinish=").append(itemFinish);
        sb.append('}');
        return sb.toString();
    }

    public Items(int id_items, String description, boolean itemFinish) {
        this.id_items = id_items;
        this.description = description;
        this.itemFinish = itemFinish;
    }

    public boolean isItemFinish() {
        return itemFinish;
    }

    public void setItemFinish(boolean itemFinish) {
        this.itemFinish = itemFinish;
    }

    public int getId_items() {
        return id_items;
    }

    public void setId_items(int id_items) {
        this.id_items = id_items;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
