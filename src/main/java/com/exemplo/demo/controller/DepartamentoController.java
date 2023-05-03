package com.exemplo.demo.controller;

import com.exemplo.demo.entities.Departamento;
import com.exemplo.demo.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/departamentos")
public class DepartamentoController {
    @Autowired
    private DepartamentoRepository departamentoRepository;
    @GetMapping
    public List<Departamento> getDepartamento(){
        List<Departamento> departamentos = departamentoRepository.findAll();
        return departamentos;
    }
}
