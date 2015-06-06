/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

/**
 *
 * @author Ace
 */
public class ModelBean {
    
    private String typ;
    private String attribute;

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public ModelBean(String typ, String attribute) {
        this.typ = typ;
        this.attribute = attribute;
    }

    public ModelBean() {
    }

    @Override
    public String toString() {
        return "ModelBean{" + "typ=" + typ + ", attribute=" + attribute + '}';
    }
}
