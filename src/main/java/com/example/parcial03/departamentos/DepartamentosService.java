package com.example.parcial03.departamentos;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DepartamentosService {
    private final DepartamentosRepository departamentosRepository;


   
    public DepartamentosService(DepartamentosRepository departamentosRepository) {
        this.departamentosRepository = departamentosRepository;
    }

    public List<Departamentos> obtenerTodosLosDepartamentos() {
        return departamentosRepository.findAll();
    }
    
}
