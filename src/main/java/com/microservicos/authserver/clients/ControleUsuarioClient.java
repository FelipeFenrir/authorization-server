package com.microservicos.authserver.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "ms-controle-usuario", url = "localhost:8080/")
public interface ControleUsuarioClient {

}
