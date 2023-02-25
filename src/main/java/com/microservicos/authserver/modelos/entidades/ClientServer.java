package com.microservicos.authserver.modelos.entidades;

import jakarta.persistence.*;
import lombok.Data;

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

}
