package com.example.parcial03.empleados.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IGenericRepo<T, ID> extends JpaRepository<T, ID> {

    T save(T t);


    void deleteById(ID id);

    ScopedValue<Object> findById(ID id);
}
