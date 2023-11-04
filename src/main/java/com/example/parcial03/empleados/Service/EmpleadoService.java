package com.example.parcial03.empleados.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parcial03.empleados.Model.Empleado;
import com.example.parcial03.empleados.Repository.EmpleadoRepository;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public Empleado insertarEmpleado(Empleado empleado) {
        // Aquí se puede añadir lógica adicional si es necesario
        return empleadoRepository.save(empleado);
    }
}