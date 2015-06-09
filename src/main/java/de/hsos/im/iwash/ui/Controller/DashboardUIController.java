/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import javax.inject.Named;
import java.io.Serializable;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Ace
 */
@Named(value = "dashboardUIController")
@Model
public class DashboardUIController implements Serializable {

    public DashboardUIController() {
    }

    public String goToPerfectWash() {
        return "perfect_wash.xhtml?faces-redirect=true";
    }

    public String goToOverview() {
        System.out.println("gogogo");
        return "overview.xhtml?faces-redirect=true";
    }

    public String goToSteuerung() {
        System.out.println("gogogo");
        return "select.xhtml?faces-redirect=true";
    }

    public String goToRemoteDesktop() {
        System.out.println("gogogo");
        return "remote_desktop.xhtml?faces-redirect=true";
    }

    public String goToRemotestart() {
        System.out.println("gogogo");
        return "startMschine.xhtml?faces-redirect=true";
    }
    
     public String goToSupport(){
         return "support.xhtml?faces-redirect=true";
     }
     
       public String goToIndex(){
         System.out.println("check goToIndex");
         return "index.xhtml?faces-redirect=true";
     }
      
     public String goToSettings(){
         return "settings.xhtml?faces-redirect=true";
     }
     
     
     public void fatal() {
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + "") );
        context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
   }
}

