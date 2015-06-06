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
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author Ace
 */
@Model
public class ChartView implements Serializable {

    private BarChartModel barModel;
    private PieChartModel pieModel1;
    private PieChartModel Maschine1;
    private PieChartModel Maschine2;
    private PieChartModel Maschine3;
    private PieChartModel Maschine4;
    private PieChartModel Maschine5;
    private PieChartModel pieModel2;
    private HorizontalBarChartModel horizontalBarModel;
    private LineChartModel lineModel2;
    private boolean flagA = false;
    private String readyA;
    private boolean flagB = false;
    private String readyB;
    private boolean flagC = false;
    private String readyC;
    private boolean flagD = false;
    private String readyD;
    private boolean flagE = false;
    private String readyE;
    private boolean tmpA = false;
    
    ArrayList<ModelBean[]> liste=new ArrayList<ModelBean[]>();

    @Inject
    ChartSessionBean testBean;

    @Inject
    ChartProgressModelBean model;

    @Inject
    PieSessionBean PieTestBean;

    private List<String> supplier;
    private List<String> supplies;
    private WashProcess selectedWasher;
    @ManagedProperty(value = "#{washerService}")
    private WasherService service;

    @PostConstruct
    public void init() {
        createBarModels();
        createPieModels();
        createBarModels();
        createLineModels();
    }

    public LineChartModel getLineModel2() {
        return lineModel2;
    }

    public boolean isFlagB() {
        return flagB;
    }

    public boolean isTmpA() {
        return tmpA;
    }

    public void setTmpA(boolean tmpA) {
        this.tmpA = tmpA;
    }

    public ArrayList<ModelBean[]> getListe() {
        return liste;
    }

    public void setListe(ArrayList<ModelBean[]> liste) {
        this.liste = liste;
    }
    
    public void setFlagB(boolean flagB) {
        this.flagB = flagB;
    }

    public String getReadyB() {
        return readyB;
    }

    public void setReadyB(String readyB) {
        this.readyB = readyB;
    }

    public boolean isFlagC() {
        return flagC;
    }

    public void setFlagC(boolean flagC) {
        this.flagC = flagC;
    }

    public String getReadyC() {
        return readyC;
    }

    public void setReadyC(String readyC) {
        this.readyC = readyC;
    }

    public boolean isFlagD() {
        return flagD;
    }

    public void setFlagD(boolean flagD) {
        this.flagD = flagD;
    }

    public String getReadyD() {
        return readyD;
    }

    public void setReadyD(String readyD) {
        this.readyD = readyD;
    }

    public boolean isFlagE() {
        return flagE;
    }

    public void setFlagE(boolean flagE) {
        this.flagE = flagE;
    }

    public String getReadyE() {
        return readyE;
    }

    public void setReadyE(String readyE) {
        this.readyE = readyE;
    }

    public boolean isFlagA() {
        return flagA;
    }

    public void setFlagA(boolean flagA) {
        this.flagA = flagA;
    }

    public PieChartModel getMaschine1() {
        return Maschine1;
    }

    public void setMaschine1(PieChartModel Maschine1) {
        this.Maschine1 = Maschine1;
    }

    public PieChartModel getMaschine2() {
        return Maschine2;
    }

    public void setMaschine2(PieChartModel Maschine2) {
        this.Maschine2 = Maschine2;
    }

    public PieChartModel getMaschine3() {
        return Maschine3;
    }

    public void setMaschine3(PieChartModel Maschine3) {
        this.Maschine3 = Maschine3;
    }

    public PieChartModel getMaschine4() {
        return Maschine4;
    }

    public void setMaschine4(PieChartModel Maschine4) {
        this.Maschine4 = Maschine4;
    }

    public PieChartModel getMaschine5() {
        return Maschine5;
    }

    public void setMaschine5(PieChartModel Maschine5) {
        this.Maschine5 = Maschine5;
    }

