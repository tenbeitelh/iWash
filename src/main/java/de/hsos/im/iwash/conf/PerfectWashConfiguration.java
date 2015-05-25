/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.conf;

import java.util.Date;

/**
 *
 * @author H. Tenbeitel
 */
public class PerfectWashConfiguration {

    private String modus;
    private float temperature;
    private String duration;
    private int qunatity;
    private String pollutionVariety;
    private String pollutionDegree;
    private Date startTime;
    private String good;
    private boolean usePerfectWash;

    public PerfectWashConfiguration(String modus, float temperature, String duration, int qunatity, String pollutionVariety, String pollutionDegree, Date startTime, String good, boolean usePerfectWash) {
        this.modus = modus;
        this.temperature = temperature;
        this.duration = duration;
        this.qunatity = qunatity;
        this.pollutionVariety = pollutionVariety;
        this.pollutionDegree = pollutionDegree;
        this.startTime = startTime;
        this.good = good;
        this.usePerfectWash = usePerfectWash;
    }

    public String getModus() {
        return modus;
    }

    public void setModus(String modus) {
        this.modus = modus;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getQunatity() {
        return qunatity;
    }

    public void setQunatity(int qunatity) {
        this.qunatity = qunatity;
    }

    public String getPollutionVariety() {
        return pollutionVariety;
    }

    public void setPollutionVariety(String pollutionVariety) {
        this.pollutionVariety = pollutionVariety;
    }

    public String getPollutionDegree() {
        return pollutionDegree;
    }

    public void setPollutionDegree(String pollutionDegree) {
        this.pollutionDegree = pollutionDegree;
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

    public boolean isUsePerfectWash() {
        return usePerfectWash;
    }

    public void setUsePerfectWash(boolean usePerfectWash) {
        this.usePerfectWash = usePerfectWash;
    }

    @Override
    public String toString() {
        return "PerfectWashConfiguration{" + "modus=" + modus + ", temperature=" + temperature + ", duration=" + duration + ", qunatity=" + qunatity + ", pollutionVariety=" + pollutionVariety + ", pollutionDegree=" + pollutionDegree + ", startTime=" + startTime + ", good=" + good + ", usePerfectWash=" + usePerfectWash + '}';
    }

}
