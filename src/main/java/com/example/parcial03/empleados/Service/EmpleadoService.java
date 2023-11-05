package com.example.parcial03.empleados.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.parcial03.empleados.Model.Empleado;
import com.example.parcial03.empleados.Repository.EmpleadoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpleadoService {

    private EmpleadoRepository repo;

    public Empleado createEmpleado (Empleado empleado) {

        return repo.save(empleado);
    }

    public List<Empleado> getEmpleado() {

        return (List<Empleado>) repo.findAll();
    }

    public void deleteEmpleado(Integer id) {

        repo.deleteById(id);
    }

}