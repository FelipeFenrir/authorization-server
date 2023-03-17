package com.microservicos.authserver.controladores;

import com.microservicos.authserver.modelos.entidades.Credencial;
import com.microservicos.authserver.servicos.CredencialServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class CredencialControlador {

    @Autowired
    private CredencialServico credencialServico;

    @PostMapping("/cadastrarCredencial")
    public ResponseEntity cadastrarAuth(@RequestBody Credencial credencial){
        credencialServico.cadastrarCredencial(credencial);
        return ResponseEntity.status(201).build();
    }

}
