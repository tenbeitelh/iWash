/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.model;

/**
 *
 * @author H. Tenbeitel
 */
public class Employee {
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
