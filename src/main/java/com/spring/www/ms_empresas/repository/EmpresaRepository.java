package com.spring.www.ms_empresas.repository;

import com.spring.www.ms_empresas.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    Optional<Empresa> findEmpresaByNombreIgnoreCase(String nombre);
}
