/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal.spring.soalspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author USER
 */
@ComponentScan
public class UmurSaya {
    
        public static void main(String[] args) {
            ApplicationContext springContainer = new AnnotationConfigApplicationContext(Umur.class);
            Umur umur = springContainer.getBean("umur", Umur.class);
            System.out.println(umur.getUmur());
            
        }
}
