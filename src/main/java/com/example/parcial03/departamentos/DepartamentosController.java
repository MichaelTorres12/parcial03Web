package com.example.parcial03.departamentos;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departamentos")
public class DepartamentosController {
     private final DepartamentosService departamentosService;

   
    public DepartamentosController(DepartamentosService departamentosService) {
        this.departamentosService = departamentosService;
    }

    @GetMapping
    public List<Departamentos> mostDepartamentos() {
        return departamentosService.obtenerTodosLosDepartamentos();
    }
    
}
