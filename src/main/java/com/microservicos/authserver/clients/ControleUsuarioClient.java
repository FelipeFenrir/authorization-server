package com.microservicos.authserver.clients;

import com.microservicos.authserver.modelos.entidades.Autenticacao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-controle-usuario", url = "localhost:8000/")
public interface ControleUsuarioClient {

    @GetMapping("usuario/email/{email}")
    Autenticacao buscarUsuarioPorEmail(@PathVariable("email") String email);

}