    private void createLineModels() {

        Random rand = new Random();
        int c = rand.nextInt(3) + 0;
        supplier = new ArrayList<>();
        supplier.add("Miele");
        supplier.add("mundizio");
        supplier.add("wisch-star");
        supplier.add("reinigungsberater");
        lineModel2 = initCategoryModel();
        lineModel2.setTitle("Verkaufspreisentwicklung Reinigungsmittel " + supplier.get(c));
        lineModel2.setLegendPosition("e");
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
        int n = rand.nextInt(20) + 0;
        int b = rand.nextInt(50) + 0;

        int c = rand.nextInt(7) + 0;
        int d = rand.nextInt(7) + 0;

        supplies = new ArrayList<>();
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
        boys.set("JAN", n - rand.nextInt(1) + 0);
        boys.set("FEB", n - rand.nextInt(3) + 1);
        boys.set("MÄR", n - rand.nextInt(5) + 3);
        boys.set("APR", n - rand.nextInt(5) + 0);
        boys.set("MAI", n - rand.nextInt(5) + 8);

        ChartSeries girls = new ChartSeries();
        girls.setLabel(supplies.get(d));
        girls.set("JAN", b - rand.nextInt(1) + 0);
        girls.set("FEB", b - rand.nextInt(3) + 1);
        girls.set("MÄR", b - rand.nextInt(5) + 3);
        girls.set("APR", b - rand.nextInt(5) + 0);
        girls.set("MAI", b - rand.nextInt(5) + 8);

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

    public String getReadyA() {
        return readyA;
    }

    public void setReadyA(String readyA) {
        this.readyA = readyA;
    }

    private PieChartModel createMaschineOnePieModel() {

        double laufzeit = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", model.getProgressMaschineA()));

        if (laufzeit < 100) {
            readyA = "In Arbeit";
        } else {
            readyA = "Fertig";
            flagA = true;
        }
        
        Maschine1 = new PieChartModel();  
        Maschine1.set("Restwaschzeit", 100-laufzeit);
        Maschine1.set("Waschzeit", laufzeit);
        Maschine1.setLegendPosition("s");
        Maschine1.setFill(true);
        Maschine1.setShowDataLabels(true);
        Maschine1.setDiameter(100);
        return null;

    }

    private PieChartModel createMaschineTwoPieModel() {
        double laufzeit = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", model.getProgressMAschineB()));

        if (laufzeit < 100) {
            readyB = "In Arbeit";
        } else {
            readyB = "Fertig";
            flagB = true;
        }

        Maschine2 = new PieChartModel();
        Maschine2.set("Restwaschzeit", 100 - laufzeit);
        Maschine2.set("Waschzeit", laufzeit);
        Maschine2.setLegendPosition("s");
        Maschine2.setFill(true);
        Maschine2.setShowDataLabels(true);
        Maschine2.setDiameter(100);
        return null;

    }

    private PieChartModel createMaschineThreePieModel() {
        double laufzeit = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", model.getProgressMAschineC()));

        if (laufzeit < 100) {
            readyC = "In Arbeit";
        } else {
            readyC = "Fertig";
            flagC = true;
        }
        Maschine3 = new PieChartModel();
        Maschine3.set("Restwaschzeit", 100 - laufzeit);
        Maschine3.set("Waschzeit", laufzeit);
        Maschine3.setLegendPosition("s");
        Maschine3.setFill(true);
        Maschine3.setShowDataLabels(true);
        Maschine3.setDiameter(100);
        return null;

    }

    private PieChartModel createMaschineFourPieModel() {
        double laufzeit = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", model.getProgressMAschineD()));

        if (laufzeit < 100) {
            readyD = "In Arbeit";
        } else {
            readyD = "Fertig";
            flagD = true;
        }

        Maschine4 = new PieChartModel();
        Maschine4.set("Restwaschzeit", 100 - laufzeit);
        Maschine4.set("Waschzeit", laufzeit);
        Maschine4.setLegendPosition("s");
        Maschine4.setFill(true);
        Maschine4.setShowDataLabels(true);
        Maschine4.setDiameter(100);
        return null;
    }

    private PieChartModel createMaschineFivePieModel() {

        double laufzeit = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", model.getProgressMAschineE()));
        if (laufzeit < 100) {
            readyE = "In Arbeit";
        } else {
            readyE = "Fertig";
            flagE = true;
        }

        Maschine5 = new PieChartModel();
        Maschine5.set("Restwaschzeit", 100 - laufzeit);
        Maschine5.set("Waschzeit", laufzeit);
        Maschine5.setLegendPosition("s");
        Maschine5.setFill(true);
        Maschine5.setShowDataLabels(true);
        Maschine5.setDiameter(100);
        return null;
    }

    private HorizontalBarChartModel createHorizontalBarModel() {

        horizontalBarModel = new HorizontalBarChartModel();
        ChartSeries boys = new ChartSeries();
        ChartSeries girls = new ChartSeries();

        double WDA110 = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", model.getProgressMaschineA()));           
        double  EX200P = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", model.getProgressMAschineB()));           
        double  WDA1101 = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", model.getProgressMAschineC()));           
        double  EDF800 = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", model.getProgressMAschineD()));           
        double  KP_233 = Double.parseDouble(String.format(Locale.ENGLISH, "%1.2f", model.getProgressMAschineE()));           

        boys.setLabel("Laufzeit");
        boys.set("WDA110", WDA110);
        boys.set("EX200P", EX200P);
        boys.set("WDA1101", WDA1101);
        boys.set("EDF800", EDF800);
        boys.set("KP/233", KP_233);

        girls.setLabel("Verbleibende Laufzeit");
        girls.set("WDA110", 100 - WDA110);
        girls.set("EX200P", 100 - EX200P);
        girls.set("WDA1101", 100 - WDA1101);
        girls.set("EDF800", 100 - EDF800);
        girls.set("KP/233", 100 - KP_233);

        horizontalBarModel.addSeries(boys);
        horizontalBarModel.addSeries(girls);

        horizontalBarModel.setTitle("Laufzeit alle Maschinen");
        horizontalBarModel.setLegendPosition("s");
        horizontalBarModel.setStacked(true);
        Axis xAxis = horizontalBarModel.getAxis(AxisType.Y);
        xAxis.setLabel("Maschinen");
        xAxis.setMin(0);
        xAxis.setMax(110);

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
        createMaschineOnePieModel();
        createMaschineTwoPieModel();
        createMaschineThreePieModel();
        createMaschineFourPieModel();
        createMaschineFivePieModel();

    }

    private void createPieModel1() {
        pieModel1 = new PieChartModel();

        Random rand = new Random();
        int n = rand.nextInt(100) + 0;

        int maschine = rand.nextInt(5) + 1;
        int minuten = rand.nextInt(60) + 1;
        int sekunden = rand.nextInt(60) + 1;
        int Stunden = rand.nextInt(2) + 0;

        pieModel1.set("Restwaschzeit", 100 - n);
        pieModel1.set("Waschzeit", n);
        pieModel1.setLegendPosition("e");
        pieModel1.setFill(true);
        pieModel1.setShowDataLabels(true);
        pieModel1.setDiameter(100);

    }

    private void createPieModel2() {
        pieModel2 = new PieChartModel();

        Random rand = new Random();
        int n = rand.nextInt(100) + 0;

        int maschine = rand.nextInt(5) + 1;

        int minuten = rand.nextInt(60) + 1;
        int sekunden = rand.nextInt(60) + 1;
        int Stunden = rand.nextInt(2) + 0;

        pieModel2.set("Restwaschzeit", 100 - n);
        pieModel2.set("Waschzeit", n);
        pieModel2.setTitle("Laufzeit " + Stunden + ":" + minuten + ":" + sekunden);
        pieModel2.setLegendPosition("e");
        pieModel2.setFill(true);
        pieModel2.setShowDataLabels(true);
        pieModel2.setDiameter(100);
    }
}
