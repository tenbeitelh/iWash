/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;


import de.hsos.im.iwash.model.WasherService;
import de.hsos.im.iwash.model.WashProcess;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
 
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
/**
 *
 * @author Ace
 */
@ManagedBean
public class ChartView implements Serializable {
 
    private BarChartModel barModel;
    private HorizontalBarChartModel horizontalBarModel;
    private PieChartModel pieModel1;
    private PieChartModel pieModel2;
    
    private List<WashProcess> washerlist;
    private WashProcess selectedWasher;
    @ManagedProperty(value="#{washerService}")
    private WasherService service;

    @PostConstruct
    public void init() {
        createBarModels();
        createPieModels();
        washerlist = service.createWashProcess(4);
    }

    public PieChartModel getPieModel2() {
        return pieModel2;
    }

    public void setPieModel2(PieChartModel pieModel2) {
        this.pieModel2 = pieModel2;
    }
    
    
    
    public void setService(WasherService service) {
        this.service = service;
    }
 
    public WashProcess getSelectedCar() {
        return selectedWasher;
    }
 
    public void setSelectedWasher(WashProcess selectedWasher) {
        this.selectedWasher = selectedWasher;
    }
 
    public BarChartModel getBarModel() {
        return barModel;
    }
    public PieChartModel getPieModel1() {
        return pieModel1;
    }
    
    public List<WashProcess> getWasherlist() {
        return washerlist;
    }

    public void setWasherlist(List<WashProcess> washerlist) {
        this.washerlist = washerlist;
    }
     
    public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel;
    }
 
    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();
 
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("2004", 120);

        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");
        girls.set("2004", 52);
 
        model.addSeries(boys);
        model.addSeries(girls);
         
        return model;
    }
     
    private void createBarModels() {
        createBarModel();
        createHorizontalBarModel();
    }
     
    private void createBarModel() {
        barModel = initBarModel();
         
        barModel.setTitle("Bar Chart");
        barModel.setLegendPosition("ne");
         
        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Gender");
         
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Births");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }
     
    private void createHorizontalBarModel() {
        horizontalBarModel = new HorizontalBarChartModel();
 
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("2004", 50);
        boys.set("2005", 96);
 
        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");
        girls.set("2004", 52);
        girls.set("2005", 60);
 
        horizontalBarModel.addSeries(boys);
        horizontalBarModel.addSeries(girls);
         
        horizontalBarModel.setTitle("Horizontal and Stacked");
        horizontalBarModel.setLegendPosition("e");
        horizontalBarModel.setStacked(true);
         
        Axis xAxis = horizontalBarModel.getAxis(AxisType.X);
        xAxis.setLabel("Births");
        xAxis.setMin(0);
        xAxis.setMax(200);
         
        Axis yAxis = horizontalBarModel.getAxis(AxisType.Y);
        yAxis.setLabel("Gender");        
    }
 
    
    private void createPieModels() {
        createPieModel1();
        createPieModel2();
    }
 
    private void createPieModel1() {
        pieModel1 = new PieChartModel();
        
        Random rand = new Random();
        int  n = rand.nextInt(100) + 0;

        int  maschine = rand.nextInt(5) + 1;
         
        pieModel1.set("Restwaschzeit", 100-n);
        pieModel1.set("Waschzeit", n);
        pieModel1.setTitle("Laufzeit von Waschmaschine " +maschine);
        pieModel1.setLegendPosition("e");
    }
    private void createPieModel2() {
        pieModel2 = new PieChartModel();
        
        Random rand = new Random();
        int  n = rand.nextInt(100) + 0;

        int  maschine = rand.nextInt(5) + 1;
         
        pieModel2.set("Restwaschzeit", 100-n);
        pieModel2.set("Waschzeit", n);
        pieModel2.setTitle("Laufzeit von Waschmaschine " +maschine);
        pieModel2.setLegendPosition("e");
    }
}
