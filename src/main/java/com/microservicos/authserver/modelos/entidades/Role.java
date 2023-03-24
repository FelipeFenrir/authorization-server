package com.microservicos.authserver.modelos.entidades;

import com.microservicos.authserver.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.UUID;

@Data
@Entity
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private RoleEnum identificador;

    @Override
    public String getAuthority() {
        return this.identificador.toString();
    }
}
