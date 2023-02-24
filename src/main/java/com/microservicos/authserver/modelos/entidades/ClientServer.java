package com.microservicos.authserver.modelos.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "tb_client")
public class ClientServer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
