/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.repository.crud;

import com.usa.reto3completoMiguel.modelentidades.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
    
}
