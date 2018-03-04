/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clockworkjava.kursspring.domain;

import com.clockworkjava.kursspring.domain.Quest;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Arek
 */

public class Knight {
    
    
    
    
    private int id;
    @NotNull
    @Size(min=2, max=40, message = "Imie musi zawierac miedzy 2 a 40 znakow")
    private String name;
    
    @NotNull
    @Range(min=18, max=60, message="Wiek musi sie zawierac miedzy 18 a 60 lat")
    private int age;
    private int level;

    private Quest quest;

    public Knight() {
        this.level = 1;
    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
        this.level = 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knight knight = (Knight) o;
        return age == knight.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie dla rycerza.");
        this.quest = quest;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    public Quest getQuest() {
        return quest;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu " + name + "(" + age + "). Ma za zadanie: " + quest;
    }
    
  
//    private int id;
//    private String name;
//
//    private int age;
//    private int level;
//    
//    private Quest quest;
//    
//        public Knight(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.level=1;
//       
//    }
////    public Knight(){
////  
////        
////    }
////   private Quest quest; 
//
//    public Knight() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 97 * hash + this.age;
//        return hash;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Knight other = (Knight) obj;
//        return true;
//    }
//
//    
//    public void setQuest(Quest quest) {
//        System.out.println("Ustaw zadanie dla rycerza");
//        this.quest = quest;
//    }
////    public Knight(String name, int age, Quest quest) {
////        this.name = name;
////        this.age = age;
////        this.quest = quest;
////    }
//    
////    public Knight(){
//////    this.name = "Lancelot";
//////    this.age ="29";
////    }
//  
//
//    public int getLevel() {
//        return level;
//    }
//
//    public void setLevel(int level) {
//        this.level = level;
//    }
//      
//      public void setAge(int age){
//      this.age = age;
//      }
//
//    public int getAge() {
//        return age;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//      
//      
//      
//    
////    @Override
////    public String toString(){
////    return "Rycerz o imieniu "  + name +"(" + age +").zadanie :" + quest;
////    }
//    @Override
//    public String toString(){
//    return "Rycerz o imieniu "  + name +"(" + age +")" ;
//    }
//    
//          
    
}
