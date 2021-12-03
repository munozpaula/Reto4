/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.repository.crud;

import com.usa.reto3completoMiguel.interfaz.ClientInterfaz;
import com.usa.reto3completoMiguel.modelentidades.Client;
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
public class ClientRepository {
     @Autowired
    private ClientInterfaz repo; 
    
    public List<Client> getAll(){
        return (List<Client>) repo.findAll();
    }
    
    public Optional<Client> getById(int id){
        return repo.findById(id);
    }
    
    public Client save (Client client){
        return repo.save(client);
    }
    
    public void delete(Client client){
        repo.delete(client);
    }
    
}
