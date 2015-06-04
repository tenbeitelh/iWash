/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import java.io.Serializable;
import java.util.Locale;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Ace
 */
@ApplicationScoped
public class ChartProgressSessionBean implements Serializable {

    public ChartProgressSessionBean() {
    }
    
    private double ProgressMaschineA;
    private double ProgressMaschineB;
    private double ProgressMaschineC;
    private double ProgressMaschineD;
    private double ProgressMaschineE;
   
    public double getProgressMaschineA() {
        
        if(this.ProgressMaschineA <=100)
        {
            this.ProgressMaschineA++;
        }
        else
            this.ProgressMaschineA = 100;
        
        this.ProgressMaschineA = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", this.ProgressMaschineA));
        
        return ProgressMaschineA;
    }

    public void setProgressMaschineA(double ProgressMaschineA) {
        this.ProgressMaschineA = ProgressMaschineA;
    }

    public double getProgressMaschineB() {
          if(this.ProgressMaschineB <=100)
        {
            this.ProgressMaschineB = this.ProgressMaschineB+0.5;
        }
        else
            this.ProgressMaschineB = 0;
        
         this.ProgressMaschineB = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", this.ProgressMaschineB));
        
        return ProgressMaschineB;
    }

    public void setProgressMaschineB(double ProgressMaschineB) {
        this.ProgressMaschineB = ProgressMaschineB;
    }

    public double getProgressMaschineC() {
        if(this.ProgressMaschineC <=100)
        {
            this.ProgressMaschineC = this.ProgressMaschineC+0.1;
        }
        else
            this.ProgressMaschineC = 0;
        this.ProgressMaschineC = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", this.ProgressMaschineC));
        
        
        return ProgressMaschineC;
    }

    public void setProgressMaschineC(double ProgressMaschineC) {
        this.ProgressMaschineC = ProgressMaschineC;
    }

    public double getProgressMaschineD() {
        if(this.ProgressMaschineD <=100)
        {
            this.ProgressMaschineD = this.ProgressMaschineD+0.1;
        }
        else
            this.ProgressMaschineD = 0;
        
        this.ProgressMaschineD = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", this.ProgressMaschineD));
        
        
        
        return ProgressMaschineD;
    }

    public void setProgressMaschineD(double ProgressMaschineD) {
        this.ProgressMaschineD = ProgressMaschineD;
    }

    public double getProgressMaschineE() {
        if(this.ProgressMaschineE <=100)
        {
            this.ProgressMaschineE = this.ProgressMaschineE+0.02;
        }
        else
            this.ProgressMaschineE = 0;
        
        this.ProgressMaschineE = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", this.ProgressMaschineE));
        
        
        return ProgressMaschineE;
    }

    public void setProgressMaschineE(double ProgressMaschineE) {
        this.ProgressMaschineE = ProgressMaschineE;
    }

    @Override
    public String toString() {
        return "ChartProgressSessionBean{" + "ProgressMaschineA=" + ProgressMaschineA + ", ProgressMaschineB=" + ProgressMaschineB + ", ProgressMaschineC=" + ProgressMaschineC + ", ProgressMaschineD=" + ProgressMaschineD + ", ProgressMaschineE=" + ProgressMaschineE + '}';
    }
    
    
}
