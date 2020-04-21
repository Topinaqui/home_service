package com.faiton.school_panel.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * ClientType
 */
@Entity
public class ClientType {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private int id;

    private String title;

    private String description;

    private String code;
    
}