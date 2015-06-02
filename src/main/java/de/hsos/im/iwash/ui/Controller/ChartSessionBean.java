/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author Ace
 */
@ApplicationScoped
public class ChartSessionBean implements Serializable{
    
    private int Maschine1 = 1;
    private int Maschine2 = 1;
    private int Maschine3 = 1;
    private int Maschine4 = 1;
    private int Maschine5 = 1;

    public int getMaschine1() {
        return Maschine1;
    }

    public void setMaschine1(int Maschine1) {
        this.Maschine1 = Maschine1;
    }

    public int getMaschine2() {
        return Maschine2;
    }

    public void setMaschine2(int Maschine2) {
        this.Maschine2 = Maschine2;
    }

    public int getMaschine3() {
        return Maschine3;
    }

    public void setMaschine3(int Maschine3) {
        this.Maschine3 = Maschine3;
    }

    public int getMaschine4() {
        return Maschine4;
    }

    public void setMaschine4(int Maschine4) {
        this.Maschine4 = Maschine4;
    }

    public int getMaschine5() {
        return Maschine5;
    }

    public void setMaschine5(int Maschine5) {
        this.Maschine5 = Maschine5;
    }
    
    
    
    
    public ChartSessionBean() {
    }    
}
