/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.interfaz;

import com.usa.reto3completoMiguel.modelentidades.Client;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Administrador
 */
public interface ClientInterfaz extends CrudRepository<Client, Integer>{
    
}
