package com.microservicos.authserver.servicos;

import com.microservicos.authserver.repositorios.CredencialRepositorio;
import com.netflix.discovery.converters.Auto;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private CredencialRepositorio credencialRepositorio;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        var user =  credencialRepositorio.findCredencialByEmail(email);
        if(user != null){
            return user;
        }
        throw new NullPointerException("User não existente");
    }
}
