package com.microservicos.authserver.modelos.dtos;

import com.microservicos.authserver.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleEnum identificador;

    @Override
    public String getAuthority() {
        return this.identificador.toString();
    }
}
