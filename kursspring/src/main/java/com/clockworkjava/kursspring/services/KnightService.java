/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clockworkjava.kursspring.services;

import com.clockworkjava.kursspring.domain.Knight;
import com.clockworkjava.kursspring.repository.KnightRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Arek
 */
@Component
public class KnightService {
     @Autowired
    KnightRepository knightRepository;

    public List<Knight> getAllKnights() {
        return new ArrayList<>(knightRepository.getAllKnights());
    }


    public void saveKnight(Knight knight) {
        knightRepository.createKnight(knight);
    }

    public Knight getKnight(Integer id) {
        return knightRepository.getKnightById(id);
    }

    public void deleteKnight(Integer id) {
        knightRepository.deleteKnight(id);
    }

    public void updateKnight(Knight knight) {
        knightRepository.updateKnight(knight.getId(), knight);
    }
    
     public int collectRewards() {

        int sum = knightRepository.getAllKnights().stream().filter(knight -> knight.getQuest().isCompleted())
                .mapToInt(knight -> knight.getQuest().getReward())
                .sum();

        knightRepository.getAllKnights().stream().filter(knight -> knight.getQuest().isCompleted()).forEach( knight -> {
            knight.setQuest(null);
        });

        return sum;

    }
}
