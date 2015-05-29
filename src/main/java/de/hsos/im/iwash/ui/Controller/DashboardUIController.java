/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import javax.inject.Named;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.time.Clock;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author Ace
 */
@Named(value = "dashboardUIController")
@ManagedBean
public class DashboardUIController implements Serializable{

    public DashboardUIController() {
    }
     public String goToPerfectWash() {
        return "perfect_wash.xhtml?faces-redirect=true";
    }  
    
     public String goToSupport(){
         return "support.xhtml?faces-redirect=true";
     }
     
     public String goToSettings(){
         return "settings.xhtml?faces-redirect=true";
     }
}