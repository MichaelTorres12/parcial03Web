package com.example.parcial03.departamentos;

import java.util.List;

import com.example.parcial03.municipios.Municipios;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Departamentos {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String nombre;
    
        @OneToMany
        (mappedBy = "departamentos", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private List<Municipios> municipios;
    
        // Constructor, Getters y Setters
    }


