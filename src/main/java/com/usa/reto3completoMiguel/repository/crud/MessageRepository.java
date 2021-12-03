/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.repository.crud;


import com.usa.reto3completoMiguel.interfaz.MessageInterfaz;
import com.usa.reto3completoMiguel.modelentidades.Message;
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
public class MessageRepository {
    
     @Autowired
    private MessageInterfaz repo; 
    
    public List<Message> getAll(){
        return (List<Message>) repo.findAll();
    }
    
    public Optional<Message> getById(int id){
        return repo.findById(id);
    }
    
    public Message save (Message message){
        return repo.save(message);
    }
    
    public void delete(Message message){
        repo.delete(message);
    }

}
