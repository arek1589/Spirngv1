/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clockworkjava.kursspring;

/**
 *
 * @author Arek
 */
public enum PersonUtils2 {
    INSTANCE;
    public final String operacja(Person person){
    
    return person.name.toUpperCase();
    }
    
}
