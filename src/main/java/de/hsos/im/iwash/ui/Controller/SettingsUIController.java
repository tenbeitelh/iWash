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
    private Map<String, String> supplierMap;
    private Map<String, String> goodsMap;

    private String machineName;
    private String employeeName;
    private String supplierName;
    private String good;

    private String eMail = "";
    private String telephone = "";

    private boolean notification = true;
    private boolean order = true;

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
        setupSupplierMap();
        setupGoodsMap();

        this.employeeName = "Walter";
        this.telephone = this.empMap.get("Walter").getTelephone();
        this.eMail = this.empMap.get("Walter").geteMail();
    }

    public void onMachineChange() {
        this.employeeName = "Walter";
        this.telephone = this.empMap.get("Walter").getTelephone();
        this.eMail = this.empMap.get("Walter").geteMail();
        this.notification = this.settingsMap.get(this.machineName).isNotification();

    }

    public void onEmployeeChange() {
        this.eMail = this.empMap.get(employeeName).geteMail();
        this.telephone = this.empMap.get(employeeName).getTelephone();
    }
    
    public void onOrderChange(){
        System.out.println("Order changed");
        this.order = this.order;
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

    public Map<String, String> getSupplierMap() {
        return supplierMap;
    }

    public void setSupplierMap(Map<String, String> supplierMap) {
        this.supplierMap = supplierMap;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Map<String, String> getGoodsMap() {
        return goodsMap;
    }

    public void setGoodsMap(Map<String, String> goodsMap) {
        this.goodsMap = goodsMap;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public boolean isOrder() {
        return order;
    }

    public void setOrder(boolean order) {
        this.order = order;
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

    private void setupSupplierMap() {
        this.supplierMap = new HashMap<>();
        this.supplierMap.put("Miele", "Miele");
        this.supplierMap.put("Amazon", "Amazon");
        this.supplierMap.put("Otto", "Otto");
        this.supplierMap.put("Bosch", "Bosch");
    }

    private void setupGoodsMap() {
        this.goodsMap = new HashMap<>();
        this.goodsMap.put("WA UP1 1501 L Kartusche UltraPhase 1, 1,5 l", "WA UP1 1501 L Kartusche UltraPhase 1, 1,5 l");
        this.goodsMap.put("WA UP2 1501 L Kartusche UltraPhase 2, 1,5 l", "WA UP2 1501 L Kartusche UltraPhase 2, 1,5 l");
        this.goodsMap.put("WA CP5 1503 L Kartusche UltraPhase 3, 8,5 l", "WA CP5 1503 L Kartusche UltraPhase 3, 8,5 l");
        this.goodsMap.put("WA LP3 1504 L Kartusche UltraPhase 4, 5,5 l", "WA LP3 1504 L Kartusche UltraPhase 4, 5,5 l");
        this.goodsMap.put("WA PP1 1588 L Kartusche UltraPhase 5, 2,5 l", "WA PP1 1588 L Kartusche UltraPhase 5, 2,5 l");
        this.goodsMap.put("WA KP2 1587 L Kartusche UltraPhase 6, 3,5 l", "WA KP2 1587 L Kartusche UltraPhase 6, 3,5 l");
        this.goodsMap.put("WA MP5 1593 L Kartusche MediumPhase 7, 7,5 l", "WA MP5 1593 L Kartusche MediumPhase 7, 7,5 l");
        this.goodsMap.put("WA NP3 1564 L Kartusche MegaPhase 8, 8,5 l", "WA NP3 1564 L Kartusche MegaPhase 8, 8,5 l");
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
