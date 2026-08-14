package com.exemplo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "API Spring Boot rodando com sucesso! Pipeline de CI/CD funcionando!";
    }
}