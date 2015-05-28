/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.model;

import javax.ejb.Stateless;

/**
 *
 * @author Ace
 */
@Stateless
public class washerlist {
  
    private int x;

    public washerlist() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    
}
