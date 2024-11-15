package com.miportafolio.gestion_usuarios.security.repository;

import com.miportafolio.gestion_usuarios.security.entity.Rol;
import com.miportafolio.gestion_usuarios.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}