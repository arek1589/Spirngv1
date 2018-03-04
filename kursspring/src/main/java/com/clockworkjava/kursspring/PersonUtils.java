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
public class PersonUtils {
    private static  PersonUtils instance = null;

    public PersonUtils() {
    }

    public  PersonUtils getInstance() {
        if(instance == null){
            instance = new PersonUtils();
        }
        
        return instance;
    }
    
    public final String operacja(Person person) {
        return person.name.toUpperCase();
        
    }
}
