/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springboot_aiml;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;

/**
 *
 * @author mint
 */
public class Alice {

    private static Alice instance = new Alice();
    private Bot bot;
    private Chat chatSession;

    private Alice() {
        bot = new Bot("super", "src/lib/aiml");
        chatSession = new Chat(bot);
        
    }
    
    
    
    public static Alice getInstance(){
        return instance;
    }
    
    //Message Bot, returns response
    public String chat(String msg) {
        if (chatSession != null) {
            return chatSession.multisentenceRespond(msg);
        }
        return "Error: chatSession is nulled!";
          
    }
    //Resets conversation variables!
    public static String reset(){
        instance = new Alice();
        return "Bot reseted";
    }

}
