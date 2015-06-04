/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import java.io.Serializable;
import java.util.Random;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Ace
 */
@ApplicationScoped
public class OverviewAttributeBean implements Serializable{

    public OverviewAttributeBean() {
    }
    
    private int tmpMA = 20;
    private int tmpMB = 30;
    private int tmpMC = 50;
    private int tmpMD = 40;
    private int tmpME = 70;
    
    private int generateRandomInt()
    {
        Random rand = new Random();
        int  n = rand.nextInt(5) + 0;
        return n;
    }

    public int getTmpMA() {
        return tmpMA;
    }

    public void setTmpMA(int tmpMA) {
        this.tmpMA = tmpMA;
    }

    public int getTmpMB() {
        return tmpMB;
    }

    public void setTmpMB(int tmpMB) {
        this.tmpMB = tmpMB;
    }

    public int getTmpMC() {
        return tmpMC;
    }

    public void setTmpMC(int tmpMC) {
        this.tmpMC = tmpMC;
    }

    public int getTmpMD() {
        return tmpMD;
    }

    public void setTmpMD(int tmpMD) {
        this.tmpMD = tmpMD;
    }

    public int getTmpME() {
        return tmpME;
    }

    public void setTmpME(int tmpME) {
        this.tmpME = tmpME;
    }

   
}
