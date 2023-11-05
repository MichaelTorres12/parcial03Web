package com.example.parcial03.empleados.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.parcial03.empleados.Model.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

    Empleado save(Empleado empleado);

    void deleteById(Integer id);
}

