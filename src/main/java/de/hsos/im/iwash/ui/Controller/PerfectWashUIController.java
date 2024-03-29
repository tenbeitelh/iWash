/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import de.hsos.im.iwash.conf.PerfectWashConfiguration;
import de.hsos.im.iwash.model.WashProcess;
import de.hsos.im.iwash.utils.ConfigurationUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author H. Tenbeitel
 */
@Named(value = "perfectWashUIController")
@Dependent
public class PerfectWashUIController {

    private String modus = "Standard Modus";
    private Map<String, String> modi;

    private float temperature;

    private Date duration;

    private int quantity;

    private String pollutionVariety = "anorganisch";
    private Map<String, String> pollutionVarieties;

    private String pollutionDegree = "Mittel";
    private Map<String, String> pollutionDegrees;

    private Date startTime;

    private String good = "Becher";
    private Map<String, String> goods;

    private boolean usePerfectWash = true;

    private List<WashProcess> lastWashProcesses;

    public PerfectWashUIController() {
    }

    @PostConstruct
    public void init() {
        
        duration = new Date();
        startTime = new Date();
        
        modi = new HashMap<String, String>();
        modi.put("StandartA", "StandartA");
        modi.put("Ultimate", "Ultimate");
        modi.put("Clean", "Clean");
        modi.put("UltraWash", "UltraWash");

        pollutionVarieties = new HashMap<String, String>();
        pollutionVarieties.put("anorganisch", "anorganisch");
        pollutionVarieties.put("organisch", "organisch");

        pollutionDegrees = new HashMap<String, String>();
        pollutionDegrees.put("Stark", "Stark");
        pollutionDegrees.put("Mittel", "Mittel");
        pollutionDegrees.put("Gering", "Gering");

        goods = new HashMap<>();
        goods.put("Becher", "Becher");

        createLastWashProcesses();
        onPageLeft();
    }

    public void onPageLeft() {
        PerfectWashConfiguration conf = new PerfectWashConfiguration(modus, temperature, duration.toString(), quantity, pollutionVariety, pollutionDegree, startTime, good, usePerfectWash);
        
        try {
            ConfigurationUtils.saveConfiguration("perfect_wash_conf.conf", conf);
        } catch (IOException ex) {
            Logger.getLogger(PerfectWashUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadConfiguration(){
        try {
            PerfectWashConfiguration conf = ConfigurationUtils.loadPerfectWashConfiguration("perfect_wash_conf.conf");
            this.modus = conf.getModus();
            this.temperature = conf.getTemperature();
            this.quantity = conf.getQunatity();
            this.startTime = conf.getStartTime();
            this.pollutionVariety = conf.getPollutionVariety();
            this.pollutionDegree = conf.getPollutionDegree();
            this.good = conf.getGood();
            this.duration = new Date(conf.getDuration());
            this.usePerfectWash = conf.isUsePerfectWash();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PerfectWashUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createLastWashProcesses() {
        this.lastWashProcesses = new ArrayList<WashProcess>();
        WashProcess temp = new WashProcess("WDA110", new Date(1999, 12, 10, 12, 12, 12), "30sec", "Perfect Wash", 0.97);
        this.lastWashProcesses.add(temp);
        temp = new WashProcess("EX200P", new Date(1999, 12, 10, 18, 12, 12), "1min", "Ultimate A", 0.88);
        this.lastWashProcesses.add(temp);
        temp = new WashProcess("WDA1101", new Date(1999, 12, 10, 18, 12, 12), "8min", "Super B", 0.90);
        this.lastWashProcesses.add(temp);
        temp = new WashProcess("EDF800", new Date(1999, 12, 10, 18, 12, 12), "8min", "Ultimate A", 0.87);
        this.lastWashProcesses.add(temp);
        temp = new WashProcess("KP/233", new Date(1999, 12, 10, 18, 12, 12), "20min", "Ultimate A", 0.87);
        this.lastWashProcesses.add(temp);
    }

    public String getModus() {
        return modus;
    }

    public void setModus(String modus) {
        this.modus = modus;
    }

    public Map<String, String> getModi() {
        return modi;
    }

    public void setModi(Map<String, String> modi) {
        this.modi = modi;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPollutionVariety() {
        return pollutionVariety;
    }

    public void setPollutionVariety(String pollutionVariety) {
        this.pollutionVariety = pollutionVariety;
    }

    public Map<String, String> getPollutionVarieties() {
        return pollutionVarieties;
    }

    public void setPollutionVarieties(Map<String, String> pollutionVarieties) {
        this.pollutionVarieties = pollutionVarieties;
    }

    public String getPollutionDegree() {
        return pollutionDegree;
    }

    public void setPollutionDegree(String pollutionDegree) {
        this.pollutionDegree = pollutionDegree;
    }

    public Map<String, String> getPollutionDegrees() {
        return pollutionDegrees;
    }

    public void setPollutionDegrees(Map<String, String> pollutionDegrees) {
        this.pollutionDegrees = pollutionDegrees;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public Map<String, String> getGoods() {
        return goods;
    }

    public void setGoods(Map<String, String> goods) {
        this.goods = goods;
    }

    public boolean isUsePerfectWash() {
        return usePerfectWash;
    }

    public void setUsePerfectWash(boolean usePerfectWash) {
        this.usePerfectWash = usePerfectWash;
    }

    public List<WashProcess> getLastWashProcesses() {
        return lastWashProcesses;
    }

    public void setLastWashProcesses(List<WashProcess> lastWashProcesses) {
        this.lastWashProcesses = lastWashProcesses;
    }

}
