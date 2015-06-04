/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.inject.Model;

/**
 *
 * @author H. Tenbeitel
 */
@Named(value = "settingsUIController")
@Model
public class SettingsUIController {

    private Map<String, String> machineMap;
    private Map<String, MachineSettings> settingsMap;

    private Map<String, String> employeeMap;
    private Map<String, Employee> empMap;

    private String machineName;
    private String employeeName;

    private String eMail = "";
    private String telephone = "";

    private boolean notification = true;

    /**
     * Creates a new instance of SettingsUIController
     */
    public SettingsUIController() {
    }

    @PostConstruct
    public void init() {
        createTestEmployeeData();
        initEmpStringMap();
        createTestMachineDate();
        initMachStringMap();
        
        this.telephone = this.empMap.get("Walter").getTelephone();
        this.eMail = this.empMap.get("Walter").geteMail();
    }

    public void onMachineChange() {

        this.notification = this.settingsMap.get(this.machineName).isNotification();

        System.out.println(this.notification);
        System.out.println(machineName);
    }

    public void onEmployeeChange() {
        System.out.println(this.eMail);
        System.out.println(this.telephone);
        this.eMail = this.empMap.get(employeeName).geteMail();
        this.telephone = this.empMap.get(employeeName).getTelephone();
        System.out.println(employeeName);
        System.out.println(this.eMail);
        System.out.println(this.telephone);
    }

    public Map<String, String> getMachineMap() {
        return machineMap;
    }

    public void setMachineMap(Map<String, String> machineMap) {
        this.machineMap = machineMap;
    }

    public Map<String, MachineSettings> getSettingsMap() {
        return settingsMap;
    }

    public void setSettingsMap(Map<String, MachineSettings> settingsMap) {
        this.settingsMap = settingsMap;
    }

    public Map<String, String> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, String> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public Map<String, Employee> getEmpMap() {
        return empMap;
    }

    public void setEmpMap(Map<String, Employee> empMap) {
        this.empMap = empMap;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    private void createTestEmployeeData() {
        this.empMap = new HashMap<>();
        this.empMap.put("Walter", new Employee("Walter", "walter@company.com", "123455123132"));
        this.empMap.put("Uwe", new Employee("Uwe", "uwe@company.com", "132121255123132"));
        this.empMap.put("Kai", new Employee("Kai", "kai@company.com", "213124315415"));
    }

    private void initEmpStringMap() {
        this.employeeMap = new HashMap<>();
        for (String key : this.empMap.keySet()) {
            this.employeeMap.put(key, key);
        }
    }

    private void createTestMachineDate() {
        this.settingsMap = new HashMap<>();
        this.settingsMap.put("Maschine1", new MachineSettings("Machine1", true));
        this.settingsMap.put("Maschine2", new MachineSettings("Machine2", false));
        this.settingsMap.put("Maschine3", new MachineSettings("Machine3", true));
    }

    private void initMachStringMap() {
        this.machineMap = new HashMap<>();
        for (String key : this.settingsMap.keySet()) {
            this.machineMap.put(key, key);
        }
    }

    private class Employee {

        private String name;
        private String eMail;
        private String telephone;

        public Employee(String name, String eMail, String telephone) {
            this.name = name;
            this.eMail = eMail;
            this.telephone = telephone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String geteMail() {
            return eMail;
        }

        public void seteMail(String eMail) {
            this.eMail = eMail;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

    }

    private class MachineSettings {

        private String name;
        private boolean notification;

        public MachineSettings(String name, boolean notification) {
            this.name = name;
            this.notification = notification;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isNotification() {
            return notification;
        }

        public void setNotification(boolean notification) {
            this.notification = notification;
        }

    }

}
