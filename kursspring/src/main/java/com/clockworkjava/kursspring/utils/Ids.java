/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clockworkjava.kursspring.utils;

import java.util.Set;

/**
 *
 * @author Arek
 */
public class Ids {
    
    public static int generateNewId(Set<Integer> existingIds) {
        if(existingIds.isEmpty()) {
            return 0;
        }
        else {
            Integer integer = existingIds.stream().max((o1, o2) -> o1.compareTo(o2)).get();
            return integer+1;
        }
    }
}
