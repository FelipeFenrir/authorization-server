package com.microservicos.authserver.controladores;

import com.microservicos.authserver.modelos.entidades.Autenticacao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AutenticacaoControlador {

    @PostMapping("/cadastrarAutenticacao")
    public ResponseEntity cadastrarAuth(@PostMapping Autenticacao autenticacao){

    }

}
