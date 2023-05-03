package com.exemplo.demo.controller;

import com.exemplo.demo.entities.Departamento;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/departamentos")
public class DepartamentoController {
    @GetMapping
    public List<Departamento> getDepartamento(){
        Departamento departamento1 = new Departamento(1L,"Tech");
        Departamento departamento2 = new Departamento(2L, "Moveis");
        List<Departamento> departamentos = new ArrayList<>();
        departamentos.add(departamento1);
        departamentos.add(departamento2);
        return departamentos;
    }
}
