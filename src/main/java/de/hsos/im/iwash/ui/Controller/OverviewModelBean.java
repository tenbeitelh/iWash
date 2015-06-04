/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import java.util.Random;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author Ace
 */
@Model
public class OverviewModelBean {
 
    @Inject
    OverviewAttributeBean testBean;

    public OverviewModelBean(OverviewAttributeBean testBean) {
        this.testBean = testBean;
    }
    private int tmpMA;
    private boolean flagA = true;
    private boolean flagB = true;
    private boolean flagC = true;
    private boolean flagD = true;
    private boolean flagE = true;
    
    private int tmpMB;
    private int tmpMC;
    private int tmpMD;
    private int tmpME;

    public OverviewAttributeBean getTestBean() {
        return testBean;
    }

    public void setTestBean(OverviewAttributeBean testBean) {
        this.testBean = testBean;
    }

    public int getTmpMA() {
        
        if(testBean.getTmpMA()<=30)
        {
                this.tmpMA = testBean.getTmpMA() + generateRandomInt();
                testBean.setTmpMA(tmpMA);
                flagA = false;
        }
        else
        {
            this.tmpMA = testBean.getTmpMA() - generateRandomInt();
            testBean.setTmpMA(tmpMA);
            flagA = true;
        }
        return tmpMA;
    }

    public void setTmpMA(int tmpMA) {
        
        this.tmpMA = tmpMA;
    }

    public int getTmpMB() {
        if(testBean.getTmpMB()<=40)
        {
                this.tmpMB = testBean.getTmpMB() + generateRandomInt();
                testBean.setTmpMB(tmpMB);
                flagB = false;
        }
        else
        {
            this.tmpMB = testBean.getTmpMB() - generateRandomInt();
            testBean.setTmpMB(tmpMB);
            flagB = true;
        }
        return tmpMB;
    }

    public void setTmpMB(int tmpMB) {
        this.tmpMB = tmpMB;
    }

    public int getTmpMC() {
        if(testBean.getTmpMC()<=60)
        {
                this.tmpMC = testBean.getTmpMC() + generateRandomInt();
                testBean.setTmpMC(tmpMC);
                flagC = false;
        }
        else
        {
            this.tmpMC = testBean.getTmpMC() - generateRandomInt();
            testBean.setTmpMB(tmpMC);
            flagC = true;
        }
        return tmpMC;
    }

    public void setTmpMC(int tmpMC) {
        this.tmpMC = tmpMC;
    }

    public int getTmpMD() {
        if(testBean.getTmpMD()<=60)
        {
                this.tmpMD = testBean.getTmpMD() + generateRandomInt();
                testBean.setTmpMC(tmpMD);
                flagD = false;
        }
        else
        {
            this.tmpMD = testBean.getTmpMD() - generateRandomInt();
            testBean.setTmpMB(tmpMD);
            flagD = true;
        }
        return tmpMD;
    }

    public void setTmpMD(int tmpMD) {
        this.tmpMD = tmpMD;
    }

    public int getTmpME() {
        if(testBean.getTmpME()<=60)
        {
                this.tmpME = testBean.getTmpME() + generateRandomInt();
                testBean.setTmpMC(tmpME);
                flagE = false;
        }
        else
        {
            this.tmpME = testBean.getTmpME() - generateRandomInt();
            testBean.setTmpMB(tmpME);
            flagE = true;
        }
        return tmpME;
    }

    public void setTmpME(int tmpME) {
        this.tmpME = tmpME;
    }
    
    public OverviewModelBean() {
    }
    
    private int generateRandomInt()
    {
        Random rand = new Random();
        int  n = rand.nextInt(5) + 0;
        return n;
    }

    public boolean isFlagA() {
        return flagA;
    }

    public void setFlagA(boolean flagA) {
        this.flagA = flagA;
    }

    public boolean isFlagB() {
        return flagB;
    }

    public void setFlagB(boolean flagB) {
        this.flagB = flagB;
    }

    public boolean isFlagC() {
        return flagC;
    }

    public void setFlagC(boolean flagC) {
        this.flagC = flagC;
    }

    public boolean isFlagD() {
        return flagD;
    }

    public void setFlagD(boolean flagD) {
        this.flagD = flagD;
    }

    public boolean isFlagE() {
        return flagE;
    }

    public void setFlagE(boolean flagE) {
        this.flagE = flagE;
    }
    
    
    
}
