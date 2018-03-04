/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clockworkjava.kursspring.repository;

import com.clockworkjava.kursspring.domain.Quest;
import com.clockworkjava.kursspring.utils.Ids;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.annotation.PostConstruct;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Arek
 */
@Repository
public class QuestRepository {
    
//    List<Quest> questList = new ArrayList<>();
//    Random rand = new Random();
//    //tworzymy metode ktora dodaje zadania 
//    
//    public void createQuest(String description){
//        questList.add(new Quest(description));
//    }
//
//    public List<Quest> getAll() {
//        return questList;
//    }
//    
//    public void deleteQuest(Quest quest){
//        questList.remove(quest);
//    }
//      public void update(Quest quest) {
//        quests.put(quest.getId(),quest);
//    }
//    @Scheduled(fixedDelayString = "${questDelay}")
//    public void createRandomQuest(){
//    List<String> descriptions = new ArrayList<>();
//    descriptions.add("Uratuj księżniczkę");
//    descriptions.add("Weź udział w turnieju");
//    descriptions.add("Zabij bandytów");
//    descriptions.add("Zabij smoka");
//    
//    String description = descriptions.get(rand.nextInt(descriptions.size()));
//    System.out.println("Utworzył zadania  o opisie: " + description);
//    createQuest(description);
//
//    
//    }
//    
//    
//    
//    public void init(){
//      
//    }
//
//    @Override
//    public String toString() {
//        return "QuestRepository{" + "questList=" + questList + '}';
//    }
//    
     Random rand = new Random();

    Map<Integer,Quest> quests = new HashMap<>();


    public void createQuest(String description) {
        int newId = Ids.generateNewId(quests.keySet());
        Quest newQuest = new Quest(newId, description);
        quests.put(newId, newQuest);
    }

    public List<Quest> getAll() {
        return  new ArrayList<>(quests.values());
    }

    public void deleteQuest(Quest quest) {
        quests.remove(quest.getId());
    }

    @PostConstruct
    public void init() {

    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "quests=" + quests +
                '}';
    }

    @Scheduled(fixedDelayString  = "${questCreationDelay}")
    public void createRandomQuest() {
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Uratuj ksiezniczke");
        descriptions.add("Wez udzial w turnieju");
        descriptions.add("Zabij bande goblinow");
        descriptions.add("Zabij smoka");

        String description = descriptions.get(rand.nextInt(descriptions.size()));
        createQuest(description);
    }

    public void update(Quest quest) {
        quests.put(quest.getId(),quest);
    }

    public Quest getQuest(Integer id) {
        return quests.get(id);
    }
    
//     public void init(){
//     }
}
