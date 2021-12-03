/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.repository.crud;

import com.usa.reto3completoMiguel.interfaz.LibInterfaz;
import com.usa.reto3completoMiguel.modelentidades.Lib;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public class libRepository {
     @Autowired
    private LibInterfaz repo; 
    
    public List<Lib> getAll(){
        return (List<Lib>) repo.findAll();
    }
    
    public Optional<Lib> getById(int id){
        return repo.findById(id);
    }
    
    public Lib save (Lib lib){
        return repo.save(lib);
    }
    
    public void delete(Lib lib){
        repo.delete(lib);
    }

 
   
    
}
