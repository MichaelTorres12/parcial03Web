package com.example.parcial03.empleados.Repository;

import com.example.parcial03.empleados.Model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    // No es necesario definir el método save, JpaRepository ya lo provee
}

