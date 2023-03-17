package com.microservicos.authserver.servicos;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private ControleUsuarioClient controleUsuarioClient;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = controleUsuarioClient.buscarUsuarioPorEmail(username);
        if(user != null){
            return user;
        }
        throw new NullPointerException("User não existente");
    }
}
