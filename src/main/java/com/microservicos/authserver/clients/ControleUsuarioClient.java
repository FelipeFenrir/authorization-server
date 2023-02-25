package com.microservicos.authserver.clients;

import com.microservicos.authserver.modelos.dtos.AutenticacaoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-controle-usuario", url = "localhost:8080/")
public interface ControleUsuarioClient {

    @GetMapping("usuario/email/{email}")
    AutenticacaoDTO buscarUsuarioPorEmail(@PathVariable("email") String email);

}
