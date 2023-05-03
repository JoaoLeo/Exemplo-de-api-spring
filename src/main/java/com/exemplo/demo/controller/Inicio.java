package com.exemplo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Inicio {
    @GetMapping
    public String getMsg(){
        return "Bem vindo ao exemplo de api com spring, endpoints disponiveis: /produtos /departamentos ";
    }
}
