/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
/**
 *
 * @author Ace
 */
@ApplicationScoped
public class PieSessionBean implements Serializable{
    private double Maschine1 = 1;
    private double Maschine2 = 1;
    private double Maschine3 = 1;
    private double Maschine4 = 1;
    private double Maschine5 = 1;

    public double getMaschine1() {
        return Maschine1;
    }

    public void setMaschine1(double Maschine1) {
        this.Maschine1 = Maschine1;
    }

    public double getMaschine2() {
        return Maschine2;
    }

    public void setMaschine2(double Maschine2) {
        this.Maschine2 = Maschine2;
    }

    public double getMaschine3() {
        return Maschine3;
    }

    public void setMaschine3(double Maschine3) {
        this.Maschine3 = Maschine3;
    }

    public double getMaschine4() {
        return Maschine4;
    }

    public void setMaschine4(double Maschine4) {
        this.Maschine4 = Maschine4;
    }

    public double getMaschine5() {
        return Maschine5;
    }

    public void setMaschine5(double Maschine5) {
        this.Maschine5 = Maschine5;
    }

    public PieSessionBean() {
    }
}
