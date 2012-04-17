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
@Table (name = "Linie")
public class Linia {

    private Long id;
    private int nr;
    
    public Linia() {
    }
    
}
