/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;


import de.hsos.im.iwash.model.WasherService;
import de.hsos.im.iwash.model.WashProcess;
import de.hsos.im.iwash.model.washerlist;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;
 
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.BarChartSeries;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.PieChartModel;
/**
 *
 * @author Ace
 */
@ManagedBean
public class ChartView implements Serializable {
 
    private BarChartModel barModel;
    private PieChartModel pieModel1;
    private PieChartModel pieModel2;
    private HorizontalBarChartModel horizontalBarModel;
    private LineChartModel lineModel2;
    
    @Inject
    washerlist list;
    
    private List<WashProcess> washerlist;
    private List<String> supplier;
    private List<String> supplies;
    private WashProcess selectedWasher;
    @ManagedProperty(value="#{washerService}")
    private WasherService service;

    @PostConstruct
    public void init() {
        createBarModels();
        createPieModels();
        washerlist = service.createWashProcess(4);
        createBarModels();
        list.setX(0);
         createLineModels();
    }
     public LineChartModel getLineModel2() {
        return lineModel2;
    }
     
     private void createLineModels() {
         
        Random rand = new Random();
        int  c = rand.nextInt(3) + 0;
        supplier = new  ArrayList<>();
        supplier.add("Miele");
        supplier.add("Amazon");
        supplier.add("Otto");
        supplier.add("Bosch");
        lineModel2 = initCategoryModel();
        lineModel2.setTitle("Verkaufspreisentwicklung Reinigungsmittel "+supplier.get(c));
        lineModel2.setLegendPosition("n");
        lineModel2.setShowPointLabels(true);
        lineModel2.getAxes().put(AxisType.X, new CategoryAxis("2015"));
        Axis yAxis = lineModel2.getAxis(AxisType.Y);
        yAxis.setLabel("Preis in €");
        yAxis.setMin(0);
        yAxis.setMax(80);
    }
     private LineChartModel initCategoryModel() {
        LineChartModel model = new LineChartModel();
 
        Random rand = new Random();
        int  n = rand.nextInt(20) + 0;
        int  b = rand.nextInt(50) + 0;
        
        int  c = rand.nextInt(7) + 0;
        int  d = rand.nextInt(7) + 0;
        
        supplies = new  ArrayList<>();
        supplies.add("WA UP1 1501 L Kartusche UltraPhase 1, 1,5 l");
        supplies.add("WA UP2 1501 L Kartusche UltraPhase 2, 1,5 l");
        supplies.add("WA CP5 1503 L Kartusche UltraPhase 3, 8,5 l");
        supplies.add("WA LP3 1504 L Kartusche UltraPhase 4, 5,5 l");
        supplies.add("WA PP1 1588 L Kartusche UltraPhase 5, 2,5 l");
        supplies.add("WA KP2 1587 L Kartusche UltraPhase 6, 3,5 l");
        supplies.add("WA MP5 1593 L Kartusche MediumPhase 7, 7,5 l");
        supplies.add("WA NP3 1564 L Kartusche MegaPhase 8, 8,5 l");
        
        
        ChartSeries boys = new ChartSeries();
        boys.setLabel(supplies.get(c));
        boys.set("JAN", n-rand.nextInt(1) + 0);
        boys.set("FEB", n-rand.nextInt(3) + 1);
        boys.set("MÄR", n-rand.nextInt(5) + 3);
        boys.set("APR", n-rand.nextInt(5) + 0);
        boys.set("MAI", n-rand.nextInt(5) + 8);
 
        ChartSeries girls = new ChartSeries();
        girls.setLabel(supplies.get(d));
        girls.set("JAN", b-rand.nextInt(1) + 0);
        girls.set("FEB", b-rand.nextInt(3) + 1);
        girls.set("MÄR", b-rand.nextInt(5) + 3);
        girls.set("APR", b-rand.nextInt(5) + 0);
        girls.set("MAI", b-rand.nextInt(5) + 8);
 
        model.addSeries(boys);
        model.addSeries(girls);
        
         return model;
    }

    public PieChartModel getPieModel2() {
        return pieModel2;
    }
    
    public void setPieModel2(PieChartModel pieModel2) {
        this.pieModel2 = pieModel2;
    }
    
