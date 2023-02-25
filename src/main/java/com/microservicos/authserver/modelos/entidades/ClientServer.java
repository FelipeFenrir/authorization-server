package com.microservicos.authserver.modelos.entidades;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;

import java.io.Serializable;

@Data
@Entity(name = "tb_client")
public class ClientServer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientId;
    private String secret;
    private String redirectUri;
    private String scope;
    private String authMethod;
    private String grantType;

    public static ClientServer from(RegisteredClient registeredClient) {
        ClientServer clientServer = new ClientServer();

        clientServer.setClientId(registeredClient.getClientId());
        clientServer.setSecret(registeredClient.getClientSecret());
        clientServer.setRedirectUri(registeredClient.getRedirectUris().stream().findAny().get());
        clientServer.setScope(registeredClient.getScopes().stream().findAny().get());
        clientServer.setAuthMethod(registeredClient.getClientAuthenticationMethods().stream().findAny().get().getValue());
        clientServer.setGrantType(registeredClient.getAuthorizationGrantTypes().stream().findAny().get().getValue());
        return clientServer;
    }

    public static RegisteredClient from(ClientServer clientServer){
        return  RegisteredClient.withId(String.valueOf(clientServer.getId()))
               .clientId(clientServer.getClientId())
               .clientSecret(clientServer.getSecret())
               .scope(clientServer.getScope())
               .redirectUri(clientServer.getRedirectUri())
               .clientAuthenticationMethod(new ClientAuthenticationMethod(clientServer.getAuthMethod()))
               .authorizationGrantType(new AuthorizationGrantType(clientServer.getGrantType()))
               .build();
    }

}
