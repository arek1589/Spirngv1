/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clockworkjava.kursspring.repository;

import com.clockworkjava.kursspring.domain.Knight;
import com.clockworkjava.kursspring.utils.Ids;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Arek
 */
@Repository
public class KnightRepository {
    
   
 private String name;
    Map<Integer,Knight> knights = new HashMap<>();
    public KnightRepository() {
        
    }

    
    public void createKnight(String name, int age){
        Knight newKnight = new Knight(name,age);
        newKnight.setId(getNewId());
    knights.put(newKnight.getId(),newKnight);
    }
    
    public Collection<Knight> getAllKnights(){
        return knights.values();
    }
    

    public Optional<Knight> getKnight(String name) {

        Optional<Knight> knightByName = knights.values().stream().filter(knight -> knight.getName().equals(name)).findAny();

        return knightByName;
    }
    
    public void deleteKnight(Integer id){
        knights.remove(id);
    }
    @PostConstruct
    public void build(){
        createKnight("Lancelot", 29);
        createKnight("Percival", 25);

    }
   

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "KnightRepository{" + "name=" + name + ", knights=" + knights + '}';
    }
  

    
     public void createKnight(Knight knight) {
        knight.setId(Ids.generateNewId(knights.keySet()));
        knights.put(knight.getId(), knight);
    }
   

    
    public int getNewId() {
        if(knights.isEmpty()) {
            return 0;
        }
        else {
            Integer integer = knights.keySet().stream().max((o1, o2) -> o1.compareTo(o2)).get();
            return integer+1;
        }
    }
    
//    private int getNewId() {
//      if(knights.isEmpty()){
//          return 0;
//      }else {
//      knights.keySet().stream().max(Integer::max);
//      }
//      return 1;
//    }

   // public void createKnight(Knight knight) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    public Knight getKnightById(Integer id) {
       return knights.get(id);//To change body of generated methods, choose Tools | Templates.
    }
     
      public void updateKnight(int id, Knight knight) {
        knights.put(id,knight);
    }
    
}
