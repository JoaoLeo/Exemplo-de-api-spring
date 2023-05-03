package com.exemplo.demo.controller;

import com.exemplo.demo.entities.Departamento;
import com.exemplo.demo.entities.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
    @GetMapping
    public List<Produto> getProdutos(){
        Departamento departamento1 = new Departamento(1L,"Tech");
        Departamento departamento2 = new Departamento(2L, "Moveis");
        Produto produto1= new Produto(1L, "PC Gamer", 4000, departamento1);
        Produto produto2= new Produto(2L, "Mesa", 850, departamento2);
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        return produtos;
    }
}
