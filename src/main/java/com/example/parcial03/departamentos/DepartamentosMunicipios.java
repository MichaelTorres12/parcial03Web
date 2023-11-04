package com.example.parcial03.departamentos;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class DepartamentosMunicipios {

    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String nombre;

}
