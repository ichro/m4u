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
@Table (name = "Linia_Przystanek")
public class LiniaPrzystanek {

    private Long idLinii;
    private Long idPrzystanku;
    
    public LiniaPrzystanek() {
    }
    
}
