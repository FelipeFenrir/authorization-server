package com.microservicos.authserver.repositorios;

import com.microservicos.authserver.modelos.entidades.ClientServer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepositorio extends JpaRepository<ClientServer, Long> {

    @Query(value = "SELECT * FROM tb_client where tb_client.client_id = ?1", nativeQuery = true)
    Optional<ClientServer> findClientServerByClientId(String clientId);

}
