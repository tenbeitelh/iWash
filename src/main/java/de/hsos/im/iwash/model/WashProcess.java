/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.model;


import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author H. Tenbeitel
 */
@ManagedBean
@ViewScoped
public class WashProcess {
    private String machineId;
    private Date startTime;
    private String duration; 
    private String washProgram;
    private double quality;
    
    public WashProcess(String machineId, Date startTime, String duration, String washProgramm, double quality){
        this.machineId = machineId;
        this.startTime = startTime;
        this.duration = duration;
        this.washProgram = washProgramm;
        this.quality = quality;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getWashProgram() {
        return washProgram;
    }

    public void setWashProgram(String washProgram) {
        this.washProgram = washProgram;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }
    
    
    
    
    
}
