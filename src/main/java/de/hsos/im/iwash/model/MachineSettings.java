/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author H. Tenbeitel
 */
public class MachineSettings {

    private String machineName;
    private boolean notifaction;
    private static List<Employee> employees;
    private static Map<String, Employee> map;

    public MachineSettings(String machineName, boolean notification) {
        this.machineName = machineName;
        this.notifaction = notification;
        if (employees == null) {
            initEmployeeList();
        }

    }

    public static Map<String, Employee> getEmployeeMap() {
        if (map == null) {
            map = new HashMap<>();
            for (Employee emp : employees) {
                map.put(emp.getName(), emp);
            }

        }
        return map;
    }

    public void initEmployeeList() {
        employees = new ArrayList<>();
        Employee emp = new Employee("Walter", "walter@company.com", "015121554654");
        employees.add(emp);
        emp = new Employee("Heidi", "heidi@company.com", "01514556478898");
        employees.add(emp);
        emp = new Employee("Tobias", "tobias@company.com", "01514787465465");
        employees.add(emp);
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public boolean isNotifaction() {
        return notifaction;
    }

    public void setNotifaction(boolean notifaction) {
        this.notifaction = notifaction;
    }
    
    

}
