/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springboot_aiml;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author mint
 */


public class First {
    public void main(String args[]){
        // TODO code application logic here
        Bot bot = new Bot("super","src/lib/aiml");
        Chat chatSession = new Chat(bot); 
        String request = "Hello.";
        String response = chatSession.multisentenceRespond(request); 
        System.out.println(response); 
    }
    
    
}
