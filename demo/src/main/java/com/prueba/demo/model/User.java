package com.prueba.demo.model;

import javax.persistence.*;
import lombok.Data;

@Table(name = "users")
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    // Otros campos y relaciones

    // Getters y setters
}