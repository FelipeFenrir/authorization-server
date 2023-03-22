package com.microservicos.authserver.repositorios;

import com.microservicos.authserver.modelos.entidades.Credencial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CredencialRepositorio extends JpaRepository<Credencial, UUID> {

    Credencial findCredencialByEmail(String email);
}
