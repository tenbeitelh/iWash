/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author Ace
 */
@Model
public class ChartProgressModelBean {
    
    @Inject
    ChartProgressSessionBean testBean;
    
    private double ProgressMaschineA = 0.00;
    private double ProgressMAschineB = 0.00;
    private double ProgressMAschineC;
    private double ProgressMAschineD;
    private double ProgressMAschineE;

    public ChartProgressSessionBean getTestBean() {
        return testBean;
    }

    public void setTestBean(ChartProgressSessionBean testBean) {
        this.testBean = testBean;
    }

    public double getProgressMaschineA() {
        
        this.ProgressMaschineA = testBean.getProgressMaschineA();
        if(this.ProgressMaschineA >=100)
        {
            this.ProgressMaschineA =100;
        }
        return ProgressMaschineA;
    }

    public void setProgressMaschineA(double ProgressMaschineA) {
        this.ProgressMaschineA = ProgressMaschineA;
    }

    public double getProgressMAschineB() {
        this.ProgressMAschineB = testBean.getProgressMaschineB();
        if(this.ProgressMAschineB > 100)
        {
            this.ProgressMAschineB =0;
        }
        return ProgressMAschineB;
    }

    public void setProgressMAschineB(double ProgressMAschineB) {
        this.ProgressMAschineB = ProgressMAschineB;
    }

    public double getProgressMAschineC() {
        this.ProgressMAschineC = testBean.getProgressMaschineC();
        if(this.ProgressMAschineC == 100)
        {
            this.ProgressMAschineC =0;
        }
        return ProgressMAschineC;
    }

    public void setProgressMAschineC(double ProgressMAschineC) {
        this.ProgressMAschineC = ProgressMAschineC;
    }

    public double getProgressMAschineD() {
        this.ProgressMAschineD = testBean.getProgressMaschineD();
        if(this.ProgressMAschineD == 100)
        {
            this.ProgressMAschineD =0;
        }
        return ProgressMAschineD;
    }

    public void setProgressMAschineD(double ProgressMAschineD) {
        this.ProgressMAschineD = ProgressMAschineD;
    }

    public double getProgressMAschineE() {
         this.ProgressMAschineE = testBean.getProgressMaschineE();
        if(this.ProgressMAschineE == 100)
        {
            this.ProgressMAschineE =0;
        }
        return ProgressMAschineE;
    }

    public void setProgressMAschineE(double ProgressMAschineE) {
        this.ProgressMAschineE = ProgressMAschineE;
    }
       
   
    
    
}
