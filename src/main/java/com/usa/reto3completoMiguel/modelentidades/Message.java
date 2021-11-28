/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.modelentidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author USER
 */
@Data
@Entity
@Table(name = "message")
public class Message implements Serializable {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    /**
     * @JsonIgnoreProperties({"messages", "category", "reservations"})
     * @ManyToMany(mappedBy = "messages") private List<Lib> libs;
     */
    @ManyToOne
    @JsonIgnoreProperties({"messages", "client", "reservations"})
    private Lib lib;

    @ManyToOne
    @JsonIgnoreProperties({"messages", "reservations"})
    private Client client;

}
