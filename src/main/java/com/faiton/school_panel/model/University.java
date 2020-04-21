package com.faiton.school_panel.model;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class University {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private int id;
    
    @Column
    private String nome;

    @Column
    private String description;

    @Column
    private String clientTypeCode;

}