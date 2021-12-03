/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.repository.crud;

import com.usa.reto3completoMiguel.interfaz.ReservationInterfaz;
import com.usa.reto3completoMiguel.modelentidades.Reservation;
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
public class ReservationRepository {
    
     @Autowired
    private ReservationInterfaz repo; 
    
    public List<Reservation> getAll(){
        return (List<Reservation>) repo.findAll();
    }
    
    public Optional<Reservation> getById(int id){
        return repo.findById(id);
    }
    
    public Reservation save (Reservation reservation){
        return repo.save(reservation);
    }
    
    public void delete(Reservation reservation){
        repo.delete(reservation);
    }
    
}
