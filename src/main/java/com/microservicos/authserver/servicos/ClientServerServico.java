package com.microservicos.authserver.servicos;


import com.microservicos.authserver.modelos.entidades.ClientServer;
import com.microservicos.authserver.repositorios.ClientRepositorio;
import com.netflix.discovery.converters.Auto;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class ClientServerServico implements RegisteredClientRepository {

    @Autowired
    private ClientRepositorio clientRepositorio;

    @Override
    public void save(RegisteredClient registeredClient) {
        clientRepositorio.save(ClientServer.from(registeredClient));
    }

    @Override
    public RegisteredClient findById(String id) {
        var a = clientRepositorio.findById(Long.valueOf(id)).orElseThrow();
        return ClientServer.from(a);
    }

    @Override
    public RegisteredClient findByClientId(String clientId) {
        var a = clientRepositorio.findByClientId(clientId).orElseThrow();
        return ClientServer.from(a);
    }
}
