/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springboot_aiml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author mint
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
    
    //Not a test!
    @Bean
    public void Hello(){
        System.out.println(Alice.getInstance().chat("Hi"));
    }
    
    //Not a test!
    
    @Bean
    public void Name(){
        System.out.println(Alice.getInstance().chat("What is your name?"));
    }
}
