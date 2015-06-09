/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.ui.Controller;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Ace
 */
@ApplicationScoped
public class MessageContainer {
    
    private List<Message> messageList;

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    public MessageContainer() {
    }
    
    public void addMessage(Message e)
    {
        this.messageList.add(e);
    }
    
}
