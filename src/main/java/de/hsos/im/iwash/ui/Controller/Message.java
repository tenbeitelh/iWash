/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import java.util.List;

/**
 *
 * @author Ace
 */
public class Message {
    
    private String typ;
    private String message;

    public Message() {
    }

    public Message(String typ, String message) {
        this.typ = typ;
        this.message = message;
    }
    
    

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
