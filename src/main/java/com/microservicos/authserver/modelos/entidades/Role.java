package com.microservicos.authserver.modelos.entidades;

import com.microservicos.authserver.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
@Entity
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String identificador;

    @Override
    public String getAuthority() {
        return this.identificador;
    }
}
