/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clockworkjava.kursspring.services;

import com.clockworkjava.kursspring.domain.Quest;
import com.clockworkjava.kursspring.repository.QuestRepository;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

/**
 *
 * @author Arek
 */
@Service
public class QuestFormatter implements Formatter<Quest>{

    @Autowired
    QuestRepository repository;
    
    @Override
    public String print(Quest object, Locale locale) {
        return object.toString();
                }

    @Override
    public Quest parse(String idAsStr, Locale locale) throws ParseException {
     Integer id = Integer.parseInt(idAsStr);
     repository.getQuest(id);
        return repository.getQuest(id);
    }
    
}
