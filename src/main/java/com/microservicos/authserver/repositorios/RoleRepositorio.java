package com.microservicos.authserver.repositorios;

import com.microservicos.authserver.enums.RoleEnum;
import com.microservicos.authserver.modelos.entidades.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RoleRepositorio extends JpaRepository<Role, UUID> {

    Role findRoleByIdentificador(RoleEnum identificador);

}
