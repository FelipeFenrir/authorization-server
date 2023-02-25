package com.microservicos.authserver.servicos;

import com.microservicos.authserver.clients.ControleUsuarioClient;
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
        return user;
    }
}
