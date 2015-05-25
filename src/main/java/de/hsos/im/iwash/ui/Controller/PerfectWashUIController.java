/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import de.hsos.im.iwash.model.WashProcess;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
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
        modi = new HashMap<String, String>();
        modi.put("TestModus", "TestModus");
        modi.put("Standard Modus", "Standard Modus");

        pollutionVarieties = new HashMap<String, String>();
        pollutionVarieties.put("anorganisch", "anorganisch");

        pollutionDegrees = new HashMap<String, String>();
        pollutionDegrees.put("Stark", "Stark");
        pollutionDegrees.put("Mittel", "Mittel");
        pollutionDegrees.put("Gering", "Gering");

        goods = new HashMap<String, String>();
        goods.put("Becher", "Becher");
        
        createLastWashProcesses();
    }

    public void createLastWashProcesses() {
        this.lastWashProcesses = new ArrayList<WashProcess>();
        WashProcess temp = new WashProcess("MachineId1", new Date(1999, 12, 10, 12, 12, 12), "1h", "Standard Modus", 0.97);
        this.lastWashProcesses.add(temp);
        temp = new WashProcess("MachineId2", new Date(1999, 12, 10, 18, 12, 12), "1,5h", "Erweiterter Modus", 0.90);
        this.lastWashProcesses.add(temp);
        temp = new WashProcess("MachineId3", new Date(1999, 12, 10, 18, 12, 12), "1,5h", "Erweiterter Modus", 0.70);
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
