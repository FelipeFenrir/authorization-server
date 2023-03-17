package com.microservicos.authserver.servicos;

import com.microservicos.authserver.modelos.entidades.Credencial;
import com.microservicos.authserver.repositorios.CredencialRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredencialServico {

    @Autowired
    private CredencialRepositorio credencialRepositorio;

    public void cadastrarCredencial(Credencial credencial){
        credencialRepositorio.save(credencial);
    }

}