    public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel;
    }
    
    private void createBarModel() {
        barModel = initBarModel();
         
        barModel.setTitle("Aktuell ausgeführte Programme in den Maschinen");
        barModel.setLegendPosition("ne");
         
        Axis xAxis = barModel.getAxis(AxisType.X);
         
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Anzahl Maschinen");
        yAxis.setMin(0);
        yAxis.setMax(8);
    }
    
    private HorizontalBarChartModel createHorizontalBarModel() { 
        
     horizontalBarModel = new HorizontalBarChartModel();
        ChartSeries boys = new ChartSeries();
        ChartSeries girls = new ChartSeries();
     
           Random rand = new Random();
         int  WDA110 = rand.nextInt(100) + 0;
         int  EX200P = rand.nextInt(100) + 0;
         int  WDA1101 = rand.nextInt(100) + 0;
         int  EDF800 = rand.nextInt(100) + 0;
         int  KP_233 = rand.nextInt(100) + 0;
        
        boys.setLabel("Laufzeit");
        boys.set("WDA110", WDA110);
        boys.set("EX200P", EX200P);
        boys.set("WDA110", WDA1101);
        boys.set("EDF800", EDF800);
        boys.set("KP/233", KP_233);
 
        
        girls.setLabel("Verbleibende Laufzeit");
        girls.set("WDA110", 100-WDA110);
        girls.set("EX200P", 100-EX200P);
        girls.set("WDA110", 100-WDA1101);
        girls.set("EDF800", 100-EDF800);
        girls.set("KP/233", 100-KP_233);
 
        horizontalBarModel.addSeries(boys);
        horizontalBarModel.addSeries(girls);
         
        horizontalBarModel.setTitle("Laufzeit alle Maschinen");
        horizontalBarModel.setLegendPosition("s");
        horizontalBarModel.setStacked(true);
        Axis xAxis = horizontalBarModel.getAxis(AxisType.Y);
        xAxis.setLabel("Maschinen");
        xAxis.setMin(0);
        xAxis.setMax(200);
         
        Axis yAxis = horizontalBarModel.getAxis(AxisType.X);
        yAxis.setLabel("Laufzeit in %");
        return horizontalBarModel;
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
 
    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();
 
        ChartSeries pA = new ChartSeries();
        pA.setLabel("PerfectWash");
        pA.set("Programme", 5);

        ChartSeries pB = new ChartSeries();
        pB.setLabel("StandartA");
        pB.set("Programme", 1);
        
        
        ChartSeries pC = new ChartSeries();
        pC.setLabel("Ultimate");
        pC.set("Programme", 3);
        
        ChartSeries pD = new ChartSeries();
        pD.setLabel("Clean");
        pD.set("Programme", 0);
        
        ChartSeries pE = new ChartSeries();
        pE.setLabel("UltraWash");
        pE.set("Programme", 1);
 
        model.addSeries(pA);
        model.addSeries(pB);
        model.addSeries(pC);
        model.addSeries(pD);
        model.addSeries(pE);
         
        return model;
    }
     
    private void createBarModels() {
        createBarModel();
        createHorizontalBarModel();
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
        int  minuten = rand.nextInt(60) + 1;
        int sekunden = rand.nextInt(60) + 1;
        int Stunden = rand.nextInt(2) + 0;
         
        pieModel1.set("Restwaschzeit", 100-n);
        pieModel1.set("Waschzeit", n);
        pieModel1.setTitle("Laufzeit "+Stunden+":"+minuten+":"+sekunden);
        pieModel1.setLegendPosition("e");
        pieModel1.setFill(true);
        pieModel1.setShowDataLabels(true);
        pieModel1.setDiameter(100);
        
    }
    private void createPieModel2() {
        pieModel2 = new PieChartModel();
        
        Random rand = new Random();
        int  n = rand.nextInt(100) + 0;
        
        

        int  maschine = rand.nextInt(5) + 1;
        
        int  minuten = rand.nextInt(60) + 1;
        int sekunden = rand.nextInt(60) + 1;
        int Stunden = rand.nextInt(2) + 0;
        
        pieModel2.set("Restwaschzeit", 100-n);
        pieModel2.set("Waschzeit", n);
        pieModel2.setTitle("Laufzeit "+Stunden+":"+minuten+":"+sekunden);
        pieModel2.setLegendPosition("e");
        pieModel2.setFill(true);
        pieModel2.setShowDataLabels(true);
        pieModel2.setDiameter(100);
    }
}
