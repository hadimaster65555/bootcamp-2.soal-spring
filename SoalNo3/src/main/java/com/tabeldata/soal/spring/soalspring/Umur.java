/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal.spring.soalspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author USER
 */
@Component
public class Umur {
    private java.lang.Integer umur;
    
    public Umur(@Value("20") java.lang.Integer umur){
        this.umur=umur;
    }
    
        public String getUmur(){
        return "Saya ber usia " + umur + " tahun";
    }
}
