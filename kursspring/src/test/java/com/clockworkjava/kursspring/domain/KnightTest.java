/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clockworkjava.kursspring.domain;

/**
 *
 * @author Arek
 */
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class KnightTest {


    @Test
    public void testIfQuestMarkedAsStarted() {

        Knight knight = new Knight("Percival", 25);
        Quest quest = new Quest(1,"Testowe zdanie");

        knight.setQuest(quest);

        assertTrue(knight.getQuest().isStarted());


    }
}
