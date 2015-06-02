/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import de.hsos.im.iwash.model.Employee;
import de.hsos.im.iwash.model.MachineSettings;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

/**
 *
 * @author H. Tenbeitel
 */
@Named(value = "settingsController")
@ManagedBean
public class SettingsController implements Serializable{

    /**
     * Creates a new instance of SettingsController
     */
    
    private Map<String, MachineSettings> machineSettingsMap;
    private Map<String, Employee> employees = new HashMap<>();
    
    private MachineSettings selectedMachine;
    private Employee selectedEmployee;
    
    private String telephone;
    private String email ;
    
    public SettingsController() {
        
        
        machineSettingsMap = new HashMap<>();
        machineSettingsMap.put("Machine1", new MachineSettings("Machine1", true));
        machineSettingsMap.put("Machine2", new MachineSettings("Machine2", true));
        machineSettingsMap.put("Machine3", new MachineSettings("Machine3", false));
        employees = MachineSettings.getEmployeeMap();
        
        this.selectedMachine = machineSettingsMap.get("Machine1");
        this.selectedEmployee= employees.get("Walter");
        
        this.telephone = this.selectedEmployee.getTelephone();
        this.email = this.selectedEmployee.geteMail();
        
            
    }

    public Map<String, MachineSettings> getMachineSettingsMap() {
        return machineSettingsMap;
    }

    private void setMachineSettingsMap(Map<String, MachineSettings> machineSettingsMap) {
        this.machineSettingsMap = machineSettingsMap;
    }

    public Map<String, Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(Map<String, Employee> employees) {
        this.employees = employees;
    }

    public MachineSettings getSelectedMachine() {
        return selectedMachine;
    }

    public void setSelectedMachine(MachineSettings selectedMachine) {
        this.selectedMachine = selectedMachine;
    }

    public Employee getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(Employee selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    public void onEmployeeChanges(){
        System.out.println(this.telephone);
        System.out.println(this.email);
        this.telephone = selectedEmployee.getTelephone();
        this.email = selectedEmployee.geteMail();
        System.out.println(this.telephone);
        System.out.println(this.email);
    }
    
    
}
