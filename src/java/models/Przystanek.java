/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author ichro
 */
@Entity
@Table (name = "Przystanki")
public class Przystanek {

    private Long id;
    private String name;
    
    public Przystanek() {
    }
    
    
    
}
