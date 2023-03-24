package com.microservicos.authserver.servicos;

import com.microservicos.authserver.enums.RoleEnum;
import com.microservicos.authserver.modelos.entidades.Credencial;
import com.microservicos.authserver.modelos.entidades.Role;
import com.microservicos.authserver.repositorios.CredencialRepositorio;
import com.microservicos.authserver.repositorios.RoleRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CredencialServico {

    @Autowired
    private RoleRepositorio roleRepositorio;
    @Autowired
    private CredencialRepositorio credencialRepositorio;

    public void cadastrarCredencial(Credencial credencial){
        Role role = roleRepositorio.findRoleByIdentificador(RoleEnum.CANDIDATO);
        credencial.setRole(Collections.singletonList(role));
        credencialRepositorio.save(credencial);
    }

}
