package com.example.parcial03.departamentos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentosMunicipiosRepository extends JpaRepository<DepartamentosMunicipios, Integer> {

}
