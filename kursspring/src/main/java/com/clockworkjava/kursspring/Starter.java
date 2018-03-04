/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clockworkjava.kursspring;

import com.clockworkjava.kursspring.services.QuestService;
import com.clockworkjava.kursspring.repository.KnightRepository;
import com.clockworkjava.kursspring.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 *
 * @author Arek
 */
@Component
@Scope("singleton")
public class Starter implements CommandLineRunner{

    @Autowired
    KnightRepository knightRepository;
    
    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;
    
    @Override
    public void run(String... args) throws Exception {
        
        questRepository.createRandomQuest();
        questRepository.createRandomQuest();

        questService.assignRandomQuest("Percival");
        
//        questService.assignedRandomQuest("Lancelot");
//        questService.assignedRandomQuest("Percival");

       
  //      System.out.println(knightRepository);
//        System.out.println(questRepository);



    }
    
}
