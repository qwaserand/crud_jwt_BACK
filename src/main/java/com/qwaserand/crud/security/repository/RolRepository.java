package com.qwaserand.crud.security.repository;

import com.qwaserand.crud.security.entity.Rol;
import com.qwaserand.crud.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
