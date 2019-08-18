/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springboot_aiml.controller;

import com.mycompany.springboot_aiml.Alice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mint
 */
@RestController
public class BotController {
    //
    @RequestMapping("/chat")
    public String chat(@RequestParam(value="message", defaultValue="Hi") String message){
        return Alice.getInstance().chat(message);
    }
    
    @RequestMapping("/reset")
    public String reset(){
        return Alice.getInstance().reset();
    }
    
    @RequestMapping("/")
    public String help(){
        return "/chat?message=\"Hi Alice!\"";
    }
}
